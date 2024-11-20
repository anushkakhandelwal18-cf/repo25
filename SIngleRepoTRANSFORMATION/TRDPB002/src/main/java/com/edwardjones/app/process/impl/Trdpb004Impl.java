package com.edwardjones.app.process.impl;
  /* 
*****************************************************************
*                                                               *
* trdpb004 : exception, execution statistics, customer summary  *
*            reports                                            *
*                                                               *
*                                                               *
*****************************************************************
*/
  
import com.cloudframe.app.process.BaseProcess;
import com.edwardjones.app.trdpb004.Trdpb004Ctx.*;
import com.edwardjones.app.trdpb004.Trdpb004Ctx;
import com.edwardjones.app.process.Trdpb004;
  import com.cloudframe.app.process.BaseProcess;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.exception.Terminate;
import com.edwardjones.app.trdpb004.file.*;
import java.util.ArrayList;
  import com.cloudframe.app.data.Field;
import java.util.Map;
import java.util.HashMap;
import com.edwardjones.app.repository.Trdpb004Repository;
  import com.cloudframe.app.utility.CFUtil;
import java.math.BigDecimal;
import com.edwardjones.app.trdpb004.dto.*;
import com.edwardjones.app.trdpb004.dto.HdrRunlogRecDash;
import com.edwardjones.app.trdpb004.dto.PrtRunlogRec;
import com.edwardjones.app.trdpb004.dto.HdrSummaryRecDash;
import com.edwardjones.app.trdpb004.dto.PrtSummaryRec;
import com.edwardjones.app.trdpb004.dto.PrtExcptionRec;
import com.edwardjones.app.trdpb004.dto.Sqlca;
import com.edwardjones.app.trdpb004.dto.HdrExcptionRecDash;
import com.edwardjones.app.trdpb004.file.records.ExcptionRecord;
import com.edwardjones.app.trdpb004.dto.Dcltbtrdexc;
import com.edwardjones.app.trdpb004.file.records.SummaryRecord;
import com.edwardjones.app.trdpb004.file.records.RunlogRecord;
import com.edwardjones.app.trdpb004.dto.Dcltbtrdsum;
import com.edwardjones.app.trdpb004.dto.Dcltbtrdlog;
import com.edwardjones.app.trdpb004.dto.Work;
import com.edwardjones.app.common.CONSTANTS;
import com.edwardjones.app.common.SQLS;
import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
import java.sql.SQLException;
  
  @Component("trdpb004")
  
  public class Trdpb004Impl extends CommonProcess implements Trdpb004 {
  
  Logger logger = LoggerFactory.getLogger(Trdpb004Impl.class);
  
  
  @Value("${TRDPB004.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("db2Base")
  Db2Base db2Base;
  @Autowired 
  @Qualifier("trdpb004_excptionReport")
  ExcptionReport excptionReport;
  @Autowired 
  @Qualifier("trdpb004Repository")
  Trdpb004Repository trdpb004Repository;
  @Autowired 
  @Qualifier("trdpb004_runlogReport")
  RunlogReport runlogReport;
  @Autowired 
  @Qualifier("trdpb004_summaryReport")
  SummaryReport summaryReport;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Trdpb004Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("TRDPB004" ,dbQualifier, true/*use Dynamic SQL*/);
//  cobolCode::PERFORM 0000-MAINLINE
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
      		if(excptionReport.hasOpened() && !excptionReport.isReadOnly()) { 
      			excptionReport.flush(); 
      		}
      		if(runlogReport.hasOpened() && !runlogReport.isReadOnly()) { 
      			runlogReport.flush(); 
      		}
      		if(summaryReport.hasOpened() && !summaryReport.isReadOnly()) { 
      			summaryReport.flush(); 
      		}
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

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public MainlineOutCtx mainline(Trdpb004Ctx programCtx) throws Exception {
//Added variable to get the output context in place.
MainlineOutCtx methodOut = programCtx.getMainlineOutCtx();
//  cobolCode::PERFORM 0001-INITIALIZE THRU 0001-EXIT
//  PERFORM 0001-INITIALIZE THRU 0001-EXIT
          initialize(programCtx);/*0001-INITIALIZE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  cobolCode::PERFORM 1000-PROCESS-EXCEPTION THRU 1000-EXIT
//  PERFORM 1000-PROCESS-EXCEPTION THRU 1000-EXIT
          processException(programCtx.getProcessExceptionInCtx());/*1000-PROCESS-EXCEPTION*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  cobolCode::PERFORM 2000-PROCESS-TIMINGS THRU 2000-EXIT
//  PERFORM 2000-PROCESS-TIMINGS THRU 2000-EXIT
          processTimings(programCtx.getProcessTimingsInCtx());/*2000-PROCESS-TIMINGS*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  cobolCode::PERFORM 3000-PROCESS-SUMMARY-RPT THRU 3000-EXIT
//  PERFORM 3000-PROCESS-SUMMARY-RPT THRU 3000-EXIT
          processSummaryRpt(programCtx.getProcessSummaryRptInCtx());/*3000-PROCESS-SUMMARY-RPT*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  cobolCode::PERFORM 4000-CLEANUP THRU 4000-EXIT
//  PERFORM 4000-CLEANUP THRU 4000-EXIT
          cleanup(programCtx);/*4000-CLEANUP*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
          // MOVE 0 TO RETURN-CODE
          programCtx.setRc( 0);
//  cobolCode::COMMIT
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

// *
//  cobolCode::GOBACK
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * initialize 
      *   This method is derived from 
  *   COBOL Paragraph - 0001-INITIALIZE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - filler1                        COBOL Name: FILLER1
      * - filler2                        COBOL Name: FILLER2
      * - filler3                        COBOL Name: FILLER3
      * - filler4                        COBOL Name: FILLER4
      * - filler101                      COBOL Name: FILLER1
      * - filler201                      COBOL Name: FILLER2
      * - filler102                      COBOL Name: FILLER1
      * - filler202                      COBOL Name: FILLER2
      * - filler301                      COBOL Name: FILLER3
      * - filler401                      COBOL Name: FILLER4
      * - filler5                        COBOL Name: FILLER5
      * - filler6                        COBOL Name: FILLER6
      * - filler7                        COBOL Name: FILLER7
      * - filler8                        COBOL Name: FILLER8
      * - filler9                        COBOL Name: FILLER9
      *
      * @throws CFException
      */
      @Override
      public InitializeOutCtx initialize(Trdpb004Ctx programCtx) throws Exception {
      
// *

// *
//Added variable to get the output context in place.
InitializeOutCtx methodOut = programCtx.getInitializeOutCtx();
//  cobolCode::MOVE ALL '-' TO FILLER1 OF HDR-RUNLOG-REC-DASH FILLER2 OF HDR-RUNLOG-REC-DASH FILLER3 OF HDR-RUNLOG-REC-DASH FILLER4 OF HDR-RUNLOG-REC-DASH FILLER1 OF HDR-EXCPTION-REC-DASH FILLER2 OF HDR-EXCPTION-REC-DASH FILLER1 OF HDR-SUMMARY-REC-DASH FILLER2 OF HDR-SUMMARY-REC-DASH FILLER3 OF HDR-SUMMARY-REC-DASH FILLER4 OF HDR-SUMMARY-REC-DASH FILLER5 OF HDR-SUMMARY-REC-DASH FILLER6 OF HDR-SUMMARY-REC-DASH FILLER7 OF HDR-SUMMARY-REC-DASH FILLER8 OF HDR-SUMMARY-REC-DASH FILLER9 OF HDR-SUMMARY-REC-DASH
//  MOVE ALL '-' TO FILLER1 OF HDR-RUNLOG-REC-DASH FILLER2 OF HDR-RUNLOG-REC-DASH FILLER3 OF HDR-RUNLOG-REC-DASH FILLER4 OF HDR-RUNLOG-REC-DASH FILLER1 OF HDR-EXCPTION-REC-DASH FILLER2 OF HDR-EXCPTION-REC-DASH FILLER1 OF HDR-SUMMARY-REC-DASH FILLER2 OF HDR-SUMMARY-REC-DASH FILLER3 OF HDR-SUMMARY-REC-DASH FILLER4 OF HDR-SUMMARY-REC-DASH FILLER5 OF HDR-SUMMARY-REC-DASH FILLER6 OF HDR-SUMMARY-REC-DASH FILLER7 OF HDR-SUMMARY-REC-DASH FILLER8 OF HDR-SUMMARY-REC-DASH FILLER9 OF HDR-SUMMARY-REC-DASH
          methodOut.setFiller1(CONSTANTS.LITERAL_MN12_);
          methodOut.setFiller2(CONSTANTS.LITERAL_MN8_);
          methodOut.setFiller3(CONSTANTS.LITERAL_MN26_);
          methodOut.setFiller4(CONSTANTS.LITERAL_MN26_);
          methodOut.setFiller101(CONSTANTS.LITERAL_MN20_);
          methodOut.setFiller201(CONSTANTS.LITERAL_1680254125);
          methodOut.setFiller102(CONSTANTS.LITERAL_MN12_);
          methodOut.setFiller202(CONSTANTS.LITERAL_MN11_);
          methodOut.setFiller301(CONSTANTS.LITERAL_MN11_);
          methodOut.setFiller401(CONSTANTS.LITERAL_MN11_);
          methodOut.setFiller5(CONSTANTS.LITERAL_MN8_);
          methodOut.setFiller6(CONSTANTS.LITERAL_MN14_);
          methodOut.setFiller7(CONSTANTS.LITERAL_MN14_);
          methodOut.setFiller8(CONSTANTS.LITERAL_MN14_);
          methodOut.setFiller9(CONSTANTS.LITERAL_MN14_);
          ;
      
      return methodOut;
      }
      /**
      * processException 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-PROCESS-EXCEPTION COBOL Cyclomatic complexity - 33
      * Input  :  

      * - excptionRecord                 COBOL Name: EXCPTION-RECORD
      * - sqlcode                        COBOL Name: SQLCODE
      * - excType                        COBOL Name: EXC-TYPE
      * - excDescriptionText             COBOL Name: EXC-DESCRIPTION-TEXT
      *
      * Output :  

      * - runlogFileStatus               COBOL Name: RUNLOG-FILE-STATUS
      * - summaryFileStatus              COBOL Name: SUMMARY-FILE-STATUS
      * - excptionFileStatus             COBOL Name: EXCPTION-FILE-STATUS
      * - exception                      COBOL Name: WS-EXCEPTION
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - excptionRecord                 COBOL Name: EXCPTION-RECORD
      * - prtExcptionType                COBOL Name: PRT-EXCPTION-TYPE
      * - excType                        COBOL Name: EXC-TYPE
      * - prtExcptionDesc                COBOL Name: PRT-EXCPTION-DESC
      * - excDescriptionText             COBOL Name: EXC-DESCRIPTION-TEXT
      *
      * @throws CFException
      */
      @Override
      public ProcessExceptionOutCtx processException(ProcessExceptionInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// *

// *

// *
//Added variable to get the program context in place.
Trdpb004Ctx programCtx = methodIn.getTrdpb004Ctx();
//Added variable to get the output context in place.
ProcessExceptionOutCtx methodOut = methodIn.getProcessExceptionOutCtx();
//  cobolCode::OPEN OUTPUT EXCPTION-REPORT
//  OPEN OUTPUT EXCPTION-REPORT
          excptionReport.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),excptionReport.getFileName(),excptionReport.getExcptionReportCharSet(),excptionReport.getExcptionReportCrlfFlag());
          methodOut.setExcptionFileStatus(excptionReport.getStatus() );
//  cobolCode::IF EXCPTION-FILE-STATUS NOT = 0
//  IF EXCPTION-FILE-STATUS NOT = 0
          if (	( methodOut.getExcptionFileStatus() != 0 )) { 
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Open EXCEPTION FILE failed : File-Status = ' EXCPTION-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Open EXCEPTION FILE failed : File-Status = ' EXCPTION-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1014051608);
                 charArray.add(String.valueOf(methodOut.getExcptionFileStatusString()).toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }

// *
//  cobolCode::WRITE EXCPTION-RECORD FROM HDR-EXCPTION-REC-DASH
//  WRITE EXCPTION-RECORD FROM HDR-EXCPTION-REC-DASH
          excptionReport.write(methodIn.getHdrExcptionRecDash().toCharArray()); 
          methodOut.getExcptionRecord().setString(CONSTANTS.LOW_VALUE_1901561749);
          methodOut.setExcptionFileStatus(excptionReport.getStatus() );
//  cobolCode::WRITE EXCPTION-RECORD FROM HDR-EXCPTION-REC
//  WRITE EXCPTION-RECORD FROM HDR-EXCPTION-REC
          excptionReport.write(methodIn.getHdrExcptionRec()); 
          methodOut.getExcptionRecord().setString(CONSTANTS.LOW_VALUE_1901561749);
          methodOut.setExcptionFileStatus(excptionReport.getStatus() );
//  cobolCode::WRITE EXCPTION-RECORD FROM HDR-EXCPTION-REC-DASH
//  WRITE EXCPTION-RECORD FROM HDR-EXCPTION-REC-DASH
          excptionReport.write(methodIn.getHdrExcptionRecDash().toCharArray()); 
          methodOut.getExcptionRecord().setString(CONSTANTS.LOW_VALUE_1901561749);
          methodOut.setExcptionFileStatus(excptionReport.getStatus() );

// *
//  cobolCode::IF EXCPTION-FILE-STATUS NOT = 0
//  IF EXCPTION-FILE-STATUS NOT = 0
          if (	( methodOut.getExcptionFileStatus() != 0 )) { 
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Write EXCEPTION Header failed : File-Status = ' EXCPTION-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Write EXCEPTION Header failed : File-Status = ' EXCPTION-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_37533272);
                 charArray.add(String.valueOf(methodOut.getExcptionFileStatusString()).toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  cobolCode::SELECT EXC_TYPE , EXC_DESCRIPTION FROM TBTRDEXC ORDER BY EXC_TYPE ASC , EXC_DESCRIPTION ASC
//  SELECT EXC_TYPE , EXC_DESCRIPTION FROM TBTRDEXC ORDER BY EXC_TYPE ASC , EXC_DESCRIPTION ASC
          programCtx.setExcptionCursorResultSet(trdpb004Repository.openExcptionCursorTrdpb004(programCtx.getSqlca()));

// *
//  cobolCode::IF SQLCODE NOT = 0 THEN
//  IF SQLCODE NOT = 0 THEN
          if (	( methodOut.getSqlcode() != 0 )) { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Open EXCPTION_CURSOR Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Open EXCPTION_CURSOR Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_320510168);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  cobolCode::FETCH EXCPTION_CURSOR INTO ? , ?
//  FETCH EXCPTION_CURSOR INTO ? , ?
          trdpb004Repository.fetchExcptionCursorTrdpb004(programCtx.getExcptionCursorResultSet(),programCtx.getSqlca(),methodOut.getDcltbtrdexc());

// *
//  cobolCode::EVALUATE TRUE
//  EVALUATE TRUE
          if  (	( methodOut.getSqlcode() == 0 )) { 
              ;
          }
          else if  (	( methodOut.getSqlcode() == 100 )) { 
              // MOVE '*** No Exceptions ****' TO EXCPTION-RECORD
              methodOut.getExcptionRecord().setString(CONSTANTS.LITERAL_1019924377);
//  cobolCode::WRITE EXCPTION-RECORD
//  WRITE EXCPTION-RECORD
              excptionReport.write(methodOut.getExcptionRecord().toCharArray()); 
              methodOut.getExcptionRecord().setString(CONSTANTS.LOW_VALUE_1901561749);
              methodOut.setExcptionFileStatus(excptionReport.getStatus() );
//  cobolCode::IF EXCPTION-FILE-STATUS NOT = 0
//  IF EXCPTION-FILE-STATUS NOT = 0
              if (	( methodOut.getExcptionFileStatus() != 0 )) { 
                  // MOVE SPACES TO WS-EXCEPTION
                  methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Write EXCEPTION FILE failed : File-Status = ' EXCPTION-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Write EXCEPTION FILE failed : File-Status = ' EXCPTION-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_1066450583);
                     charArray.add(String.valueOf(methodOut.getExcptionFileStatusString()).toCharArray());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
              }
          }
          else   { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Fetch EXCPTION_CURSOR Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Fetch EXCPTION_CURSOR Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1352272044);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }

// *

// *
// *        Move exc-timestamp     to prt-excption-ts
//  cobolCode::PERFORM UNTIL SQLCODE NOT = 0
//  PERFORM UNTIL SQLCODE NOT = 0
          while ((	( methodOut.getSqlcode() == 0 ))) {
//  cobolCode::MOVE EXC-TYPE TO PRT-EXCPTION-TYPE
//  MOVE EXC-TYPE TO PRT-EXCPTION-TYPE
              methodOut.setPrtExcptionType(methodOut.getExcType());
//  cobolCode::MOVE EXC-DESCRIPTION-TEXT (1 : EXC-DESCRIPTION-LEN ) TO PRT-EXCPTION-DESC
//  MOVE EXC-DESCRIPTION-TEXT (1 : EXC-DESCRIPTION-LEN ) TO PRT-EXCPTION-DESC
              methodIn.getPrtExcptionRec().replace(methodOut.getDcltbtrdexc()/*parent*/,26/*fromOffset - (prtExcptionDesc) */,methodIn.getExcDescriptionLen()/*fromLen*/,25/*toOffset - (excDescriptionText) */,1000/*toLen*/);

// *

// *
//  cobolCode::WRITE EXCPTION-RECORD FROM PRT-EXCPTION-REC
//  WRITE EXCPTION-RECORD FROM PRT-EXCPTION-REC
              excptionReport.write(methodIn.getPrtExcptionRec().toCharArray()); 
              methodOut.getExcptionRecord().setString(CONSTANTS.LOW_VALUE_1901561749);
              methodOut.setExcptionFileStatus(excptionReport.getStatus() );
//  cobolCode::IF EXCPTION-FILE-STATUS NOT = 0
//  IF EXCPTION-FILE-STATUS NOT = 0
              if (	( methodOut.getExcptionFileStatus() != 0 )) { 
                  // MOVE SPACES TO WS-EXCEPTION
                  methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Write EXCEPTION Header failed : File-Status = ' EXCPTION-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Write EXCEPTION Header failed : File-Status = ' EXCPTION-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_37533272);
                     charArray.add(String.valueOf(methodOut.getExcptionFileStatusString()).toCharArray());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
              }
//  cobolCode::FETCH EXCPTION_CURSOR INTO ? , ?
//  FETCH EXCPTION_CURSOR INTO ? , ?
              trdpb004Repository.fetchExcptionCursor1Trdpb004(programCtx.getExcptionCursorResultSet(),programCtx.getSqlca(),methodOut.getDcltbtrdexc());

// *
//  cobolCode::IF SQLCODE = 0 OR 100 THEN
//  IF SQLCODE = 0 OR 100 THEN
//  cobolCode::ELSE
//  ELSE
              if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != 100 )) { 
                  // MOVE SQLCODE TO WS-SQLCODE
                  //  FORMAT1016334848 = "----"
                  methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
                  // MOVE SPACES TO WS-EXCEPTION
                  methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Fetch EXCPTION_CURSOR Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Fetch EXCPTION_CURSOR Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_1352272044);
                     charArray.add(methodOut.getSqlcode_Ws());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
              }
          }
//  cobolCode::CLOSE EXCPTION_CURSOR
//  CLOSE EXCPTION_CURSOR
          trdpb004Repository.closeExcptionCursorTrdpb004(programCtx.getExcptionCursorResultSet(),programCtx.getSqlca());
//  cobolCode::EVALUATE TRUE
//  EVALUATE TRUE
          if  (	( methodOut.getSqlcode() == 0 )) { 
              ;
          }
          else   { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Close EXCPTION_CURSOR failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Close EXCPTION_CURSOR failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1879447962);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }

// *

// *

// *
//  cobolCode::WRITE EXCPTION-RECORD FROM HDR-EXCPTION-REC-DASH
//  WRITE EXCPTION-RECORD FROM HDR-EXCPTION-REC-DASH
          excptionReport.write(methodIn.getHdrExcptionRecDash().toCharArray()); 
          methodOut.getExcptionRecord().setString(CONSTANTS.LOW_VALUE_1901561749);
          methodOut.setExcptionFileStatus(excptionReport.getStatus() );
//  cobolCode::CLOSE EXCPTION-REPORT
//  CLOSE EXCPTION-REPORT
          excptionReport.close(); 
          methodOut.setExcptionFileStatus(excptionReport.getStatus() );
//  cobolCode::IF EXCPTION-FILE-STATUS NOT = 0
//  IF EXCPTION-FILE-STATUS NOT = 0
          if (	( methodOut.getExcptionFileStatus() != 0 )) { 
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Close EXCEPTION FILE failed : File-Status = ' EXCPTION-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Close EXCEPTION FILE failed : File-Status = ' EXCPTION-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1920531074);
                 charArray.add(String.valueOf(methodOut.getExcptionFileStatusString()).toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
          ;
      
      return methodOut;
      }
      /**
      * processTimings 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PROCESS-TIMINGS COBOL Cyclomatic complexity - 28
      * Input  :  

      * - runlogRecord                   COBOL Name: RUNLOG-RECORD
      * - sqlcode                        COBOL Name: SQLCODE
      * - logTransaction                 COBOL Name: LOG-TRANSACTION
      * - logCurrency                    COBOL Name: LOG-CURRENCY
      * - logStartTs                     COBOL Name: LOG-START-TS
      * - logEndTs                       COBOL Name: LOG-END-TS
      *
      * Output :  

      * - runlogFileStatus               COBOL Name: RUNLOG-FILE-STATUS
      * - summaryFileStatus              COBOL Name: SUMMARY-FILE-STATUS
      * - excptionFileStatus             COBOL Name: EXCPTION-FILE-STATUS
      * - exception                      COBOL Name: WS-EXCEPTION
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - prtRunlogTransaction           COBOL Name: PRT-RUNLOG-TRANSACTION
      * - logTransaction                 COBOL Name: LOG-TRANSACTION
      * - prtRunlogCurrency              COBOL Name: PRT-RUNLOG-CURRENCY
      * - logCurrency                    COBOL Name: LOG-CURRENCY
      * - prtRunlogStartTs               COBOL Name: PRT-RUNLOG-START-TS
      * - logStartTs                     COBOL Name: LOG-START-TS
      * - prtRunlogEndTs                 COBOL Name: PRT-RUNLOG-END-TS
      * - logEndTs                       COBOL Name: LOG-END-TS
      *
      * @throws CFException
      */
      @Override
      public ProcessTimingsOutCtx processTimings(ProcessTimingsInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// *

// *

// *
//Added variable to get the program context in place.
Trdpb004Ctx programCtx = methodIn.getTrdpb004Ctx();
//Added variable to get the output context in place.
ProcessTimingsOutCtx methodOut = methodIn.getProcessTimingsOutCtx();
//  cobolCode::OPEN OUTPUT RUNLOG-REPORT
//  OPEN OUTPUT RUNLOG-REPORT
          runlogReport.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),runlogReport.getFileName(),runlogReport.getRunlogReportCharSet(),runlogReport.getRunlogReportCrlfFlag());
          methodOut.setRunlogFileStatus(runlogReport.getStatus() );
//  cobolCode::IF RUNLOG-FILE-STATUS NOT = 0
//  IF RUNLOG-FILE-STATUS NOT = 0
          if (	( methodOut.getRunlogFileStatus() != 0 )) { 
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Open RUNLOG FILE failed : File-Status = ' RUNLOG-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Open RUNLOG FILE failed : File-Status = ' RUNLOG-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1323385110);
                 charArray.add(String.valueOf(methodOut.getRunlogFileStatusString()).toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }

// *
//  cobolCode::WRITE RUNLOG-RECORD FROM HDR-RUNLOG-REC-DASH
//  WRITE RUNLOG-RECORD FROM HDR-RUNLOG-REC-DASH
          runlogReport.write(methodIn.getHdrRunlogRecDash().toCharArray()); 
          methodOut.getRunlogRecord().setString(CONSTANTS.LOW_VALUE_1253878146);
          methodOut.setRunlogFileStatus(runlogReport.getStatus() );
//  cobolCode::WRITE RUNLOG-RECORD FROM HDR-RUNLOG-REC
//  WRITE RUNLOG-RECORD FROM HDR-RUNLOG-REC
          runlogReport.write(methodIn.getHdrRunlogRec()); 
          methodOut.getRunlogRecord().setString(CONSTANTS.LOW_VALUE_1253878146);
          methodOut.setRunlogFileStatus(runlogReport.getStatus() );
//  cobolCode::WRITE RUNLOG-RECORD FROM HDR-RUNLOG-REC-DASH
//  WRITE RUNLOG-RECORD FROM HDR-RUNLOG-REC-DASH
          runlogReport.write(methodIn.getHdrRunlogRecDash().toCharArray()); 
          methodOut.getRunlogRecord().setString(CONSTANTS.LOW_VALUE_1253878146);
          methodOut.setRunlogFileStatus(runlogReport.getStatus() );

// *
//  cobolCode::IF RUNLOG-FILE-STATUS NOT = 0
//  IF RUNLOG-FILE-STATUS NOT = 0
          if (	( methodOut.getRunlogFileStatus() != 0 )) { 
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Write EXCEPTION Header failed : File-Status = ' RUNLOG-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Write EXCEPTION Header failed : File-Status = ' RUNLOG-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_37533272);
                 charArray.add(String.valueOf(methodOut.getRunlogFileStatusString()).toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  cobolCode::SELECT LOG_TRANSACTION , LOG_CURRENCY , LOG_START_TS , LOG_END_TS FROM TBTRDLOG ORDER BY LOG_TRANSACTION ASC , LOG_CURRENCY ASC
//  SELECT LOG_TRANSACTION , LOG_CURRENCY , LOG_START_TS , LOG_END_TS FROM TBTRDLOG ORDER BY LOG_TRANSACTION ASC , LOG_CURRENCY ASC
          programCtx.setRunlogCursorResultSet(trdpb004Repository.openRunlogCursorTrdpb004(programCtx.getSqlca()));

// *
//  cobolCode::IF SQLCODE NOT = 0 THEN
//  IF SQLCODE NOT = 0 THEN
          if (	( methodOut.getSqlcode() != 0 )) { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Open RUNLOG_CURSOR Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Open RUNLOG_CURSOR Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1964633763);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  cobolCode::FETCH RUNLOG_CURSOR INTO ? , ? , ? , ?
//  FETCH RUNLOG_CURSOR INTO ? , ? , ? , ?
          trdpb004Repository.fetchRunlogCursorTrdpb004(programCtx.getRunlogCursorResultSet(),methodOut.getDcltbtrdlog(),programCtx.getSqlca());

// *
//  cobolCode::EVALUATE TRUE
//  EVALUATE TRUE
          if  (	( methodOut.getSqlcode() == 0 ) || 	( methodOut.getSqlcode() == 100 )) { 
              ;
          }
          else   { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Fetch RUNLOG_CURSOR Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Fetch RUNLOG_CURSOR Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_479762895);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }

// *

// *
//  cobolCode::PERFORM UNTIL SQLCODE NOT = 0
//  PERFORM UNTIL SQLCODE NOT = 0
          while ((	( methodOut.getSqlcode() == 0 ))) {
//  cobolCode::MOVE LOG-TRANSACTION TO PRT-RUNLOG-TRANSACTION
//  MOVE LOG-TRANSACTION TO PRT-RUNLOG-TRANSACTION
              methodOut.setPrtRunlogTransaction(methodOut.getLogTransaction());
//  cobolCode::MOVE LOG-CURRENCY TO PRT-RUNLOG-CURRENCY
//  MOVE LOG-CURRENCY TO PRT-RUNLOG-CURRENCY
              methodOut.setPrtRunlogCurrency(methodOut.getLogCurrency());
//  cobolCode::MOVE LOG-START-TS TO PRT-RUNLOG-START-TS
//  MOVE LOG-START-TS TO PRT-RUNLOG-START-TS
              methodOut.setPrtRunlogStartTs(methodOut.getLogStartTs());
//  cobolCode::MOVE LOG-END-TS TO PRT-RUNLOG-END-TS
//  MOVE LOG-END-TS TO PRT-RUNLOG-END-TS
              methodOut.setPrtRunlogEndTs(methodOut.getLogEndTs());

// *

// *
//  cobolCode::WRITE RUNLOG-RECORD FROM PRT-RUNLOG-REC
//  WRITE RUNLOG-RECORD FROM PRT-RUNLOG-REC
              runlogReport.write(methodIn.getPrtRunlogRec().toCharArray()); 
              methodOut.getRunlogRecord().setString(CONSTANTS.LOW_VALUE_1253878146);
              methodOut.setRunlogFileStatus(runlogReport.getStatus() );
//  cobolCode::IF RUNLOG-FILE-STATUS NOT = 0
//  IF RUNLOG-FILE-STATUS NOT = 0
              if (	( methodOut.getRunlogFileStatus() != 0 )) { 
                  // MOVE SPACES TO WS-EXCEPTION
                  methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Write EXCEPTION Header failed : File-Status = ' RUNLOG-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Write EXCEPTION Header failed : File-Status = ' RUNLOG-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_37533272);
                     charArray.add(String.valueOf(methodOut.getRunlogFileStatusString()).toCharArray());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
              }
//  cobolCode::FETCH RUNLOG_CURSOR INTO ? , ? , ? , ?
//  FETCH RUNLOG_CURSOR INTO ? , ? , ? , ?
              trdpb004Repository.fetchRunlogCursor1Trdpb004(programCtx.getRunlogCursorResultSet(),methodOut.getDcltbtrdlog(),programCtx.getSqlca());

// *
//  cobolCode::IF SQLCODE = 0 OR 100 THEN
//  IF SQLCODE = 0 OR 100 THEN
//  cobolCode::ELSE
//  ELSE
              if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != 100 )) { 
                  // MOVE SQLCODE TO WS-SQLCODE
                  //  FORMAT1016334848 = "----"
                  methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
                  // MOVE SPACES TO WS-EXCEPTION
                  methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Fetch RUNLOG_CURSOR Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Fetch RUNLOG_CURSOR Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_479762895);
                     charArray.add(methodOut.getSqlcode_Ws());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
              }
          }
//  cobolCode::CLOSE RUNLOG_CURSOR
//  CLOSE RUNLOG_CURSOR
          trdpb004Repository.closeRunlogCursorTrdpb004(programCtx.getRunlogCursorResultSet(),programCtx.getSqlca());
//  cobolCode::EVALUATE TRUE
//  EVALUATE TRUE
          if  (	( methodOut.getSqlcode() == 0 )) { 
              ;
          }
          else   { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Close RUNLOG_CURSOR failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Close RUNLOG_CURSOR failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_452817919);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }

// *

// *

// *
//  cobolCode::WRITE RUNLOG-RECORD FROM HDR-RUNLOG-REC-DASH
//  WRITE RUNLOG-RECORD FROM HDR-RUNLOG-REC-DASH
          runlogReport.write(methodIn.getHdrRunlogRecDash().toCharArray()); 
          methodOut.getRunlogRecord().setString(CONSTANTS.LOW_VALUE_1253878146);
          methodOut.setRunlogFileStatus(runlogReport.getStatus() );
//  cobolCode::CLOSE RUNLOG-REPORT
//  CLOSE RUNLOG-REPORT
          runlogReport.close(); 
          methodOut.setRunlogFileStatus(runlogReport.getStatus() );
//  cobolCode::IF RUNLOG-FILE-STATUS NOT = 0
//  IF RUNLOG-FILE-STATUS NOT = 0
          if (	( methodOut.getRunlogFileStatus() != 0 )) { 
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Close RUNLOG FILE failed : File-Status = ' RUNLOG-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Close RUNLOG FILE failed : File-Status = ' RUNLOG-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1091059648);
                 charArray.add(String.valueOf(methodOut.getRunlogFileStatusString()).toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
          ;
      
      return methodOut;
      }
      /**
      * processSummaryRpt 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-PROCESS-SUMMARY-RPT COBOL Cyclomatic complexity - 28
      * Input  :  

      * - summaryRecord                  COBOL Name: SUMMARY-RECORD
      * - sqlcode                        COBOL Name: SQLCODE
      * - sumCustomerId                  COBOL Name: SUM-CUSTOMER-ID
      * - sumOverdue                     COBOL Name: SUM-OVERDUE
      * - sumRejected                    COBOL Name: SUM-REJECTED
      * - sumSettled                     COBOL Name: SUM-SETTLED
      * - sumCurrency                    COBOL Name: SUM-CURRENCY
      * - sumOpenBalance                 COBOL Name: SUM-OPEN-BALANCE
      * - sumTotalDebit                  COBOL Name: SUM-TOTAL-DEBIT
      * - sumTotalCredit                 COBOL Name: SUM-TOTAL-CREDIT
      * - sumCloseBalance                COBOL Name: SUM-CLOSE-BALANCE
      *
      * Output :  

      * - runlogFileStatus               COBOL Name: RUNLOG-FILE-STATUS
      * - summaryFileStatus              COBOL Name: SUMMARY-FILE-STATUS
      * - excptionFileStatus             COBOL Name: EXCPTION-FILE-STATUS
      * - exception                      COBOL Name: WS-EXCEPTION
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - prtSummaryCustomerId           COBOL Name: PRT-SUMMARY-CUSTOMER-ID
      * - sumCustomerId                  COBOL Name: SUM-CUSTOMER-ID
      * - prtSummaryOverdue              COBOL Name: PRT-SUMMARY-OVERDUE
      * - sumOverdue                     COBOL Name: SUM-OVERDUE
      * - prtSummaryRejected             COBOL Name: PRT-SUMMARY-REJECTED
      * - sumRejected                    COBOL Name: SUM-REJECTED
      * - prtSummarySettled              COBOL Name: PRT-SUMMARY-SETTLED
      * - sumSettled                     COBOL Name: SUM-SETTLED
      * - prtSummaryCurrency             COBOL Name: PRT-SUMMARY-CURRENCY
      * - sumCurrency                    COBOL Name: SUM-CURRENCY
      * - prtSummaryOpenBalance          COBOL Name: PRT-SUMMARY-OPEN-BALANCE
      * - sumOpenBalance                 COBOL Name: SUM-OPEN-BALANCE
      * - prtSummaryTotalDebit           COBOL Name: PRT-SUMMARY-TOTAL-DEBIT
      * - sumTotalDebit                  COBOL Name: SUM-TOTAL-DEBIT
      * - prtSummaryTotalCredit          COBOL Name: PRT-SUMMARY-TOTAL-CREDIT
      * - sumTotalCredit                 COBOL Name: SUM-TOTAL-CREDIT
      * - prtSummaryCloseBalance         COBOL Name: PRT-SUMMARY-CLOSE-BALANCE
      * - sumCloseBalance                COBOL Name: SUM-CLOSE-BALANCE
      *
      * @throws CFException
      */
      @Override
      public ProcessSummaryRptOutCtx processSummaryRpt(ProcessSummaryRptInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// *

// *

// *
//Added variable to get the program context in place.
Trdpb004Ctx programCtx = methodIn.getTrdpb004Ctx();
//Added variable to get the output context in place.
ProcessSummaryRptOutCtx methodOut = methodIn.getProcessSummaryRptOutCtx();
//  cobolCode::OPEN OUTPUT SUMMARY-REPORT
//  OPEN OUTPUT SUMMARY-REPORT
          summaryReport.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),summaryReport.getFileName(),summaryReport.getSummaryReportCharSet(),summaryReport.getSummaryReportCrlfFlag());
          methodOut.setSummaryFileStatus(summaryReport.getStatus() );
//  cobolCode::IF SUMMARY-FILE-STATUS NOT = 0
//  IF SUMMARY-FILE-STATUS NOT = 0
          if (	( methodOut.getSummaryFileStatus() != 0 )) { 
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Open SUMMARY FILE failed : File-Status = ' SUMMARY-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Open SUMMARY FILE failed : File-Status = ' SUMMARY-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1195131089);
                 charArray.add(String.valueOf(methodOut.getSummaryFileStatusString()).toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }

// *
//  cobolCode::WRITE SUMMARY-RECORD FROM HDR-SUMMARY-REC-DASH
//  WRITE SUMMARY-RECORD FROM HDR-SUMMARY-REC-DASH
          summaryReport.write(methodIn.getHdrSummaryRecDash().toCharArray()); 
          methodOut.getSummaryRecord().setString(CONSTANTS.LOW_VALUE_215751088);
          methodOut.setSummaryFileStatus(summaryReport.getStatus() );
//  cobolCode::WRITE SUMMARY-RECORD FROM HDR-SUMMARY-REC
//  WRITE SUMMARY-RECORD FROM HDR-SUMMARY-REC
          summaryReport.write(methodIn.getHdrSummaryRec()); 
          methodOut.getSummaryRecord().setString(CONSTANTS.LOW_VALUE_215751088);
          methodOut.setSummaryFileStatus(summaryReport.getStatus() );
//  cobolCode::WRITE SUMMARY-RECORD FROM HDR-SUMMARY-REC-DASH
//  WRITE SUMMARY-RECORD FROM HDR-SUMMARY-REC-DASH
          summaryReport.write(methodIn.getHdrSummaryRecDash().toCharArray()); 
          methodOut.getSummaryRecord().setString(CONSTANTS.LOW_VALUE_215751088);
          methodOut.setSummaryFileStatus(summaryReport.getStatus() );

// *
//  cobolCode::IF SUMMARY-FILE-STATUS NOT = 0
//  IF SUMMARY-FILE-STATUS NOT = 0
          if (	( methodOut.getSummaryFileStatus() != 0 )) { 
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Write EXCEPTION Header failed : File-Status = ' SUMMARY-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Write EXCEPTION Header failed : File-Status = ' SUMMARY-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_37533272);
                 charArray.add(String.valueOf(methodOut.getSummaryFileStatusString()).toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  cobolCode::SELECT SUM_CUSTOMER_ID , SUM_OVERDUE , SUM_REJECTED , SUM_SETTLED , SUM_CURRENCY , SUM_OPEN_BALANCE , SUM_TOTAL_DEBIT , SUM_TOTAL_CREDIT , SUM_CLOSE_BALANCE FROM TBTRDSUM ORDER BY SUM_CUSTOMER_ID ASC
//  SELECT SUM_CUSTOMER_ID , SUM_OVERDUE , SUM_REJECTED , SUM_SETTLED , SUM_CURRENCY , SUM_OPEN_BALANCE , SUM_TOTAL_DEBIT , SUM_TOTAL_CREDIT , SUM_CLOSE_BALANCE FROM TBTRDSUM ORDER BY SUM_CUSTOMER_ID ASC
          programCtx.setSummaryCursorResultSet(trdpb004Repository.openSummaryCursorTrdpb004(programCtx.getSqlca()));

// *
//  cobolCode::IF SQLCODE NOT = 0 THEN
//  IF SQLCODE NOT = 0 THEN
          if (	( methodOut.getSqlcode() != 0 )) { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Open SUMMARY_CURSOR Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Open SUMMARY_CURSOR Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_497856130);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  cobolCode::FETCH SUMMARY_CURSOR INTO ? , ? , ? , ? , ? , ? , ? , ? , ?
//  FETCH SUMMARY_CURSOR INTO ? , ? , ? , ? , ? , ? , ? , ? , ?
          trdpb004Repository.fetchSummaryCursorTrdpb004(programCtx.getSummaryCursorResultSet(),methodOut.getDcltbtrdsum(),programCtx.getSqlca());

// *
//  cobolCode::EVALUATE TRUE
//  EVALUATE TRUE
          if  (	( methodOut.getSqlcode() == 0 ) || 	( methodOut.getSqlcode() == 100 )) { 
              ;
          }
          else   { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Fetch SUMMARY_CURSOR Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Fetch SUMMARY_CURSOR Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_715787218);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }

// *

// *
//  cobolCode::PERFORM UNTIL SQLCODE NOT = 0
//  PERFORM UNTIL SQLCODE NOT = 0
          while ((	( methodOut.getSqlcode() == 0 ))) {
//  cobolCode::MOVE SUM-CUSTOMER-ID TO PRT-SUMMARY-CUSTOMER-ID
//  MOVE SUM-CUSTOMER-ID TO PRT-SUMMARY-CUSTOMER-ID
              methodOut.setPrtSummaryCustomerId(methodOut.getSumCustomerId());
              // MOVE SUM-OVERDUE TO PRT-SUMMARY-OVERDUE
              //  FORMAT769933041 = "ZZZ,ZZZ,ZZ9"
              methodOut.setPrtSummaryOverdue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT769933041,String.valueOf(methodOut.getSumOverdue()).toCharArray()));
              // MOVE SUM-REJECTED TO PRT-SUMMARY-REJECTED
              //  FORMAT769933041 = "ZZZ,ZZZ,ZZ9"
              methodOut.setPrtSummaryRejected(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT769933041,String.valueOf(methodOut.getSumRejected()).toCharArray()));
              // MOVE SUM-SETTLED TO PRT-SUMMARY-SETTLED
              //  FORMAT769933041 = "ZZZ,ZZZ,ZZ9"
              methodOut.setPrtSummarySettled(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT769933041,String.valueOf(methodOut.getSumSettled()).toCharArray()));
//  cobolCode::MOVE SUM-CURRENCY TO PRT-SUMMARY-CURRENCY
//  MOVE SUM-CURRENCY TO PRT-SUMMARY-CURRENCY
              methodOut.setPrtSummaryCurrency(methodOut.getSumCurrency());
//  cobolCode::MOVE SUM-OPEN-BALANCE TO PRT-SUMMARY-OPEN-BALANCE
//  MOVE SUM-OPEN-BALANCE TO PRT-SUMMARY-OPEN-BALANCE
//  FORMAT_1490104077 = "---,---,--9.99"
              methodOut.setPrtSummaryOpenBalance(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1490104077,methodOut.getSumOpenBalance().toPlainString().toCharArray()));
//  cobolCode::MOVE SUM-TOTAL-DEBIT TO PRT-SUMMARY-TOTAL-DEBIT
//  MOVE SUM-TOTAL-DEBIT TO PRT-SUMMARY-TOTAL-DEBIT
//  FORMAT_1490104077 = "---,---,--9.99"
              methodOut.setPrtSummaryTotalDebit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1490104077,methodOut.getSumTotalDebit().toPlainString().toCharArray()));
//  cobolCode::MOVE SUM-TOTAL-CREDIT TO PRT-SUMMARY-TOTAL-CREDIT
//  MOVE SUM-TOTAL-CREDIT TO PRT-SUMMARY-TOTAL-CREDIT
//  FORMAT_1490104077 = "---,---,--9.99"
              methodOut.setPrtSummaryTotalCredit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1490104077,methodOut.getSumTotalCredit().toPlainString().toCharArray()));
//  cobolCode::MOVE SUM-CLOSE-BALANCE TO PRT-SUMMARY-CLOSE-BALANCE
//  MOVE SUM-CLOSE-BALANCE TO PRT-SUMMARY-CLOSE-BALANCE
//  FORMAT_1490104077 = "---,---,--9.99"
              methodOut.setPrtSummaryCloseBalance(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1490104077,methodOut.getSumCloseBalance().toPlainString().toCharArray()));

// *

// *
//  cobolCode::WRITE SUMMARY-RECORD FROM PRT-SUMMARY-REC
//  WRITE SUMMARY-RECORD FROM PRT-SUMMARY-REC
              summaryReport.write(methodIn.getPrtSummaryRec().toCharArray()); 
              methodOut.getSummaryRecord().setString(CONSTANTS.LOW_VALUE_215751088);
              methodOut.setSummaryFileStatus(summaryReport.getStatus() );
//  cobolCode::IF SUMMARY-FILE-STATUS NOT = 0
//  IF SUMMARY-FILE-STATUS NOT = 0
              if (	( methodOut.getSummaryFileStatus() != 0 )) { 
                  // MOVE SPACES TO WS-EXCEPTION
                  methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Write EXCEPTION Header failed : File-Status = ' SUMMARY-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Write EXCEPTION Header failed : File-Status = ' SUMMARY-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_37533272);
                     charArray.add(String.valueOf(methodOut.getSummaryFileStatusString()).toCharArray());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
              }
//  cobolCode::FETCH SUMMARY_CURSOR INTO ? , ? , ? , ? , ? , ? , ? , ?
//  FETCH SUMMARY_CURSOR INTO ? , ? , ? , ? , ? , ? , ? , ?
              trdpb004Repository.fetchSummaryCursor1Trdpb004(programCtx.getSummaryCursorResultSet(),methodOut.getDcltbtrdsum(),programCtx.getSqlca());

// *
//  cobolCode::IF SQLCODE = 0 OR 100 THEN
//  IF SQLCODE = 0 OR 100 THEN
//  cobolCode::ELSE
//  ELSE
              if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != 100 )) { 
                  // MOVE SQLCODE TO WS-SQLCODE
                  //  FORMAT1016334848 = "----"
                  methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
                  // MOVE SPACES TO WS-EXCEPTION
                  methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Fetch SUMMARY_CURSOR Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Fetch SUMMARY_CURSOR Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_715787218);
                     charArray.add(methodOut.getSqlcode_Ws());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
              }
          }
//  cobolCode::CLOSE SUMMARY_CURSOR
//  CLOSE SUMMARY_CURSOR
          trdpb004Repository.closeSummaryCursorTrdpb004(programCtx.getSummaryCursorResultSet(),programCtx.getSqlca());
//  cobolCode::EVALUATE TRUE
//  EVALUATE TRUE
          if  (	( methodOut.getSqlcode() == 0 )) { 
              ;
          }
          else   { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Close SUMMARY_CURSOR failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Close SUMMARY_CURSOR failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1681395608);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }

// *

// *

// *
//  cobolCode::WRITE SUMMARY-RECORD FROM HDR-SUMMARY-REC-DASH
//  WRITE SUMMARY-RECORD FROM HDR-SUMMARY-REC-DASH
          summaryReport.write(methodIn.getHdrSummaryRecDash().toCharArray()); 
          methodOut.getSummaryRecord().setString(CONSTANTS.LOW_VALUE_215751088);
          methodOut.setSummaryFileStatus(summaryReport.getStatus() );
//  cobolCode::CLOSE SUMMARY-REPORT
//  CLOSE SUMMARY-REPORT
          summaryReport.close(); 
          methodOut.setSummaryFileStatus(summaryReport.getStatus() );
//  cobolCode::IF SUMMARY-FILE-STATUS NOT = 0
//  IF SUMMARY-FILE-STATUS NOT = 0
          if (	( methodOut.getSummaryFileStatus() != 0 )) { 
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Close SUMMARY FILE failed : File-Status = ' SUMMARY-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Close SUMMARY FILE failed : File-Status = ' SUMMARY-FILE-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_638212377);
                 charArray.add(String.valueOf(methodOut.getSummaryFileStatusString()).toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
          ;
      
      return methodOut;
      }
      /**
      * cleanup 
      *   This method is derived from 
  *   COBOL Paragraph - 4000-CLEANUP COBOL Cyclomatic complexity - 6
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public CleanupOutCtx cleanup(Trdpb004Ctx programCtx) throws Exception {
      
// *
//Added variable to get the output context in place.
CleanupOutCtx methodOut = programCtx.getCleanupOutCtx();
//  cobolCode::DELETE FROM TBTRDSTQ
//  DELETE FROM TBTRDSTQ
          trdpb004Repository.deleteTbtrdstq(programCtx.getSqlca());
//  cobolCode::DELETE FROM TBTRDLOG
//  DELETE FROM TBTRDLOG
          trdpb004Repository.deleteTbtrdlog(programCtx.getSqlca());
//  cobolCode::DELETE FROM TBTRDSUM
//  DELETE FROM TBTRDSUM
          trdpb004Repository.deleteTbtrdsum(programCtx.getSqlca());
//  cobolCode::DELETE FROM TBTRDEXC
//  DELETE FROM TBTRDEXC
          trdpb004Repository.deleteTbtrdexc(programCtx.getSqlca());
//  cobolCode::COMMIT
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
      
      return methodOut;
      }
      /**
      * reportException 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-REPORT-EXCEPTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - exception                      COBOL Name: WS-EXCEPTION
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public ReportExceptionOutCtx reportException(ReportExceptionInCtx methodIn) throws Exception {
      
// *

// *
//Added variable to get the program context in place.
Trdpb004Ctx programCtx = methodIn.getTrdpb004Ctx();
//Added variable to get the output context in place.
ReportExceptionOutCtx methodOut = methodIn.getReportExceptionOutCtx();
//  cobolCode::DISPLAY WS-EXCEPTION
//  DISPLAY WS-EXCEPTION
          logger.info(new String(methodIn.getException())); 
          // MOVE 16 TO RETURN-CODE
          programCtx.setRc( 16);
//  cobolCode::GOBACK
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
  
  
  
  
  
  
  
  
  }
