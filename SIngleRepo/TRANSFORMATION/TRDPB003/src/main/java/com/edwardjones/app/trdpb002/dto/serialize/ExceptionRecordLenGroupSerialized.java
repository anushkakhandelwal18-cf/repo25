package com.edwardjones.app.trdpb002.dto.serialize;

/**
*  The class ExceptionRecordLenGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:10. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ExceptionRecordLenGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ExceptionRecordLenGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EXCEPTION_RECORD_LEN_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginExceptionRecordLen;
	
	/**
	* Constructor for ExceptionRecordLenGroupSerialized
	**/
    public ExceptionRecordLenGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ExceptionRecordLenGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EXCEPTION_RECORD_LEN_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginExceptionRecordLen = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localExceptionRecordLenCounter = -1;
         public boolean isExceptionRecordLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localExceptionRecordLenCounter != sharedCounter;
            localExceptionRecordLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int EXCEPTION_RECORD_LEN_LEN = 2;
  	/**
	 * serializeExceptionRecordLen
	 */
	protected void serializeExceptionRecordLen(short exceptionRecordLen) {
           replaceValue( //  save the value as string
                   getBinaryString( exceptionRecordLen,EXCEPTION_RECORD_LEN_LEN)
                  ,beginExceptionRecordLen
                  ,EXCEPTION_RECORD_LEN_LEN
                 );
            localExceptionRecordLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkExceptionRecordLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshExceptionRecordLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshExceptionRecordLen() {	 
			return (getShort(beginExceptionRecordLen));
   	}




}
  
