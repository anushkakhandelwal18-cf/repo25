package com.edwardjones.app.process.impl;
  /* 
*****************************************************************
*                                                               *
* trdpbexc : exception hander                                   *
*                                                               *
*****************************************************************
*/
  
import com.cloudframe.app.process.BaseProcess;
import com.edwardjones.app.trdpbexc.TrdpbexcCtx.*;
import com.edwardjones.app.trdpbexc.TrdpbexcCtx;
import com.edwardjones.app.process.Trdpbexc;
  import com.cloudframe.app.process.BaseProcess;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.edwardjones.app.repository.TrdpbexcRepository;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.data.Field;
import com.edwardjones.app.trdpbexc.dto.*;
import com.edwardjones.app.trdpbexc.dto.ExceptionRecordLenGroup;
import com.edwardjones.app.trdpbexc.dto.Sqlca;
import com.edwardjones.app.trdpbexc.dto.ExceptionRecord;
import com.edwardjones.app.trdpbexc.dto.Dcltbtrdexc;
import com.edwardjones.app.trdpbexc.dto.Work;
import com.edwardjones.app.common.CONSTANTS;
import com.edwardjones.app.common.SQLS;
import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
import java.sql.SQLException;
  
  @Component("trdpbexc")
  
  public class TrdpbexcImpl extends CommonProcess implements Trdpbexc {
  
  Logger logger = LoggerFactory.getLogger(TrdpbexcImpl.class);
  
  
  @Value("${TRDPBEXC.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("trdpbexcRepository")
  TrdpbexcRepository trdpbexcRepository;
  
  
  
  
  
  
      @Override
      public int setParameter(TrdpbexcCtx programCtx, String exceptionRecordLenGroup,String exceptionRecord) throws Exception {
      		if(exceptionRecordLenGroup != null)
      		    programCtx.getExceptionRecordLenGroup().setString(com.cloudframe.app.data.Field.getParm(exceptionRecordLenGroup),new String(CONSTANTS.EBCDIC_ENCODING));
      		if(exceptionRecord != null)
      		    programCtx.getExceptionRecord().setString(com.cloudframe.app.data.Field.getParm(exceptionRecord),new String(CONSTANTS.EBCDIC_ENCODING));
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
      public int process(TrdpbexcCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("TRDPBEXC" ,dbQualifier, true/*use Dynamic SQL*/);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
//  PERFORM 0000-MAINLINE
          mainline(programCtx.getMainlineInCtx());/*0000-MAINLINE*/
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
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 12
      * Input  :  

      * - exceptionType                  COBOL Name: EXCEPTION-TYPE
      * - exceptionRecordLen             COBOL Name: EXCEPTION-RECORD-LEN
      * - exceptionDesc                  COBOL Name: EXCEPTION-DESC
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - excType                        COBOL Name: EXC-TYPE
      * - exceptionType                  COBOL Name: EXCEPTION-TYPE
      * - excDescriptionLen              COBOL Name: EXC-DESCRIPTION-LEN
      * - exceptionRecordLen             COBOL Name: EXCEPTION-RECORD-LEN
      * - excDescriptionText             COBOL Name: EXC-DESCRIPTION-TEXT
      * - exceptionDesc                  COBOL Name: EXCEPTION-DESC
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
TrdpbexcCtx programCtx = methodIn.getTrdpbexcCtx();
MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();

// *
// * Data exceptions are tolerated and application continues
// *
//  IF EXCEPTION-DATA THEN
//  ELSE
          if (!(methodIn.isExceptionData()) ) { 
//  ROLLBACK
              try {
              	// COMMIT
              	// reset SQLCODE
              	methodOut.setSqlcode(0);
                 // execute jdbc commit
                 db2Base.rollback();
              }
               catch (SQLException e) {
                         methodOut.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
                     }
               catch(Exception e) {
                handleErrorCode(e);
              }
          }

// *
// *    Move exception-timestamp     to exc-timestamp
//  MOVE EXCEPTION-TYPE TO EXC-TYPE
          methodOut.setExcType(methodOut.getExceptionType());
//  MOVE EXCEPTION-RECORD-LEN TO EXC-DESCRIPTION-LEN
          methodOut.setExcDescriptionLen(methodOut.getExceptionRecordLen());
//  MOVE EXCEPTION-DESC TO EXC-DESCRIPTION-TEXT
          methodOut.setExcDescriptionText(methodOut.getExceptionDesc());
//  INSERT INTO TBTRDEXC ( EXC_TYPE , EXC_DESCRIPTION ) VALUES ( ? , ? )
          trdpbexcRepository.insertTbtrdexc(programCtx.getSqlca(),methodIn.getDcltbtrdexc());
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
          break;
          	case -803:

// * Retry insert if it failed with sqlcode -803 (duplicate)
//  PERFORM UNTIL SQLCODE = 0
              while ((	( methodOut.getSqlcode() != 0 ))) {
//  INSERT INTO TBTRDEXC ( EXC_TYPE , EXC_DESCRIPTION ) VALUES ( ? , ? )
                  trdpbexcRepository.insertTbtrdexc2(programCtx.getSqlca(),methodIn.getDcltbtrdexc());
              }
          break;
          default :
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  DISPLAY 'Error Logging Exception.. Sqlcode = ' WS-SQLCODE
              logger.info("Error Logging Exception.. Sqlcode = {}", new String(methodOut.getSqlcode_Ws())); 
//  PERFORM 9999-ABEND-DUMP THRU 9999-EXIT
              abendDump(programCtx.getAbendDumpInCtx());/*9999-ABEND-DUMP*/
          }

// * Tolerate data exception
//  IF EXCEPTION-DATA THEN
//  ELSE
          if (!(methodIn.isExceptionData()) ) { 
//  COMMIT
              try {
              	// COMMIT
              	// reset SQLCODE
              	methodOut.setSqlcode(0);
                 // execute jdbc commit
                 db2Base.commit();
              }
               catch (SQLException e) {
                         methodOut.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
                     }
               catch(Exception e) {
                 handleErrorCode(e);
              }
//  PERFORM 9999-ABEND-DUMP THRU 9999-EXIT
              abendDump(programCtx.getAbendDumpInCtx());/*9999-ABEND-DUMP*/
          }

// *
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * abendDump 
      *   This method is derived from 
  *   COBOL Paragraph - 9999-ABEND-DUMP COBOL Cyclomatic complexity - 1
      * Input  :  

      * - excType                        COBOL Name: EXC-TYPE
      * - excDescriptionText             COBOL Name: EXC-DESCRIPTION-TEXT
      *
      * Output :  

      * - abendCode                      COBOL Name: WS-ABEND-CODE
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public AbendDumpOutCtx abendDump(AbendDumpInCtx methodIn) throws Exception {
      
// *

// *
TrdpbexcCtx programCtx = methodIn.getTrdpbexcCtx();
AbendDumpOutCtx methodOut = methodIn.getAbendDumpOutCtx();
//  DISPLAY EXC-TYPE ' Exception : ' EXC-DESCRIPTION-TEXT (1 : 100)
          logger.info("{} Exception : {}", new String(methodIn.getExcType()), new String(substring(methodIn.getExcDescriptionText(),0,100))); 
//  MOVE 255 TO WS-ABEND-CODE
          methodOut.setAbendCode(255);
//  CALL 'ILBOABN0' USING WS-ABEND-CODE
          // CALL 'ILBOABN0' USING WS-ABEND-CODE
          /**
          *  User Program is requesting an Exception be thrown at this point
          **/
          setException(new CFException("User program is requesting abend/exception be thrown"));
          getException().setAbendCode(pad(4, String.valueOf(methodOut.getAbendCode()),"0",LEFT_PAD));
          throw getException();
      
  }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      TrdpbexcCtx programCtx = (TrdpbexcCtx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getExceptionRecordLenGroup().set((Field)params[0]);
         if (len > 1 && params[1] != null )
            programCtx.getExceptionRecord().set((Field)params[1]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      TrdpbexcCtx programCtx = (TrdpbexcCtx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof ExceptionRecordLenGroup) {
                       	programCtx.setExceptionRecordLenGroup((ExceptionRecordLenGroup) parameters[index]);
                  	} else {
                       	programCtx.getExceptionRecordLenGroup().set(parameters[index]);
                  	}
                  }
                
                  break;
              case 1:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof ExceptionRecord) {
                       	programCtx.setExceptionRecord((ExceptionRecord) parameters[index]);
                  	} else {
                       	programCtx.getExceptionRecord().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
  
  
  
  
  
  }
