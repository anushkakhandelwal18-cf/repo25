package com.edwardjones.app.trdpb004.dto;

/**
*  The class PrtSummaryRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 13:17. using version 5.0.0.153
**/


import com.edwardjones.app.trdpb004.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PrtSummaryRec extends PrtSummaryRecSerialized { 
   


						private char[] prtSummaryCustomerId = Field.fillLowValue(12);


								private char[] prtSummaryOverdue = Field.fillLowValue(11);


								private char[] prtSummaryRejected = Field.fillLowValue(11);


								private char[] prtSummarySettled = Field.fillLowValue(11);


						private char[] prtSummaryCurrency = Field.fillLowValue(8);


								private char[] prtSummaryOpenBalance = Field.fillLowValue(14);


								private char[] prtSummaryTotalDebit = Field.fillLowValue(14);


								private char[] prtSummaryTotalCredit = Field.fillLowValue(14);


								private char[] prtSummaryCloseBalance = Field.fillLowValue(14);

	
	/**
	* Constructor for PrtSummaryRec
	**/
    public PrtSummaryRec() {
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
             , getStartOffset() + 28
             ,3
             );
       replaceValue( // serialize and save the value
             (" | ").toCharArray()
             , getStartOffset() + 42
             ,3
             );
       replaceValue( // serialize and save the value
             (" | ").toCharArray()
             , getStartOffset() + 56
             ,3
             );
       replaceValue( // serialize and save the value
             (" | ").toCharArray()
             , getStartOffset() + 67
             ,3
             );
       replaceValue( // serialize and save the value
             (" | -").toCharArray()
             , getStartOffset() + 84
             ,4
             );
       replaceValue( // serialize and save the value
             (" | +").toCharArray()
             , getStartOffset() + 102
             ,4
             );
       replaceValue( // serialize and save the value
             (" | ").toCharArray()
             , getStartOffset() + 120
             ,3
             );
       replaceValue( // serialize and save the value
             (" | ").toCharArray()
             , getStartOffset() + 137
             ,3
             );
    }


 

	/**
	 *	Returns the value of prtSummaryCustomerId
	 *	@return prtSummaryCustomerId
	 */
   public char[] getPrtSummaryCustomerId() throws CFException{
     if (isPrtSummaryCustomerIdModified()) { 
        prtSummaryCustomerId = refreshPrtSummaryCustomerId();
     }
   		return prtSummaryCustomerId;
   }

  
	/**
	*  set variable prtSummaryCustomerId
	*  Corresponding COBOL Variable is PRT-SUMMARY-CUSTOMER-ID
	*  @param value
	**/
   public void setPrtSummaryCustomerId(char[] value) {
      prtSummaryCustomerId = checkPrtSummaryCustomerIdConstraints(value);
      serializePrtSummaryCustomerId(prtSummaryCustomerId);
   } 

     /**
	 * 	Update PrtSummaryCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtSummaryCustomerId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtSummaryCustomerId,prtSummaryCustomerId.length);
   	
   }
   
   public void setPrtSummaryCustomerId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryCustomerId,prtSummaryCustomerId.length);
   	
   }
   
     /**
	 * 	Update PrtSummaryCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryCustomerId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtSummaryCustomerId with another Field
	 *	@param value
	 */
   public void setPrtSummaryCustomerId(Field source) {
       replace(source,0,source.length(),beginPrtSummaryCustomerId,PRT_SUMMARY_CUSTOMER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update PrtSummaryCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtSummaryCustomerId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtSummaryCustomerId,PRT_SUMMARY_CUSTOMER_ID_LEN);
   	
   }
   
     /**
	 * 	Update PrtSummaryCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryCustomerId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prtSummaryOverdue
	 *	@return prtSummaryOverdue
	 */
   public char[] getPrtSummaryOverdue() throws CFException{
     if (isPrtSummaryOverdueModified()) { 
        prtSummaryOverdue = refreshPrtSummaryOverdue();
     }
   		return prtSummaryOverdue;
   }

  
	/**
	*  set variable prtSummaryOverdue
	*  Corresponding COBOL Variable is PRT-SUMMARY-OVERDUE
	*  @param value
	**/
   public void setPrtSummaryOverdue(char[] value) {
      prtSummaryOverdue = checkPrtSummaryOverdueConstraints(value);
      serializePrtSummaryOverdue(prtSummaryOverdue);
   } 

     /**
	 * 	Update PrtSummaryOverdue 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtSummaryOverdue(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtSummaryOverdue,prtSummaryOverdue.length);
   	
   }
   
   public void setPrtSummaryOverdue(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryOverdue,prtSummaryOverdue.length);
   	
   }
   
     /**
	 * 	Update PrtSummaryOverdue 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryOverdue(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryOverdue+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtSummaryOverdue with another Field
	 *	@param value
	 */
   public void setPrtSummaryOverdue(Field source) {
       replace(source,0,source.length(),beginPrtSummaryOverdue,PRT_SUMMARY_OVERDUE_LEN);
   	
   }  
   
     /**
	 * 	Update PrtSummaryOverdue 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtSummaryOverdue(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtSummaryOverdue,PRT_SUMMARY_OVERDUE_LEN);
   	
   }
   
     /**
	 * 	Update PrtSummaryOverdue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryOverdue(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryOverdue+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prtSummaryRejected
	 *	@return prtSummaryRejected
	 */
   public char[] getPrtSummaryRejected() throws CFException{
     if (isPrtSummaryRejectedModified()) { 
        prtSummaryRejected = refreshPrtSummaryRejected();
     }
   		return prtSummaryRejected;
   }

  
	/**
	*  set variable prtSummaryRejected
	*  Corresponding COBOL Variable is PRT-SUMMARY-REJECTED
	*  @param value
	**/
   public void setPrtSummaryRejected(char[] value) {
      prtSummaryRejected = checkPrtSummaryRejectedConstraints(value);
      serializePrtSummaryRejected(prtSummaryRejected);
   } 

     /**
	 * 	Update PrtSummaryRejected 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtSummaryRejected(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtSummaryRejected,prtSummaryRejected.length);
   	
   }
   
   public void setPrtSummaryRejected(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryRejected,prtSummaryRejected.length);
   	
   }
   
     /**
	 * 	Update PrtSummaryRejected 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryRejected(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryRejected+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtSummaryRejected with another Field
	 *	@param value
	 */
   public void setPrtSummaryRejected(Field source) {
       replace(source,0,source.length(),beginPrtSummaryRejected,PRT_SUMMARY_REJECTED_LEN);
   	
   }  
   
     /**
	 * 	Update PrtSummaryRejected 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtSummaryRejected(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtSummaryRejected,PRT_SUMMARY_REJECTED_LEN);
   	
   }
   
     /**
	 * 	Update PrtSummaryRejected 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryRejected(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryRejected+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prtSummarySettled
	 *	@return prtSummarySettled
	 */
   public char[] getPrtSummarySettled() throws CFException{
     if (isPrtSummarySettledModified()) { 
        prtSummarySettled = refreshPrtSummarySettled();
     }
   		return prtSummarySettled;
   }

  
	/**
	*  set variable prtSummarySettled
	*  Corresponding COBOL Variable is PRT-SUMMARY-SETTLED
	*  @param value
	**/
   public void setPrtSummarySettled(char[] value) {
      prtSummarySettled = checkPrtSummarySettledConstraints(value);
      serializePrtSummarySettled(prtSummarySettled);
   } 

     /**
	 * 	Update PrtSummarySettled 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtSummarySettled(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtSummarySettled,prtSummarySettled.length);
   	
   }
   
   public void setPrtSummarySettled(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummarySettled,prtSummarySettled.length);
   	
   }
   
     /**
	 * 	Update PrtSummarySettled 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummarySettled(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummarySettled+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtSummarySettled with another Field
	 *	@param value
	 */
   public void setPrtSummarySettled(Field source) {
       replace(source,0,source.length(),beginPrtSummarySettled,PRT_SUMMARY_SETTLED_LEN);
   	
   }  
   
     /**
	 * 	Update PrtSummarySettled 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtSummarySettled(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtSummarySettled,PRT_SUMMARY_SETTLED_LEN);
   	
   }
   
     /**
	 * 	Update PrtSummarySettled 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummarySettled(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummarySettled+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prtSummaryCurrency
	 *	@return prtSummaryCurrency
	 */
   public char[] getPrtSummaryCurrency() throws CFException{
     if (isPrtSummaryCurrencyModified()) { 
        prtSummaryCurrency = refreshPrtSummaryCurrency();
     }
   		return prtSummaryCurrency;
   }

  
	/**
	*  set variable prtSummaryCurrency
	*  Corresponding COBOL Variable is PRT-SUMMARY-CURRENCY
	*  @param value
	**/
   public void setPrtSummaryCurrency(char[] value) {
      prtSummaryCurrency = checkPrtSummaryCurrencyConstraints(value);
      serializePrtSummaryCurrency(prtSummaryCurrency);
   } 

     /**
	 * 	Update PrtSummaryCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtSummaryCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtSummaryCurrency,prtSummaryCurrency.length);
   	
   }
   
   public void setPrtSummaryCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryCurrency,prtSummaryCurrency.length);
   	
   }
   
     /**
	 * 	Update PrtSummaryCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtSummaryCurrency with another Field
	 *	@param value
	 */
   public void setPrtSummaryCurrency(Field source) {
       replace(source,0,source.length(),beginPrtSummaryCurrency,PRT_SUMMARY_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update PrtSummaryCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtSummaryCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtSummaryCurrency,PRT_SUMMARY_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update PrtSummaryCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prtSummaryOpenBalance
	 *	@return prtSummaryOpenBalance
	 */
   public char[] getPrtSummaryOpenBalance() throws CFException{
     if (isPrtSummaryOpenBalanceModified()) { 
        prtSummaryOpenBalance = refreshPrtSummaryOpenBalance();
     }
   		return prtSummaryOpenBalance;
   }

  
	/**
	*  set variable prtSummaryOpenBalance
	*  Corresponding COBOL Variable is PRT-SUMMARY-OPEN-BALANCE
	*  @param value
	**/
   public void setPrtSummaryOpenBalance(char[] value) {
      prtSummaryOpenBalance = checkPrtSummaryOpenBalanceConstraints(value);
      serializePrtSummaryOpenBalance(prtSummaryOpenBalance);
   } 

     /**
	 * 	Update PrtSummaryOpenBalance 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtSummaryOpenBalance(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtSummaryOpenBalance,prtSummaryOpenBalance.length);
   	
   }
   
   public void setPrtSummaryOpenBalance(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryOpenBalance,prtSummaryOpenBalance.length);
   	
   }
   
     /**
	 * 	Update PrtSummaryOpenBalance 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryOpenBalance(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryOpenBalance+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtSummaryOpenBalance with another Field
	 *	@param value
	 */
   public void setPrtSummaryOpenBalance(Field source) {
       replace(source,0,source.length(),beginPrtSummaryOpenBalance,PRT_SUMMARY_OPEN_BALANCE_LEN);
   	
   }  
   
     /**
	 * 	Update PrtSummaryOpenBalance 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtSummaryOpenBalance(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtSummaryOpenBalance,PRT_SUMMARY_OPEN_BALANCE_LEN);
   	
   }
   
     /**
	 * 	Update PrtSummaryOpenBalance 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryOpenBalance(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryOpenBalance+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prtSummaryTotalDebit
	 *	@return prtSummaryTotalDebit
	 */
   public char[] getPrtSummaryTotalDebit() throws CFException{
     if (isPrtSummaryTotalDebitModified()) { 
        prtSummaryTotalDebit = refreshPrtSummaryTotalDebit();
     }
   		return prtSummaryTotalDebit;
   }

  
	/**
	*  set variable prtSummaryTotalDebit
	*  Corresponding COBOL Variable is PRT-SUMMARY-TOTAL-DEBIT
	*  @param value
	**/
   public void setPrtSummaryTotalDebit(char[] value) {
      prtSummaryTotalDebit = checkPrtSummaryTotalDebitConstraints(value);
      serializePrtSummaryTotalDebit(prtSummaryTotalDebit);
   } 

     /**
	 * 	Update PrtSummaryTotalDebit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtSummaryTotalDebit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtSummaryTotalDebit,prtSummaryTotalDebit.length);
   	
   }
   
   public void setPrtSummaryTotalDebit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryTotalDebit,prtSummaryTotalDebit.length);
   	
   }
   
     /**
	 * 	Update PrtSummaryTotalDebit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryTotalDebit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryTotalDebit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtSummaryTotalDebit with another Field
	 *	@param value
	 */
   public void setPrtSummaryTotalDebit(Field source) {
       replace(source,0,source.length(),beginPrtSummaryTotalDebit,PRT_SUMMARY_TOTAL_DEBIT_LEN);
   	
   }  
   
     /**
	 * 	Update PrtSummaryTotalDebit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtSummaryTotalDebit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtSummaryTotalDebit,PRT_SUMMARY_TOTAL_DEBIT_LEN);
   	
   }
   
     /**
	 * 	Update PrtSummaryTotalDebit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryTotalDebit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryTotalDebit+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prtSummaryTotalCredit
	 *	@return prtSummaryTotalCredit
	 */
   public char[] getPrtSummaryTotalCredit() throws CFException{
     if (isPrtSummaryTotalCreditModified()) { 
        prtSummaryTotalCredit = refreshPrtSummaryTotalCredit();
     }
   		return prtSummaryTotalCredit;
   }

  
	/**
	*  set variable prtSummaryTotalCredit
	*  Corresponding COBOL Variable is PRT-SUMMARY-TOTAL-CREDIT
	*  @param value
	**/
   public void setPrtSummaryTotalCredit(char[] value) {
      prtSummaryTotalCredit = checkPrtSummaryTotalCreditConstraints(value);
      serializePrtSummaryTotalCredit(prtSummaryTotalCredit);
   } 

     /**
	 * 	Update PrtSummaryTotalCredit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtSummaryTotalCredit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtSummaryTotalCredit,prtSummaryTotalCredit.length);
   	
   }
   
   public void setPrtSummaryTotalCredit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryTotalCredit,prtSummaryTotalCredit.length);
   	
   }
   
     /**
	 * 	Update PrtSummaryTotalCredit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryTotalCredit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryTotalCredit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtSummaryTotalCredit with another Field
	 *	@param value
	 */
   public void setPrtSummaryTotalCredit(Field source) {
       replace(source,0,source.length(),beginPrtSummaryTotalCredit,PRT_SUMMARY_TOTAL_CREDIT_LEN);
   	
   }  
   
     /**
	 * 	Update PrtSummaryTotalCredit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtSummaryTotalCredit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtSummaryTotalCredit,PRT_SUMMARY_TOTAL_CREDIT_LEN);
   	
   }
   
     /**
	 * 	Update PrtSummaryTotalCredit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryTotalCredit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryTotalCredit+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prtSummaryCloseBalance
	 *	@return prtSummaryCloseBalance
	 */
   public char[] getPrtSummaryCloseBalance() throws CFException{
     if (isPrtSummaryCloseBalanceModified()) { 
        prtSummaryCloseBalance = refreshPrtSummaryCloseBalance();
     }
   		return prtSummaryCloseBalance;
   }

  
	/**
	*  set variable prtSummaryCloseBalance
	*  Corresponding COBOL Variable is PRT-SUMMARY-CLOSE-BALANCE
	*  @param value
	**/
   public void setPrtSummaryCloseBalance(char[] value) {
      prtSummaryCloseBalance = checkPrtSummaryCloseBalanceConstraints(value);
      serializePrtSummaryCloseBalance(prtSummaryCloseBalance);
   } 

     /**
	 * 	Update PrtSummaryCloseBalance 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtSummaryCloseBalance(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtSummaryCloseBalance,prtSummaryCloseBalance.length);
   	
   }
   
   public void setPrtSummaryCloseBalance(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryCloseBalance,prtSummaryCloseBalance.length);
   	
   }
   
     /**
	 * 	Update PrtSummaryCloseBalance 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryCloseBalance(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryCloseBalance+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtSummaryCloseBalance with another Field
	 *	@param value
	 */
   public void setPrtSummaryCloseBalance(Field source) {
       replace(source,0,source.length(),beginPrtSummaryCloseBalance,PRT_SUMMARY_CLOSE_BALANCE_LEN);
   	
   }  
   
     /**
	 * 	Update PrtSummaryCloseBalance 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtSummaryCloseBalance(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtSummaryCloseBalance,PRT_SUMMARY_CLOSE_BALANCE_LEN);
   	
   }
   
     /**
	 * 	Update PrtSummaryCloseBalance 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtSummaryCloseBalance(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtSummaryCloseBalance+targetIndex,targetLen);
    
   }

	
	
	

		public static int getPrtSummaryRecFieldLength() {
			return PRT_SUMMARY_REC_LENGTH;
		}

}
  
