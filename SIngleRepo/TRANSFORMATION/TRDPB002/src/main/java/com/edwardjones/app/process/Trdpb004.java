package com.edwardjones.app.process;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import com.edwardjones.app.trdpb004.Trdpb004Ctx;
import com.edwardjones.app.trdpb004.Trdpb004Ctx.CleanupOutCtx;
import com.edwardjones.app.trdpb004.Trdpb004Ctx.InitializeOutCtx;
import com.edwardjones.app.trdpb004.Trdpb004Ctx.MainlineOutCtx;
import com.edwardjones.app.trdpb004.Trdpb004Ctx.ProcessExceptionInCtx;
import com.edwardjones.app.trdpb004.Trdpb004Ctx.ProcessExceptionOutCtx;
import com.edwardjones.app.trdpb004.Trdpb004Ctx.ProcessSummaryRptInCtx;
import com.edwardjones.app.trdpb004.Trdpb004Ctx.ProcessSummaryRptOutCtx;
import com.edwardjones.app.trdpb004.Trdpb004Ctx.ProcessTimingsInCtx;
import com.edwardjones.app.trdpb004.Trdpb004Ctx.ProcessTimingsOutCtx;
import com.edwardjones.app.trdpb004.Trdpb004Ctx.ReportExceptionInCtx;
import com.edwardjones.app.trdpb004.Trdpb004Ctx.ReportExceptionOutCtx;

public interface Trdpb004 {
  /**
   * This method is derived from Cobol Paragraph - PROCESS
   *
   * @return Return Code of the this class
   */
  public int process(Trdpb004Ctx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0000-MAINLINE
   *
   * @return
   */
  public MainlineOutCtx mainline(Trdpb004Ctx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0001-INITIALIZE
   *
   * @return
   */
  public InitializeOutCtx initialize(Trdpb004Ctx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1000-PROCESS-EXCEPTION
   *
   * @return
   */
  public ProcessExceptionOutCtx processException(ProcessExceptionInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2000-PROCESS-TIMINGS
   *
   * @return
   */
  public ProcessTimingsOutCtx processTimings(ProcessTimingsInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3000-PROCESS-SUMMARY-RPT
   *
   * @return
   */
  public ProcessSummaryRptOutCtx processSummaryRpt(ProcessSummaryRptInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4000-CLEANUP
   *
   * @return
   */
  public CleanupOutCtx cleanup(Trdpb004Ctx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 9000-REPORT-EXCEPTION
   *
   * @return
   */
  public ReportExceptionOutCtx reportException(ReportExceptionInCtx methodIn) throws Exception;

  /**
   * This will invoke the program given parameters from the caller program.
   *
   * @return return code of the program
   */
  public int call(ProgramContext programCtx, Object[] parameters) throws Exception;

  /**
   * This will invoke the program given Field parameters from the caller program.
   *
   * @return return code of the program
   */
  public int call(ProgramContext programCtx, Field... parameters) throws Exception;
}
