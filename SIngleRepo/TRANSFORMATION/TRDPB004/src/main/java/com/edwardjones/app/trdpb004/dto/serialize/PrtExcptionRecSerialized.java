package com.edwardjones.app.trdpb004.dto.serialize;

/**
*  The class PrtExcptionRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:20. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PrtExcptionRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PrtExcptionRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PRT_EXCPTION_REC_LENGTH = 1028;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPrtExcptionType;
            protected  int beginPrtExcptionDesc;
	
	/**
	* Constructor for PrtExcptionRecSerialized
	**/
    public PrtExcptionRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in PrtExcptionRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PRT_EXCPTION_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginPrtExcptionType = getStartOffset() + 2;	// set offset for serialization
  
  
             beginPrtExcptionDesc = getStartOffset() + 25;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localPrtExcptionTypeCounter = -1;
     public boolean isPrtExcptionTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtExcptionTypeCounter != sharedCounter;
         localPrtExcptionTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_EXCPTION_TYPE_LEN = 20;
	/**
	 * 	serialize this PrtExcptionType
	 */
   protected void serializePrtExcptionType(char[] prtExcptionType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtExcptionType,0,getStringValue(),beginPrtExcptionType,PRT_EXCPTION_TYPE_LEN);
       localPrtExcptionTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtExcptionTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshPrtExcptionType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtExcptionType() {	 
   		return (substring(getStringValue(),beginPrtExcptionType,beginPrtExcptionType + PRT_EXCPTION_TYPE_LEN));
   	}
     int localPrtExcptionDescCounter = -1;
     public boolean isPrtExcptionDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtExcptionDescCounter != sharedCounter;
         localPrtExcptionDescCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_EXCPTION_DESC_LEN = 1000;
	/**
	 * 	serialize this PrtExcptionDesc
	 */
   protected void serializePrtExcptionDesc(char[] prtExcptionDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtExcptionDesc,0,getStringValue(),beginPrtExcptionDesc,PRT_EXCPTION_DESC_LEN);
       localPrtExcptionDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtExcptionDescConstraints(char[] value) {
   			return super.checkConstraints(value , 1000 ,false, false);
   }
    /**
	 *	refreshPrtExcptionDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtExcptionDesc() {	 
   		return (substring(getStringValue(),beginPrtExcptionDesc,beginPrtExcptionDesc + PRT_EXCPTION_DESC_LEN));
   	}




}
  
