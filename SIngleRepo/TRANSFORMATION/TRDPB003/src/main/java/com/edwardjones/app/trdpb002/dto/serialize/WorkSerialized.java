package com.edwardjones.app.trdpb002.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:10. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlcode_Ws;
	
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
     int localCrDbSwtichCounter = -1;
     public boolean isCrDbSwtichModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCrDbSwtichCounter != sharedCounter;
         localCrDbSwtichCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCrDbSwtichConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
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
     int localExceptionHandlerCounter = -1;
     public boolean isExceptionHandlerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExceptionHandlerCounter != sharedCounter;
         localExceptionHandlerCounter = sharedCounter; return hasModified;
     }

   protected char[] checkExceptionHandlerConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
     int localExcpTypeCounter = -1;
     public boolean isExcpTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExcpTypeCounter != sharedCounter;
         localExcpTypeCounter = sharedCounter; return hasModified;
     }

   protected char[] checkExcpTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }




}
  
