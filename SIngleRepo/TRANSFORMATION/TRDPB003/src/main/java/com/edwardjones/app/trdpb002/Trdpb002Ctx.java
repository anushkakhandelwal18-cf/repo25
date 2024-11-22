package com.edwardjones.app.trdpb002;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.edwardjones.app.trdpb002.dto.TrdOrderPair;
import com.edwardjones.app.trdpb002.dto.ExceptionRecord;
import com.edwardjones.app.trdpb002.dto.Sqlwarn;
import com.edwardjones.app.trdpb002.dto.Dcltbtrdpos;
import com.edwardjones.app.trdpb002.dto.ExceptionRecordLenGroup;
import java.sql.ResultSet;
import com.edwardjones.app.trdpb002.dto.Sqlca;
import com.edwardjones.app.trdpb002.dto.Work;


@Context
public class Trdpb002Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    TrdOrderPair trdOrderPair;
    Work work;
    ExceptionRecord exceptionRecord;
    Sqlca sqlca;
    Dcltbtrdpos dcltbtrdpos;
    ExceptionRecordLenGroup exceptionRecordLenGroup;


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


    ResultSet posBookingResultSet;

    public ResultSet getPosBookingResultSet() {
        return this.posBookingResultSet;
    }

    public void setPosBookingResultSet(ResultSet posBookingResultSet) {
        this.posBookingResultSet = posBookingResultSet;
    }

    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }


    public TrdOrderPair getTrdOrderPair() {
        if (trdOrderPair == null) {
            trdOrderPair = new TrdOrderPair();
        }

        return trdOrderPair;
    }

    public void setTrdOrderPair(TrdOrderPair trdOrderPair) {
        this.trdOrderPair = trdOrderPair;
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
    public Sqlca getSqlca() {
        if (sqlca == null) {
            sqlca = new Sqlca();
        }

        return sqlca;
    }

    public void setSqlca(Sqlca sqlca) {
        this.sqlca = sqlca;
    }
    public Dcltbtrdpos getDcltbtrdpos() {
        if (dcltbtrdpos == null) {
            dcltbtrdpos = new Dcltbtrdpos();
        }

        return dcltbtrdpos;
    }

    public void setDcltbtrdpos(Dcltbtrdpos dcltbtrdpos) {
        this.dcltbtrdpos = dcltbtrdpos;
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


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += trdOrderPair.hashCode();
        str += work.hashCode();
        str += exceptionRecord.hashCode();
        str += sqlca.hashCode();
        str += dcltbtrdpos.hashCode();
        str += exceptionRecordLenGroup.hashCode();
       return str.hashCode();
    }

    public Trdpb002Ctx clone() {
        Trdpb002Ctx cloneObj = new Trdpb002Ctx();
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.exceptionRecord = new ExceptionRecord();
        cloneObj.exceptionRecord.set(exceptionRecord.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dcltbtrdpos = new Dcltbtrdpos();
        cloneObj.dcltbtrdpos.set(dcltbtrdpos.getClonedField());
        cloneObj.exceptionRecordLenGroup = new ExceptionRecordLenGroup();
        cloneObj.exceptionRecordLenGroup.set(exceptionRecordLenGroup.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     TrdOrderPair trdOrderPair = Trdpb002Ctx.this.getTrdOrderPair();


        public Trdpb002Ctx getTrdpb002Ctx() {
            return Trdpb002Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += trdOrderPair.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     TrdOrderPair trdOrderPair = Trdpb002Ctx.this.getTrdOrderPair();
     Work work = Trdpb002Ctx.this.getWork();

	/**
	 *	Test condition "D" for isDebitSeller()
	 *	@return  Returns true if isDebitSeller() is "D"
	 */
   public boolean isDebitSeller() throws CFException {
      return work.isDebitSeller();
   }

	/**
	*  set values "D"
	*/
   	public void setDebitSellerTrue()  throws CFException{  			
    	work.setDebitSellerTrue();
   	}
	/**
	 *	Test condition "C" for isCreditBuyer()
	 *	@return  Returns true if isCreditBuyer() is "C"
	 */
   public boolean isCreditBuyer() throws CFException {
      return work.isCreditBuyer();
   }

	/**
	*  set values "C"
	*/
   	public void setCreditBuyerTrue()  throws CFException{  			
    	work.setCreditBuyerTrue();
   	}
	/**
	 *	Test condition "S" for isTrdSacBookingDone()
	 *	@return  Returns true if isTrdSacBookingDone() is "S"
	 */
   public boolean isTrdSacBookingDone() throws CFException {
      return trdOrderPair.isTrdSacBookingDone();
   }

	/**
	*  set values "S"
	*/
   	public void setTrdSacBookingDoneTrue()  throws CFException{  			
    	trdOrderPair.setTrdSacBookingDoneTrue();
   	}
	/**
	 *	Test condition "F" for isTrdSacBookingFailed()
	 *	@return  Returns true if isTrdSacBookingFailed() is "F"
	 */
   public boolean isTrdSacBookingFailed() throws CFException {
      return trdOrderPair.isTrdSacBookingFailed();
   }

	/**
	*  set values "F"
	*/
   	public void setTrdSacBookingFailedTrue()  throws CFException{  			
    	trdOrderPair.setTrdSacBookingFailedTrue();
   	}

        public Trdpb002Ctx getTrdpb002Ctx() {
            return Trdpb002Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += trdOrderPair.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class SacBookingInCtx implements Cloneable {
     TrdOrderPair trdOrderPair = Trdpb002Ctx.this.getTrdOrderPair();
     Work work = Trdpb002Ctx.this.getWork();
     Dcltbtrdpos dcltbtrdpos = Trdpb002Ctx.this.getDcltbtrdpos();
     Sqlca sqlca = Trdpb002Ctx.this.getSqlca();

	public BigDecimal getPosBalance() throws CFException{      
   		return dcltbtrdpos.getPosBalance();
	}

    public char[] getPosBalanceString() throws CFException {
          return  dcltbtrdpos.getPosBalance().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update PosBalance with the passed number
	 *	@param number
	 */
	public void setPosBalance(BigDecimal number)  throws CFException{
		dcltbtrdpos.setPosBalance(number);
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
	 *	Returns the value of trdSellerSecAccNum
	 *	@return trdSellerSecAccNum
	 */
	public int getTrdSellerSecAccNum() throws CFException {        
   		return trdOrderPair.getTrdSellerSecAccNum();
	}
	
	/**
	 * 	Update TrdSellerSecAccNum with the passed value
	 *	@param number
	 */
	public void setTrdSellerSecAccNum(int number)  throws CFException{
		trdOrderPair.setTrdSellerSecAccNum(number);
	}


	public void setTrdSellerSecAccNum(long number)  throws CFException{
		trdOrderPair.setTrdSellerSecAccNum((int)number);
	}


	/**
	 *	Returns the value of trdCurrency
	 *	@return trdCurrency
	 */
   public char[] getTrdCurrency() throws CFException  {              
   		return trdOrderPair.getTrdCurrency();
   }

  
	/**
	*  set variable trdCurrency
	*  @param value
	**/
   public void setTrdCurrency(char[] value) throws CFException {
      trdOrderPair.setTrdCurrency(value);
   } 

     /**
	 * 	Update TrdCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdCurrency(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdCurrency(source, sourceIndex);
   	
   }
   
   public void setTrdCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdCurrency with another Field
	 *	@param value
	 */
   public void setTrdCurrency(Field source) {
      trdOrderPair.setTrdCurrency(source);
   }  
   
     /**
	 * 	Update TrdCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdCurrency(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of trdBuyerSecAccNum
	 *	@return trdBuyerSecAccNum
	 */
	public int getTrdBuyerSecAccNum() throws CFException {        
   		return trdOrderPair.getTrdBuyerSecAccNum();
	}
	
	/**
	 * 	Update TrdBuyerSecAccNum with the passed value
	 *	@param number
	 */
	public void setTrdBuyerSecAccNum(int number)  throws CFException{
		trdOrderPair.setTrdBuyerSecAccNum(number);
	}


	public void setTrdBuyerSecAccNum(long number)  throws CFException{
		trdOrderPair.setTrdBuyerSecAccNum((int)number);
	}


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of dcltbtrdpos
	 *	@return dcltbtrdpos
	 */   
	 public Dcltbtrdpos getDcltbtrdpos() {
   	return dcltbtrdpos;
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
	 *	Returns the value of trdFigi
	 *	@return trdFigi
	 */
   public char[] getTrdFigi() throws CFException  {              
   		return trdOrderPair.getTrdFigi();
   }

  
	/**
	*  set variable trdFigi
	*  @param value
	**/
   public void setTrdFigi(char[] value) throws CFException {
      trdOrderPair.setTrdFigi(value);
   } 

     /**
	 * 	Update TrdFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdFigi(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdFigi(source, sourceIndex);
   	
   }
   
   public void setTrdFigi(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdFigi(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdFigi with another Field
	 *	@param value
	 */
   public void setTrdFigi(Field source) {
      trdOrderPair.setTrdFigi(source);
   }  
   
     /**
	 * 	Update TrdFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdFigi(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdFigi(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "D" for isDebitSeller()
	 *	@return  Returns true if isDebitSeller() is "D"
	 */
   public boolean isDebitSeller() throws CFException {
      return work.isDebitSeller();
   }

	/**
	*  set values "D"
	*/
   	public void setDebitSellerTrue()  throws CFException{  			
    	work.setDebitSellerTrue();
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


	public BigDecimal getTrdOrderQty() throws CFException{      
   		return trdOrderPair.getTrdOrderQty();
	}

    public char[] getTrdOrderQtyString() throws CFException {
          return  trdOrderPair.getTrdOrderQty().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update TrdOrderQty with the passed number
	 *	@param number
	 */
	public void setTrdOrderQty(BigDecimal number)  throws CFException{
		trdOrderPair.setTrdOrderQty(number);
   }


        public Trdpb002Ctx getTrdpb002Ctx() {
            return Trdpb002Ctx.this;
        }

        public SacBookingOutCtx getSacBookingOutCtx() {
            return new SacBookingOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += trdOrderPair.hashCode();
        str += work.hashCode();
        str += dcltbtrdpos.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public SacBookingInCtx clone() {
        SacBookingInCtx cloneObj = new SacBookingInCtx();
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dcltbtrdpos = new Dcltbtrdpos();
        cloneObj.dcltbtrdpos.set(dcltbtrdpos.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public SacBookingInCtx getSacBookingInCtx() {
            return new SacBookingInCtx();
    }
     public class SacBookingOutCtx implements Cloneable {
     TrdOrderPair trdOrderPair = Trdpb002Ctx.this.getTrdOrderPair();
     Work work = Trdpb002Ctx.this.getWork();
     Sqlca sqlca = Trdpb002Ctx.this.getSqlca();
     Dcltbtrdpos dcltbtrdpos = Trdpb002Ctx.this.getDcltbtrdpos();

	public BigDecimal getPosBalance() throws CFException{      
   		return dcltbtrdpos.getPosBalance();
	}

    public char[] getPosBalanceString() throws CFException {
          return  dcltbtrdpos.getPosBalance().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update PosBalance with the passed number
	 *	@param number
	 */
	public void setPosBalance(BigDecimal number)  throws CFException{
		dcltbtrdpos.setPosBalance(number);
   }

	/**
	 *	Returns the value of posFigi
	 *	@return posFigi
	 */
   public char[] getPosFigi() throws CFException  {              
   		return dcltbtrdpos.getPosFigi();
   }

  
	/**
	*  set variable posFigi
	*  @param value
	**/
   public void setPosFigi(char[] value) throws CFException {
      dcltbtrdpos.setPosFigi(value);
   } 

     /**
	 * 	Update PosFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPosFigi(char[] source, int sourceIndex) throws CFException {
      dcltbtrdpos.setPosFigi(source, sourceIndex);
   	
   }
   
   public void setPosFigi(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdpos.setPosFigi(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PosFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPosFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdpos.setPosFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PosFigi with another Field
	 *	@param value
	 */
   public void setPosFigi(Field source) {
      dcltbtrdpos.setPosFigi(source);
   }  
   
     /**
	 * 	Update PosFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPosFigi(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdpos.setPosFigi(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PosFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPosFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdpos.setPosFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of trdSellerSecAccNum
	 *	@return trdSellerSecAccNum
	 */
	public int getTrdSellerSecAccNum() throws CFException {        
   		return trdOrderPair.getTrdSellerSecAccNum();
	}
	
	/**
	 * 	Update TrdSellerSecAccNum with the passed value
	 *	@param number
	 */
	public void setTrdSellerSecAccNum(int number)  throws CFException{
		trdOrderPair.setTrdSellerSecAccNum(number);
	}


	public void setTrdSellerSecAccNum(long number)  throws CFException{
		trdOrderPair.setTrdSellerSecAccNum((int)number);
	}


	/**
	 *	Returns the value of trdCurrency
	 *	@return trdCurrency
	 */
   public char[] getTrdCurrency() throws CFException  {              
   		return trdOrderPair.getTrdCurrency();
   }

  
	/**
	*  set variable trdCurrency
	*  @param value
	**/
   public void setTrdCurrency(char[] value) throws CFException {
      trdOrderPair.setTrdCurrency(value);
   } 

     /**
	 * 	Update TrdCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdCurrency(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdCurrency(source, sourceIndex);
   	
   }
   
   public void setTrdCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdCurrency with another Field
	 *	@param value
	 */
   public void setTrdCurrency(Field source) {
      trdOrderPair.setTrdCurrency(source);
   }  
   
     /**
	 * 	Update TrdCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdCurrency(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of trdBuyerSecAccNum
	 *	@return trdBuyerSecAccNum
	 */
	public int getTrdBuyerSecAccNum() throws CFException {        
   		return trdOrderPair.getTrdBuyerSecAccNum();
	}
	
	/**
	 * 	Update TrdBuyerSecAccNum with the passed value
	 *	@param number
	 */
	public void setTrdBuyerSecAccNum(int number)  throws CFException{
		trdOrderPair.setTrdBuyerSecAccNum(number);
	}


	public void setTrdBuyerSecAccNum(long number)  throws CFException{
		trdOrderPair.setTrdBuyerSecAccNum((int)number);
	}


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of dcltbtrdpos
	 *	@return dcltbtrdpos
	 */   
	 public Dcltbtrdpos getDcltbtrdpos() {
   	return dcltbtrdpos;
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
	 *	Returns the value of trdFigi
	 *	@return trdFigi
	 */
   public char[] getTrdFigi() throws CFException  {              
   		return trdOrderPair.getTrdFigi();
   }

  
	/**
	*  set variable trdFigi
	*  @param value
	**/
   public void setTrdFigi(char[] value) throws CFException {
      trdOrderPair.setTrdFigi(value);
   } 

     /**
	 * 	Update TrdFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdFigi(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdFigi(source, sourceIndex);
   	
   }
   
   public void setTrdFigi(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdFigi(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdFigi with another Field
	 *	@param value
	 */
   public void setTrdFigi(Field source) {
      trdOrderPair.setTrdFigi(source);
   }  
   
     /**
	 * 	Update TrdFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdFigi(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdFigi(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of posSacNumber
	 *	@return posSacNumber
	 */
	public int getPosSacNumber() throws CFException {        
   		return dcltbtrdpos.getPosSacNumber();
	}
	
	/**
	 * 	Update PosSacNumber with the passed value
	 *	@param number
	 */
	public void setPosSacNumber(int number)  throws CFException{
		dcltbtrdpos.setPosSacNumber(number);
	}


	public void setPosSacNumber(long number)  throws CFException{
		dcltbtrdpos.setPosSacNumber((int)number);
	}


	/**
	 *	Test condition "D" for isDataException()
	 *	@return  Returns true if isDataException() is "D"
	 */
   public boolean isDataException() throws CFException {
      return work.isDataException();
   }

	/**
	*  set values "D"
	*/
   	public void setDataExceptionTrue()  throws CFException{  			
    	work.setDataExceptionTrue();
   	}
	/**
	 *	Returns the value of posCurrency
	 *	@return posCurrency
	 */
   public char[] getPosCurrency() throws CFException  {              
   		return dcltbtrdpos.getPosCurrency();
   }

  
	/**
	*  set variable posCurrency
	*  @param value
	**/
   public void setPosCurrency(char[] value) throws CFException {
      dcltbtrdpos.setPosCurrency(value);
   } 

     /**
	 * 	Update PosCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPosCurrency(char[] source, int sourceIndex) throws CFException {
      dcltbtrdpos.setPosCurrency(source, sourceIndex);
   	
   }
   
   public void setPosCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdpos.setPosCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PosCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPosCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdpos.setPosCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PosCurrency with another Field
	 *	@param value
	 */
   public void setPosCurrency(Field source) {
      dcltbtrdpos.setPosCurrency(source);
   }  
   
     /**
	 * 	Update PosCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPosCurrency(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdpos.setPosCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PosCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPosCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdpos.setPosCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "S" for isTrdSacBookingDone()
	 *	@return  Returns true if isTrdSacBookingDone() is "S"
	 */
   public boolean isTrdSacBookingDone() throws CFException {
      return trdOrderPair.isTrdSacBookingDone();
   }

	/**
	*  set values "S"
	*/
   	public void setTrdSacBookingDoneTrue()  throws CFException{  			
    	trdOrderPair.setTrdSacBookingDoneTrue();
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
	 *	Test condition "F" for isTrdSacBookingFailed()
	 *	@return  Returns true if isTrdSacBookingFailed() is "F"
	 */
   public boolean isTrdSacBookingFailed() throws CFException {
      return trdOrderPair.isTrdSacBookingFailed();
   }

	/**
	*  set values "F"
	*/
   	public void setTrdSacBookingFailedTrue()  throws CFException{  			
    	trdOrderPair.setTrdSacBookingFailedTrue();
   	}

        public Trdpb002Ctx getTrdpb002Ctx() {
            return Trdpb002Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += trdOrderPair.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
        str += dcltbtrdpos.hashCode();
       return str.hashCode();
    }

    public SacBookingOutCtx clone() {
        SacBookingOutCtx cloneObj = new SacBookingOutCtx();
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dcltbtrdpos = new Dcltbtrdpos();
        cloneObj.dcltbtrdpos.set(dcltbtrdpos.getClonedField());
        return cloneObj;
    }

    }

    public SacBookingOutCtx getSacBookingOutCtx() {
            return new SacBookingOutCtx();
    }
     public class ReportExceptionInCtx implements Cloneable {
     Work work = Trdpb002Ctx.this.getWork();
     ExceptionRecord exceptionRecord = Trdpb002Ctx.this.getExceptionRecord();
     ExceptionRecordLenGroup exceptionRecordLenGroup = Trdpb002Ctx.this.getExceptionRecordLenGroup();

	/**
	 *	Test condition "S" for isSystemException()
	 *	@return  Returns true if isSystemException() is "S"
	 */
   public boolean isSystemException() throws CFException {
      return work.isSystemException();
   }

	/**
	*  set values "S"
	*/
   	public void setSystemExceptionTrue()  throws CFException{  			
    	work.setSystemExceptionTrue();
   	}
	/**
	 *	Test condition "A" for isApplException()
	 *	@return  Returns true if isApplException() is "A"
	 */
   public boolean isApplException() throws CFException {
      return work.isApplException();
   }

	/**
	*  set values "A"
	*/
   	public void setApplExceptionTrue()  throws CFException{  			
    	work.setApplExceptionTrue();
   	}
	/**
	 *	Test condition "D" for isDataException()
	 *	@return  Returns true if isDataException() is "D"
	 */
   public boolean isDataException() throws CFException {
      return work.isDataException();
   }

	/**
	*  set values "D"
	*/
   	public void setDataExceptionTrue()  throws CFException{  			
    	work.setDataExceptionTrue();
   	}
	/**
	 *	Returns the value of exceptionHandler
	 *	@return exceptionHandler
	 */
   public char[] getExceptionHandler() throws CFException  {              
   		return work.getExceptionHandler();
   }

  
	/**
	*  set variable exceptionHandler
	*  @param value
	**/
   public void setExceptionHandler(char[] value) throws CFException {
      work.setExceptionHandler(value);
   } 

	/**
	 *	Returns the value of exceptionRecord
	 *	@return exceptionRecord
	 */   
	 public ExceptionRecord getExceptionRecord() {
   	return exceptionRecord;
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
	 *	Returns the value of exceptionRecordLenGroup
	 *	@return exceptionRecordLenGroup
	 */   
	 public ExceptionRecordLenGroup getExceptionRecordLenGroup() {
   	return exceptionRecordLenGroup;
   }



        public Trdpb002Ctx getTrdpb002Ctx() {
            return Trdpb002Ctx.this;
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
        str += exceptionRecord.hashCode();
        str += exceptionRecordLenGroup.hashCode();
       return str.hashCode();
    }

    public ReportExceptionInCtx clone() {
        ReportExceptionInCtx cloneObj = new ReportExceptionInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.exceptionRecord = new ExceptionRecord();
        cloneObj.exceptionRecord.set(exceptionRecord.getClonedField());
        cloneObj.exceptionRecordLenGroup = new ExceptionRecordLenGroup();
        cloneObj.exceptionRecordLenGroup.set(exceptionRecordLenGroup.getClonedField());
        return cloneObj;
    }

    }

    public ReportExceptionInCtx getReportExceptionInCtx() {
            return new ReportExceptionInCtx();
    }
     public class ReportExceptionOutCtx implements Cloneable {
     Work work = Trdpb002Ctx.this.getWork();
     ExceptionRecord exceptionRecord = Trdpb002Ctx.this.getExceptionRecord();
     ExceptionRecordLenGroup exceptionRecordLenGroup = Trdpb002Ctx.this.getExceptionRecordLenGroup();

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
	 *	Returns the value of exceptionRecord
	 *	@return exceptionRecord
	 */   
	 public ExceptionRecord getExceptionRecord() {
   	return exceptionRecord;
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
	 *	Returns the value of exceptionRecordLenGroup
	 *	@return exceptionRecordLenGroup
	 */   
	 public ExceptionRecordLenGroup getExceptionRecordLenGroup() {
   	return exceptionRecordLenGroup;
   }



        public Trdpb002Ctx getTrdpb002Ctx() {
            return Trdpb002Ctx.this;
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
        str += exceptionRecord.hashCode();
        str += exceptionRecordLenGroup.hashCode();
       return str.hashCode();
    }

    public ReportExceptionOutCtx clone() {
        ReportExceptionOutCtx cloneObj = new ReportExceptionOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.exceptionRecord = new ExceptionRecord();
        cloneObj.exceptionRecord.set(exceptionRecord.getClonedField());
        cloneObj.exceptionRecordLenGroup = new ExceptionRecordLenGroup();
        cloneObj.exceptionRecordLenGroup.set(exceptionRecordLenGroup.getClonedField());
        return cloneObj;
    }

    }

    public ReportExceptionOutCtx getReportExceptionOutCtx() {
            return new ReportExceptionOutCtx();
    }
}
