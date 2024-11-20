package com.edwardjones.app.trdpb004.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 12:55. using version 5.0.0.153
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlcode_Ws;
            protected  int beginRunlogFileStatus;
            protected  int beginSummaryFileStatus;
            protected  int beginExcptionFileStatus;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSqlcode_Ws = getStartOffset() + 0;	// set offset for serialization
  
             beginRunlogFileStatus = getStartOffset() + 4;	// set offset for serialization
  
             beginSummaryFileStatus = getStartOffset() + 6;	// set offset for serialization
  
             beginExcptionFileStatus = getStartOffset() + 8;	// set offset for serialization
  
  
  
  
  
	   /*  end of offset */
	}
     int localSqlcode_WsCounter = -1;
     public boolean isSqlcode_WsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlcode_WsCounter != sharedCounter;
         localSqlcode_WsCounter = sharedCounter; return hasModified;
     }
	protected static final int SQLCODE__WS_LEN = 4;
	/**
	 * 	serialize this Sqlcode_Ws
	 */
   protected void serializeSqlcode_Ws(char[] sqlcode_Ws) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlcode_Ws,0,getStringValue(),beginSqlcode_Ws,SQLCODE__WS_LEN);
       localSqlcode_WsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlcode_WsConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSqlcode_Ws is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlcode_Ws() {	 
   		return (substring(getStringValue(),beginSqlcode_Ws,beginSqlcode_Ws + SQLCODE__WS_LEN));
   	}
     int localRunlogFileStatusCounter = -1;
     public boolean isRunlogFileStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRunlogFileStatusCounter != sharedCounter;
         localRunlogFileStatusCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of runlogFileStatus
	 *	@return runlogFileStatus
	 */
	public char[]  getRunlogFileStatusString() {
	     return getCharArray(beginRunlogFileStatus,RUNLOG_FILE_STATUS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean runlogFileStatusIsNumeric() {
	    return isNumeric(beginRunlogFileStatus
	                    ,beginRunlogFileStatus + RUNLOG_FILE_STATUS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RUNLOG_FILE_STATUS_LEN = 2;
  	/**
	 * serializeRunlogFileStatus
	 */
	protected void serializeRunlogFileStatus(int runlogFileStatus) {
		 putNumber(beginRunlogFileStatus,runlogFileStatus,RUNLOG_FILE_STATUS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRunlogFileStatusCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRunlogFileStatus
	 */
   	protected  int serializeRunlogFileStatus(char[] value) {
	    int  runlogFileStatus;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    runlogFileStatus = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRunlogFileStatus
		       ,2
		      );
		 localRunlogFileStatusCounter = shareString.getSerializedField().getModifiedCounter();
		return  runlogFileStatus;
    }

   protected int checkRunlogFileStatusMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRunlogFileStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRunlogFileStatus() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRunlogFileStatus
			                 ,RUNLOG_FILE_STATUS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("runlogFileStatus", beginRunlogFileStatus,RUNLOG_FILE_STATUS_LEN);
    }
   	}
     int localSummaryFileStatusCounter = -1;
     public boolean isSummaryFileStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSummaryFileStatusCounter != sharedCounter;
         localSummaryFileStatusCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of summaryFileStatus
	 *	@return summaryFileStatus
	 */
	public char[]  getSummaryFileStatusString() {
	     return getCharArray(beginSummaryFileStatus,SUMMARY_FILE_STATUS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean summaryFileStatusIsNumeric() {
	    return isNumeric(beginSummaryFileStatus
	                    ,beginSummaryFileStatus + SUMMARY_FILE_STATUS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SUMMARY_FILE_STATUS_LEN = 2;
  	/**
	 * serializeSummaryFileStatus
	 */
	protected void serializeSummaryFileStatus(int summaryFileStatus) {
		 putNumber(beginSummaryFileStatus,summaryFileStatus,SUMMARY_FILE_STATUS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSummaryFileStatusCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSummaryFileStatus
	 */
   	protected  int serializeSummaryFileStatus(char[] value) {
	    int  summaryFileStatus;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    summaryFileStatus = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginSummaryFileStatus
		       ,2
		      );
		 localSummaryFileStatusCounter = shareString.getSerializedField().getModifiedCounter();
		return  summaryFileStatus;
    }

   protected int checkSummaryFileStatusMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSummaryFileStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSummaryFileStatus() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSummaryFileStatus
			                 ,SUMMARY_FILE_STATUS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("summaryFileStatus", beginSummaryFileStatus,SUMMARY_FILE_STATUS_LEN);
    }
   	}
     int localExcptionFileStatusCounter = -1;
     public boolean isExcptionFileStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExcptionFileStatusCounter != sharedCounter;
         localExcptionFileStatusCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of excptionFileStatus
	 *	@return excptionFileStatus
	 */
	public char[]  getExcptionFileStatusString() {
	     return getCharArray(beginExcptionFileStatus,EXCPTION_FILE_STATUS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean excptionFileStatusIsNumeric() {
	    return isNumeric(beginExcptionFileStatus
	                    ,beginExcptionFileStatus + EXCPTION_FILE_STATUS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXCPTION_FILE_STATUS_LEN = 2;
  	/**
	 * serializeExcptionFileStatus
	 */
	protected void serializeExcptionFileStatus(int excptionFileStatus) {
		 putNumber(beginExcptionFileStatus,excptionFileStatus,EXCPTION_FILE_STATUS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExcptionFileStatusCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExcptionFileStatus
	 */
   	protected  int serializeExcptionFileStatus(char[] value) {
	    int  excptionFileStatus;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    excptionFileStatus = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginExcptionFileStatus
		       ,2
		      );
		 localExcptionFileStatusCounter = shareString.getSerializedField().getModifiedCounter();
		return  excptionFileStatus;
    }

   protected int checkExcptionFileStatusMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshExcptionFileStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshExcptionFileStatus() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginExcptionFileStatus
			                 ,EXCPTION_FILE_STATUS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("excptionFileStatus", beginExcptionFileStatus,EXCPTION_FILE_STATUS_LEN);
    }
   	}
     int localExceptionCounter = -1;
     public boolean isExceptionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExceptionCounter != sharedCounter;
         localExceptionCounter = sharedCounter; return hasModified;
     }

   protected char[] checkExceptionConstraints(char[] value) {
   			return super.checkConstraints(value , 200 ,false, false);
   }
     int localHdrRunlogRecCounter = -1;
     public boolean isHdrRunlogRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdrRunlogRecCounter != sharedCounter;
         localHdrRunlogRecCounter = sharedCounter; return hasModified;
     }

   protected char[] checkHdrRunlogRecConstraints(char[] value) {
   			return super.checkConstraints(value , 86 ,false, false);
   }
     int localHdrExcptionRecCounter = -1;
     public boolean isHdrExcptionRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdrExcptionRecCounter != sharedCounter;
         localHdrExcptionRecCounter = sharedCounter; return hasModified;
     }

   protected char[] checkHdrExcptionRecConstraints(char[] value) {
   			return super.checkConstraints(value , 1028 ,false, false);
   }
     int localHdrSummaryRecCounter = -1;
     public boolean isHdrSummaryRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdrSummaryRecCounter != sharedCounter;
         localHdrSummaryRecCounter = sharedCounter; return hasModified;
     }

   protected char[] checkHdrSummaryRecConstraints(char[] value) {
   			return super.checkConstraints(value , 140 ,false, false);
   }




}
  
