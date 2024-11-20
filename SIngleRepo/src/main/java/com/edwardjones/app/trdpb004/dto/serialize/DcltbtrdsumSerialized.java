package com.edwardjones.app.trdpb004.dto.serialize;

/**
*  The class DcltbtrdsumSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 12:55. using version 5.0.0.153
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DcltbtrdsumSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DcltbtrdsumSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLTBTRDSUM_LENGTH = 55;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSumCustomerId;
            protected  int beginSumOverdue;
            protected  int beginSumRejected;
            protected  int beginSumSettled;
            protected  int beginSumCurrency;
            protected  int beginSumOpenBalance;
            protected  int beginSumTotalDebit;
            protected  int beginSumTotalCredit;
            protected  int beginSumCloseBalance;
	
	/**
	* Constructor for DcltbtrdsumSerialized
	**/
    public DcltbtrdsumSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DcltbtrdsumSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLTBTRDSUM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSumCustomerId = getStartOffset() + 0;	// set offset for serialization
  
             beginSumOverdue = getStartOffset() + 12;	// set offset for serialization
  
             beginSumRejected = getStartOffset() + 16;	// set offset for serialization
  
             beginSumSettled = getStartOffset() + 20;	// set offset for serialization
  
             beginSumCurrency = getStartOffset() + 24;	// set offset for serialization
  
             beginSumOpenBalance = getStartOffset() + 27;	// set offset for serialization
  
             beginSumTotalDebit = getStartOffset() + 34;	// set offset for serialization
  
             beginSumTotalCredit = getStartOffset() + 41;	// set offset for serialization
  
             beginSumCloseBalance = getStartOffset() + 48;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSumCustomerIdCounter = -1;
     public boolean isSumCustomerIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSumCustomerIdCounter != sharedCounter;
         localSumCustomerIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SUM_CUSTOMER_ID_LEN = 12;
	/**
	 * 	serialize this SumCustomerId
	 */
   protected void serializeSumCustomerId(char[] sumCustomerId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sumCustomerId,0,getStringValue(),beginSumCustomerId,SUM_CUSTOMER_ID_LEN);
       localSumCustomerIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSumCustomerIdConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshSumCustomerId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSumCustomerId() {	 
   		return (substring(getStringValue(),beginSumCustomerId,beginSumCustomerId + SUM_CUSTOMER_ID_LEN));
   	}
         int localSumOverdueCounter = -1;
         public boolean isSumOverdueModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSumOverdueCounter != sharedCounter;
            localSumOverdueCounter = sharedCounter; return hasModified; 
         }
   protected static final int SUM_OVERDUE_LEN = 4;
  	/**
	 * serializeSumOverdue
	 */
	protected void serializeSumOverdue(int sumOverdue) {
           replaceValue( //  save the value as string
                   getBinaryString( sumOverdue,SUM_OVERDUE_LEN)
                  ,beginSumOverdue
                  ,SUM_OVERDUE_LEN
                 );
            localSumOverdueCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSumOverdueMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSumOverdue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSumOverdue() {	 
			return (getInt(beginSumOverdue));
   	}
         int localSumRejectedCounter = -1;
         public boolean isSumRejectedModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSumRejectedCounter != sharedCounter;
            localSumRejectedCounter = sharedCounter; return hasModified; 
         }
   protected static final int SUM_REJECTED_LEN = 4;
  	/**
	 * serializeSumRejected
	 */
	protected void serializeSumRejected(int sumRejected) {
           replaceValue( //  save the value as string
                   getBinaryString( sumRejected,SUM_REJECTED_LEN)
                  ,beginSumRejected
                  ,SUM_REJECTED_LEN
                 );
            localSumRejectedCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSumRejectedMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSumRejected is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSumRejected() {	 
			return (getInt(beginSumRejected));
   	}
         int localSumSettledCounter = -1;
         public boolean isSumSettledModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSumSettledCounter != sharedCounter;
            localSumSettledCounter = sharedCounter; return hasModified; 
         }
   protected static final int SUM_SETTLED_LEN = 4;
  	/**
	 * serializeSumSettled
	 */
	protected void serializeSumSettled(int sumSettled) {
           replaceValue( //  save the value as string
                   getBinaryString( sumSettled,SUM_SETTLED_LEN)
                  ,beginSumSettled
                  ,SUM_SETTLED_LEN
                 );
            localSumSettledCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSumSettledMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSumSettled is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSumSettled() {	 
			return (getInt(beginSumSettled));
   	}
     int localSumCurrencyCounter = -1;
     public boolean isSumCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSumCurrencyCounter != sharedCounter;
         localSumCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int SUM_CURRENCY_LEN = 3;
	/**
	 * 	serialize this SumCurrency
	 */
   protected void serializeSumCurrency(char[] sumCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sumCurrency,0,getStringValue(),beginSumCurrency,SUM_CURRENCY_LEN);
       localSumCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSumCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSumCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSumCurrency() {	 
   		return (substring(getStringValue(),beginSumCurrency,beginSumCurrency + SUM_CURRENCY_LEN));
   	}
        int localSumOpenBalanceCounter = -1;
        public boolean isSumOpenBalanceModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSumOpenBalanceCounter != sharedCounter;
           localSumOpenBalanceCounter = sharedCounter; return hasModified; 
        }
	    public boolean sumOpenBalanceIsNumeric() {
	      return decimalIsNumeric(beginSumOpenBalance,SUM_OPEN_BALANCE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] sumOpenBalanceString() {
            return getPackedString(beginSumOpenBalance,SUM_OPEN_BALANCE_LEN);
         }
   protected static final int SUM_OPEN_BALANCE_LEN = 7;
   protected static final int SUM_OPEN_BALANCE_SCALE = 2;
  	/**
	 * 	serializeSumOpenBalance
	 */
	protected void serializeSumOpenBalance(BigDecimal sumOpenBalance) {
		   putDecimal(beginSumOpenBalance,sumOpenBalance,SUM_OPEN_BALANCE_LEN,SUM_OPEN_BALANCE_SCALE,true);
		 localSumOpenBalanceCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSumOpenBalanceMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshSumOpenBalance is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSumOpenBalance() throws CFException {	
   	try { 
		 return (getDecimal(beginSumOpenBalance,SUM_OPEN_BALANCE_LEN,SUM_OPEN_BALANCE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("sumOpenBalance", beginSumOpenBalance,SUM_OPEN_BALANCE_LEN);
     }
   	}
        int localSumTotalDebitCounter = -1;
        public boolean isSumTotalDebitModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSumTotalDebitCounter != sharedCounter;
           localSumTotalDebitCounter = sharedCounter; return hasModified; 
        }
	    public boolean sumTotalDebitIsNumeric() {
	      return decimalIsNumeric(beginSumTotalDebit,SUM_TOTAL_DEBIT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] sumTotalDebitString() {
            return getPackedString(beginSumTotalDebit,SUM_TOTAL_DEBIT_LEN);
         }
   protected static final int SUM_TOTAL_DEBIT_LEN = 7;
   protected static final int SUM_TOTAL_DEBIT_SCALE = 2;
  	/**
	 * 	serializeSumTotalDebit
	 */
	protected void serializeSumTotalDebit(BigDecimal sumTotalDebit) {
		   putDecimal(beginSumTotalDebit,sumTotalDebit,SUM_TOTAL_DEBIT_LEN,SUM_TOTAL_DEBIT_SCALE,true);
		 localSumTotalDebitCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSumTotalDebitMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshSumTotalDebit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSumTotalDebit() throws CFException {	
   	try { 
		 return (getDecimal(beginSumTotalDebit,SUM_TOTAL_DEBIT_LEN,SUM_TOTAL_DEBIT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("sumTotalDebit", beginSumTotalDebit,SUM_TOTAL_DEBIT_LEN);
     }
   	}
        int localSumTotalCreditCounter = -1;
        public boolean isSumTotalCreditModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSumTotalCreditCounter != sharedCounter;
           localSumTotalCreditCounter = sharedCounter; return hasModified; 
        }
	    public boolean sumTotalCreditIsNumeric() {
	      return decimalIsNumeric(beginSumTotalCredit,SUM_TOTAL_CREDIT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] sumTotalCreditString() {
            return getPackedString(beginSumTotalCredit,SUM_TOTAL_CREDIT_LEN);
         }
   protected static final int SUM_TOTAL_CREDIT_LEN = 7;
   protected static final int SUM_TOTAL_CREDIT_SCALE = 2;
  	/**
	 * 	serializeSumTotalCredit
	 */
	protected void serializeSumTotalCredit(BigDecimal sumTotalCredit) {
		   putDecimal(beginSumTotalCredit,sumTotalCredit,SUM_TOTAL_CREDIT_LEN,SUM_TOTAL_CREDIT_SCALE,true);
		 localSumTotalCreditCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSumTotalCreditMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshSumTotalCredit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSumTotalCredit() throws CFException {	
   	try { 
		 return (getDecimal(beginSumTotalCredit,SUM_TOTAL_CREDIT_LEN,SUM_TOTAL_CREDIT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("sumTotalCredit", beginSumTotalCredit,SUM_TOTAL_CREDIT_LEN);
     }
   	}
        int localSumCloseBalanceCounter = -1;
        public boolean isSumCloseBalanceModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSumCloseBalanceCounter != sharedCounter;
           localSumCloseBalanceCounter = sharedCounter; return hasModified; 
        }
	    public boolean sumCloseBalanceIsNumeric() {
	      return decimalIsNumeric(beginSumCloseBalance,SUM_CLOSE_BALANCE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] sumCloseBalanceString() {
            return getPackedString(beginSumCloseBalance,SUM_CLOSE_BALANCE_LEN);
         }
   protected static final int SUM_CLOSE_BALANCE_LEN = 7;
   protected static final int SUM_CLOSE_BALANCE_SCALE = 2;
  	/**
	 * 	serializeSumCloseBalance
	 */
	protected void serializeSumCloseBalance(BigDecimal sumCloseBalance) {
		   putDecimal(beginSumCloseBalance,sumCloseBalance,SUM_CLOSE_BALANCE_LEN,SUM_CLOSE_BALANCE_SCALE,true);
		 localSumCloseBalanceCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSumCloseBalanceMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshSumCloseBalance is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSumCloseBalance() throws CFException {	
   	try { 
		 return (getDecimal(beginSumCloseBalance,SUM_CLOSE_BALANCE_LEN,SUM_CLOSE_BALANCE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("sumCloseBalance", beginSumCloseBalance,SUM_CLOSE_BALANCE_LEN);
     }
   	}




}
  
