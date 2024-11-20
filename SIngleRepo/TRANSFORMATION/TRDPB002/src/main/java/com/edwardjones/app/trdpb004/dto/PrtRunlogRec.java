package com.edwardjones.app.trdpb004.dto;

/**
*  The class PrtRunlogRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 12:55. using version 5.0.0.153
**/


import com.edwardjones.app.trdpb004.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PrtRunlogRec extends PrtRunlogRecSerialized { 
   


						private char[] prtRunlogTransaction = Field.fillLowValue(12);


						private char[] prtRunlogCurrency = Field.fillLowValue(8);


						private char[] prtRunlogStartTs = Field.fillLowValue(26);


						private char[] prtRunlogEndTs = Field.fillLowValue(26);

	
	/**
	* Constructor for PrtRunlogRec
	**/
    public PrtRunlogRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("| ").toCharArray()
             , getStartOffset() + 0
             ,2
             );
       replaceValue( // serialize and save the value
             (" | ").toCharArray()
             , getStartOffset() + 14
             ,3
             );
       replaceValue( // serialize and save the value
             (" | ").toCharArray()
             , getStartOffset() + 25
             ,3
             );
       replaceValue( // serialize and save the value
             (" | ").toCharArray()
             , getStartOffset() + 54
             ,3
             );
       replaceValue( // serialize and save the value
             (" | ").toCharArray()
             , getStartOffset() + 83
             ,3
             );
    }


 

	/**
	 *	Returns the value of prtRunlogTransaction
	 *	@return prtRunlogTransaction
	 */
   public char[] getPrtRunlogTransaction() throws CFException{
     if (isPrtRunlogTransactionModified()) { 
        prtRunlogTransaction = refreshPrtRunlogTransaction();
     }
   		return prtRunlogTransaction;
   }

  
	/**
	*  set variable prtRunlogTransaction
	*  Corresponding COBOL Variable is PRT-RUNLOG-TRANSACTION
	*  @param value
	**/
   public void setPrtRunlogTransaction(char[] value) {
      prtRunlogTransaction = checkPrtRunlogTransactionConstraints(value);
      serializePrtRunlogTransaction(prtRunlogTransaction);
   } 

     /**
	 * 	Update PrtRunlogTransaction 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtRunlogTransaction(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtRunlogTransaction,prtRunlogTransaction.length);
   	
   }
   
   public void setPrtRunlogTransaction(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtRunlogTransaction,prtRunlogTransaction.length);
   	
   }
   
     /**
	 * 	Update PrtRunlogTransaction 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtRunlogTransaction(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtRunlogTransaction+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtRunlogTransaction with another Field
	 *	@param value
	 */
   public void setPrtRunlogTransaction(Field source) {
       replace(source,0,source.length(),beginPrtRunlogTransaction,PRT_RUNLOG_TRANSACTION_LEN);
   	
   }  
   
     /**
	 * 	Update PrtRunlogTransaction 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtRunlogTransaction(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtRunlogTransaction,PRT_RUNLOG_TRANSACTION_LEN);
   	
   }
   
     /**
	 * 	Update PrtRunlogTransaction 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtRunlogTransaction(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtRunlogTransaction+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prtRunlogCurrency
	 *	@return prtRunlogCurrency
	 */
   public char[] getPrtRunlogCurrency() throws CFException{
     if (isPrtRunlogCurrencyModified()) { 
        prtRunlogCurrency = refreshPrtRunlogCurrency();
     }
   		return prtRunlogCurrency;
   }

  
	/**
	*  set variable prtRunlogCurrency
	*  Corresponding COBOL Variable is PRT-RUNLOG-CURRENCY
	*  @param value
	**/
   public void setPrtRunlogCurrency(char[] value) {
      prtRunlogCurrency = checkPrtRunlogCurrencyConstraints(value);
      serializePrtRunlogCurrency(prtRunlogCurrency);
   } 

     /**
	 * 	Update PrtRunlogCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtRunlogCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtRunlogCurrency,prtRunlogCurrency.length);
   	
   }
   
   public void setPrtRunlogCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtRunlogCurrency,prtRunlogCurrency.length);
   	
   }
   
     /**
	 * 	Update PrtRunlogCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtRunlogCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtRunlogCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtRunlogCurrency with another Field
	 *	@param value
	 */
   public void setPrtRunlogCurrency(Field source) {
       replace(source,0,source.length(),beginPrtRunlogCurrency,PRT_RUNLOG_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update PrtRunlogCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtRunlogCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtRunlogCurrency,PRT_RUNLOG_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update PrtRunlogCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtRunlogCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtRunlogCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prtRunlogStartTs
	 *	@return prtRunlogStartTs
	 */
   public char[] getPrtRunlogStartTs() throws CFException{
     if (isPrtRunlogStartTsModified()) { 
        prtRunlogStartTs = refreshPrtRunlogStartTs();
     }
   		return prtRunlogStartTs;
   }

  
	/**
	*  set variable prtRunlogStartTs
	*  Corresponding COBOL Variable is PRT-RUNLOG-START-TS
	*  @param value
	**/
   public void setPrtRunlogStartTs(char[] value) {
      prtRunlogStartTs = checkPrtRunlogStartTsConstraints(value);
      serializePrtRunlogStartTs(prtRunlogStartTs);
   } 

     /**
	 * 	Update PrtRunlogStartTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtRunlogStartTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtRunlogStartTs,prtRunlogStartTs.length);
   	
   }
   
   public void setPrtRunlogStartTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtRunlogStartTs,prtRunlogStartTs.length);
   	
   }
   
     /**
	 * 	Update PrtRunlogStartTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtRunlogStartTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtRunlogStartTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtRunlogStartTs with another Field
	 *	@param value
	 */
   public void setPrtRunlogStartTs(Field source) {
       replace(source,0,source.length(),beginPrtRunlogStartTs,PRT_RUNLOG_START_TS_LEN);
   	
   }  
   
     /**
	 * 	Update PrtRunlogStartTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtRunlogStartTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtRunlogStartTs,PRT_RUNLOG_START_TS_LEN);
   	
   }
   
     /**
	 * 	Update PrtRunlogStartTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtRunlogStartTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtRunlogStartTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prtRunlogEndTs
	 *	@return prtRunlogEndTs
	 */
   public char[] getPrtRunlogEndTs() throws CFException{
     if (isPrtRunlogEndTsModified()) { 
        prtRunlogEndTs = refreshPrtRunlogEndTs();
     }
   		return prtRunlogEndTs;
   }

  
	/**
	*  set variable prtRunlogEndTs
	*  Corresponding COBOL Variable is PRT-RUNLOG-END-TS
	*  @param value
	**/
   public void setPrtRunlogEndTs(char[] value) {
      prtRunlogEndTs = checkPrtRunlogEndTsConstraints(value);
      serializePrtRunlogEndTs(prtRunlogEndTs);
   } 

     /**
	 * 	Update PrtRunlogEndTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtRunlogEndTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtRunlogEndTs,prtRunlogEndTs.length);
   	
   }
   
   public void setPrtRunlogEndTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtRunlogEndTs,prtRunlogEndTs.length);
   	
   }
   
     /**
	 * 	Update PrtRunlogEndTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtRunlogEndTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtRunlogEndTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtRunlogEndTs with another Field
	 *	@param value
	 */
   public void setPrtRunlogEndTs(Field source) {
       replace(source,0,source.length(),beginPrtRunlogEndTs,PRT_RUNLOG_END_TS_LEN);
   	
   }  
   
     /**
	 * 	Update PrtRunlogEndTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtRunlogEndTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtRunlogEndTs,PRT_RUNLOG_END_TS_LEN);
   	
   }
   
     /**
	 * 	Update PrtRunlogEndTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtRunlogEndTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtRunlogEndTs+targetIndex,targetLen);
    
   }

	
	
	

		public static int getPrtRunlogRecFieldLength() {
			return PRT_RUNLOG_REC_LENGTH;
		}

}
  
