package com.edwardjones.app.process;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import com.edwardjones.app.trdpb002.Trdpb002Ctx;
import com.edwardjones.app.trdpb002.Trdpb002Ctx.MainlineOutCtx;
import com.edwardjones.app.trdpb002.Trdpb002Ctx.ReportExceptionInCtx;
import com.edwardjones.app.trdpb002.Trdpb002Ctx.ReportExceptionOutCtx;
import com.edwardjones.app.trdpb002.Trdpb002Ctx.SacBookingInCtx;
import com.edwardjones.app.trdpb002.Trdpb002Ctx.SacBookingOutCtx;

public interface Trdpb002 {
  /**
   * This method is derived from Cobol Paragraph -
   *
   * @return return code of program
   */
  public int setParameter(Trdpb002Ctx programCtx, String parm) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - PROCESS
   *
   * @return Return Code of the this class
   */
  public int process(Trdpb002Ctx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0000-MAINLINE
   *
   * @return
   */
  public MainlineOutCtx mainline(Trdpb002Ctx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1000-SAC-BOOKING
   *
   * @return
   */
  public SacBookingOutCtx sacBooking(SacBookingInCtx methodIn) throws Exception;

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
