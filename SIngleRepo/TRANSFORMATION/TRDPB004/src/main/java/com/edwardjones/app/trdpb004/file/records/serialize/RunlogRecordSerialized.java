package com.edwardjones.app.trdpb004.file.records.serialize;

/**
*  The class RunlogRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 13:17. using version 5.0.0.153
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RunlogRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RunlogRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RUNLOG_RECORD_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRunlogRecordString;
	
	/**
	* Constructor for RunlogRecordSerialized
	**/
    public RunlogRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RunlogRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RUNLOG_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRunlogRecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRunlogRecordStringCounter = -1;
     public boolean isRunlogRecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRunlogRecordStringCounter != sharedCounter;
         localRunlogRecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int RUNLOG_RECORD_STRING_LEN = 90;
	/**
	 * 	serialize this RunlogRecordString
	 */
   protected void serializeRunlogRecordString(char[] runlogRecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(runlogRecordString,0,getStringValue(),beginRunlogRecordString,RUNLOG_RECORD_STRING_LEN);
       localRunlogRecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRunlogRecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 90 ,false, false);
   }
    /**
	 *	refreshRunlogRecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRunlogRecordString() {	 
   		return (substring(getStringValue(),beginRunlogRecordString,beginRunlogRecordString + RUNLOG_RECORD_STRING_LEN));
   	}




}
  
