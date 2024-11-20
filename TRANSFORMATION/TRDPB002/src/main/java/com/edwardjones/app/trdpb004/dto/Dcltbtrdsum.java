package com.edwardjones.app.trdpb004.dto;

/**
*  The class Dcltbtrdsum is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 12:55. using version 5.0.0.153
**/


import com.edwardjones.app.trdpb004.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class Dcltbtrdsum extends DcltbtrdsumSerialized { 
   

						private char[] sumCustomerId = Field.fillLowValue(12);

								private int sumOverdue;

								private int sumRejected;

								private int sumSettled;

						private char[] sumCurrency = Field.fillLowValue(3);

								private BigDecimal sumOpenBalance = BigDecimal.ZERO;

								private BigDecimal sumTotalDebit = BigDecimal.ZERO;

								private BigDecimal sumTotalCredit = BigDecimal.ZERO;

								private BigDecimal sumCloseBalance = BigDecimal.ZERO;
	
	/**
	* Constructor for Dcltbtrdsum
	**/
    public Dcltbtrdsum() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sumCustomerId
	 *	@return sumCustomerId
	 */
   public char[] getSumCustomerId() throws CFException{
     if (isSumCustomerIdModified()) { 
        sumCustomerId = refreshSumCustomerId();
     }
   		return sumCustomerId;
   }

  
	/**
	*  set variable sumCustomerId
	*  Corresponding COBOL Variable is SUM-CUSTOMER-ID
	*  @param value
	**/
   public void setSumCustomerId(char[] value) {
      sumCustomerId = checkSumCustomerIdConstraints(value);
      serializeSumCustomerId(sumCustomerId);
   } 

     /**
	 * 	Update SumCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSumCustomerId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSumCustomerId,sumCustomerId.length);
   	
   }
   
   public void setSumCustomerId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSumCustomerId,sumCustomerId.length);
   	
   }
   
     /**
	 * 	Update SumCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSumCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSumCustomerId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SumCustomerId with another Field
	 *	@param value
	 */
   public void setSumCustomerId(Field source) {
       replace(source,0,source.length(),beginSumCustomerId,SUM_CUSTOMER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SumCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSumCustomerId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSumCustomerId,SUM_CUSTOMER_ID_LEN);
   	
   }
   
     /**
	 * 	Update SumCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSumCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSumCustomerId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sumOverdue
	 *	@return sumOverdue
	 */
	public int getSumOverdue() throws CFException {
        if (isSumOverdueModified()) { 
           sumOverdue = refreshSumOverdue();
        }
   		return sumOverdue;
	}
	
	/**
	 * 	Update SumOverdue with the passed value
	 *  Corresponding COBOL Variable is SUM-OVERDUE
	 *	@param number
	 */
	public void setSumOverdue(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sumOverdue = checkSumOverdueMaxLimit(number); 
		serializeSumOverdue(sumOverdue);
	}


	public void setSumOverdue(long number) {
	    number = checkSumOverdueMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSumOverdue((int)number);
	}
	
	/**
	 *	Returns the value of sumRejected
	 *	@return sumRejected
	 */
	public int getSumRejected() throws CFException {
        if (isSumRejectedModified()) { 
           sumRejected = refreshSumRejected();
        }
   		return sumRejected;
	}
	
	/**
	 * 	Update SumRejected with the passed value
	 *  Corresponding COBOL Variable is SUM-REJECTED
	 *	@param number
	 */
	public void setSumRejected(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sumRejected = checkSumRejectedMaxLimit(number); 
		serializeSumRejected(sumRejected);
	}


	public void setSumRejected(long number) {
	    number = checkSumRejectedMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSumRejected((int)number);
	}
	
	/**
	 *	Returns the value of sumSettled
	 *	@return sumSettled
	 */
	public int getSumSettled() throws CFException {
        if (isSumSettledModified()) { 
           sumSettled = refreshSumSettled();
        }
   		return sumSettled;
	}
	
	/**
	 * 	Update SumSettled with the passed value
	 *  Corresponding COBOL Variable is SUM-SETTLED
	 *	@param number
	 */
	public void setSumSettled(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sumSettled = checkSumSettledMaxLimit(number); 
		serializeSumSettled(sumSettled);
	}


	public void setSumSettled(long number) {
	    number = checkSumSettledMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSumSettled((int)number);
	}
	
	/**
	 *	Returns the value of sumCurrency
	 *	@return sumCurrency
	 */
   public char[] getSumCurrency() throws CFException{
     if (isSumCurrencyModified()) { 
        sumCurrency = refreshSumCurrency();
     }
   		return sumCurrency;
   }

  
	/**
	*  set variable sumCurrency
	*  Corresponding COBOL Variable is SUM-CURRENCY
	*  @param value
	**/
   public void setSumCurrency(char[] value) {
      sumCurrency = checkSumCurrencyConstraints(value);
      serializeSumCurrency(sumCurrency);
   } 

     /**
	 * 	Update SumCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSumCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSumCurrency,sumCurrency.length);
   	
   }
   
   public void setSumCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSumCurrency,sumCurrency.length);
   	
   }
   
     /**
	 * 	Update SumCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSumCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSumCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SumCurrency with another Field
	 *	@param value
	 */
   public void setSumCurrency(Field source) {
       replace(source,0,source.length(),beginSumCurrency,SUM_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update SumCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSumCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSumCurrency,SUM_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update SumCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSumCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSumCurrency+targetIndex,targetLen);
    
   }
	public BigDecimal getSumOpenBalance() throws CFException {
        if (isSumOpenBalanceModified()) { 
           sumOpenBalance = refreshSumOpenBalance();
        }
   		return sumOpenBalance;
	}

    public char[] getSumOpenBalanceString() {
          return  sumOpenBalanceString();
    }
	
	/**
	 * 	Update SumOpenBalance with the passed number
	 *  Corresponding COBOL Variable is SUM-OPEN-BALANCE
	 *	@param number
	 */
	public void setSumOpenBalance(BigDecimal number) {	
     sumOpenBalance = checkSumOpenBalanceMaxLimit(number);
	    serializeSumOpenBalance(sumOpenBalance);
   }
	public BigDecimal getSumTotalDebit() throws CFException {
        if (isSumTotalDebitModified()) { 
           sumTotalDebit = refreshSumTotalDebit();
        }
   		return sumTotalDebit;
	}

    public char[] getSumTotalDebitString() {
          return  sumTotalDebitString();
    }
	
	/**
	 * 	Update SumTotalDebit with the passed number
	 *  Corresponding COBOL Variable is SUM-TOTAL-DEBIT
	 *	@param number
	 */
	public void setSumTotalDebit(BigDecimal number) {	
     sumTotalDebit = checkSumTotalDebitMaxLimit(number);
	    serializeSumTotalDebit(sumTotalDebit);
   }
	public BigDecimal getSumTotalCredit() throws CFException {
        if (isSumTotalCreditModified()) { 
           sumTotalCredit = refreshSumTotalCredit();
        }
   		return sumTotalCredit;
	}

    public char[] getSumTotalCreditString() {
          return  sumTotalCreditString();
    }
	
	/**
	 * 	Update SumTotalCredit with the passed number
	 *  Corresponding COBOL Variable is SUM-TOTAL-CREDIT
	 *	@param number
	 */
	public void setSumTotalCredit(BigDecimal number) {	
     sumTotalCredit = checkSumTotalCreditMaxLimit(number);
	    serializeSumTotalCredit(sumTotalCredit);
   }
	public BigDecimal getSumCloseBalance() throws CFException {
        if (isSumCloseBalanceModified()) { 
           sumCloseBalance = refreshSumCloseBalance();
        }
   		return sumCloseBalance;
	}

    public char[] getSumCloseBalanceString() {
          return  sumCloseBalanceString();
    }
	
	/**
	 * 	Update SumCloseBalance with the passed number
	 *  Corresponding COBOL Variable is SUM-CLOSE-BALANCE
	 *	@param number
	 */
	public void setSumCloseBalance(BigDecimal number) {	
     sumCloseBalance = checkSumCloseBalanceMaxLimit(number);
	    serializeSumCloseBalance(sumCloseBalance);
   }

	
	
	

		public static int getDcltbtrdsumFieldLength() {
			return DCLTBTRDSUM_LENGTH;
		}

}
  
