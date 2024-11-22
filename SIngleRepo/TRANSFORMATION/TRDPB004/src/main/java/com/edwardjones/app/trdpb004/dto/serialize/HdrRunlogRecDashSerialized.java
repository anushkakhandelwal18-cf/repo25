package com.edwardjones.app.trdpb004.dto.serialize;

/**
*  The class HdrRunlogRecDashSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:10. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdrRunlogRecDashSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdrRunlogRecDashSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HDR_RUNLOG_REC_DASH_LENGTH = 86;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFiller1;
            protected  int beginFiller2;
            protected  int beginFiller3;
            protected  int beginFiller4;
	
	/**
	* Constructor for HdrRunlogRecDashSerialized
	**/
    public HdrRunlogRecDashSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdrRunlogRecDashSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HDR_RUNLOG_REC_DASH_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFiller1 = getStartOffset() + 2;	// set offset for serialization
  
  
             beginFiller2 = getStartOffset() + 17;	// set offset for serialization
  
  
             beginFiller3 = getStartOffset() + 28;	// set offset for serialization
  
  
             beginFiller4 = getStartOffset() + 57;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFiller1Counter = -1;
     public boolean isFiller1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller1Counter != sharedCounter;
         localFiller1Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_1_LEN = 12;
	/**
	 * 	serialize this Filler1
	 */
   protected void serializeFiller1(char[] filler1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler1,0,getStringValue(),beginFiller1,FILLER_1_LEN);
       localFiller1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller1Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshFiller1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller1() {	 
   		return (substring(getStringValue(),beginFiller1,beginFiller1 + FILLER_1_LEN));
   	}
     int localFiller2Counter = -1;
     public boolean isFiller2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller2Counter != sharedCounter;
         localFiller2Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_2_LEN = 8;
	/**
	 * 	serialize this Filler2
	 */
   protected void serializeFiller2(char[] filler2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler2,0,getStringValue(),beginFiller2,FILLER_2_LEN);
       localFiller2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller2Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshFiller2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller2() {	 
   		return (substring(getStringValue(),beginFiller2,beginFiller2 + FILLER_2_LEN));
   	}
     int localFiller3Counter = -1;
     public boolean isFiller3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller3Counter != sharedCounter;
         localFiller3Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_3_LEN = 26;
	/**
	 * 	serialize this Filler3
	 */
   protected void serializeFiller3(char[] filler3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler3,0,getStringValue(),beginFiller3,FILLER_3_LEN);
       localFiller3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller3Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshFiller3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller3() {	 
   		return (substring(getStringValue(),beginFiller3,beginFiller3 + FILLER_3_LEN));
   	}
     int localFiller4Counter = -1;
     public boolean isFiller4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller4Counter != sharedCounter;
         localFiller4Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_4_LEN = 26;
	/**
	 * 	serialize this Filler4
	 */
   protected void serializeFiller4(char[] filler4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler4,0,getStringValue(),beginFiller4,FILLER_4_LEN);
       localFiller4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller4Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshFiller4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller4() {	 
   		return (substring(getStringValue(),beginFiller4,beginFiller4 + FILLER_4_LEN));
   	}




}
  
