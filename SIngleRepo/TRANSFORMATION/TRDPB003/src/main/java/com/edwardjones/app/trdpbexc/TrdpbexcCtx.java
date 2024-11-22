package com.edwardjones.app.trdpbexc;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.edwardjones.app.trdpbexc.dto.Sqlwarn;
import com.edwardjones.app.trdpbexc.dto.Work;
import com.edwardjones.app.trdpbexc.dto.ExceptionRecord;
import com.edwardjones.app.trdpbexc.dto.ExceptionRecordLenGroup;
import com.edwardjones.app.trdpbexc.dto.Sqlca;
import com.edwardjones.app.trdpbexc.dto.Dcltbtrdexc;
import com.edwardjones.app.trdpbexc.dto.ExcDescription;


@Context
public class TrdpbexcCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    ExceptionRecordLenGroup exceptionRecordLenGroup;
    Sqlca sqlca;
    Work work;
    ExceptionRecord exceptionRecord;
    Dcltbtrdexc dcltbtrdexc;


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



    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }


    public ExceptionRecordLenGroup getExceptionRecordLenGroup() {
        if (exceptionRecordLenGroup == null) {
            exceptionRecordLenGroup = new ExceptionRecordLenGroup();
        }

        return exceptionRecordLenGroup;
    }

    public void setExceptionRecordLenGroup(ExceptionRecordLenGroup exceptionRecordLenGroup) {
        this.exceptionRecordLenGroup = exceptionRecordLenGroup;
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
    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
    public ExceptionRecord getExceptionRecord() {
        if (exceptionRecord == null) {
            exceptionRecord = new ExceptionRecord();
        }

        return exceptionRecord;
    }

    public void setExceptionRecord(ExceptionRecord exceptionRecord) {
        this.exceptionRecord = exceptionRecord;
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


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += exceptionRecordLenGroup.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
        str += exceptionRecord.hashCode();
        str += dcltbtrdexc.hashCode();
       return str.hashCode();
    }

    public TrdpbexcCtx clone() {
        TrdpbexcCtx cloneObj = new TrdpbexcCtx();
        cloneObj.exceptionRecordLenGroup = new ExceptionRecordLenGroup();
        cloneObj.exceptionRecordLenGroup.set(exceptionRecordLenGroup.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.exceptionRecord = new ExceptionRecord();
        cloneObj.exceptionRecord.set(exceptionRecord.getClonedField());
        cloneObj.dcltbtrdexc = new Dcltbtrdexc();
        cloneObj.dcltbtrdexc.set(dcltbtrdexc.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     ExceptionRecordLenGroup exceptionRecordLenGroup = TrdpbexcCtx.this.getExceptionRecordLenGroup();
     ExceptionRecord exceptionRecord = TrdpbexcCtx.this.getExceptionRecord();


        public TrdpbexcCtx getTrdpbexcCtx() {
            return TrdpbexcCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += exceptionRecordLenGroup.hashCode();
        str += exceptionRecord.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.exceptionRecordLenGroup = new ExceptionRecordLenGroup();
        cloneObj.exceptionRecordLenGroup.set(exceptionRecordLenGroup.getClonedField());
        cloneObj.exceptionRecord = new ExceptionRecord();
        cloneObj.exceptionRecord.set(exceptionRecord.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainlineInCtx implements Cloneable {
     ExceptionRecordLenGroup exceptionRecordLenGroup = TrdpbexcCtx.this.getExceptionRecordLenGroup();
     Sqlca sqlca = TrdpbexcCtx.this.getSqlca();
     Work work = TrdpbexcCtx.this.getWork();
     ExceptionRecord exceptionRecord = TrdpbexcCtx.this.getExceptionRecord();
     Dcltbtrdexc dcltbtrdexc = TrdpbexcCtx.this.getDcltbtrdexc();

	/**
	 *	Returns the value of exceptionRecordLen
	 *	@return exceptionRecordLen
	 */
	public short getExceptionRecordLen() throws CFException {        
   		return exceptionRecordLenGroup.getExceptionRecordLen();
	}
	
	/**
	 * 	Update ExceptionRecordLen with the passed value
	 *	@param number
	 */
	public void setExceptionRecordLen(short number)  throws CFException{
		exceptionRecordLenGroup.setExceptionRecordLen(number);
	}

	public void setExceptionRecordLen(int number)  throws CFException{
		exceptionRecordLenGroup.setExceptionRecordLen((short)number);
	}

	public void setExceptionRecordLen(long number)  throws CFException{
		exceptionRecordLenGroup.setExceptionRecordLen((short)number);
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
	 *	Returns the value of exceptionDesc
	 *	@return exceptionDesc
	 */
   public char[] getExceptionDesc() throws CFException  {              
   		return exceptionRecord.getExceptionDesc();
   }

  
	/**
	*  set variable exceptionDesc
	*  @param value
	**/
   public void setExceptionDesc(char[] value) throws CFException {
      exceptionRecord.setExceptionDesc(value);
   } 

     /**
	 * 	Update ExceptionDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExceptionDesc(char[] source, int sourceIndex) throws CFException {
      exceptionRecord.setExceptionDesc(source, sourceIndex);
   	
   }
   
   public void setExceptionDesc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      exceptionRecord.setExceptionDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExceptionDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExceptionDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      exceptionRecord.setExceptionDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExceptionDesc with another Field
	 *	@param value
	 */
   public void setExceptionDesc(Field source) {
      exceptionRecord.setExceptionDesc(source);
   }  
   
     /**
	 * 	Update ExceptionDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExceptionDesc(Field source, int sourceIndex,int sourceLen) {
      exceptionRecord.setExceptionDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExceptionDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExceptionDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      exceptionRecord.setExceptionDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Returns the value of exceptionType
	 *	@return exceptionType
	 */
   public char[] getExceptionType() throws CFException  {              
   		return exceptionRecord.getExceptionType();
   }

  
	/**
	*  set variable exceptionType
	*  @param value
	**/
   public void setExceptionType(char[] value) throws CFException {
      exceptionRecord.setExceptionType(value);
   } 

     /**
	 * 	Update ExceptionType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExceptionType(char[] source, int sourceIndex) throws CFException {
      exceptionRecord.setExceptionType(source, sourceIndex);
   	
   }
   
   public void setExceptionType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      exceptionRecord.setExceptionType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExceptionType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExceptionType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      exceptionRecord.setExceptionType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExceptionType with another Field
	 *	@param value
	 */
   public void setExceptionType(Field source) {
      exceptionRecord.setExceptionType(source);
   }  
   
     /**
	 * 	Update ExceptionType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExceptionType(Field source, int sourceIndex,int sourceLen) {
      exceptionRecord.setExceptionType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExceptionType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExceptionType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      exceptionRecord.setExceptionType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "DATA" for isExceptionData()
	 *	@return  Returns true if isExceptionData() is "DATA"
	 */
   public boolean isExceptionData() throws CFException {
      return exceptionRecord.isExceptionData();
   }

	/**
	*  set values "DATA"
	*/
   	public void setExceptionDataTrue()  throws CFException{  			
    	exceptionRecord.setExceptionDataTrue();
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
	 *	Returns the value of dcltbtrdexc
	 *	@return dcltbtrdexc
	 */   
	 public Dcltbtrdexc getDcltbtrdexc() {
   	return dcltbtrdexc;
   }



        public TrdpbexcCtx getTrdpbexcCtx() {
            return TrdpbexcCtx.this;
        }

        public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += exceptionRecordLenGroup.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
        str += exceptionRecord.hashCode();
        str += dcltbtrdexc.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.exceptionRecordLenGroup = new ExceptionRecordLenGroup();
        cloneObj.exceptionRecordLenGroup.set(exceptionRecordLenGroup.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.exceptionRecord = new ExceptionRecord();
        cloneObj.exceptionRecord.set(exceptionRecord.getClonedField());
        cloneObj.dcltbtrdexc = new Dcltbtrdexc();
        cloneObj.dcltbtrdexc.set(dcltbtrdexc.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     ExceptionRecordLenGroup exceptionRecordLenGroup = TrdpbexcCtx.this.getExceptionRecordLenGroup();
     Sqlca sqlca = TrdpbexcCtx.this.getSqlca();
     Work work = TrdpbexcCtx.this.getWork();
     ExceptionRecord exceptionRecord = TrdpbexcCtx.this.getExceptionRecord();
     Dcltbtrdexc dcltbtrdexc = TrdpbexcCtx.this.getDcltbtrdexc();

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
	 *	Returns the value of exceptionRecordLen
	 *	@return exceptionRecordLen
	 */
	public short getExceptionRecordLen() throws CFException {        
   		return exceptionRecordLenGroup.getExceptionRecordLen();
	}
	
	/**
	 * 	Update ExceptionRecordLen with the passed value
	 *	@param number
	 */
	public void setExceptionRecordLen(short number)  throws CFException{
		exceptionRecordLenGroup.setExceptionRecordLen(number);
	}

	public void setExceptionRecordLen(int number)  throws CFException{
		exceptionRecordLenGroup.setExceptionRecordLen((short)number);
	}

	public void setExceptionRecordLen(long number)  throws CFException{
		exceptionRecordLenGroup.setExceptionRecordLen((short)number);
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
	 *	Returns the value of exceptionDesc
	 *	@return exceptionDesc
	 */
   public char[] getExceptionDesc() throws CFException  {              
   		return exceptionRecord.getExceptionDesc();
   }

  
	/**
	*  set variable exceptionDesc
	*  @param value
	**/
   public void setExceptionDesc(char[] value) throws CFException {
      exceptionRecord.setExceptionDesc(value);
   } 

     /**
	 * 	Update ExceptionDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExceptionDesc(char[] source, int sourceIndex) throws CFException {
      exceptionRecord.setExceptionDesc(source, sourceIndex);
   	
   }
   
   public void setExceptionDesc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      exceptionRecord.setExceptionDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExceptionDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExceptionDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      exceptionRecord.setExceptionDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExceptionDesc with another Field
	 *	@param value
	 */
   public void setExceptionDesc(Field source) {
      exceptionRecord.setExceptionDesc(source);
   }  
   
     /**
	 * 	Update ExceptionDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExceptionDesc(Field source, int sourceIndex,int sourceLen) {
      exceptionRecord.setExceptionDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExceptionDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExceptionDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      exceptionRecord.setExceptionDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of exceptionType
	 *	@return exceptionType
	 */
   public char[] getExceptionType() throws CFException  {              
   		return exceptionRecord.getExceptionType();
   }

  
	/**
	*  set variable exceptionType
	*  @param value
	**/
   public void setExceptionType(char[] value) throws CFException {
      exceptionRecord.setExceptionType(value);
   } 

     /**
	 * 	Update ExceptionType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExceptionType(char[] source, int sourceIndex) throws CFException {
      exceptionRecord.setExceptionType(source, sourceIndex);
   	
   }
   
   public void setExceptionType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      exceptionRecord.setExceptionType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExceptionType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExceptionType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      exceptionRecord.setExceptionType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExceptionType with another Field
	 *	@param value
	 */
   public void setExceptionType(Field source) {
      exceptionRecord.setExceptionType(source);
   }  
   
     /**
	 * 	Update ExceptionType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExceptionType(Field source, int sourceIndex,int sourceLen) {
      exceptionRecord.setExceptionType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExceptionType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExceptionType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      exceptionRecord.setExceptionType(source, sourceIndex, sourceLen, targetIndex, targetLen);
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


        public TrdpbexcCtx getTrdpbexcCtx() {
            return TrdpbexcCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += exceptionRecordLenGroup.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
        str += exceptionRecord.hashCode();
        str += dcltbtrdexc.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.exceptionRecordLenGroup = new ExceptionRecordLenGroup();
        cloneObj.exceptionRecordLenGroup.set(exceptionRecordLenGroup.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.exceptionRecord = new ExceptionRecord();
        cloneObj.exceptionRecord.set(exceptionRecord.getClonedField());
        cloneObj.dcltbtrdexc = new Dcltbtrdexc();
        cloneObj.dcltbtrdexc.set(dcltbtrdexc.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class AbendDumpInCtx implements Cloneable {
     Work work = TrdpbexcCtx.this.getWork();
     Dcltbtrdexc dcltbtrdexc = TrdpbexcCtx.this.getDcltbtrdexc();

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


        public TrdpbexcCtx getTrdpbexcCtx() {
            return TrdpbexcCtx.this;
        }

        public AbendDumpOutCtx getAbendDumpOutCtx() {
            return new AbendDumpOutCtx();
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
        str += dcltbtrdexc.hashCode();
       return str.hashCode();
    }

    public AbendDumpInCtx clone() {
        AbendDumpInCtx cloneObj = new AbendDumpInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dcltbtrdexc = new Dcltbtrdexc();
        cloneObj.dcltbtrdexc.set(dcltbtrdexc.getClonedField());
        return cloneObj;
    }

    }

    public AbendDumpInCtx getAbendDumpInCtx() {
            return new AbendDumpInCtx();
    }
     public class AbendDumpOutCtx implements Cloneable {
     Work work = TrdpbexcCtx.this.getWork();
     Dcltbtrdexc dcltbtrdexc = TrdpbexcCtx.this.getDcltbtrdexc();

	/**
	 *	Returns the value of abendCode
	 *	@return abendCode
	 */
	public int getAbendCode() throws CFException {        
   		return work.getAbendCode();
	}
	
	/**
	 * 	Update AbendCode with the passed value
	 *	@param number
	 */
	public void setAbendCode(int number)  throws CFException{
		work.setAbendCode(number);
	}


	public void setAbendCode(long number)  throws CFException{
		work.setAbendCode((int)number);
	}



        public TrdpbexcCtx getTrdpbexcCtx() {
            return TrdpbexcCtx.this;
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
        str += dcltbtrdexc.hashCode();
       return str.hashCode();
    }

    public AbendDumpOutCtx clone() {
        AbendDumpOutCtx cloneObj = new AbendDumpOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dcltbtrdexc = new Dcltbtrdexc();
        cloneObj.dcltbtrdexc.set(dcltbtrdexc.getClonedField());
        return cloneObj;
    }

    }

    public AbendDumpOutCtx getAbendDumpOutCtx() {
            return new AbendDumpOutCtx();
    }
}
