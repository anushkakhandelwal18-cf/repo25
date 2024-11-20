package com.edwardjones.app.trdpb004;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.edwardjones.app.trdpb004.dto.HdrRunlogRecDash;
import com.edwardjones.app.trdpb004.dto.Dcltbtrdlog;
import com.edwardjones.app.trdpb004.dto.Sqlwarn;
import com.edwardjones.app.trdpb004.dto.PrtRunlogRec;
import com.edwardjones.app.trdpb004.dto.PrtSummaryRec;
import com.edwardjones.app.trdpb004.file.records.SummaryRecord;
import com.edwardjones.app.trdpb004.file.records.RunlogRecord;
import com.edwardjones.app.trdpb004.dto.HdrExcptionRecDash;
import com.edwardjones.app.trdpb004.dto.HdrSummaryRecDash;
import com.edwardjones.app.trdpb004.dto.PrtExcptionRec;
import com.edwardjones.app.trdpb004.dto.Dcltbtrdexc;
import java.sql.ResultSet;
import com.edwardjones.app.trdpb004.dto.Work;
import com.edwardjones.app.trdpb004.dto.Dcltbtrdsum;
import com.edwardjones.app.trdpb004.file.records.ExcptionRecord;
import com.edwardjones.app.trdpb004.dto.ExcDescription;
import com.edwardjones.app.trdpb004.dto.Sqlca;


@Context
public class Trdpb004Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    SummaryRecord summaryRecord;
    ExcptionRecord excptionRecord;
    PrtRunlogRec prtRunlogRec;
    PrtSummaryRec prtSummaryRec;
    Work work;
    Dcltbtrdexc dcltbtrdexc;
    HdrRunlogRecDash hdrRunlogRecDash;
    RunlogRecord runlogRecord;
    Dcltbtrdlog dcltbtrdlog;
    Dcltbtrdsum dcltbtrdsum;
    HdrSummaryRecDash hdrSummaryRecDash;
    PrtExcptionRec prtExcptionRec;
    Sqlca sqlca;
    HdrExcptionRecDash hdrExcptionRecDash;


    private int rc;

    public GlobalExecutorCtx getGlobalCtx() {
            return globalCtx;
    }

    public void setGlobalCtx(GlobalExecutorCtx globalCtx) {
        this.globalCtx = globalCtx;
    }

    public int getRc() {
        return this.rc;
    }

    public void setRc(int rc) {
        this.rc = rc;
    }


    ResultSet excptionCursorResultSet;

    public ResultSet getExcptionCursorResultSet() {
        return this.excptionCursorResultSet;
    }

    public void setExcptionCursorResultSet(ResultSet excptionCursorResultSet) {
        this.excptionCursorResultSet = excptionCursorResultSet;
    }
    ResultSet runlogCursorResultSet;

    public ResultSet getRunlogCursorResultSet() {
        return this.runlogCursorResultSet;
    }

    public void setRunlogCursorResultSet(ResultSet runlogCursorResultSet) {
        this.runlogCursorResultSet = runlogCursorResultSet;
    }
    ResultSet summaryCursorResultSet;

    public ResultSet getSummaryCursorResultSet() {
        return this.summaryCursorResultSet;
    }

    public void setSummaryCursorResultSet(ResultSet summaryCursorResultSet) {
        this.summaryCursorResultSet = summaryCursorResultSet;
    }

    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }


    public SummaryRecord getSummaryRecord() {
        if (summaryRecord == null) {
            summaryRecord = new SummaryRecord();
        }

        return summaryRecord;
    }

    public void setSummaryRecord(SummaryRecord summaryRecord) {
        this.summaryRecord = summaryRecord;
    }
    public ExcptionRecord getExcptionRecord() {
        if (excptionRecord == null) {
            excptionRecord = new ExcptionRecord();
        }

        return excptionRecord;
    }

    public void setExcptionRecord(ExcptionRecord excptionRecord) {
        this.excptionRecord = excptionRecord;
    }
    public PrtRunlogRec getPrtRunlogRec() {
        if (prtRunlogRec == null) {
            prtRunlogRec = new PrtRunlogRec();
        }

        return prtRunlogRec;
    }

    public void setPrtRunlogRec(PrtRunlogRec prtRunlogRec) {
        this.prtRunlogRec = prtRunlogRec;
    }
    public PrtSummaryRec getPrtSummaryRec() {
        if (prtSummaryRec == null) {
            prtSummaryRec = new PrtSummaryRec();
        }

        return prtSummaryRec;
    }

    public void setPrtSummaryRec(PrtSummaryRec prtSummaryRec) {
        this.prtSummaryRec = prtSummaryRec;
    }
    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
    public Dcltbtrdexc getDcltbtrdexc() {
        if (dcltbtrdexc == null) {
            dcltbtrdexc = new Dcltbtrdexc();
        }

        return dcltbtrdexc;
    }

    public void setDcltbtrdexc(Dcltbtrdexc dcltbtrdexc) {
        this.dcltbtrdexc = dcltbtrdexc;
    }
    public HdrRunlogRecDash getHdrRunlogRecDash() {
        if (hdrRunlogRecDash == null) {
            hdrRunlogRecDash = new HdrRunlogRecDash();
        }

        return hdrRunlogRecDash;
    }

    public void setHdrRunlogRecDash(HdrRunlogRecDash hdrRunlogRecDash) {
        this.hdrRunlogRecDash = hdrRunlogRecDash;
    }
    public RunlogRecord getRunlogRecord() {
        if (runlogRecord == null) {
            runlogRecord = new RunlogRecord();
        }

        return runlogRecord;
    }

    public void setRunlogRecord(RunlogRecord runlogRecord) {
        this.runlogRecord = runlogRecord;
    }
    public Dcltbtrdlog getDcltbtrdlog() {
        if (dcltbtrdlog == null) {
            dcltbtrdlog = new Dcltbtrdlog();
        }

        return dcltbtrdlog;
    }

    public void setDcltbtrdlog(Dcltbtrdlog dcltbtrdlog) {
        this.dcltbtrdlog = dcltbtrdlog;
    }
    public Dcltbtrdsum getDcltbtrdsum() {
        if (dcltbtrdsum == null) {
            dcltbtrdsum = new Dcltbtrdsum();
        }

        return dcltbtrdsum;
    }

    public void setDcltbtrdsum(Dcltbtrdsum dcltbtrdsum) {
        this.dcltbtrdsum = dcltbtrdsum;
    }
    public HdrSummaryRecDash getHdrSummaryRecDash() {
        if (hdrSummaryRecDash == null) {
            hdrSummaryRecDash = new HdrSummaryRecDash();
        }

        return hdrSummaryRecDash;
    }

    public void setHdrSummaryRecDash(HdrSummaryRecDash hdrSummaryRecDash) {
        this.hdrSummaryRecDash = hdrSummaryRecDash;
    }
    public PrtExcptionRec getPrtExcptionRec() {
        if (prtExcptionRec == null) {
            prtExcptionRec = new PrtExcptionRec();
        }

        return prtExcptionRec;
    }

    public void setPrtExcptionRec(PrtExcptionRec prtExcptionRec) {
        this.prtExcptionRec = prtExcptionRec;
    }
    public Sqlca getSqlca() {
        if (sqlca == null) {
            sqlca = new Sqlca();
        }

        return sqlca;
    }

    public void setSqlca(Sqlca sqlca) {
        this.sqlca = sqlca;
    }
    public HdrExcptionRecDash getHdrExcptionRecDash() {
        if (hdrExcptionRecDash == null) {
            hdrExcptionRecDash = new HdrExcptionRecDash();
        }

        return hdrExcptionRecDash;
    }

    public void setHdrExcptionRecDash(HdrExcptionRecDash hdrExcptionRecDash) {
        this.hdrExcptionRecDash = hdrExcptionRecDash;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += summaryRecord.hashCode();
        str += excptionRecord.hashCode();
        str += prtRunlogRec.hashCode();
        str += prtSummaryRec.hashCode();
        str += work.hashCode();
        str += dcltbtrdexc.hashCode();
        str += hdrRunlogRecDash.hashCode();
        str += runlogRecord.hashCode();
        str += dcltbtrdlog.hashCode();
        str += dcltbtrdsum.hashCode();
        str += hdrSummaryRecDash.hashCode();
        str += prtExcptionRec.hashCode();
        str += sqlca.hashCode();
        str += hdrExcptionRecDash.hashCode();
       return str.hashCode();
    }

    public Trdpb004Ctx clone() {
        Trdpb004Ctx cloneObj = new Trdpb004Ctx();
        cloneObj.summaryRecord = new SummaryRecord();
        cloneObj.summaryRecord.set(summaryRecord.getClonedField());
        cloneObj.excptionRecord = new ExcptionRecord();
        cloneObj.excptionRecord.set(excptionRecord.getClonedField());
        cloneObj.prtRunlogRec = new PrtRunlogRec();
        cloneObj.prtRunlogRec.set(prtRunlogRec.getClonedField());
        cloneObj.prtSummaryRec = new PrtSummaryRec();
        cloneObj.prtSummaryRec.set(prtSummaryRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dcltbtrdexc = new Dcltbtrdexc();
        cloneObj.dcltbtrdexc.set(dcltbtrdexc.getClonedField());
        cloneObj.hdrRunlogRecDash = new HdrRunlogRecDash();
        cloneObj.hdrRunlogRecDash.set(hdrRunlogRecDash.getClonedField());
        cloneObj.runlogRecord = new RunlogRecord();
        cloneObj.runlogRecord.set(runlogRecord.getClonedField());
        cloneObj.dcltbtrdlog = new Dcltbtrdlog();
        cloneObj.dcltbtrdlog.set(dcltbtrdlog.getClonedField());
        cloneObj.dcltbtrdsum = new Dcltbtrdsum();
        cloneObj.dcltbtrdsum.set(dcltbtrdsum.getClonedField());
        cloneObj.hdrSummaryRecDash = new HdrSummaryRecDash();
        cloneObj.hdrSummaryRecDash.set(hdrSummaryRecDash.getClonedField());
        cloneObj.prtExcptionRec = new PrtExcptionRec();
        cloneObj.prtExcptionRec.set(prtExcptionRec.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.hdrExcptionRecDash = new HdrExcptionRecDash();
        cloneObj.hdrExcptionRecDash.set(hdrExcptionRecDash.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineOutCtx implements Cloneable {
     Sqlca sqlca = Trdpb004Ctx.this.getSqlca();

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }



        public Trdpb004Ctx getTrdpb004Ctx() {
            return Trdpb004Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class InitializeOutCtx implements Cloneable {
     HdrRunlogRecDash hdrRunlogRecDash = Trdpb004Ctx.this.getHdrRunlogRecDash();
     HdrSummaryRecDash hdrSummaryRecDash = Trdpb004Ctx.this.getHdrSummaryRecDash();
     HdrExcptionRecDash hdrExcptionRecDash = Trdpb004Ctx.this.getHdrExcptionRecDash();

	/**
	 *	Returns the value of filler202
	 *	@return filler202
	 */
   public char[] getFiller202() throws CFException  {              
   		return hdrSummaryRecDash.getFiller202();
   }

  
	/**
	*  set variable filler202
	*  @param value
	**/
   public void setFiller202(char[] value) throws CFException {
      hdrSummaryRecDash.setFiller202(value);
   } 

     /**
	 * 	Update Filler202 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller202(char[] source, int sourceIndex) throws CFException {
      hdrSummaryRecDash.setFiller202(source, sourceIndex);
   	
   }
   
   public void setFiller202(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrSummaryRecDash.setFiller202(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Filler202 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller202(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrSummaryRecDash.setFiller202(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Filler202 with another Field
	 *	@param value
	 */
   public void setFiller202(Field source) {
      hdrSummaryRecDash.setFiller202(source);
   }  
   
     /**
	 * 	Update Filler202 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller202(Field source, int sourceIndex,int sourceLen) {
      hdrSummaryRecDash.setFiller202(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Filler202 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller202(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrSummaryRecDash.setFiller202(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of filler301
	 *	@return filler301
	 */
   public char[] getFiller301() throws CFException  {              
   		return hdrSummaryRecDash.getFiller301();
   }

  
	/**
	*  set variable filler301
	*  @param value
	**/
   public void setFiller301(char[] value) throws CFException {
      hdrSummaryRecDash.setFiller301(value);
   } 

     /**
	 * 	Update Filler301 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller301(char[] source, int sourceIndex) throws CFException {
      hdrSummaryRecDash.setFiller301(source, sourceIndex);
   	
   }
   
   public void setFiller301(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrSummaryRecDash.setFiller301(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Filler301 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller301(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrSummaryRecDash.setFiller301(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Filler301 with another Field
	 *	@param value
	 */
   public void setFiller301(Field source) {
      hdrSummaryRecDash.setFiller301(source);
   }  
   
     /**
	 * 	Update Filler301 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller301(Field source, int sourceIndex,int sourceLen) {
      hdrSummaryRecDash.setFiller301(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Filler301 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller301(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrSummaryRecDash.setFiller301(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of filler6
	 *	@return filler6
	 */
   public char[] getFiller6() throws CFException  {              
   		return hdrSummaryRecDash.getFiller6();
   }

  
	/**
	*  set variable filler6
	*  @param value
	**/
   public void setFiller6(char[] value) throws CFException {
      hdrSummaryRecDash.setFiller6(value);
   } 

     /**
	 * 	Update Filler6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller6(char[] source, int sourceIndex) throws CFException {
      hdrSummaryRecDash.setFiller6(source, sourceIndex);
   	
   }
   
   public void setFiller6(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrSummaryRecDash.setFiller6(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Filler6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrSummaryRecDash.setFiller6(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Filler6 with another Field
	 *	@param value
	 */
   public void setFiller6(Field source) {
      hdrSummaryRecDash.setFiller6(source);
   }  
   
     /**
	 * 	Update Filler6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller6(Field source, int sourceIndex,int sourceLen) {
      hdrSummaryRecDash.setFiller6(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Filler6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrSummaryRecDash.setFiller6(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of filler7
	 *	@return filler7
	 */
   public char[] getFiller7() throws CFException  {              
   		return hdrSummaryRecDash.getFiller7();
   }

  
	/**
	*  set variable filler7
	*  @param value
	**/
   public void setFiller7(char[] value) throws CFException {
      hdrSummaryRecDash.setFiller7(value);
   } 

     /**
	 * 	Update Filler7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller7(char[] source, int sourceIndex) throws CFException {
      hdrSummaryRecDash.setFiller7(source, sourceIndex);
   	
   }
   
   public void setFiller7(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrSummaryRecDash.setFiller7(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Filler7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrSummaryRecDash.setFiller7(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Filler7 with another Field
	 *	@param value
	 */
   public void setFiller7(Field source) {
      hdrSummaryRecDash.setFiller7(source);
   }  
   
     /**
	 * 	Update Filler7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller7(Field source, int sourceIndex,int sourceLen) {
      hdrSummaryRecDash.setFiller7(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Filler7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrSummaryRecDash.setFiller7(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of filler102
	 *	@return filler102
	 */
   public char[] getFiller102() throws CFException  {              
   		return hdrSummaryRecDash.getFiller102();
   }

  
	/**
	*  set variable filler102
	*  @param value
	**/
   public void setFiller102(char[] value) throws CFException {
      hdrSummaryRecDash.setFiller102(value);
   } 

     /**
	 * 	Update Filler102 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller102(char[] source, int sourceIndex) throws CFException {
      hdrSummaryRecDash.setFiller102(source, sourceIndex);
   	
   }
   
   public void setFiller102(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrSummaryRecDash.setFiller102(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Filler102 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller102(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrSummaryRecDash.setFiller102(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Filler102 with another Field
	 *	@param value
	 */
   public void setFiller102(Field source) {
      hdrSummaryRecDash.setFiller102(source);
   }  
   
     /**
	 * 	Update Filler102 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller102(Field source, int sourceIndex,int sourceLen) {
      hdrSummaryRecDash.setFiller102(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Filler102 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller102(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrSummaryRecDash.setFiller102(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of filler2
	 *	@return filler2
	 */
   public char[] getFiller2() throws CFException  {              
   		return hdrRunlogRecDash.getFiller2();
   }

  
	/**
	*  set variable filler2
	*  @param value
	**/
   public void setFiller2(char[] value) throws CFException {
      hdrRunlogRecDash.setFiller2(value);
   } 

     /**
	 * 	Update Filler2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller2(char[] source, int sourceIndex) throws CFException {
      hdrRunlogRecDash.setFiller2(source, sourceIndex);
   	
   }
   
   public void setFiller2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrRunlogRecDash.setFiller2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Filler2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrRunlogRecDash.setFiller2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Filler2 with another Field
	 *	@param value
	 */
   public void setFiller2(Field source) {
      hdrRunlogRecDash.setFiller2(source);
   }  
   
     /**
	 * 	Update Filler2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller2(Field source, int sourceIndex,int sourceLen) {
      hdrRunlogRecDash.setFiller2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Filler2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrRunlogRecDash.setFiller2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of filler8
	 *	@return filler8
	 */
   public char[] getFiller8() throws CFException  {              
   		return hdrSummaryRecDash.getFiller8();
   }

  
	/**
	*  set variable filler8
	*  @param value
	**/
   public void setFiller8(char[] value) throws CFException {
      hdrSummaryRecDash.setFiller8(value);
   } 

     /**
	 * 	Update Filler8 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller8(char[] source, int sourceIndex) throws CFException {
      hdrSummaryRecDash.setFiller8(source, sourceIndex);
   	
   }
   
   public void setFiller8(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrSummaryRecDash.setFiller8(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Filler8 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrSummaryRecDash.setFiller8(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Filler8 with another Field
	 *	@param value
	 */
   public void setFiller8(Field source) {
      hdrSummaryRecDash.setFiller8(source);
   }  
   
     /**
	 * 	Update Filler8 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller8(Field source, int sourceIndex,int sourceLen) {
      hdrSummaryRecDash.setFiller8(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Filler8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrSummaryRecDash.setFiller8(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of filler3
	 *	@return filler3
	 */
   public char[] getFiller3() throws CFException  {              
   		return hdrRunlogRecDash.getFiller3();
   }

  
	/**
	*  set variable filler3
	*  @param value
	**/
   public void setFiller3(char[] value) throws CFException {
      hdrRunlogRecDash.setFiller3(value);
   } 

     /**
	 * 	Update Filler3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller3(char[] source, int sourceIndex) throws CFException {
      hdrRunlogRecDash.setFiller3(source, sourceIndex);
   	
   }
   
   public void setFiller3(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrRunlogRecDash.setFiller3(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Filler3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrRunlogRecDash.setFiller3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Filler3 with another Field
	 *	@param value
	 */
   public void setFiller3(Field source) {
      hdrRunlogRecDash.setFiller3(source);
   }  
   
     /**
	 * 	Update Filler3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller3(Field source, int sourceIndex,int sourceLen) {
      hdrRunlogRecDash.setFiller3(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Filler3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrRunlogRecDash.setFiller3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of filler4
	 *	@return filler4
	 */
   public char[] getFiller4() throws CFException  {              
   		return hdrRunlogRecDash.getFiller4();
   }

  
	/**
	*  set variable filler4
	*  @param value
	**/
   public void setFiller4(char[] value) throws CFException {
      hdrRunlogRecDash.setFiller4(value);
   } 

     /**
	 * 	Update Filler4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller4(char[] source, int sourceIndex) throws CFException {
      hdrRunlogRecDash.setFiller4(source, sourceIndex);
   	
   }
   
   public void setFiller4(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrRunlogRecDash.setFiller4(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Filler4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrRunlogRecDash.setFiller4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Filler4 with another Field
	 *	@param value
	 */
   public void setFiller4(Field source) {
      hdrRunlogRecDash.setFiller4(source);
   }  
   
     /**
	 * 	Update Filler4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller4(Field source, int sourceIndex,int sourceLen) {
      hdrRunlogRecDash.setFiller4(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Filler4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrRunlogRecDash.setFiller4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of filler401
	 *	@return filler401
	 */
   public char[] getFiller401() throws CFException  {              
   		return hdrSummaryRecDash.getFiller401();
   }

  
	/**
	*  set variable filler401
	*  @param value
	**/
   public void setFiller401(char[] value) throws CFException {
      hdrSummaryRecDash.setFiller401(value);
   } 

     /**
	 * 	Update Filler401 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller401(char[] source, int sourceIndex) throws CFException {
      hdrSummaryRecDash.setFiller401(source, sourceIndex);
   	
   }
   
   public void setFiller401(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrSummaryRecDash.setFiller401(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Filler401 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller401(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrSummaryRecDash.setFiller401(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Filler401 with another Field
	 *	@param value
	 */
   public void setFiller401(Field source) {
      hdrSummaryRecDash.setFiller401(source);
   }  
   
     /**
	 * 	Update Filler401 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller401(Field source, int sourceIndex,int sourceLen) {
      hdrSummaryRecDash.setFiller401(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Filler401 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller401(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrSummaryRecDash.setFiller401(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of filler1
	 *	@return filler1
	 */
   public char[] getFiller1() throws CFException  {              
   		return hdrRunlogRecDash.getFiller1();
   }

  
	/**
	*  set variable filler1
	*  @param value
	**/
   public void setFiller1(char[] value) throws CFException {
      hdrRunlogRecDash.setFiller1(value);
   } 

     /**
	 * 	Update Filler1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller1(char[] source, int sourceIndex) throws CFException {
      hdrRunlogRecDash.setFiller1(source, sourceIndex);
   	
   }
   
   public void setFiller1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrRunlogRecDash.setFiller1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Filler1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrRunlogRecDash.setFiller1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Filler1 with another Field
	 *	@param value
	 */
   public void setFiller1(Field source) {
      hdrRunlogRecDash.setFiller1(source);
   }  
   
     /**
	 * 	Update Filler1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller1(Field source, int sourceIndex,int sourceLen) {
      hdrRunlogRecDash.setFiller1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Filler1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrRunlogRecDash.setFiller1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of filler9
	 *	@return filler9
	 */
   public char[] getFiller9() throws CFException  {              
   		return hdrSummaryRecDash.getFiller9();
   }

  
	/**
	*  set variable filler9
	*  @param value
	**/
   public void setFiller9(char[] value) throws CFException {
      hdrSummaryRecDash.setFiller9(value);
   } 

     /**
	 * 	Update Filler9 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller9(char[] source, int sourceIndex) throws CFException {
      hdrSummaryRecDash.setFiller9(source, sourceIndex);
   	
   }
   
   public void setFiller9(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrSummaryRecDash.setFiller9(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Filler9 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrSummaryRecDash.setFiller9(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Filler9 with another Field
	 *	@param value
	 */
   public void setFiller9(Field source) {
      hdrSummaryRecDash.setFiller9(source);
   }  
   
     /**
	 * 	Update Filler9 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller9(Field source, int sourceIndex,int sourceLen) {
      hdrSummaryRecDash.setFiller9(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Filler9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrSummaryRecDash.setFiller9(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of filler101
	 *	@return filler101
	 */
   public char[] getFiller101() throws CFException  {              
   		return hdrExcptionRecDash.getFiller101();
   }

  
	/**
	*  set variable filler101
	*  @param value
	**/
   public void setFiller101(char[] value) throws CFException {
      hdrExcptionRecDash.setFiller101(value);
   } 

     /**
	 * 	Update Filler101 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller101(char[] source, int sourceIndex) throws CFException {
      hdrExcptionRecDash.setFiller101(source, sourceIndex);
   	
   }
   
   public void setFiller101(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrExcptionRecDash.setFiller101(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Filler101 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller101(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrExcptionRecDash.setFiller101(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Filler101 with another Field
	 *	@param value
	 */
   public void setFiller101(Field source) {
      hdrExcptionRecDash.setFiller101(source);
   }  
   
     /**
	 * 	Update Filler101 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller101(Field source, int sourceIndex,int sourceLen) {
      hdrExcptionRecDash.setFiller101(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Filler101 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller101(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrExcptionRecDash.setFiller101(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of filler5
	 *	@return filler5
	 */
   public char[] getFiller5() throws CFException  {              
   		return hdrSummaryRecDash.getFiller5();
   }

  
	/**
	*  set variable filler5
	*  @param value
	**/
   public void setFiller5(char[] value) throws CFException {
      hdrSummaryRecDash.setFiller5(value);
   } 

     /**
	 * 	Update Filler5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller5(char[] source, int sourceIndex) throws CFException {
      hdrSummaryRecDash.setFiller5(source, sourceIndex);
   	
   }
   
   public void setFiller5(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrSummaryRecDash.setFiller5(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Filler5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrSummaryRecDash.setFiller5(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Filler5 with another Field
	 *	@param value
	 */
   public void setFiller5(Field source) {
      hdrSummaryRecDash.setFiller5(source);
   }  
   
     /**
	 * 	Update Filler5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller5(Field source, int sourceIndex,int sourceLen) {
      hdrSummaryRecDash.setFiller5(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Filler5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrSummaryRecDash.setFiller5(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of filler201
	 *	@return filler201
	 */
   public char[] getFiller201() throws CFException  {              
   		return hdrExcptionRecDash.getFiller201();
   }

  
	/**
	*  set variable filler201
	*  @param value
	**/
   public void setFiller201(char[] value) throws CFException {
      hdrExcptionRecDash.setFiller201(value);
   } 

     /**
	 * 	Update Filler201 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller201(char[] source, int sourceIndex) throws CFException {
      hdrExcptionRecDash.setFiller201(source, sourceIndex);
   	
   }
   
   public void setFiller201(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrExcptionRecDash.setFiller201(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Filler201 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller201(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrExcptionRecDash.setFiller201(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Filler201 with another Field
	 *	@param value
	 */
   public void setFiller201(Field source) {
      hdrExcptionRecDash.setFiller201(source);
   }  
   
     /**
	 * 	Update Filler201 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller201(Field source, int sourceIndex,int sourceLen) {
      hdrExcptionRecDash.setFiller201(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Filler201 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller201(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrExcptionRecDash.setFiller201(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Trdpb004Ctx getTrdpb004Ctx() {
            return Trdpb004Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += hdrRunlogRecDash.hashCode();
        str += hdrSummaryRecDash.hashCode();
        str += hdrExcptionRecDash.hashCode();
       return str.hashCode();
    }

    public InitializeOutCtx clone() {
        InitializeOutCtx cloneObj = new InitializeOutCtx();
        cloneObj.hdrRunlogRecDash = new HdrRunlogRecDash();
        cloneObj.hdrRunlogRecDash.set(hdrRunlogRecDash.getClonedField());
        cloneObj.hdrSummaryRecDash = new HdrSummaryRecDash();
        cloneObj.hdrSummaryRecDash.set(hdrSummaryRecDash.getClonedField());
        cloneObj.hdrExcptionRecDash = new HdrExcptionRecDash();
        cloneObj.hdrExcptionRecDash.set(hdrExcptionRecDash.getClonedField());
        return cloneObj;
    }

    }

    public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
    }
     public class ProcessExceptionInCtx implements Cloneable {
     ExcptionRecord excptionRecord = Trdpb004Ctx.this.getExcptionRecord();
     PrtExcptionRec prtExcptionRec = Trdpb004Ctx.this.getPrtExcptionRec();
     Work work = Trdpb004Ctx.this.getWork();
     HdrExcptionRecDash hdrExcptionRecDash = Trdpb004Ctx.this.getHdrExcptionRecDash();
     Sqlca sqlca = Trdpb004Ctx.this.getSqlca();
     Dcltbtrdexc dcltbtrdexc = Trdpb004Ctx.this.getDcltbtrdexc();

	/**
	 *	Returns the value of excptionRecord
	 *	@return excptionRecord
	 */   
	 public ExcptionRecord getExcptionRecord() {
   	return excptionRecord;
   }


	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of excDescriptionText
	 *	@return excDescriptionText
	 */
   public char[] getExcDescriptionText() throws CFException  {              
   		return dcltbtrdexc.getExcDescription().getExcDescriptionText();
   }

  
	/**
	*  set variable excDescriptionText
	*  @param value
	**/
   public void setExcDescriptionText(char[] value) throws CFException {
      dcltbtrdexc.getExcDescription().setExcDescriptionText(value);
   } 

     /**
	 * 	Update ExcDescriptionText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExcDescriptionText(char[] source, int sourceIndex) throws CFException {
      dcltbtrdexc.getExcDescription().setExcDescriptionText(source, sourceIndex);
   	
   }
   
   public void setExcDescriptionText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdexc.getExcDescription().setExcDescriptionText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExcDescriptionText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExcDescriptionText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdexc.getExcDescription().setExcDescriptionText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExcDescriptionText with another Field
	 *	@param value
	 */
   public void setExcDescriptionText(Field source) {
      dcltbtrdexc.getExcDescription().setExcDescriptionText(source);
   }  
   
     /**
	 * 	Update ExcDescriptionText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExcDescriptionText(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdexc.getExcDescription().setExcDescriptionText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExcDescriptionText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExcDescriptionText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdexc.getExcDescription().setExcDescriptionText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hdrExcptionRec
	 *	@return hdrExcptionRec
	 */
   public char[] getHdrExcptionRec() throws CFException  {              
   		return work.getHdrExcptionRec();
   }

  
	/**
	*  set variable hdrExcptionRec
	*  @param value
	**/
   public void setHdrExcptionRec(char[] value) throws CFException {
      work.setHdrExcptionRec(value);
   } 

	/**
	 *	Returns the value of excType
	 *	@return excType
	 */
   public char[] getExcType() throws CFException  {              
   		return dcltbtrdexc.getExcType();
   }

  
	/**
	*  set variable excType
	*  @param value
	**/
   public void setExcType(char[] value) throws CFException {
      dcltbtrdexc.setExcType(value);
   } 

     /**
	 * 	Update ExcType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExcType(char[] source, int sourceIndex) throws CFException {
      dcltbtrdexc.setExcType(source, sourceIndex);
   	
   }
   
   public void setExcType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdexc.setExcType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExcType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExcType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdexc.setExcType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExcType with another Field
	 *	@param value
	 */
   public void setExcType(Field source) {
      dcltbtrdexc.setExcType(source);
   }  
   
     /**
	 * 	Update ExcType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExcType(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdexc.setExcType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExcType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExcType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdexc.setExcType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dcltbtrdexc
	 *	@return dcltbtrdexc
	 */   
	 public Dcltbtrdexc getDcltbtrdexc() {
   	return dcltbtrdexc;
   }


	/**
	 *	Returns the value of excDescription
	 *	@return excDescription
	 */   
	 public ExcDescription getExcDescription() {
   	return dcltbtrdexc.getExcDescription();
   }

   /**
	* 	Update ExcDescription with the passed value
	*	@param value
	*/
   public void setExcDescription(char[] value) throws CFException {
      dcltbtrdexc.setExcDescription(value);
   }   

     /**
	 * 	Update ExcDescription 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setExcDescription(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	dcltbtrdexc.setExcDescription(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExcDescription 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExcDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	dcltbtrdexc.setExcDescription(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExcDescription with another Field
	 *	@param value
	 */
   public void setExcDescription(Field source) {
   	dcltbtrdexc.setExcDescription(source);
   }  
   
     /**
	 * 	Update ExcDescription 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setExcDescription(Field source, int sourceIndex,int sourceLen) {
   	dcltbtrdexc.setExcDescription(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExcDescription 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExcDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	dcltbtrdexc.setExcDescription(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of excDescriptionLen
	 *	@return excDescriptionLen
	 */
	public short getExcDescriptionLen() throws CFException {        
   		return dcltbtrdexc.getExcDescription().getExcDescriptionLen();
	}
	
	/**
	 * 	Update ExcDescriptionLen with the passed value
	 *	@param number
	 */
	public void setExcDescriptionLen(short number)  throws CFException{
		dcltbtrdexc.getExcDescription().setExcDescriptionLen(number);
	}

	public void setExcDescriptionLen(int number)  throws CFException{
		dcltbtrdexc.getExcDescription().setExcDescriptionLen((short)number);
	}

	public void setExcDescriptionLen(long number)  throws CFException{
		dcltbtrdexc.getExcDescription().setExcDescriptionLen((short)number);
	}



	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prtExcptionRec
	 *	@return prtExcptionRec
	 */   
	 public PrtExcptionRec getPrtExcptionRec() {
   	return prtExcptionRec;
   }


	/**
	 *	Returns the value of excptionFileStatus
	 *	@return excptionFileStatus
	 */
	public int getExcptionFileStatus() throws CFException {
   		return work.getExcptionFileStatus();
	}


	/**
	 *	Returns String value of excptionFileStatus
	 *	@return excptionFileStatus
	 */
	public char[]  getExcptionFileStatusString() throws CFException {
	     return String.valueOf(work.getExcptionFileStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean excptionFileStatusIsNumeric()  throws CFException{
	    return work.excptionFileStatusIsNumeric();
	}

	/**
	 * 	Update ExcptionFileStatus with the passed value
	 *	@param number
	 */
	public void setExcptionFileStatus(int number)  throws CFException{
		work.setExcptionFileStatus(number);
	}
	

	public void setExcptionFileStatus(long number)  throws CFException{
	    work.setExcptionFileStatus(number);
	}
	
	
	/**
	 * 	Update ExcptionFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setExcptionFileStatus(char[] value)  throws CFException {
		work.setExcptionFileStatus(value);
	}
	
	/**
	 * 	Update ExcptionFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExcptionFileStatusString(char[] value)  throws CFException{
		work.setExcptionFileStatus(value);
	}	

	/**
	 *	Returns the value of hdrExcptionRecDash
	 *	@return hdrExcptionRecDash
	 */   
	 public HdrExcptionRecDash getHdrExcptionRecDash() {
   	return hdrExcptionRecDash;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}



        public Trdpb004Ctx getTrdpb004Ctx() {
            return Trdpb004Ctx.this;
        }

        public ProcessExceptionOutCtx getProcessExceptionOutCtx() {
            return new ProcessExceptionOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += excptionRecord.hashCode();
        str += prtExcptionRec.hashCode();
        str += work.hashCode();
        str += hdrExcptionRecDash.hashCode();
        str += sqlca.hashCode();
        str += dcltbtrdexc.hashCode();
       return str.hashCode();
    }

    public ProcessExceptionInCtx clone() {
        ProcessExceptionInCtx cloneObj = new ProcessExceptionInCtx();
        cloneObj.excptionRecord = new ExcptionRecord();
        cloneObj.excptionRecord.set(excptionRecord.getClonedField());
        cloneObj.prtExcptionRec = new PrtExcptionRec();
        cloneObj.prtExcptionRec.set(prtExcptionRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.hdrExcptionRecDash = new HdrExcptionRecDash();
        cloneObj.hdrExcptionRecDash.set(hdrExcptionRecDash.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dcltbtrdexc = new Dcltbtrdexc();
        cloneObj.dcltbtrdexc.set(dcltbtrdexc.getClonedField());
        return cloneObj;
    }

    }

    public ProcessExceptionInCtx getProcessExceptionInCtx() {
            return new ProcessExceptionInCtx();
    }
     public class ProcessExceptionOutCtx implements Cloneable {
     ExcptionRecord excptionRecord = Trdpb004Ctx.this.getExcptionRecord();
     PrtExcptionRec prtExcptionRec = Trdpb004Ctx.this.getPrtExcptionRec();
     Work work = Trdpb004Ctx.this.getWork();
     Sqlca sqlca = Trdpb004Ctx.this.getSqlca();
     HdrExcptionRecDash hdrExcptionRecDash = Trdpb004Ctx.this.getHdrExcptionRecDash();
     Dcltbtrdexc dcltbtrdexc = Trdpb004Ctx.this.getDcltbtrdexc();

	/**
	 *	Returns the value of excptionRecord
	 *	@return excptionRecord
	 */   
	 public ExcptionRecord getExcptionRecord() {
   	return excptionRecord;
   }


	/**
	 *	Returns the value of excDescriptionLen
	 *	@return excDescriptionLen
	 */
	public short getExcDescriptionLen() throws CFException {        
   		return dcltbtrdexc.getExcDescription().getExcDescriptionLen();
	}
	
	/**
	 * 	Update ExcDescriptionLen with the passed value
	 *	@param number
	 */
	public void setExcDescriptionLen(short number)  throws CFException{
		dcltbtrdexc.getExcDescription().setExcDescriptionLen(number);
	}

	public void setExcDescriptionLen(int number)  throws CFException{
		dcltbtrdexc.getExcDescription().setExcDescriptionLen((short)number);
	}

	public void setExcDescriptionLen(long number)  throws CFException{
		dcltbtrdexc.getExcDescription().setExcDescriptionLen((short)number);
	}



	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of prtExcptionType
	 *	@return prtExcptionType
	 */
   public char[] getPrtExcptionType() throws CFException  {              
   		return prtExcptionRec.getPrtExcptionType();
   }

  
	/**
	*  set variable prtExcptionType
	*  @param value
	**/
   public void setPrtExcptionType(char[] value) throws CFException {
      prtExcptionRec.setPrtExcptionType(value);
   } 

     /**
	 * 	Update PrtExcptionType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtExcptionType(char[] source, int sourceIndex) throws CFException {
      prtExcptionRec.setPrtExcptionType(source, sourceIndex);
   	
   }
   
   public void setPrtExcptionType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      prtExcptionRec.setPrtExcptionType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtExcptionType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtExcptionType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtExcptionRec.setPrtExcptionType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtExcptionType with another Field
	 *	@param value
	 */
   public void setPrtExcptionType(Field source) {
      prtExcptionRec.setPrtExcptionType(source);
   }  
   
     /**
	 * 	Update PrtExcptionType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtExcptionType(Field source, int sourceIndex,int sourceLen) {
      prtExcptionRec.setPrtExcptionType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtExcptionType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtExcptionType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtExcptionRec.setPrtExcptionType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prtExcptionDesc
	 *	@return prtExcptionDesc
	 */
   public char[] getPrtExcptionDesc() throws CFException  {              
   		return prtExcptionRec.getPrtExcptionDesc();
   }

  
	/**
	*  set variable prtExcptionDesc
	*  @param value
	**/
   public void setPrtExcptionDesc(char[] value) throws CFException {
      prtExcptionRec.setPrtExcptionDesc(value);
   } 

     /**
	 * 	Update PrtExcptionDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtExcptionDesc(char[] source, int sourceIndex) throws CFException {
      prtExcptionRec.setPrtExcptionDesc(source, sourceIndex);
   	
   }
   
   public void setPrtExcptionDesc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      prtExcptionRec.setPrtExcptionDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtExcptionDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtExcptionDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtExcptionRec.setPrtExcptionDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtExcptionDesc with another Field
	 *	@param value
	 */
   public void setPrtExcptionDesc(Field source) {
      prtExcptionRec.setPrtExcptionDesc(source);
   }  
   
     /**
	 * 	Update PrtExcptionDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtExcptionDesc(Field source, int sourceIndex,int sourceLen) {
      prtExcptionRec.setPrtExcptionDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtExcptionDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtExcptionDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtExcptionRec.setPrtExcptionDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
   public char[] getSqlcode_Ws() throws CFException  {              
   		return work.getSqlcode_Ws();
   }

  
	/**
	*  set variable sqlcode_Ws
	*  @param value
	**/
   public void setSqlcode_Ws(char[] value) throws CFException {
      work.setSqlcode_Ws(value);
   } 

     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex) throws CFException {
      work.setSqlcode_Ws(source, sourceIndex);
   	
   }
   
   public void setSqlcode_Ws(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlcode_Ws with another Field
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source) {
      work.setSqlcode_Ws(source);
   }  
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of excDescriptionText
	 *	@return excDescriptionText
	 */
   public char[] getExcDescriptionText() throws CFException  {              
   		return dcltbtrdexc.getExcDescription().getExcDescriptionText();
   }

  
	/**
	*  set variable excDescriptionText
	*  @param value
	**/
   public void setExcDescriptionText(char[] value) throws CFException {
      dcltbtrdexc.getExcDescription().setExcDescriptionText(value);
   } 

     /**
	 * 	Update ExcDescriptionText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExcDescriptionText(char[] source, int sourceIndex) throws CFException {
      dcltbtrdexc.getExcDescription().setExcDescriptionText(source, sourceIndex);
   	
   }
   
   public void setExcDescriptionText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdexc.getExcDescription().setExcDescriptionText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExcDescriptionText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExcDescriptionText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdexc.getExcDescription().setExcDescriptionText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExcDescriptionText with another Field
	 *	@param value
	 */
   public void setExcDescriptionText(Field source) {
      dcltbtrdexc.getExcDescription().setExcDescriptionText(source);
   }  
   
     /**
	 * 	Update ExcDescriptionText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExcDescriptionText(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdexc.getExcDescription().setExcDescriptionText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExcDescriptionText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExcDescriptionText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdexc.getExcDescription().setExcDescriptionText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of excptionFileStatus
	 *	@return excptionFileStatus
	 */
	public int getExcptionFileStatus() throws CFException {
   		return work.getExcptionFileStatus();
	}


	/**
	 *	Returns String value of excptionFileStatus
	 *	@return excptionFileStatus
	 */
	public char[]  getExcptionFileStatusString() throws CFException {
	     return String.valueOf(work.getExcptionFileStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean excptionFileStatusIsNumeric()  throws CFException{
	    return work.excptionFileStatusIsNumeric();
	}

	/**
	 * 	Update ExcptionFileStatus with the passed value
	 *	@param number
	 */
	public void setExcptionFileStatus(int number)  throws CFException{
		work.setExcptionFileStatus(number);
	}
	

	public void setExcptionFileStatus(long number)  throws CFException{
	    work.setExcptionFileStatus(number);
	}
	
	
	/**
	 * 	Update ExcptionFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setExcptionFileStatus(char[] value)  throws CFException {
		work.setExcptionFileStatus(value);
	}
	
	/**
	 * 	Update ExcptionFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExcptionFileStatusString(char[] value)  throws CFException{
		work.setExcptionFileStatus(value);
	}	

	/**
	 *	Returns the value of exception
	 *	@return exception
	 */
   public char[] getException() throws CFException  {              
   		return work.getException();
   }

  
	/**
	*  set variable exception
	*  @param value
	**/
   public void setException(char[] value) throws CFException {
      work.setException(value);
   } 

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of excType
	 *	@return excType
	 */
   public char[] getExcType() throws CFException  {              
   		return dcltbtrdexc.getExcType();
   }

  
	/**
	*  set variable excType
	*  @param value
	**/
   public void setExcType(char[] value) throws CFException {
      dcltbtrdexc.setExcType(value);
   } 

     /**
	 * 	Update ExcType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExcType(char[] source, int sourceIndex) throws CFException {
      dcltbtrdexc.setExcType(source, sourceIndex);
   	
   }
   
   public void setExcType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdexc.setExcType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExcType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExcType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdexc.setExcType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExcType with another Field
	 *	@param value
	 */
   public void setExcType(Field source) {
      dcltbtrdexc.setExcType(source);
   }  
   
     /**
	 * 	Update ExcType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExcType(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdexc.setExcType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExcType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExcType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdexc.setExcType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dcltbtrdexc
	 *	@return dcltbtrdexc
	 */   
	 public Dcltbtrdexc getDcltbtrdexc() {
   	return dcltbtrdexc;
   }



        public Trdpb004Ctx getTrdpb004Ctx() {
            return Trdpb004Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += excptionRecord.hashCode();
        str += prtExcptionRec.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
        str += hdrExcptionRecDash.hashCode();
        str += dcltbtrdexc.hashCode();
       return str.hashCode();
    }

    public ProcessExceptionOutCtx clone() {
        ProcessExceptionOutCtx cloneObj = new ProcessExceptionOutCtx();
        cloneObj.excptionRecord = new ExcptionRecord();
        cloneObj.excptionRecord.set(excptionRecord.getClonedField());
        cloneObj.prtExcptionRec = new PrtExcptionRec();
        cloneObj.prtExcptionRec.set(prtExcptionRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.hdrExcptionRecDash = new HdrExcptionRecDash();
        cloneObj.hdrExcptionRecDash.set(hdrExcptionRecDash.getClonedField());
        cloneObj.dcltbtrdexc = new Dcltbtrdexc();
        cloneObj.dcltbtrdexc.set(dcltbtrdexc.getClonedField());
        return cloneObj;
    }

    }

    public ProcessExceptionOutCtx getProcessExceptionOutCtx() {
            return new ProcessExceptionOutCtx();
    }
     public class ProcessTimingsInCtx implements Cloneable {
     HdrRunlogRecDash hdrRunlogRecDash = Trdpb004Ctx.this.getHdrRunlogRecDash();
     RunlogRecord runlogRecord = Trdpb004Ctx.this.getRunlogRecord();
     Dcltbtrdlog dcltbtrdlog = Trdpb004Ctx.this.getDcltbtrdlog();
     PrtRunlogRec prtRunlogRec = Trdpb004Ctx.this.getPrtRunlogRec();
     Work work = Trdpb004Ctx.this.getWork();
     Sqlca sqlca = Trdpb004Ctx.this.getSqlca();

	/**
	 *	Returns the value of logCurrency
	 *	@return logCurrency
	 */
   public char[] getLogCurrency() throws CFException  {              
   		return dcltbtrdlog.getLogCurrency();
   }

  
	/**
	*  set variable logCurrency
	*  @param value
	**/
   public void setLogCurrency(char[] value) throws CFException {
      dcltbtrdlog.setLogCurrency(value);
   } 

     /**
	 * 	Update LogCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogCurrency(char[] source, int sourceIndex) throws CFException {
      dcltbtrdlog.setLogCurrency(source, sourceIndex);
   	
   }
   
   public void setLogCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdlog.setLogCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogCurrency with another Field
	 *	@param value
	 */
   public void setLogCurrency(Field source) {
      dcltbtrdlog.setLogCurrency(source);
   }  
   
     /**
	 * 	Update LogCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogCurrency(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdlog.setLogCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of logEndTs
	 *	@return logEndTs
	 */
   public char[] getLogEndTs() throws CFException  {              
   		return dcltbtrdlog.getLogEndTs();
   }

  
	/**
	*  set variable logEndTs
	*  @param value
	**/
   public void setLogEndTs(char[] value) throws CFException {
      dcltbtrdlog.setLogEndTs(value);
   } 

     /**
	 * 	Update LogEndTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogEndTs(char[] source, int sourceIndex) throws CFException {
      dcltbtrdlog.setLogEndTs(source, sourceIndex);
   	
   }
   
   public void setLogEndTs(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdlog.setLogEndTs(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogEndTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogEndTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogEndTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogEndTs with another Field
	 *	@param value
	 */
   public void setLogEndTs(Field source) {
      dcltbtrdlog.setLogEndTs(source);
   }  
   
     /**
	 * 	Update LogEndTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogEndTs(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdlog.setLogEndTs(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogEndTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogEndTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogEndTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prtRunlogRec
	 *	@return prtRunlogRec
	 */   
	 public PrtRunlogRec getPrtRunlogRec() {
   	return prtRunlogRec;
   }


	/**
	 *	Returns the value of runlogFileStatus
	 *	@return runlogFileStatus
	 */
	public int getRunlogFileStatus() throws CFException {
   		return work.getRunlogFileStatus();
	}


	/**
	 *	Returns String value of runlogFileStatus
	 *	@return runlogFileStatus
	 */
	public char[]  getRunlogFileStatusString() throws CFException {
	     return String.valueOf(work.getRunlogFileStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean runlogFileStatusIsNumeric()  throws CFException{
	    return work.runlogFileStatusIsNumeric();
	}

	/**
	 * 	Update RunlogFileStatus with the passed value
	 *	@param number
	 */
	public void setRunlogFileStatus(int number)  throws CFException{
		work.setRunlogFileStatus(number);
	}
	

	public void setRunlogFileStatus(long number)  throws CFException{
	    work.setRunlogFileStatus(number);
	}
	
	
	/**
	 * 	Update RunlogFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setRunlogFileStatus(char[] value)  throws CFException {
		work.setRunlogFileStatus(value);
	}
	
	/**
	 * 	Update RunlogFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRunlogFileStatusString(char[] value)  throws CFException{
		work.setRunlogFileStatus(value);
	}	

	/**
	 *	Returns the value of hdrRunlogRecDash
	 *	@return hdrRunlogRecDash
	 */   
	 public HdrRunlogRecDash getHdrRunlogRecDash() {
   	return hdrRunlogRecDash;
   }


	/**
	 *	Returns the value of runlogRecord
	 *	@return runlogRecord
	 */   
	 public RunlogRecord getRunlogRecord() {
   	return runlogRecord;
   }


	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dcltbtrdlog
	 *	@return dcltbtrdlog
	 */   
	 public Dcltbtrdlog getDcltbtrdlog() {
   	return dcltbtrdlog;
   }


	/**
	 *	Returns the value of logTransaction
	 *	@return logTransaction
	 */
   public char[] getLogTransaction() throws CFException  {              
   		return dcltbtrdlog.getLogTransaction();
   }

  
	/**
	*  set variable logTransaction
	*  @param value
	**/
   public void setLogTransaction(char[] value) throws CFException {
      dcltbtrdlog.setLogTransaction(value);
   } 

     /**
	 * 	Update LogTransaction 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogTransaction(char[] source, int sourceIndex) throws CFException {
      dcltbtrdlog.setLogTransaction(source, sourceIndex);
   	
   }
   
   public void setLogTransaction(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdlog.setLogTransaction(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogTransaction 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogTransaction(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogTransaction(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogTransaction with another Field
	 *	@param value
	 */
   public void setLogTransaction(Field source) {
      dcltbtrdlog.setLogTransaction(source);
   }  
   
     /**
	 * 	Update LogTransaction 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogTransaction(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdlog.setLogTransaction(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogTransaction 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogTransaction(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogTransaction(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of logStartTs
	 *	@return logStartTs
	 */
   public char[] getLogStartTs() throws CFException  {              
   		return dcltbtrdlog.getLogStartTs();
   }

  
	/**
	*  set variable logStartTs
	*  @param value
	**/
   public void setLogStartTs(char[] value) throws CFException {
      dcltbtrdlog.setLogStartTs(value);
   } 

     /**
	 * 	Update LogStartTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogStartTs(char[] source, int sourceIndex) throws CFException {
      dcltbtrdlog.setLogStartTs(source, sourceIndex);
   	
   }
   
   public void setLogStartTs(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdlog.setLogStartTs(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogStartTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogStartTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogStartTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogStartTs with another Field
	 *	@param value
	 */
   public void setLogStartTs(Field source) {
      dcltbtrdlog.setLogStartTs(source);
   }  
   
     /**
	 * 	Update LogStartTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogStartTs(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdlog.setLogStartTs(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogStartTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogStartTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogStartTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hdrRunlogRec
	 *	@return hdrRunlogRec
	 */
   public char[] getHdrRunlogRec() throws CFException  {              
   		return work.getHdrRunlogRec();
   }

  
	/**
	*  set variable hdrRunlogRec
	*  @param value
	**/
   public void setHdrRunlogRec(char[] value) throws CFException {
      work.setHdrRunlogRec(value);
   } 

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}



        public Trdpb004Ctx getTrdpb004Ctx() {
            return Trdpb004Ctx.this;
        }

        public ProcessTimingsOutCtx getProcessTimingsOutCtx() {
            return new ProcessTimingsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += hdrRunlogRecDash.hashCode();
        str += runlogRecord.hashCode();
        str += dcltbtrdlog.hashCode();
        str += prtRunlogRec.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public ProcessTimingsInCtx clone() {
        ProcessTimingsInCtx cloneObj = new ProcessTimingsInCtx();
        cloneObj.hdrRunlogRecDash = new HdrRunlogRecDash();
        cloneObj.hdrRunlogRecDash.set(hdrRunlogRecDash.getClonedField());
        cloneObj.runlogRecord = new RunlogRecord();
        cloneObj.runlogRecord.set(runlogRecord.getClonedField());
        cloneObj.dcltbtrdlog = new Dcltbtrdlog();
        cloneObj.dcltbtrdlog.set(dcltbtrdlog.getClonedField());
        cloneObj.prtRunlogRec = new PrtRunlogRec();
        cloneObj.prtRunlogRec.set(prtRunlogRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public ProcessTimingsInCtx getProcessTimingsInCtx() {
            return new ProcessTimingsInCtx();
    }
     public class ProcessTimingsOutCtx implements Cloneable {
     HdrRunlogRecDash hdrRunlogRecDash = Trdpb004Ctx.this.getHdrRunlogRecDash();
     RunlogRecord runlogRecord = Trdpb004Ctx.this.getRunlogRecord();
     Dcltbtrdlog dcltbtrdlog = Trdpb004Ctx.this.getDcltbtrdlog();
     PrtRunlogRec prtRunlogRec = Trdpb004Ctx.this.getPrtRunlogRec();
     Work work = Trdpb004Ctx.this.getWork();
     Sqlca sqlca = Trdpb004Ctx.this.getSqlca();

	/**
	 *	Returns the value of logCurrency
	 *	@return logCurrency
	 */
   public char[] getLogCurrency() throws CFException  {              
   		return dcltbtrdlog.getLogCurrency();
   }

  
	/**
	*  set variable logCurrency
	*  @param value
	**/
   public void setLogCurrency(char[] value) throws CFException {
      dcltbtrdlog.setLogCurrency(value);
   } 

     /**
	 * 	Update LogCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogCurrency(char[] source, int sourceIndex) throws CFException {
      dcltbtrdlog.setLogCurrency(source, sourceIndex);
   	
   }
   
   public void setLogCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdlog.setLogCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogCurrency with another Field
	 *	@param value
	 */
   public void setLogCurrency(Field source) {
      dcltbtrdlog.setLogCurrency(source);
   }  
   
     /**
	 * 	Update LogCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogCurrency(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdlog.setLogCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of logEndTs
	 *	@return logEndTs
	 */
   public char[] getLogEndTs() throws CFException  {              
   		return dcltbtrdlog.getLogEndTs();
   }

  
	/**
	*  set variable logEndTs
	*  @param value
	**/
   public void setLogEndTs(char[] value) throws CFException {
      dcltbtrdlog.setLogEndTs(value);
   } 

     /**
	 * 	Update LogEndTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogEndTs(char[] source, int sourceIndex) throws CFException {
      dcltbtrdlog.setLogEndTs(source, sourceIndex);
   	
   }
   
   public void setLogEndTs(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdlog.setLogEndTs(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogEndTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogEndTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogEndTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogEndTs with another Field
	 *	@param value
	 */
   public void setLogEndTs(Field source) {
      dcltbtrdlog.setLogEndTs(source);
   }  
   
     /**
	 * 	Update LogEndTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogEndTs(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdlog.setLogEndTs(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogEndTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogEndTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogEndTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prtRunlogTransaction
	 *	@return prtRunlogTransaction
	 */
   public char[] getPrtRunlogTransaction() throws CFException  {              
   		return prtRunlogRec.getPrtRunlogTransaction();
   }

  
	/**
	*  set variable prtRunlogTransaction
	*  @param value
	**/
   public void setPrtRunlogTransaction(char[] value) throws CFException {
      prtRunlogRec.setPrtRunlogTransaction(value);
   } 

     /**
	 * 	Update PrtRunlogTransaction 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtRunlogTransaction(char[] source, int sourceIndex) throws CFException {
      prtRunlogRec.setPrtRunlogTransaction(source, sourceIndex);
   	
   }
   
   public void setPrtRunlogTransaction(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      prtRunlogRec.setPrtRunlogTransaction(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtRunlogTransaction 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtRunlogTransaction(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtRunlogRec.setPrtRunlogTransaction(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtRunlogTransaction with another Field
	 *	@param value
	 */
   public void setPrtRunlogTransaction(Field source) {
      prtRunlogRec.setPrtRunlogTransaction(source);
   }  
   
     /**
	 * 	Update PrtRunlogTransaction 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtRunlogTransaction(Field source, int sourceIndex,int sourceLen) {
      prtRunlogRec.setPrtRunlogTransaction(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtRunlogTransaction 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtRunlogTransaction(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtRunlogRec.setPrtRunlogTransaction(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of exception
	 *	@return exception
	 */
   public char[] getException() throws CFException  {              
   		return work.getException();
   }

  
	/**
	*  set variable exception
	*  @param value
	**/
   public void setException(char[] value) throws CFException {
      work.setException(value);
   } 

	/**
	 *	Returns the value of runlogFileStatus
	 *	@return runlogFileStatus
	 */
	public int getRunlogFileStatus() throws CFException {
   		return work.getRunlogFileStatus();
	}


	/**
	 *	Returns String value of runlogFileStatus
	 *	@return runlogFileStatus
	 */
	public char[]  getRunlogFileStatusString() throws CFException {
	     return String.valueOf(work.getRunlogFileStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean runlogFileStatusIsNumeric()  throws CFException{
	    return work.runlogFileStatusIsNumeric();
	}

	/**
	 * 	Update RunlogFileStatus with the passed value
	 *	@param number
	 */
	public void setRunlogFileStatus(int number)  throws CFException{
		work.setRunlogFileStatus(number);
	}
	

	public void setRunlogFileStatus(long number)  throws CFException{
	    work.setRunlogFileStatus(number);
	}
	
	
	/**
	 * 	Update RunlogFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setRunlogFileStatus(char[] value)  throws CFException {
		work.setRunlogFileStatus(value);
	}
	
	/**
	 * 	Update RunlogFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRunlogFileStatusString(char[] value)  throws CFException{
		work.setRunlogFileStatus(value);
	}	

	/**
	 *	Returns the value of prtRunlogCurrency
	 *	@return prtRunlogCurrency
	 */
   public char[] getPrtRunlogCurrency() throws CFException  {              
   		return prtRunlogRec.getPrtRunlogCurrency();
   }

  
	/**
	*  set variable prtRunlogCurrency
	*  @param value
	**/
   public void setPrtRunlogCurrency(char[] value) throws CFException {
      prtRunlogRec.setPrtRunlogCurrency(value);
   } 

     /**
	 * 	Update PrtRunlogCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtRunlogCurrency(char[] source, int sourceIndex) throws CFException {
      prtRunlogRec.setPrtRunlogCurrency(source, sourceIndex);
   	
   }
   
   public void setPrtRunlogCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      prtRunlogRec.setPrtRunlogCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtRunlogCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtRunlogCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtRunlogRec.setPrtRunlogCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtRunlogCurrency with another Field
	 *	@param value
	 */
   public void setPrtRunlogCurrency(Field source) {
      prtRunlogRec.setPrtRunlogCurrency(source);
   }  
   
     /**
	 * 	Update PrtRunlogCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtRunlogCurrency(Field source, int sourceIndex,int sourceLen) {
      prtRunlogRec.setPrtRunlogCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtRunlogCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtRunlogCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtRunlogRec.setPrtRunlogCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of runlogRecord
	 *	@return runlogRecord
	 */   
	 public RunlogRecord getRunlogRecord() {
   	return runlogRecord;
   }


	/**
	 *	Returns the value of dcltbtrdlog
	 *	@return dcltbtrdlog
	 */   
	 public Dcltbtrdlog getDcltbtrdlog() {
   	return dcltbtrdlog;
   }


	/**
	 *	Returns the value of prtRunlogEndTs
	 *	@return prtRunlogEndTs
	 */
   public char[] getPrtRunlogEndTs() throws CFException  {              
   		return prtRunlogRec.getPrtRunlogEndTs();
   }

  
	/**
	*  set variable prtRunlogEndTs
	*  @param value
	**/
   public void setPrtRunlogEndTs(char[] value) throws CFException {
      prtRunlogRec.setPrtRunlogEndTs(value);
   } 

     /**
	 * 	Update PrtRunlogEndTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtRunlogEndTs(char[] source, int sourceIndex) throws CFException {
      prtRunlogRec.setPrtRunlogEndTs(source, sourceIndex);
   	
   }
   
   public void setPrtRunlogEndTs(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      prtRunlogRec.setPrtRunlogEndTs(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtRunlogEndTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtRunlogEndTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtRunlogRec.setPrtRunlogEndTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtRunlogEndTs with another Field
	 *	@param value
	 */
   public void setPrtRunlogEndTs(Field source) {
      prtRunlogRec.setPrtRunlogEndTs(source);
   }  
   
     /**
	 * 	Update PrtRunlogEndTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtRunlogEndTs(Field source, int sourceIndex,int sourceLen) {
      prtRunlogRec.setPrtRunlogEndTs(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtRunlogEndTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtRunlogEndTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtRunlogRec.setPrtRunlogEndTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
   public char[] getSqlcode_Ws() throws CFException  {              
   		return work.getSqlcode_Ws();
   }

  
	/**
	*  set variable sqlcode_Ws
	*  @param value
	**/
   public void setSqlcode_Ws(char[] value) throws CFException {
      work.setSqlcode_Ws(value);
   } 

     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex) throws CFException {
      work.setSqlcode_Ws(source, sourceIndex);
   	
   }
   
   public void setSqlcode_Ws(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlcode_Ws with another Field
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source) {
      work.setSqlcode_Ws(source);
   }  
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of logTransaction
	 *	@return logTransaction
	 */
   public char[] getLogTransaction() throws CFException  {              
   		return dcltbtrdlog.getLogTransaction();
   }

  
	/**
	*  set variable logTransaction
	*  @param value
	**/
   public void setLogTransaction(char[] value) throws CFException {
      dcltbtrdlog.setLogTransaction(value);
   } 

     /**
	 * 	Update LogTransaction 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogTransaction(char[] source, int sourceIndex) throws CFException {
      dcltbtrdlog.setLogTransaction(source, sourceIndex);
   	
   }
   
   public void setLogTransaction(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdlog.setLogTransaction(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogTransaction 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogTransaction(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogTransaction(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogTransaction with another Field
	 *	@param value
	 */
   public void setLogTransaction(Field source) {
      dcltbtrdlog.setLogTransaction(source);
   }  
   
     /**
	 * 	Update LogTransaction 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogTransaction(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdlog.setLogTransaction(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogTransaction 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogTransaction(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogTransaction(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of logStartTs
	 *	@return logStartTs
	 */
   public char[] getLogStartTs() throws CFException  {              
   		return dcltbtrdlog.getLogStartTs();
   }

  
	/**
	*  set variable logStartTs
	*  @param value
	**/
   public void setLogStartTs(char[] value) throws CFException {
      dcltbtrdlog.setLogStartTs(value);
   } 

     /**
	 * 	Update LogStartTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogStartTs(char[] source, int sourceIndex) throws CFException {
      dcltbtrdlog.setLogStartTs(source, sourceIndex);
   	
   }
   
   public void setLogStartTs(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdlog.setLogStartTs(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogStartTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogStartTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogStartTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogStartTs with another Field
	 *	@param value
	 */
   public void setLogStartTs(Field source) {
      dcltbtrdlog.setLogStartTs(source);
   }  
   
     /**
	 * 	Update LogStartTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogStartTs(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdlog.setLogStartTs(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogStartTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogStartTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogStartTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of excptionFileStatus
	 *	@return excptionFileStatus
	 */
	public int getExcptionFileStatus() throws CFException {
   		return work.getExcptionFileStatus();
	}


	/**
	 *	Returns String value of excptionFileStatus
	 *	@return excptionFileStatus
	 */
	public char[]  getExcptionFileStatusString() throws CFException {
	     return String.valueOf(work.getExcptionFileStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean excptionFileStatusIsNumeric()  throws CFException{
	    return work.excptionFileStatusIsNumeric();
	}

	/**
	 * 	Update ExcptionFileStatus with the passed value
	 *	@param number
	 */
	public void setExcptionFileStatus(int number)  throws CFException{
		work.setExcptionFileStatus(number);
	}
	

	public void setExcptionFileStatus(long number)  throws CFException{
	    work.setExcptionFileStatus(number);
	}
	
	
	/**
	 * 	Update ExcptionFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setExcptionFileStatus(char[] value)  throws CFException {
		work.setExcptionFileStatus(value);
	}
	
	/**
	 * 	Update ExcptionFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExcptionFileStatusString(char[] value)  throws CFException{
		work.setExcptionFileStatus(value);
	}	

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of prtRunlogStartTs
	 *	@return prtRunlogStartTs
	 */
   public char[] getPrtRunlogStartTs() throws CFException  {              
   		return prtRunlogRec.getPrtRunlogStartTs();
   }

  
	/**
	*  set variable prtRunlogStartTs
	*  @param value
	**/
   public void setPrtRunlogStartTs(char[] value) throws CFException {
      prtRunlogRec.setPrtRunlogStartTs(value);
   } 

     /**
	 * 	Update PrtRunlogStartTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtRunlogStartTs(char[] source, int sourceIndex) throws CFException {
      prtRunlogRec.setPrtRunlogStartTs(source, sourceIndex);
   	
   }
   
   public void setPrtRunlogStartTs(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      prtRunlogRec.setPrtRunlogStartTs(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtRunlogStartTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtRunlogStartTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtRunlogRec.setPrtRunlogStartTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtRunlogStartTs with another Field
	 *	@param value
	 */
   public void setPrtRunlogStartTs(Field source) {
      prtRunlogRec.setPrtRunlogStartTs(source);
   }  
   
     /**
	 * 	Update PrtRunlogStartTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtRunlogStartTs(Field source, int sourceIndex,int sourceLen) {
      prtRunlogRec.setPrtRunlogStartTs(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtRunlogStartTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtRunlogStartTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtRunlogRec.setPrtRunlogStartTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Trdpb004Ctx getTrdpb004Ctx() {
            return Trdpb004Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += hdrRunlogRecDash.hashCode();
        str += runlogRecord.hashCode();
        str += dcltbtrdlog.hashCode();
        str += prtRunlogRec.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public ProcessTimingsOutCtx clone() {
        ProcessTimingsOutCtx cloneObj = new ProcessTimingsOutCtx();
        cloneObj.hdrRunlogRecDash = new HdrRunlogRecDash();
        cloneObj.hdrRunlogRecDash.set(hdrRunlogRecDash.getClonedField());
        cloneObj.runlogRecord = new RunlogRecord();
        cloneObj.runlogRecord.set(runlogRecord.getClonedField());
        cloneObj.dcltbtrdlog = new Dcltbtrdlog();
        cloneObj.dcltbtrdlog.set(dcltbtrdlog.getClonedField());
        cloneObj.prtRunlogRec = new PrtRunlogRec();
        cloneObj.prtRunlogRec.set(prtRunlogRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public ProcessTimingsOutCtx getProcessTimingsOutCtx() {
            return new ProcessTimingsOutCtx();
    }
     public class ProcessSummaryRptInCtx implements Cloneable {
     SummaryRecord summaryRecord = Trdpb004Ctx.this.getSummaryRecord();
     Dcltbtrdsum dcltbtrdsum = Trdpb004Ctx.this.getDcltbtrdsum();
     HdrSummaryRecDash hdrSummaryRecDash = Trdpb004Ctx.this.getHdrSummaryRecDash();
     PrtSummaryRec prtSummaryRec = Trdpb004Ctx.this.getPrtSummaryRec();
     Work work = Trdpb004Ctx.this.getWork();
     Sqlca sqlca = Trdpb004Ctx.this.getSqlca();

	/**
	 *	Returns the value of summaryRecord
	 *	@return summaryRecord
	 */   
	 public SummaryRecord getSummaryRecord() {
   	return summaryRecord;
   }


	/**
	 *	Returns the value of hdrSummaryRec
	 *	@return hdrSummaryRec
	 */
   public char[] getHdrSummaryRec() throws CFException  {              
   		return work.getHdrSummaryRec();
   }

  
	/**
	*  set variable hdrSummaryRec
	*  @param value
	**/
   public void setHdrSummaryRec(char[] value) throws CFException {
      work.setHdrSummaryRec(value);
   } 

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of sumCustomerId
	 *	@return sumCustomerId
	 */
   public char[] getSumCustomerId() throws CFException  {              
   		return dcltbtrdsum.getSumCustomerId();
   }

  
	/**
	*  set variable sumCustomerId
	*  @param value
	**/
   public void setSumCustomerId(char[] value) throws CFException {
      dcltbtrdsum.setSumCustomerId(value);
   } 

     /**
	 * 	Update SumCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSumCustomerId(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsum.setSumCustomerId(source, sourceIndex);
   	
   }
   
   public void setSumCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsum.setSumCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SumCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSumCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsum.setSumCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SumCustomerId with another Field
	 *	@param value
	 */
   public void setSumCustomerId(Field source) {
      dcltbtrdsum.setSumCustomerId(source);
   }  
   
     /**
	 * 	Update SumCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSumCustomerId(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsum.setSumCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SumCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSumCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsum.setSumCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getSumCloseBalance() throws CFException{      
   		return dcltbtrdsum.getSumCloseBalance();
	}

    public char[] getSumCloseBalanceString() throws CFException {
          return  dcltbtrdsum.getSumCloseBalance().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update SumCloseBalance with the passed number
	 *	@param number
	 */
	public void setSumCloseBalance(BigDecimal number)  throws CFException{
		dcltbtrdsum.setSumCloseBalance(number);
   }

	/**
	 *	Returns the value of sumOverdue
	 *	@return sumOverdue
	 */
	public int getSumOverdue() throws CFException {        
   		return dcltbtrdsum.getSumOverdue();
	}
	
	/**
	 * 	Update SumOverdue with the passed value
	 *	@param number
	 */
	public void setSumOverdue(int number)  throws CFException{
		dcltbtrdsum.setSumOverdue(number);
	}


	public void setSumOverdue(long number)  throws CFException{
		dcltbtrdsum.setSumOverdue((int)number);
	}


	/**
	 *	Returns the value of prtSummaryRec
	 *	@return prtSummaryRec
	 */   
	 public PrtSummaryRec getPrtSummaryRec() {
   	return prtSummaryRec;
   }


	public BigDecimal getSumTotalCredit() throws CFException{      
   		return dcltbtrdsum.getSumTotalCredit();
	}

    public char[] getSumTotalCreditString() throws CFException {
          return  dcltbtrdsum.getSumTotalCredit().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update SumTotalCredit with the passed number
	 *	@param number
	 */
	public void setSumTotalCredit(BigDecimal number)  throws CFException{
		dcltbtrdsum.setSumTotalCredit(number);
   }

	/**
	 *	Returns the value of sumSettled
	 *	@return sumSettled
	 */
	public int getSumSettled() throws CFException {        
   		return dcltbtrdsum.getSumSettled();
	}
	
	/**
	 * 	Update SumSettled with the passed value
	 *	@param number
	 */
	public void setSumSettled(int number)  throws CFException{
		dcltbtrdsum.setSumSettled(number);
	}


	public void setSumSettled(long number)  throws CFException{
		dcltbtrdsum.setSumSettled((int)number);
	}


	/**
	 *	Returns the value of summaryFileStatus
	 *	@return summaryFileStatus
	 */
	public int getSummaryFileStatus() throws CFException {
   		return work.getSummaryFileStatus();
	}


	/**
	 *	Returns String value of summaryFileStatus
	 *	@return summaryFileStatus
	 */
	public char[]  getSummaryFileStatusString() throws CFException {
	     return String.valueOf(work.getSummaryFileStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean summaryFileStatusIsNumeric()  throws CFException{
	    return work.summaryFileStatusIsNumeric();
	}

	/**
	 * 	Update SummaryFileStatus with the passed value
	 *	@param number
	 */
	public void setSummaryFileStatus(int number)  throws CFException{
		work.setSummaryFileStatus(number);
	}
	

	public void setSummaryFileStatus(long number)  throws CFException{
	    work.setSummaryFileStatus(number);
	}
	
	
	/**
	 * 	Update SummaryFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setSummaryFileStatus(char[] value)  throws CFException {
		work.setSummaryFileStatus(value);
	}
	
	/**
	 * 	Update SummaryFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSummaryFileStatusString(char[] value)  throws CFException{
		work.setSummaryFileStatus(value);
	}	

	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dcltbtrdsum
	 *	@return dcltbtrdsum
	 */   
	 public Dcltbtrdsum getDcltbtrdsum() {
   	return dcltbtrdsum;
   }


	/**
	 *	Returns the value of hdrSummaryRecDash
	 *	@return hdrSummaryRecDash
	 */   
	 public HdrSummaryRecDash getHdrSummaryRecDash() {
   	return hdrSummaryRecDash;
   }


	public BigDecimal getSumTotalDebit() throws CFException{      
   		return dcltbtrdsum.getSumTotalDebit();
	}

    public char[] getSumTotalDebitString() throws CFException {
          return  dcltbtrdsum.getSumTotalDebit().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update SumTotalDebit with the passed number
	 *	@param number
	 */
	public void setSumTotalDebit(BigDecimal number)  throws CFException{
		dcltbtrdsum.setSumTotalDebit(number);
   }

	public BigDecimal getSumOpenBalance() throws CFException{      
   		return dcltbtrdsum.getSumOpenBalance();
	}

    public char[] getSumOpenBalanceString() throws CFException {
          return  dcltbtrdsum.getSumOpenBalance().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update SumOpenBalance with the passed number
	 *	@param number
	 */
	public void setSumOpenBalance(BigDecimal number)  throws CFException{
		dcltbtrdsum.setSumOpenBalance(number);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}


	/**
	 *	Returns the value of sumRejected
	 *	@return sumRejected
	 */
	public int getSumRejected() throws CFException {        
   		return dcltbtrdsum.getSumRejected();
	}
	
	/**
	 * 	Update SumRejected with the passed value
	 *	@param number
	 */
	public void setSumRejected(int number)  throws CFException{
		dcltbtrdsum.setSumRejected(number);
	}


	public void setSumRejected(long number)  throws CFException{
		dcltbtrdsum.setSumRejected((int)number);
	}


	/**
	 *	Returns the value of sumCurrency
	 *	@return sumCurrency
	 */
   public char[] getSumCurrency() throws CFException  {              
   		return dcltbtrdsum.getSumCurrency();
   }

  
	/**
	*  set variable sumCurrency
	*  @param value
	**/
   public void setSumCurrency(char[] value) throws CFException {
      dcltbtrdsum.setSumCurrency(value);
   } 

     /**
	 * 	Update SumCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSumCurrency(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsum.setSumCurrency(source, sourceIndex);
   	
   }
   
   public void setSumCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsum.setSumCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SumCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSumCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsum.setSumCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SumCurrency with another Field
	 *	@param value
	 */
   public void setSumCurrency(Field source) {
      dcltbtrdsum.setSumCurrency(source);
   }  
   
     /**
	 * 	Update SumCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSumCurrency(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsum.setSumCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SumCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSumCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsum.setSumCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Trdpb004Ctx getTrdpb004Ctx() {
            return Trdpb004Ctx.this;
        }

        public ProcessSummaryRptOutCtx getProcessSummaryRptOutCtx() {
            return new ProcessSummaryRptOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += summaryRecord.hashCode();
        str += dcltbtrdsum.hashCode();
        str += hdrSummaryRecDash.hashCode();
        str += prtSummaryRec.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public ProcessSummaryRptInCtx clone() {
        ProcessSummaryRptInCtx cloneObj = new ProcessSummaryRptInCtx();
        cloneObj.summaryRecord = new SummaryRecord();
        cloneObj.summaryRecord.set(summaryRecord.getClonedField());
        cloneObj.dcltbtrdsum = new Dcltbtrdsum();
        cloneObj.dcltbtrdsum.set(dcltbtrdsum.getClonedField());
        cloneObj.hdrSummaryRecDash = new HdrSummaryRecDash();
        cloneObj.hdrSummaryRecDash.set(hdrSummaryRecDash.getClonedField());
        cloneObj.prtSummaryRec = new PrtSummaryRec();
        cloneObj.prtSummaryRec.set(prtSummaryRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public ProcessSummaryRptInCtx getProcessSummaryRptInCtx() {
            return new ProcessSummaryRptInCtx();
    }
     public class ProcessSummaryRptOutCtx implements Cloneable {
     SummaryRecord summaryRecord = Trdpb004Ctx.this.getSummaryRecord();
     Dcltbtrdsum dcltbtrdsum = Trdpb004Ctx.this.getDcltbtrdsum();
     HdrSummaryRecDash hdrSummaryRecDash = Trdpb004Ctx.this.getHdrSummaryRecDash();
     PrtSummaryRec prtSummaryRec = Trdpb004Ctx.this.getPrtSummaryRec();
     Work work = Trdpb004Ctx.this.getWork();
     Sqlca sqlca = Trdpb004Ctx.this.getSqlca();

	/**
	 *	Returns the value of summaryRecord
	 *	@return summaryRecord
	 */   
	 public SummaryRecord getSummaryRecord() {
   	return summaryRecord;
   }


	/**
	 *	Returns the value of prtSummaryCustomerId
	 *	@return prtSummaryCustomerId
	 */
   public char[] getPrtSummaryCustomerId() throws CFException  {              
   		return prtSummaryRec.getPrtSummaryCustomerId();
   }

  
	/**
	*  set variable prtSummaryCustomerId
	*  @param value
	**/
   public void setPrtSummaryCustomerId(char[] value) throws CFException {
      prtSummaryRec.setPrtSummaryCustomerId(value);
   } 

     /**
	 * 	Update PrtSummaryCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtSummaryCustomerId(char[] source, int sourceIndex) throws CFException {
      prtSummaryRec.setPrtSummaryCustomerId(source, sourceIndex);
   	
   }
   
   public void setPrtSummaryCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      prtSummaryRec.setPrtSummaryCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtSummaryCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtSummaryRec.setPrtSummaryCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtSummaryCustomerId with another Field
	 *	@param value
	 */
   public void setPrtSummaryCustomerId(Field source) {
      prtSummaryRec.setPrtSummaryCustomerId(source);
   }  
   
     /**
	 * 	Update PrtSummaryCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtSummaryCustomerId(Field source, int sourceIndex,int sourceLen) {
      prtSummaryRec.setPrtSummaryCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtSummaryCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtSummaryRec.setPrtSummaryCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of prtSummaryTotalCredit
	 *	@return prtSummaryTotalCredit
	 */
   public char[] getPrtSummaryTotalCredit() throws CFException  {              
   		return prtSummaryRec.getPrtSummaryTotalCredit();
   }

  
	/**
	*  set variable prtSummaryTotalCredit
	*  @param value
	**/
   public void setPrtSummaryTotalCredit(char[] value) throws CFException {
      prtSummaryRec.setPrtSummaryTotalCredit(value);
   } 

     /**
	 * 	Update PrtSummaryTotalCredit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtSummaryTotalCredit(char[] source, int sourceIndex) throws CFException {
      prtSummaryRec.setPrtSummaryTotalCredit(source, sourceIndex);
   	
   }
   
   public void setPrtSummaryTotalCredit(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      prtSummaryRec.setPrtSummaryTotalCredit(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtSummaryTotalCredit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryTotalCredit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtSummaryRec.setPrtSummaryTotalCredit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtSummaryTotalCredit with another Field
	 *	@param value
	 */
   public void setPrtSummaryTotalCredit(Field source) {
      prtSummaryRec.setPrtSummaryTotalCredit(source);
   }  
   
     /**
	 * 	Update PrtSummaryTotalCredit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtSummaryTotalCredit(Field source, int sourceIndex,int sourceLen) {
      prtSummaryRec.setPrtSummaryTotalCredit(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtSummaryTotalCredit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryTotalCredit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtSummaryRec.setPrtSummaryTotalCredit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getSumTotalCredit() throws CFException{      
   		return dcltbtrdsum.getSumTotalCredit();
	}

    public char[] getSumTotalCreditString() throws CFException {
          return  dcltbtrdsum.getSumTotalCredit().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update SumTotalCredit with the passed number
	 *	@param number
	 */
	public void setSumTotalCredit(BigDecimal number)  throws CFException{
		dcltbtrdsum.setSumTotalCredit(number);
   }

	/**
	 *	Returns the value of prtSummaryCloseBalance
	 *	@return prtSummaryCloseBalance
	 */
   public char[] getPrtSummaryCloseBalance() throws CFException  {              
   		return prtSummaryRec.getPrtSummaryCloseBalance();
   }

  
	/**
	*  set variable prtSummaryCloseBalance
	*  @param value
	**/
   public void setPrtSummaryCloseBalance(char[] value) throws CFException {
      prtSummaryRec.setPrtSummaryCloseBalance(value);
   } 

     /**
	 * 	Update PrtSummaryCloseBalance 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtSummaryCloseBalance(char[] source, int sourceIndex) throws CFException {
      prtSummaryRec.setPrtSummaryCloseBalance(source, sourceIndex);
   	
   }
   
   public void setPrtSummaryCloseBalance(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      prtSummaryRec.setPrtSummaryCloseBalance(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtSummaryCloseBalance 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryCloseBalance(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtSummaryRec.setPrtSummaryCloseBalance(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtSummaryCloseBalance with another Field
	 *	@param value
	 */
   public void setPrtSummaryCloseBalance(Field source) {
      prtSummaryRec.setPrtSummaryCloseBalance(source);
   }  
   
     /**
	 * 	Update PrtSummaryCloseBalance 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtSummaryCloseBalance(Field source, int sourceIndex,int sourceLen) {
      prtSummaryRec.setPrtSummaryCloseBalance(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtSummaryCloseBalance 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryCloseBalance(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtSummaryRec.setPrtSummaryCloseBalance(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prtSummaryRejected
	 *	@return prtSummaryRejected
	 */
   public char[] getPrtSummaryRejected() throws CFException  {              
   		return prtSummaryRec.getPrtSummaryRejected();
   }

  
	/**
	*  set variable prtSummaryRejected
	*  @param value
	**/
   public void setPrtSummaryRejected(char[] value) throws CFException {
      prtSummaryRec.setPrtSummaryRejected(value);
   } 

     /**
	 * 	Update PrtSummaryRejected 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtSummaryRejected(char[] source, int sourceIndex) throws CFException {
      prtSummaryRec.setPrtSummaryRejected(source, sourceIndex);
   	
   }
   
   public void setPrtSummaryRejected(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      prtSummaryRec.setPrtSummaryRejected(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtSummaryRejected 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryRejected(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtSummaryRec.setPrtSummaryRejected(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtSummaryRejected with another Field
	 *	@param value
	 */
   public void setPrtSummaryRejected(Field source) {
      prtSummaryRec.setPrtSummaryRejected(source);
   }  
   
     /**
	 * 	Update PrtSummaryRejected 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtSummaryRejected(Field source, int sourceIndex,int sourceLen) {
      prtSummaryRec.setPrtSummaryRejected(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtSummaryRejected 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryRejected(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtSummaryRec.setPrtSummaryRejected(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prtSummarySettled
	 *	@return prtSummarySettled
	 */
   public char[] getPrtSummarySettled() throws CFException  {              
   		return prtSummaryRec.getPrtSummarySettled();
   }

  
	/**
	*  set variable prtSummarySettled
	*  @param value
	**/
   public void setPrtSummarySettled(char[] value) throws CFException {
      prtSummaryRec.setPrtSummarySettled(value);
   } 

     /**
	 * 	Update PrtSummarySettled 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtSummarySettled(char[] source, int sourceIndex) throws CFException {
      prtSummaryRec.setPrtSummarySettled(source, sourceIndex);
   	
   }
   
   public void setPrtSummarySettled(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      prtSummaryRec.setPrtSummarySettled(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtSummarySettled 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummarySettled(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtSummaryRec.setPrtSummarySettled(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtSummarySettled with another Field
	 *	@param value
	 */
   public void setPrtSummarySettled(Field source) {
      prtSummaryRec.setPrtSummarySettled(source);
   }  
   
     /**
	 * 	Update PrtSummarySettled 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtSummarySettled(Field source, int sourceIndex,int sourceLen) {
      prtSummaryRec.setPrtSummarySettled(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtSummarySettled 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummarySettled(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtSummaryRec.setPrtSummarySettled(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of summaryFileStatus
	 *	@return summaryFileStatus
	 */
	public int getSummaryFileStatus() throws CFException {
   		return work.getSummaryFileStatus();
	}


	/**
	 *	Returns String value of summaryFileStatus
	 *	@return summaryFileStatus
	 */
	public char[]  getSummaryFileStatusString() throws CFException {
	     return String.valueOf(work.getSummaryFileStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean summaryFileStatusIsNumeric()  throws CFException{
	    return work.summaryFileStatusIsNumeric();
	}

	/**
	 * 	Update SummaryFileStatus with the passed value
	 *	@param number
	 */
	public void setSummaryFileStatus(int number)  throws CFException{
		work.setSummaryFileStatus(number);
	}
	

	public void setSummaryFileStatus(long number)  throws CFException{
	    work.setSummaryFileStatus(number);
	}
	
	
	/**
	 * 	Update SummaryFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setSummaryFileStatus(char[] value)  throws CFException {
		work.setSummaryFileStatus(value);
	}
	
	/**
	 * 	Update SummaryFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSummaryFileStatusString(char[] value)  throws CFException{
		work.setSummaryFileStatus(value);
	}	

	/**
	 *	Returns the value of dcltbtrdsum
	 *	@return dcltbtrdsum
	 */   
	 public Dcltbtrdsum getDcltbtrdsum() {
   	return dcltbtrdsum;
   }


	/**
	 *	Returns the value of excptionFileStatus
	 *	@return excptionFileStatus
	 */
	public int getExcptionFileStatus() throws CFException {
   		return work.getExcptionFileStatus();
	}


	/**
	 *	Returns String value of excptionFileStatus
	 *	@return excptionFileStatus
	 */
	public char[]  getExcptionFileStatusString() throws CFException {
	     return String.valueOf(work.getExcptionFileStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean excptionFileStatusIsNumeric()  throws CFException{
	    return work.excptionFileStatusIsNumeric();
	}

	/**
	 * 	Update ExcptionFileStatus with the passed value
	 *	@param number
	 */
	public void setExcptionFileStatus(int number)  throws CFException{
		work.setExcptionFileStatus(number);
	}
	

	public void setExcptionFileStatus(long number)  throws CFException{
	    work.setExcptionFileStatus(number);
	}
	
	
	/**
	 * 	Update ExcptionFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setExcptionFileStatus(char[] value)  throws CFException {
		work.setExcptionFileStatus(value);
	}
	
	/**
	 * 	Update ExcptionFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExcptionFileStatusString(char[] value)  throws CFException{
		work.setExcptionFileStatus(value);
	}	

	/**
	 *	Returns the value of prtSummaryOpenBalance
	 *	@return prtSummaryOpenBalance
	 */
   public char[] getPrtSummaryOpenBalance() throws CFException  {              
   		return prtSummaryRec.getPrtSummaryOpenBalance();
   }

  
	/**
	*  set variable prtSummaryOpenBalance
	*  @param value
	**/
   public void setPrtSummaryOpenBalance(char[] value) throws CFException {
      prtSummaryRec.setPrtSummaryOpenBalance(value);
   } 

     /**
	 * 	Update PrtSummaryOpenBalance 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtSummaryOpenBalance(char[] source, int sourceIndex) throws CFException {
      prtSummaryRec.setPrtSummaryOpenBalance(source, sourceIndex);
   	
   }
   
   public void setPrtSummaryOpenBalance(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      prtSummaryRec.setPrtSummaryOpenBalance(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtSummaryOpenBalance 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryOpenBalance(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtSummaryRec.setPrtSummaryOpenBalance(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtSummaryOpenBalance with another Field
	 *	@param value
	 */
   public void setPrtSummaryOpenBalance(Field source) {
      prtSummaryRec.setPrtSummaryOpenBalance(source);
   }  
   
     /**
	 * 	Update PrtSummaryOpenBalance 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtSummaryOpenBalance(Field source, int sourceIndex,int sourceLen) {
      prtSummaryRec.setPrtSummaryOpenBalance(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtSummaryOpenBalance 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryOpenBalance(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtSummaryRec.setPrtSummaryOpenBalance(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sumCustomerId
	 *	@return sumCustomerId
	 */
   public char[] getSumCustomerId() throws CFException  {              
   		return dcltbtrdsum.getSumCustomerId();
   }

  
	/**
	*  set variable sumCustomerId
	*  @param value
	**/
   public void setSumCustomerId(char[] value) throws CFException {
      dcltbtrdsum.setSumCustomerId(value);
   } 

     /**
	 * 	Update SumCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSumCustomerId(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsum.setSumCustomerId(source, sourceIndex);
   	
   }
   
   public void setSumCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsum.setSumCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SumCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSumCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsum.setSumCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SumCustomerId with another Field
	 *	@param value
	 */
   public void setSumCustomerId(Field source) {
      dcltbtrdsum.setSumCustomerId(source);
   }  
   
     /**
	 * 	Update SumCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSumCustomerId(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsum.setSumCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SumCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSumCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsum.setSumCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getSumCloseBalance() throws CFException{      
   		return dcltbtrdsum.getSumCloseBalance();
	}

    public char[] getSumCloseBalanceString() throws CFException {
          return  dcltbtrdsum.getSumCloseBalance().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update SumCloseBalance with the passed number
	 *	@param number
	 */
	public void setSumCloseBalance(BigDecimal number)  throws CFException{
		dcltbtrdsum.setSumCloseBalance(number);
   }

	/**
	 *	Returns the value of prtSummaryOverdue
	 *	@return prtSummaryOverdue
	 */
   public char[] getPrtSummaryOverdue() throws CFException  {              
   		return prtSummaryRec.getPrtSummaryOverdue();
   }

  
	/**
	*  set variable prtSummaryOverdue
	*  @param value
	**/
   public void setPrtSummaryOverdue(char[] value) throws CFException {
      prtSummaryRec.setPrtSummaryOverdue(value);
   } 

     /**
	 * 	Update PrtSummaryOverdue 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtSummaryOverdue(char[] source, int sourceIndex) throws CFException {
      prtSummaryRec.setPrtSummaryOverdue(source, sourceIndex);
   	
   }
   
   public void setPrtSummaryOverdue(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      prtSummaryRec.setPrtSummaryOverdue(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtSummaryOverdue 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryOverdue(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtSummaryRec.setPrtSummaryOverdue(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtSummaryOverdue with another Field
	 *	@param value
	 */
   public void setPrtSummaryOverdue(Field source) {
      prtSummaryRec.setPrtSummaryOverdue(source);
   }  
   
     /**
	 * 	Update PrtSummaryOverdue 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtSummaryOverdue(Field source, int sourceIndex,int sourceLen) {
      prtSummaryRec.setPrtSummaryOverdue(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtSummaryOverdue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryOverdue(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtSummaryRec.setPrtSummaryOverdue(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prtSummaryCurrency
	 *	@return prtSummaryCurrency
	 */
   public char[] getPrtSummaryCurrency() throws CFException  {              
   		return prtSummaryRec.getPrtSummaryCurrency();
   }

  
	/**
	*  set variable prtSummaryCurrency
	*  @param value
	**/
   public void setPrtSummaryCurrency(char[] value) throws CFException {
      prtSummaryRec.setPrtSummaryCurrency(value);
   } 

     /**
	 * 	Update PrtSummaryCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtSummaryCurrency(char[] source, int sourceIndex) throws CFException {
      prtSummaryRec.setPrtSummaryCurrency(source, sourceIndex);
   	
   }
   
   public void setPrtSummaryCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      prtSummaryRec.setPrtSummaryCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtSummaryCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtSummaryRec.setPrtSummaryCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtSummaryCurrency with another Field
	 *	@param value
	 */
   public void setPrtSummaryCurrency(Field source) {
      prtSummaryRec.setPrtSummaryCurrency(source);
   }  
   
     /**
	 * 	Update PrtSummaryCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtSummaryCurrency(Field source, int sourceIndex,int sourceLen) {
      prtSummaryRec.setPrtSummaryCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtSummaryCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtSummaryRec.setPrtSummaryCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sumOverdue
	 *	@return sumOverdue
	 */
	public int getSumOverdue() throws CFException {        
   		return dcltbtrdsum.getSumOverdue();
	}
	
	/**
	 * 	Update SumOverdue with the passed value
	 *	@param number
	 */
	public void setSumOverdue(int number)  throws CFException{
		dcltbtrdsum.setSumOverdue(number);
	}


	public void setSumOverdue(long number)  throws CFException{
		dcltbtrdsum.setSumOverdue((int)number);
	}


	/**
	 *	Returns the value of exception
	 *	@return exception
	 */
   public char[] getException() throws CFException  {              
   		return work.getException();
   }

  
	/**
	*  set variable exception
	*  @param value
	**/
   public void setException(char[] value) throws CFException {
      work.setException(value);
   } 

	/**
	 *	Returns the value of sumSettled
	 *	@return sumSettled
	 */
	public int getSumSettled() throws CFException {        
   		return dcltbtrdsum.getSumSettled();
	}
	
	/**
	 * 	Update SumSettled with the passed value
	 *	@param number
	 */
	public void setSumSettled(int number)  throws CFException{
		dcltbtrdsum.setSumSettled(number);
	}


	public void setSumSettled(long number)  throws CFException{
		dcltbtrdsum.setSumSettled((int)number);
	}


	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
   public char[] getSqlcode_Ws() throws CFException  {              
   		return work.getSqlcode_Ws();
   }

  
	/**
	*  set variable sqlcode_Ws
	*  @param value
	**/
   public void setSqlcode_Ws(char[] value) throws CFException {
      work.setSqlcode_Ws(value);
   } 

     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex) throws CFException {
      work.setSqlcode_Ws(source, sourceIndex);
   	
   }
   
   public void setSqlcode_Ws(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlcode_Ws with another Field
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source) {
      work.setSqlcode_Ws(source);
   }  
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getSumTotalDebit() throws CFException{      
   		return dcltbtrdsum.getSumTotalDebit();
	}

    public char[] getSumTotalDebitString() throws CFException {
          return  dcltbtrdsum.getSumTotalDebit().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update SumTotalDebit with the passed number
	 *	@param number
	 */
	public void setSumTotalDebit(BigDecimal number)  throws CFException{
		dcltbtrdsum.setSumTotalDebit(number);
   }

	public BigDecimal getSumOpenBalance() throws CFException{      
   		return dcltbtrdsum.getSumOpenBalance();
	}

    public char[] getSumOpenBalanceString() throws CFException {
          return  dcltbtrdsum.getSumOpenBalance().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update SumOpenBalance with the passed number
	 *	@param number
	 */
	public void setSumOpenBalance(BigDecimal number)  throws CFException{
		dcltbtrdsum.setSumOpenBalance(number);
   }

	/**
	 *	Returns the value of prtSummaryTotalDebit
	 *	@return prtSummaryTotalDebit
	 */
   public char[] getPrtSummaryTotalDebit() throws CFException  {              
   		return prtSummaryRec.getPrtSummaryTotalDebit();
   }

  
	/**
	*  set variable prtSummaryTotalDebit
	*  @param value
	**/
   public void setPrtSummaryTotalDebit(char[] value) throws CFException {
      prtSummaryRec.setPrtSummaryTotalDebit(value);
   } 

     /**
	 * 	Update PrtSummaryTotalDebit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtSummaryTotalDebit(char[] source, int sourceIndex) throws CFException {
      prtSummaryRec.setPrtSummaryTotalDebit(source, sourceIndex);
   	
   }
   
   public void setPrtSummaryTotalDebit(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      prtSummaryRec.setPrtSummaryTotalDebit(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtSummaryTotalDebit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryTotalDebit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtSummaryRec.setPrtSummaryTotalDebit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtSummaryTotalDebit with another Field
	 *	@param value
	 */
   public void setPrtSummaryTotalDebit(Field source) {
      prtSummaryRec.setPrtSummaryTotalDebit(source);
   }  
   
     /**
	 * 	Update PrtSummaryTotalDebit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtSummaryTotalDebit(Field source, int sourceIndex,int sourceLen) {
      prtSummaryRec.setPrtSummaryTotalDebit(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtSummaryTotalDebit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryTotalDebit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      prtSummaryRec.setPrtSummaryTotalDebit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of sumRejected
	 *	@return sumRejected
	 */
	public int getSumRejected() throws CFException {        
   		return dcltbtrdsum.getSumRejected();
	}
	
	/**
	 * 	Update SumRejected with the passed value
	 *	@param number
	 */
	public void setSumRejected(int number)  throws CFException{
		dcltbtrdsum.setSumRejected(number);
	}


	public void setSumRejected(long number)  throws CFException{
		dcltbtrdsum.setSumRejected((int)number);
	}


	/**
	 *	Returns the value of sumCurrency
	 *	@return sumCurrency
	 */
   public char[] getSumCurrency() throws CFException  {              
   		return dcltbtrdsum.getSumCurrency();
   }

  
	/**
	*  set variable sumCurrency
	*  @param value
	**/
   public void setSumCurrency(char[] value) throws CFException {
      dcltbtrdsum.setSumCurrency(value);
   } 

     /**
	 * 	Update SumCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSumCurrency(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsum.setSumCurrency(source, sourceIndex);
   	
   }
   
   public void setSumCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsum.setSumCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SumCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSumCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsum.setSumCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SumCurrency with another Field
	 *	@param value
	 */
   public void setSumCurrency(Field source) {
      dcltbtrdsum.setSumCurrency(source);
   }  
   
     /**
	 * 	Update SumCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSumCurrency(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsum.setSumCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SumCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSumCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsum.setSumCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Trdpb004Ctx getTrdpb004Ctx() {
            return Trdpb004Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += summaryRecord.hashCode();
        str += dcltbtrdsum.hashCode();
        str += hdrSummaryRecDash.hashCode();
        str += prtSummaryRec.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public ProcessSummaryRptOutCtx clone() {
        ProcessSummaryRptOutCtx cloneObj = new ProcessSummaryRptOutCtx();
        cloneObj.summaryRecord = new SummaryRecord();
        cloneObj.summaryRecord.set(summaryRecord.getClonedField());
        cloneObj.dcltbtrdsum = new Dcltbtrdsum();
        cloneObj.dcltbtrdsum.set(dcltbtrdsum.getClonedField());
        cloneObj.hdrSummaryRecDash = new HdrSummaryRecDash();
        cloneObj.hdrSummaryRecDash.set(hdrSummaryRecDash.getClonedField());
        cloneObj.prtSummaryRec = new PrtSummaryRec();
        cloneObj.prtSummaryRec.set(prtSummaryRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public ProcessSummaryRptOutCtx getProcessSummaryRptOutCtx() {
            return new ProcessSummaryRptOutCtx();
    }
     public class CleanupInCtx implements Cloneable {
     Sqlca sqlca = Trdpb004Ctx.this.getSqlca();

	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}



        public Trdpb004Ctx getTrdpb004Ctx() {
            return Trdpb004Ctx.this;
        }

        public CleanupOutCtx getCleanupOutCtx() {
            return new CleanupOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public CleanupInCtx clone() {
        CleanupInCtx cloneObj = new CleanupInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public CleanupInCtx getCleanupInCtx() {
            return new CleanupInCtx();
    }
     public class CleanupOutCtx implements Cloneable {
     Sqlca sqlca = Trdpb004Ctx.this.getSqlca();

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }



        public Trdpb004Ctx getTrdpb004Ctx() {
            return Trdpb004Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public CleanupOutCtx clone() {
        CleanupOutCtx cloneObj = new CleanupOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public CleanupOutCtx getCleanupOutCtx() {
            return new CleanupOutCtx();
    }
     public class ReportExceptionInCtx implements Cloneable {
     Work work = Trdpb004Ctx.this.getWork();

	/**
	 *	Returns the value of exception
	 *	@return exception
	 */
   public char[] getException() throws CFException  {              
   		return work.getException();
   }

  
	/**
	*  set variable exception
	*  @param value
	**/
   public void setException(char[] value) throws CFException {
      work.setException(value);
   } 


        public Trdpb004Ctx getTrdpb004Ctx() {
            return Trdpb004Ctx.this;
        }

        public ReportExceptionOutCtx getReportExceptionOutCtx() {
            return new ReportExceptionOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public ReportExceptionInCtx clone() {
        ReportExceptionInCtx cloneObj = new ReportExceptionInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReportExceptionInCtx getReportExceptionInCtx() {
            return new ReportExceptionInCtx();
    }
     public class ReportExceptionOutCtx implements Cloneable {
     Work work = Trdpb004Ctx.this.getWork();


        public Trdpb004Ctx getTrdpb004Ctx() {
            return Trdpb004Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public ReportExceptionOutCtx clone() {
        ReportExceptionOutCtx cloneObj = new ReportExceptionOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReportExceptionOutCtx getReportExceptionOutCtx() {
            return new ReportExceptionOutCtx();
    }
}
