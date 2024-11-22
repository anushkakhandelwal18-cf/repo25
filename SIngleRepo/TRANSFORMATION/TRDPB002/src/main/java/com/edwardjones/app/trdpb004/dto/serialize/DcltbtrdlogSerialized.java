package com.edwardjones.app.trdpb004.dto.serialize;

/**
*  The class DcltbtrdlogSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:10. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DcltbtrdlogSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DcltbtrdlogSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLTBTRDLOG_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLogTransaction;
            protected  int beginLogCurrency;
            protected  int beginLogStartTs;
            protected  int beginLogEndTs;
	
	/**
	* Constructor for DcltbtrdlogSerialized
	**/
    public DcltbtrdlogSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DcltbtrdlogSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLTBTRDLOG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLogTransaction = getStartOffset() + 0;	// set offset for serialization
  
             beginLogCurrency = getStartOffset() + 10;	// set offset for serialization
  
             beginLogStartTs = getStartOffset() + 13;	// set offset for serialization
  
             beginLogEndTs = getStartOffset() + 39;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLogTransactionCounter = -1;
     public boolean isLogTransactionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogTransactionCounter != sharedCounter;
         localLogTransactionCounter = sharedCounter; return hasModified;
     }
	protected static final int LOG_TRANSACTION_LEN = 10;
	/**
	 * 	serialize this LogTransaction
	 */
   protected void serializeLogTransaction(char[] logTransaction) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(logTransaction,0,getStringValue(),beginLogTransaction,LOG_TRANSACTION_LEN);
       localLogTransactionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLogTransactionConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshLogTransaction is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLogTransaction() {	 
   		return (substring(getStringValue(),beginLogTransaction,beginLogTransaction + LOG_TRANSACTION_LEN));
   	}
     int localLogCurrencyCounter = -1;
     public boolean isLogCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogCurrencyCounter != sharedCounter;
         localLogCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int LOG_CURRENCY_LEN = 3;
	/**
	 * 	serialize this LogCurrency
	 */
   protected void serializeLogCurrency(char[] logCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(logCurrency,0,getStringValue(),beginLogCurrency,LOG_CURRENCY_LEN);
       localLogCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLogCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLogCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLogCurrency() {	 
   		return (substring(getStringValue(),beginLogCurrency,beginLogCurrency + LOG_CURRENCY_LEN));
   	}
     int localLogStartTsCounter = -1;
     public boolean isLogStartTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogStartTsCounter != sharedCounter;
         localLogStartTsCounter = sharedCounter; return hasModified;
     }
	protected static final int LOG_START_TS_LEN = 26;
	/**
	 * 	serialize this LogStartTs
	 */
   protected void serializeLogStartTs(char[] logStartTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(logStartTs,0,getStringValue(),beginLogStartTs,LOG_START_TS_LEN);
       localLogStartTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLogStartTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshLogStartTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLogStartTs() {	 
   		return (substring(getStringValue(),beginLogStartTs,beginLogStartTs + LOG_START_TS_LEN));
   	}
     int localLogEndTsCounter = -1;
     public boolean isLogEndTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogEndTsCounter != sharedCounter;
         localLogEndTsCounter = sharedCounter; return hasModified;
     }
	protected static final int LOG_END_TS_LEN = 26;
	/**
	 * 	serialize this LogEndTs
	 */
   protected void serializeLogEndTs(char[] logEndTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(logEndTs,0,getStringValue(),beginLogEndTs,LOG_END_TS_LEN);
       localLogEndTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLogEndTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshLogEndTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLogEndTs() {	 
   		return (substring(getStringValue(),beginLogEndTs,beginLogEndTs + LOG_END_TS_LEN));
   	}




}
  
