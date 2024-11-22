package com.edwardjones.app.process.impl;
  /* 
*****************************************************************
*                                                               *
* trdpb002 : securities book-keeping program                    *
*                                                               *
*  - settles securities account of buyer/seller by debiting     *
*    seller security account and crediting buyer security       *
*    account                                                    *
*                                                               *
*****************************************************************
*/
  
import com.cloudframe.app.process.BaseProcess;
import com.edwardjones.app.trdpb002.Trdpb002Ctx.*;
import com.edwardjones.app.trdpb002.Trdpb002Ctx;
import com.edwardjones.app.process.Trdpb002;
  import com.cloudframe.app.process.BaseProcess;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.edwardjones.app.repository.Trdpb002Repository;
  import com.cloudframe.app.utility.CFUtil;
import java.util.ArrayList;
  import com.cloudframe.app.data.Field;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import com.edwardjones.app.process.Trdpbexc;
import com.edwardjones.app.process.*;
  import com.cloudframe.app.dto.ProgramContext;
import com.edwardjones.app.trdpb002.dto.*;
import com.edwardjones.app.trdpb002.dto.TrdOrderPair;
import com.edwardjones.app.trdpb002.dto.Sqlca;
import com.edwardjones.app.trdpb002.dto.Dcltbtrdpos;
import com.edwardjones.app.trdpb002.dto.ExceptionRecord;
import com.edwardjones.app.trdpb002.dto.ExceptionRecordLenGroup;
import com.edwardjones.app.trdpb002.dto.Work;
import com.edwardjones.app.common.CONSTANTS;
import com.edwardjones.app.common.SQLS;
import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
import java.sql.SQLException;
  
  @Component("trdpb002")
  
  public class Trdpb002Impl extends CommonProcess implements Trdpb002 {
  
  Logger logger = LoggerFactory.getLogger(Trdpb002Impl.class);
  
  
  @Value("${TRDPB002.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("trdpb002Repository")
  Trdpb002Repository trdpb002Repository;
  @Autowired 
  @Qualifier("trdpbexc")
  Trdpbexc trdpbexc;
  
  
  
  
  
  
      @Override
      public int setParameter(Trdpb002Ctx programCtx, String trdOrderPair) throws Exception {
      		if(trdOrderPair != null)
      		    programCtx.getTrdOrderPair().setString(com.cloudframe.app.data.Field.getParm(trdOrderPair),new String(CONSTANTS.EBCDIC_ENCODING));
      		setInitDone(false);
      		process(programCtx);
      		return programCtx.getRc();
      }
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Trdpb002Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("TRDPB002" ,dbQualifier, true/*use Dynamic SQL*/);
//Added variable to get the output context in place.
ProcessInCtx methodIn = programCtx.getProcessInCtx();
//  PERFORM 0000-MAINLINE
          mainline(programCtx);/*0000-MAINLINE*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
		handleDbAtEnd(db2Base); 
      

      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - trdStatus                      COBOL Name: TRD-STATUS
      * - crDbSwtich                     COBOL Name: WS-CR-DB-SWTICH
      *
      * @throws CFException
      */
      @Override
      public MainlineOutCtx mainline(Trdpb002Ctx programCtx) throws Exception {
//Added variable to get the output context in place.
MainlineOutCtx methodOut = programCtx.getMainlineOutCtx();

// * Set default to booking failed
//  SET TRD-SAC-BOOKING-FAILED TO TRUE
          methodOut.setTrdSacBookingFailedTrue(); 
          
//  SET DEBIT-SELLER TO TRUE
          methodOut.setDebitSellerTrue(); 
          
//  PERFORM 1000-SAC-BOOKING THRU 1000-EXIT
          sacBooking(programCtx.getSacBookingInCtx());/*1000-SAC-BOOKING*/
//  IF TRD-SAC-BOOKING-DONE THEN
          if ( methodOut.isTrdSacBookingDone()  ) { 

// * Reset back to booking failed and attempt crediting seller
//  SET TRD-SAC-BOOKING-FAILED TO TRUE
              methodOut.setTrdSacBookingFailedTrue(); 
              
//  SET CREDIT-BUYER TO TRUE
              methodOut.setCreditBuyerTrue(); 
              
//  PERFORM 1000-SAC-BOOKING THRU 1000-EXIT
              sacBooking(programCtx.getSacBookingInCtx());/*1000-SAC-BOOKING*/
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * sacBooking 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-SAC-BOOKING COBOL Cyclomatic complexity - 13
      * Input  :  

      * - crDbSwtich                     COBOL Name: WS-CR-DB-SWTICH
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - trdSellerSecAccNum             COBOL Name: TRD-SELLER-SEC-ACC-NUM
      * - trdFigi                        COBOL Name: TRD-FIGI
      * - trdBuyerSecAccNum              COBOL Name: TRD-BUYER-SEC-ACC-NUM
      * - sqlcode                        COBOL Name: SQLCODE
      * - posBalance                     COBOL Name: POS-BALANCE
      * - trdOrderQty                    COBOL Name: TRD-ORDER-QTY
      *
      * Output :  

      * - posCurrency                    COBOL Name: POS-CURRENCY
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - posSacNumber                   COBOL Name: POS-SAC-NUMBER
      * - trdSellerSecAccNum             COBOL Name: TRD-SELLER-SEC-ACC-NUM
      * - posFigi                        COBOL Name: POS-FIGI
      * - trdFigi                        COBOL Name: TRD-FIGI
      * - trdBuyerSecAccNum              COBOL Name: TRD-BUYER-SEC-ACC-NUM
      * - trdStatus                      COBOL Name: TRD-STATUS
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      * - exception                      COBOL Name: WS-EXCEPTION
      * - posBalance                     COBOL Name: POS-BALANCE
      *
      * @throws CFException
      */
      @Override
      public SacBookingOutCtx sacBooking(SacBookingInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// *

// *
//Added variable to get the program context in place.
Trdpb002Ctx programCtx = methodIn.getTrdpb002Ctx();
//Added variable to get the output context in place.
SacBookingOutCtx methodOut = methodIn.getSacBookingOutCtx();
//  IF DEBIT-SELLER
          if ( methodIn.isDebitSeller()  ) { 
//  MOVE TRD-CURRENCY TO POS-CURRENCY
              methodOut.setPosCurrency(methodOut.getTrdCurrency());
//  MOVE TRD-SELLER-SEC-ACC-NUM TO POS-SAC-NUMBER
              methodOut.setPosSacNumber(methodOut.getTrdSellerSecAccNum());
//  MOVE TRD-FIGI TO POS-FIGI
              methodOut.setPosFigi(methodOut.getTrdFigi());
//  DISPLAY 'TRD-CURRENCY          =' TRD-CURRENCY
              logger.info("TRD-CURRENCY          ={}", new String(methodOut.getTrdCurrency())); 
//  DISPLAY 'TRD-SELLER-SEC-ACC-NUM=' TRD-SELLER-SEC-ACC-NUM
              logger.info("TRD-SELLER-SEC-ACC-NUM={}", String.valueOf(methodOut.getTrdSellerSecAccNum())); 
//  DISPLAY 'TRD-FIGI              =' TRD-FIGI
              logger.info("TRD-FIGI              ={}", new String(methodOut.getTrdFigi())); 
          }
//  ELSE
          else { 
//  MOVE TRD-CURRENCY TO POS-CURRENCY
              methodOut.setPosCurrency(methodOut.getTrdCurrency());
//  MOVE TRD-BUYER-SEC-ACC-NUM TO POS-SAC-NUMBER
              methodOut.setPosSacNumber(methodOut.getTrdBuyerSecAccNum());
//  MOVE TRD-FIGI TO POS-FIGI
              methodOut.setPosFigi(methodOut.getTrdFigi());
//  DISPLAY 'TRD-CURRENCY          =' TRD-CURRENCY
              logger.info("TRD-CURRENCY          ={}", new String(methodOut.getTrdCurrency())); 
//  DISPLAY 'TRD-BUYER-SEC-ACC-NUM =' TRD-BUYER-SEC-ACC-NUM
              logger.info("TRD-BUYER-SEC-ACC-NUM ={}", String.valueOf(methodOut.getTrdBuyerSecAccNum())); 
//  DISPLAY 'TRD-FIGI              =' TRD-FIGI
              logger.info("TRD-FIGI              ={}", new String(methodOut.getTrdFigi())); 
          }
//  SELECT POS_BALANCE FROM TBTRDPOS WHERE POS_CURRENCY = ? AND POS_SAC_NUMBER = ? AND POS_FIGI = ? FOR UPDATE OF POS_BALANCE
          programCtx.setPosBookingResultSet(trdpb002Repository.openPosBookingTrdpb002(programCtx.getSqlca(),methodOut.getDcltbtrdpos()));

// *
//  IF SQLCODE NOT = 0 THEN
          if (	( methodOut.getSqlcode() != 0 )) { 
//  SET TRD-SAC-BOOKING-FAILED TO TRUE
              methodOut.setTrdSacBookingFailedTrue(); 
              
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'Open POS_BOOKING Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1079101867);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
//cobolCode::GO TO 1000-EXIT
return methodOut;
//cobolCodeEnds::GO TO 1000-EXIT
          }
//  FETCH POS_BOOKING INTO ?
          trdpb002Repository.fetchPosBookingTrdpb002(programCtx.getPosBookingResultSet(),programCtx.getSqlca(),methodOut.getDcltbtrdpos());

// *
//  IF SQLCODE = 0 THEN
          if (	( methodOut.getSqlcode() == 0 )) { 
//  IF DEBIT-SELLER
              if ( methodIn.isDebitSeller()  ) { 
                  methodOut.setPosBalance(methodOut.getPosBalance().subtract(methodIn.getTrdOrderQty()));
              }
//  ELSE
              else { 
                  methodOut.setPosBalance(methodOut.getPosBalance().add(methodIn.getTrdOrderQty()));
              }
//  UPDATE TBTRDPOS SET POS_BALANCE = ? WHERE POS_CURRENCY = ? AND POS_SAC_NUMBER = ? AND POS_FIGI = ?
              trdpb002Repository.updateTbtrdpos(programCtx.getSqlca(),methodOut.getDcltbtrdpos());

// *            Where current of pos_booking
//  IF SQLCODE = 0 THEN
              if (	( methodOut.getSqlcode() == 0 )) { 
//  SET TRD-SAC-BOOKING-DONE TO TRUE
                  methodOut.setTrdSacBookingDoneTrue(); 
                  
              }
//  ELSE
              else { 
//  SET TRD-SAC-BOOKING-FAILED TO TRUE
                  methodOut.setTrdSacBookingFailedTrue(); 
                  
                  // MOVE SQLCODE TO WS-SQLCODE
                  //  FORMAT1016334848 = "----"
                  methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  SET DATA-EXCEPTION TO TRUE
                  methodOut.setDataExceptionTrue(); 
                  
                  // MOVE SPACES TO WS-EXCEPTION
                  methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'Update using POS_BOOKING Cursor failed : ' 'SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_896462048);
                     charArray.add(CONSTANTS.LITERAL_1775499624);
                     charArray.add(methodOut.getSqlcode_Ws());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              }
          }
//  ELSE
          else { 
//  SET TRD-SAC-BOOKING-FAILED TO TRUE
              methodOut.setTrdSacBookingFailedTrue(); 
              
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  DISPLAY 'SQLCODE = ' WS-SQLCODE
              logger.info("SQLCODE = {}", new String(methodOut.getSqlcode_Ws())); 
//  DISPLAY 'POS-CURRENCY   = ' POS-CURRENCY
              logger.info("POS-CURRENCY   = {}", new String(methodOut.getPosCurrency())); 
//  DISPLAY 'POS-SAC-NUMBER = ' POS-SAC-NUMBER
              logger.info("POS-SAC-NUMBER = {}", String.valueOf(methodOut.getPosSacNumber())); 
//  DISPLAY 'POS-FIGI       = ' POS-FIGI
              logger.info("POS-FIGI       = {}", new String(methodOut.getPosFigi())); 
//  STRING 'Fetch POS_BOOKING Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_452312193);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
//  CLOSE POS_BOOKING
          trdpb002Repository.closePosBookingTrdpb002(programCtx.getPosBookingResultSet(),programCtx.getSqlca());
      
      return methodOut;
      }
      /**
      * reportException 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-REPORT-EXCEPTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - exception                      COBOL Name: WS-EXCEPTION
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      *
      * Output :  

      * - exceptionDesc                  COBOL Name: EXCEPTION-DESC
      * - exception                      COBOL Name: WS-EXCEPTION
      * - exceptionRecordLen             COBOL Name: EXCEPTION-RECORD-LEN
      * - exceptionType                  COBOL Name: EXCEPTION-TYPE
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public ReportExceptionOutCtx reportException(ReportExceptionInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int EXCEPTION_LENGTH = 200;
			// End of variable declaration

//Added variable to get the program context in place.
Trdpb002Ctx programCtx = methodIn.getTrdpb002Ctx();
//Added variable to get the output context in place.
ReportExceptionOutCtx methodOut = methodIn.getReportExceptionOutCtx();
//  MOVE WS-EXCEPTION TO EXCEPTION-DESC
          methodOut.setExceptionDesc(pad(1000,methodOut.getException(),SPACE_CHAR,RIGHT_PAD));
//  MOVE LENGTH OF WS-EXCEPTION TO EXCEPTION-RECORD-LEN
          methodOut.setExceptionRecordLen((short) EXCEPTION_LENGTH);
//  EVALUATE TRUE
          if  ( methodIn.isSystemException()  ) { 
//  MOVE 'SYSTEM' TO EXCEPTION-TYPE
              methodOut.setExceptionType(CONSTANTS.LITERAL_SYSTEM_B14_);
          }
          else if  ( methodIn.isApplException()  ) { 
//  MOVE 'APPLICATION' TO EXCEPTION-TYPE
              methodOut.setExceptionType(CONSTANTS.LITERAL_APPLICATION_B9_);
          }
          else if  ( methodIn.isDataException()  ) { 
//  MOVE 'DATA' TO EXCEPTION-TYPE
              methodOut.setExceptionType(CONSTANTS.LITERAL_DATA_B16_);
          }
//  ADD 46 TO EXCEPTION-RECORD-LEN
          methodOut.setExceptionRecordLen( (short) (methodOut.getExceptionRecordLen()+(short)46));

// *
//  CALL WS-EXCEPTION-HANDLER USING EXCEPTION-RECORD-LEN , EXCEPTION-RECORD
          
// *
          // CALL WS-EXCEPTION-HANDLER USING EXCEPTION-RECORD-LEN , EXCEPTION-RECORD
               programCtx.setRc( trdpbexc.call(programCtx.getGlobalCtx().getContext("TRDPBEXC"),methodOut.getExceptionRecordLenGroup(),methodOut.getExceptionRecord()));
          ;
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Trdpb002Ctx programCtx = (Trdpb002Ctx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getTrdOrderPair().set((Field)params[0]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Trdpb002Ctx programCtx = (Trdpb002Ctx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof TrdOrderPair) {
                       	programCtx.setTrdOrderPair((TrdOrderPair) parameters[index]);
                  	} else {
                       	programCtx.getTrdOrderPair().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
      public void setFromTrdpbexc(Trdpb002Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getExceptionRecordLenGroup().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getExceptionRecordLenGroup().setString((char[])params[0] );
         if (len > 1)
         if(params[1] instanceof Field) 
   programCtx.getExceptionRecord().setString(((Field)params[1] ).toCharArray());
 else    programCtx.getExceptionRecord().setString((char[])params[1] );
      }
  
  
  
  
  
  }
