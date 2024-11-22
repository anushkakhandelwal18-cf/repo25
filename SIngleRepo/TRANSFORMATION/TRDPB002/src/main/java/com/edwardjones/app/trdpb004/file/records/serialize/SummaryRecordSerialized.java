package com.edwardjones.app.trdpb004.file.records.serialize;

/**
*  The class SummaryRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:10. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SummaryRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SummaryRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SUMMARY_RECORD_LENGTH = 140;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSummaryRecordString;
	
	/**
	* Constructor for SummaryRecordSerialized
	**/
    public SummaryRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SummaryRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SUMMARY_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSummaryRecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSummaryRecordStringCounter = -1;
     public boolean isSummaryRecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSummaryRecordStringCounter != sharedCounter;
         localSummaryRecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SUMMARY_RECORD_STRING_LEN = 140;
	/**
	 * 	serialize this SummaryRecordString
	 */
   protected void serializeSummaryRecordString(char[] summaryRecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(summaryRecordString,0,getStringValue(),beginSummaryRecordString,SUMMARY_RECORD_STRING_LEN);
       localSummaryRecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSummaryRecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 140 ,false, false);
   }
    /**
	 *	refreshSummaryRecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSummaryRecordString() {	 
   		return (substring(getStringValue(),beginSummaryRecordString,beginSummaryRecordString + SUMMARY_RECORD_STRING_LEN));
   	}




}
  
