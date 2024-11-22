package com.edwardjones.app.trdpb004.dto.serialize;

/**
*  The class DcltbtrdexcSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:20. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DcltbtrdexcSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DcltbtrdexcSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLTBTRDEXC_LENGTH = 1026;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginExcType;
	
	/**
	* Constructor for DcltbtrdexcSerialized
	**/
    public DcltbtrdexcSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DcltbtrdexcSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLTBTRDEXC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginExcType = getStartOffset() + 4;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localExcTypeCounter = -1;
     public boolean isExcTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExcTypeCounter != sharedCounter;
         localExcTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int EXC_TYPE_LEN = 20;
	/**
	 * 	serialize this ExcType
	 */
   protected void serializeExcType(char[] excType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(excType,0,getStringValue(),beginExcType,EXC_TYPE_LEN);
       localExcTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExcTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshExcType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExcType() {	 
   		return (substring(getStringValue(),beginExcType,beginExcType + EXC_TYPE_LEN));
   	}




}
  
