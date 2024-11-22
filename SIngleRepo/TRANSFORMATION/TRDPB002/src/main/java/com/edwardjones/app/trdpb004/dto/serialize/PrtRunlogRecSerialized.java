package com.edwardjones.app.trdpb004.dto.serialize;

/**
*  The class PrtRunlogRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:10. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PrtRunlogRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PrtRunlogRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PRT_RUNLOG_REC_LENGTH = 86;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPrtRunlogTransaction;
            protected  int beginPrtRunlogCurrency;
            protected  int beginPrtRunlogStartTs;
            protected  int beginPrtRunlogEndTs;
	
	/**
	* Constructor for PrtRunlogRecSerialized
	**/
    public PrtRunlogRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in PrtRunlogRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PRT_RUNLOG_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginPrtRunlogTransaction = getStartOffset() + 2;	// set offset for serialization
  
  
             beginPrtRunlogCurrency = getStartOffset() + 17;	// set offset for serialization
  
  
             beginPrtRunlogStartTs = getStartOffset() + 28;	// set offset for serialization
  
  
             beginPrtRunlogEndTs = getStartOffset() + 57;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localPrtRunlogTransactionCounter = -1;
     public boolean isPrtRunlogTransactionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtRunlogTransactionCounter != sharedCounter;
         localPrtRunlogTransactionCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_RUNLOG_TRANSACTION_LEN = 12;
	/**
	 * 	serialize this PrtRunlogTransaction
	 */
   protected void serializePrtRunlogTransaction(char[] prtRunlogTransaction) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtRunlogTransaction,0,getStringValue(),beginPrtRunlogTransaction,PRT_RUNLOG_TRANSACTION_LEN);
       localPrtRunlogTransactionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtRunlogTransactionConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshPrtRunlogTransaction is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtRunlogTransaction() {	 
   		return (substring(getStringValue(),beginPrtRunlogTransaction,beginPrtRunlogTransaction + PRT_RUNLOG_TRANSACTION_LEN));
   	}
     int localPrtRunlogCurrencyCounter = -1;
     public boolean isPrtRunlogCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtRunlogCurrencyCounter != sharedCounter;
         localPrtRunlogCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_RUNLOG_CURRENCY_LEN = 8;
	/**
	 * 	serialize this PrtRunlogCurrency
	 */
   protected void serializePrtRunlogCurrency(char[] prtRunlogCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtRunlogCurrency,0,getStringValue(),beginPrtRunlogCurrency,PRT_RUNLOG_CURRENCY_LEN);
       localPrtRunlogCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtRunlogCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPrtRunlogCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtRunlogCurrency() {	 
   		return (substring(getStringValue(),beginPrtRunlogCurrency,beginPrtRunlogCurrency + PRT_RUNLOG_CURRENCY_LEN));
   	}
     int localPrtRunlogStartTsCounter = -1;
     public boolean isPrtRunlogStartTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtRunlogStartTsCounter != sharedCounter;
         localPrtRunlogStartTsCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_RUNLOG_START_TS_LEN = 26;
	/**
	 * 	serialize this PrtRunlogStartTs
	 */
   protected void serializePrtRunlogStartTs(char[] prtRunlogStartTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtRunlogStartTs,0,getStringValue(),beginPrtRunlogStartTs,PRT_RUNLOG_START_TS_LEN);
       localPrtRunlogStartTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtRunlogStartTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshPrtRunlogStartTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtRunlogStartTs() {	 
   		return (substring(getStringValue(),beginPrtRunlogStartTs,beginPrtRunlogStartTs + PRT_RUNLOG_START_TS_LEN));
   	}
     int localPrtRunlogEndTsCounter = -1;
     public boolean isPrtRunlogEndTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtRunlogEndTsCounter != sharedCounter;
         localPrtRunlogEndTsCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_RUNLOG_END_TS_LEN = 26;
	/**
	 * 	serialize this PrtRunlogEndTs
	 */
   protected void serializePrtRunlogEndTs(char[] prtRunlogEndTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtRunlogEndTs,0,getStringValue(),beginPrtRunlogEndTs,PRT_RUNLOG_END_TS_LEN);
       localPrtRunlogEndTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtRunlogEndTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshPrtRunlogEndTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtRunlogEndTs() {	 
   		return (substring(getStringValue(),beginPrtRunlogEndTs,beginPrtRunlogEndTs + PRT_RUNLOG_END_TS_LEN));
   	}




}
  
