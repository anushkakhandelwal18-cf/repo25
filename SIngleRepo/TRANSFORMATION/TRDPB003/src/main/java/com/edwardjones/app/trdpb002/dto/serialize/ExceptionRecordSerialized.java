package com.edwardjones.app.trdpb002.dto.serialize;

/**
*  The class ExceptionRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:10. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ExceptionRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ExceptionRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EXCEPTION_RECORD_LENGTH = 1020;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginExceptionType;
            protected  int beginExceptionDesc;
	
	/**
	* Constructor for ExceptionRecordSerialized
	**/
    public ExceptionRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ExceptionRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EXCEPTION_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginExceptionType = getStartOffset() + 0;	// set offset for serialization
  
             beginExceptionDesc = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localExceptionTypeCounter = -1;
     public boolean isExceptionTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExceptionTypeCounter != sharedCounter;
         localExceptionTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int EXCEPTION_TYPE_LEN = 20;
	/**
	 * 	serialize this ExceptionType
	 */
   protected void serializeExceptionType(char[] exceptionType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(exceptionType,0,getStringValue(),beginExceptionType,EXCEPTION_TYPE_LEN);
       localExceptionTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExceptionTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshExceptionType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExceptionType() {	 
   		return (substring(getStringValue(),beginExceptionType,beginExceptionType + EXCEPTION_TYPE_LEN));
   	}
     int localExceptionDescCounter = -1;
     public boolean isExceptionDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExceptionDescCounter != sharedCounter;
         localExceptionDescCounter = sharedCounter; return hasModified;
     }
	protected static final int EXCEPTION_DESC_LEN = 1000;
	/**
	 * 	serialize this ExceptionDesc
	 */
   protected void serializeExceptionDesc(char[] exceptionDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(exceptionDesc,0,getStringValue(),beginExceptionDesc,EXCEPTION_DESC_LEN);
       localExceptionDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExceptionDescConstraints(char[] value) {
   			return super.checkConstraints(value , 1000 ,false, false);
   }
    /**
	 *	refreshExceptionDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExceptionDesc() {	 
   		return (substring(getStringValue(),beginExceptionDesc,beginExceptionDesc + EXCEPTION_DESC_LEN));
   	}




}
  
