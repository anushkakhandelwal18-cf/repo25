package com.edwardjones.app.trdpb004.dto;

/**
*  The class Dcltbtrdlog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:20. using version 5.0.0.158
**/


import com.edwardjones.app.trdpb004.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dcltbtrdlog extends DcltbtrdlogSerialized { 
   

						private char[] logTransaction = Field.fillLowValue(10);

						private char[] logCurrency = Field.fillLowValue(3);

						private char[] logStartTs = Field.fillLowValue(26);

						private char[] logEndTs = Field.fillLowValue(26);
	
	/**
	* Constructor for Dcltbtrdlog
	**/
    public Dcltbtrdlog() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of logTransaction
	 *	@return logTransaction
	 */
   public char[] getLogTransaction() throws CFException{
     if (isLogTransactionModified()) { 
        logTransaction = refreshLogTransaction();
     }
   		return logTransaction;
   }

  
	/**
	*  set variable logTransaction
	*  Corresponding COBOL Variable is LOG-TRANSACTION
	*  @param value
	**/
   public void setLogTransaction(char[] value) {
      logTransaction = checkLogTransactionConstraints(value);
      serializeLogTransaction(logTransaction);
   } 

     /**
	 * 	Update LogTransaction 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogTransaction(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLogTransaction,logTransaction.length);
   	
   }
   
   public void setLogTransaction(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLogTransaction,logTransaction.length);
   	
   }
   
     /**
	 * 	Update LogTransaction 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogTransaction(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogTransaction+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LogTransaction with another Field
	 *	@param value
	 */
   public void setLogTransaction(Field source) {
       replace(source,0,source.length(),beginLogTransaction,LOG_TRANSACTION_LEN);
   	
   }  
   
     /**
	 * 	Update LogTransaction 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogTransaction(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLogTransaction,LOG_TRANSACTION_LEN);
   	
   }
   
     /**
	 * 	Update LogTransaction 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogTransaction(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogTransaction+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of logCurrency
	 *	@return logCurrency
	 */
   public char[] getLogCurrency() throws CFException{
     if (isLogCurrencyModified()) { 
        logCurrency = refreshLogCurrency();
     }
   		return logCurrency;
   }

  
	/**
	*  set variable logCurrency
	*  Corresponding COBOL Variable is LOG-CURRENCY
	*  @param value
	**/
   public void setLogCurrency(char[] value) {
      logCurrency = checkLogCurrencyConstraints(value);
      serializeLogCurrency(logCurrency);
   } 

     /**
	 * 	Update LogCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLogCurrency,logCurrency.length);
   	
   }
   
   public void setLogCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLogCurrency,logCurrency.length);
   	
   }
   
     /**
	 * 	Update LogCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LogCurrency with another Field
	 *	@param value
	 */
   public void setLogCurrency(Field source) {
       replace(source,0,source.length(),beginLogCurrency,LOG_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update LogCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLogCurrency,LOG_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update LogCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of logStartTs
	 *	@return logStartTs
	 */
   public char[] getLogStartTs() throws CFException{
     if (isLogStartTsModified()) { 
        logStartTs = refreshLogStartTs();
     }
   		return logStartTs;
   }

  
	/**
	*  set variable logStartTs
	*  Corresponding COBOL Variable is LOG-START-TS
	*  @param value
	**/
   public void setLogStartTs(char[] value) {
      logStartTs = checkLogStartTsConstraints(value);
      serializeLogStartTs(logStartTs);
   } 

     /**
	 * 	Update LogStartTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogStartTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLogStartTs,logStartTs.length);
   	
   }
   
   public void setLogStartTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLogStartTs,logStartTs.length);
   	
   }
   
     /**
	 * 	Update LogStartTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogStartTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogStartTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LogStartTs with another Field
	 *	@param value
	 */
   public void setLogStartTs(Field source) {
       replace(source,0,source.length(),beginLogStartTs,LOG_START_TS_LEN);
   	
   }  
   
     /**
	 * 	Update LogStartTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogStartTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLogStartTs,LOG_START_TS_LEN);
   	
   }
   
     /**
	 * 	Update LogStartTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogStartTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogStartTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of logEndTs
	 *	@return logEndTs
	 */
   public char[] getLogEndTs() throws CFException{
     if (isLogEndTsModified()) { 
        logEndTs = refreshLogEndTs();
     }
   		return logEndTs;
   }

  
	/**
	*  set variable logEndTs
	*  Corresponding COBOL Variable is LOG-END-TS
	*  @param value
	**/
   public void setLogEndTs(char[] value) {
      logEndTs = checkLogEndTsConstraints(value);
      serializeLogEndTs(logEndTs);
   } 

     /**
	 * 	Update LogEndTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogEndTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLogEndTs,logEndTs.length);
   	
   }
   
   public void setLogEndTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLogEndTs,logEndTs.length);
   	
   }
   
     /**
	 * 	Update LogEndTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogEndTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogEndTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LogEndTs with another Field
	 *	@param value
	 */
   public void setLogEndTs(Field source) {
       replace(source,0,source.length(),beginLogEndTs,LOG_END_TS_LEN);
   	
   }  
   
     /**
	 * 	Update LogEndTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogEndTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLogEndTs,LOG_END_TS_LEN);
   	
   }
   
     /**
	 * 	Update LogEndTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogEndTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogEndTs+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDcltbtrdlogFieldLength() {
			return DCLTBTRDLOG_LENGTH;
		}

}
  
