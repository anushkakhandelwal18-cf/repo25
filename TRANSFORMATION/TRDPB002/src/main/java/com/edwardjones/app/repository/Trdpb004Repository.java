package com.edwardjones.app.repository;

import com.edwardjones.app.trdpb004.dto.*;
import java.sql.ResultSet;

public interface Trdpb004Repository {
  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @return
   */
  public ResultSet openExcptionCursorTrdpb004(Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dcltbtrdexc
   */
  public void fetchExcptionCursorTrdpb004(
      ResultSet excptionCursorResultSet, Sqlca sqlca, Dcltbtrdexc dcltbtrdexc) throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dcltbtrdexc
   */
  public void fetchExcptionCursor1Trdpb004(
      ResultSet excptionCursorResultSet, Sqlca sqlca, Dcltbtrdexc dcltbtrdexc) throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeExcptionCursorTrdpb004(ResultSet excptionCursorResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @return
   */
  public ResultSet openRunlogCursorTrdpb004(Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm dcltbtrdlog
   * @parm sqlca
   */
  public void fetchRunlogCursorTrdpb004(
      ResultSet runlogCursorResultSet, Dcltbtrdlog dcltbtrdlog, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm dcltbtrdlog
   * @parm sqlca
   */
  public void fetchRunlogCursor1Trdpb004(
      ResultSet runlogCursorResultSet, Dcltbtrdlog dcltbtrdlog, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeRunlogCursorTrdpb004(ResultSet runlogCursorResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @return
   */
  public ResultSet openSummaryCursorTrdpb004(Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm dcltbtrdsum
   * @parm sqlca
   */
  public void fetchSummaryCursorTrdpb004(
      ResultSet summaryCursorResultSet, Dcltbtrdsum dcltbtrdsum, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm dcltbtrdsum
   * @parm sqlca
   */
  public void fetchSummaryCursor1Trdpb004(
      ResultSet summaryCursorResultSet, Dcltbtrdsum dcltbtrdsum, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeSummaryCursorTrdpb004(ResultSet summaryCursorResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   */
  public void deleteTbtrdstq(Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   */
  public void deleteTbtrdlog(Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   */
  public void deleteTbtrdsum(Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   */
  public void deleteTbtrdexc(Sqlca sqlca) throws Exception;
}
