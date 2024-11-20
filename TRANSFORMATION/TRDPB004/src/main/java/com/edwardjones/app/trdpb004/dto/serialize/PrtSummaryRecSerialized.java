package com.edwardjones.app.trdpb004.dto.serialize;

/**
*  The class PrtSummaryRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 13:17. using version 5.0.0.153
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PrtSummaryRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PrtSummaryRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PRT_SUMMARY_REC_LENGTH = 140;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPrtSummaryCustomerId;
            protected  int beginPrtSummaryOverdue;
            protected  int beginPrtSummaryRejected;
            protected  int beginPrtSummarySettled;
            protected  int beginPrtSummaryCurrency;
            protected  int beginPrtSummaryOpenBalance;
            protected  int beginPrtSummaryTotalDebit;
            protected  int beginPrtSummaryTotalCredit;
            protected  int beginPrtSummaryCloseBalance;
	
	/**
	* Constructor for PrtSummaryRecSerialized
	**/
    public PrtSummaryRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in PrtSummaryRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PRT_SUMMARY_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginPrtSummaryCustomerId = getStartOffset() + 2;	// set offset for serialization
  
  
             beginPrtSummaryOverdue = getStartOffset() + 17;	// set offset for serialization
  
  
             beginPrtSummaryRejected = getStartOffset() + 31;	// set offset for serialization
  
  
             beginPrtSummarySettled = getStartOffset() + 45;	// set offset for serialization
  
  
             beginPrtSummaryCurrency = getStartOffset() + 59;	// set offset for serialization
  
  
             beginPrtSummaryOpenBalance = getStartOffset() + 70;	// set offset for serialization
  
  
             beginPrtSummaryTotalDebit = getStartOffset() + 88;	// set offset for serialization
  
  
             beginPrtSummaryTotalCredit = getStartOffset() + 106;	// set offset for serialization
  
  
             beginPrtSummaryCloseBalance = getStartOffset() + 123;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localPrtSummaryCustomerIdCounter = -1;
     public boolean isPrtSummaryCustomerIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtSummaryCustomerIdCounter != sharedCounter;
         localPrtSummaryCustomerIdCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_SUMMARY_CUSTOMER_ID_LEN = 12;
	/**
	 * 	serialize this PrtSummaryCustomerId
	 */
   protected void serializePrtSummaryCustomerId(char[] prtSummaryCustomerId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtSummaryCustomerId,0,getStringValue(),beginPrtSummaryCustomerId,PRT_SUMMARY_CUSTOMER_ID_LEN);
       localPrtSummaryCustomerIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtSummaryCustomerIdConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshPrtSummaryCustomerId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtSummaryCustomerId() {	 
   		return (substring(getStringValue(),beginPrtSummaryCustomerId,beginPrtSummaryCustomerId + PRT_SUMMARY_CUSTOMER_ID_LEN));
   	}
     int localPrtSummaryOverdueCounter = -1;
     public boolean isPrtSummaryOverdueModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtSummaryOverdueCounter != sharedCounter;
         localPrtSummaryOverdueCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_SUMMARY_OVERDUE_LEN = 11;
	/**
	 * 	serialize this PrtSummaryOverdue
	 */
   protected void serializePrtSummaryOverdue(char[] prtSummaryOverdue) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtSummaryOverdue,0,getStringValue(),beginPrtSummaryOverdue,PRT_SUMMARY_OVERDUE_LEN);
       localPrtSummaryOverdueCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtSummaryOverdueConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshPrtSummaryOverdue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtSummaryOverdue() {	 
   		return (substring(getStringValue(),beginPrtSummaryOverdue,beginPrtSummaryOverdue + PRT_SUMMARY_OVERDUE_LEN));
   	}
     int localPrtSummaryRejectedCounter = -1;
     public boolean isPrtSummaryRejectedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtSummaryRejectedCounter != sharedCounter;
         localPrtSummaryRejectedCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_SUMMARY_REJECTED_LEN = 11;
	/**
	 * 	serialize this PrtSummaryRejected
	 */
   protected void serializePrtSummaryRejected(char[] prtSummaryRejected) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtSummaryRejected,0,getStringValue(),beginPrtSummaryRejected,PRT_SUMMARY_REJECTED_LEN);
       localPrtSummaryRejectedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtSummaryRejectedConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshPrtSummaryRejected is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtSummaryRejected() {	 
   		return (substring(getStringValue(),beginPrtSummaryRejected,beginPrtSummaryRejected + PRT_SUMMARY_REJECTED_LEN));
   	}
     int localPrtSummarySettledCounter = -1;
     public boolean isPrtSummarySettledModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtSummarySettledCounter != sharedCounter;
         localPrtSummarySettledCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_SUMMARY_SETTLED_LEN = 11;
	/**
	 * 	serialize this PrtSummarySettled
	 */
   protected void serializePrtSummarySettled(char[] prtSummarySettled) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtSummarySettled,0,getStringValue(),beginPrtSummarySettled,PRT_SUMMARY_SETTLED_LEN);
       localPrtSummarySettledCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtSummarySettledConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshPrtSummarySettled is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtSummarySettled() {	 
   		return (substring(getStringValue(),beginPrtSummarySettled,beginPrtSummarySettled + PRT_SUMMARY_SETTLED_LEN));
   	}
     int localPrtSummaryCurrencyCounter = -1;
     public boolean isPrtSummaryCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtSummaryCurrencyCounter != sharedCounter;
         localPrtSummaryCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_SUMMARY_CURRENCY_LEN = 8;
	/**
	 * 	serialize this PrtSummaryCurrency
	 */
   protected void serializePrtSummaryCurrency(char[] prtSummaryCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtSummaryCurrency,0,getStringValue(),beginPrtSummaryCurrency,PRT_SUMMARY_CURRENCY_LEN);
       localPrtSummaryCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtSummaryCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPrtSummaryCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtSummaryCurrency() {	 
   		return (substring(getStringValue(),beginPrtSummaryCurrency,beginPrtSummaryCurrency + PRT_SUMMARY_CURRENCY_LEN));
   	}
     int localPrtSummaryOpenBalanceCounter = -1;
     public boolean isPrtSummaryOpenBalanceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtSummaryOpenBalanceCounter != sharedCounter;
         localPrtSummaryOpenBalanceCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_SUMMARY_OPEN_BALANCE_LEN = 14;
	/**
	 * 	serialize this PrtSummaryOpenBalance
	 */
   protected void serializePrtSummaryOpenBalance(char[] prtSummaryOpenBalance) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtSummaryOpenBalance,0,getStringValue(),beginPrtSummaryOpenBalance,PRT_SUMMARY_OPEN_BALANCE_LEN);
       localPrtSummaryOpenBalanceCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtSummaryOpenBalanceConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshPrtSummaryOpenBalance is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtSummaryOpenBalance() {	 
   		return (substring(getStringValue(),beginPrtSummaryOpenBalance,beginPrtSummaryOpenBalance + PRT_SUMMARY_OPEN_BALANCE_LEN));
   	}
     int localPrtSummaryTotalDebitCounter = -1;
     public boolean isPrtSummaryTotalDebitModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtSummaryTotalDebitCounter != sharedCounter;
         localPrtSummaryTotalDebitCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_SUMMARY_TOTAL_DEBIT_LEN = 14;
	/**
	 * 	serialize this PrtSummaryTotalDebit
	 */
   protected void serializePrtSummaryTotalDebit(char[] prtSummaryTotalDebit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtSummaryTotalDebit,0,getStringValue(),beginPrtSummaryTotalDebit,PRT_SUMMARY_TOTAL_DEBIT_LEN);
       localPrtSummaryTotalDebitCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtSummaryTotalDebitConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshPrtSummaryTotalDebit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtSummaryTotalDebit() {	 
   		return (substring(getStringValue(),beginPrtSummaryTotalDebit,beginPrtSummaryTotalDebit + PRT_SUMMARY_TOTAL_DEBIT_LEN));
   	}
     int localPrtSummaryTotalCreditCounter = -1;
     public boolean isPrtSummaryTotalCreditModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtSummaryTotalCreditCounter != sharedCounter;
         localPrtSummaryTotalCreditCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_SUMMARY_TOTAL_CREDIT_LEN = 14;
	/**
	 * 	serialize this PrtSummaryTotalCredit
	 */
   protected void serializePrtSummaryTotalCredit(char[] prtSummaryTotalCredit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtSummaryTotalCredit,0,getStringValue(),beginPrtSummaryTotalCredit,PRT_SUMMARY_TOTAL_CREDIT_LEN);
       localPrtSummaryTotalCreditCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtSummaryTotalCreditConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshPrtSummaryTotalCredit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtSummaryTotalCredit() {	 
   		return (substring(getStringValue(),beginPrtSummaryTotalCredit,beginPrtSummaryTotalCredit + PRT_SUMMARY_TOTAL_CREDIT_LEN));
   	}
     int localPrtSummaryCloseBalanceCounter = -1;
     public boolean isPrtSummaryCloseBalanceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtSummaryCloseBalanceCounter != sharedCounter;
         localPrtSummaryCloseBalanceCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_SUMMARY_CLOSE_BALANCE_LEN = 14;
	/**
	 * 	serialize this PrtSummaryCloseBalance
	 */
   protected void serializePrtSummaryCloseBalance(char[] prtSummaryCloseBalance) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtSummaryCloseBalance,0,getStringValue(),beginPrtSummaryCloseBalance,PRT_SUMMARY_CLOSE_BALANCE_LEN);
       localPrtSummaryCloseBalanceCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtSummaryCloseBalanceConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshPrtSummaryCloseBalance is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtSummaryCloseBalance() {	 
   		return (substring(getStringValue(),beginPrtSummaryCloseBalance,beginPrtSummaryCloseBalance + PRT_SUMMARY_CLOSE_BALANCE_LEN));
   	}




}
  
