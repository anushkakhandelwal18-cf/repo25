package com.edwardjones.app.trdpb004.dto.serialize;

/**
*  The class HdrExcptionRecDashSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 12:55. using version 5.0.0.153
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdrExcptionRecDashSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdrExcptionRecDashSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HDR_EXCPTION_REC_DASH_LENGTH = 1028;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFiller101;
            protected  int beginFiller201;
	
	/**
	* Constructor for HdrExcptionRecDashSerialized
	**/
    public HdrExcptionRecDashSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdrExcptionRecDashSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HDR_EXCPTION_REC_DASH_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFiller101 = getStartOffset() + 2;	// set offset for serialization
  
  
             beginFiller201 = getStartOffset() + 25;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFiller101Counter = -1;
     public boolean isFiller101Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller101Counter != sharedCounter;
         localFiller101Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_101_LEN = 20;
	/**
	 * 	serialize this Filler101
	 */
   protected void serializeFiller101(char[] filler101) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler101,0,getStringValue(),beginFiller101,FILLER_101_LEN);
       localFiller101Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller101Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshFiller101 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller101() {	 
   		return (substring(getStringValue(),beginFiller101,beginFiller101 + FILLER_101_LEN));
   	}
     int localFiller201Counter = -1;
     public boolean isFiller201Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller201Counter != sharedCounter;
         localFiller201Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_201_LEN = 1000;
	/**
	 * 	serialize this Filler201
	 */
   protected void serializeFiller201(char[] filler201) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler201,0,getStringValue(),beginFiller201,FILLER_201_LEN);
       localFiller201Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller201Constraints(char[] value) {
   			return super.checkConstraints(value , 1000 ,false, false);
   }
    /**
	 *	refreshFiller201 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller201() {	 
   		return (substring(getStringValue(),beginFiller201,beginFiller201 + FILLER_201_LEN));
   	}




}
  
