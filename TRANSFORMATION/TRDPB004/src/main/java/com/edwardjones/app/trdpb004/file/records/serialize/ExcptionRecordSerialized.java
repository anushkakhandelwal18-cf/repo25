package com.edwardjones.app.trdpb004.file.records.serialize;

/**
*  The class ExcptionRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 13:17. using version 5.0.0.153
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ExcptionRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ExcptionRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EXCPTION_RECORD_LENGTH = 1100;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginExcptionRecordString;
	
	/**
	* Constructor for ExcptionRecordSerialized
	**/
    public ExcptionRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ExcptionRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EXCPTION_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginExcptionRecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localExcptionRecordStringCounter = -1;
     public boolean isExcptionRecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExcptionRecordStringCounter != sharedCounter;
         localExcptionRecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int EXCPTION_RECORD_STRING_LEN = 1100;
	/**
	 * 	serialize this ExcptionRecordString
	 */
   protected void serializeExcptionRecordString(char[] excptionRecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(excptionRecordString,0,getStringValue(),beginExcptionRecordString,EXCPTION_RECORD_STRING_LEN);
       localExcptionRecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExcptionRecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 1100 ,false, false);
   }
    /**
	 *	refreshExcptionRecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExcptionRecordString() {	 
   		return (substring(getStringValue(),beginExcptionRecordString,beginExcptionRecordString + EXCPTION_RECORD_STRING_LEN));
   	}




}
  
