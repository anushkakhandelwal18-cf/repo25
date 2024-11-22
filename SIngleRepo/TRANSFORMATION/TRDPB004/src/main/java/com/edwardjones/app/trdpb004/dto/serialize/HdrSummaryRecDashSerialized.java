package com.edwardjones.app.trdpb004.dto.serialize;

/**
*  The class HdrSummaryRecDashSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:10. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdrSummaryRecDashSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdrSummaryRecDashSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HDR_SUMMARY_REC_DASH_LENGTH = 140;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFiller102;
            protected  int beginFiller202;
            protected  int beginFiller301;
            protected  int beginFiller401;
            protected  int beginFiller5;
            protected  int beginFiller6;
            protected  int beginFiller7;
            protected  int beginFiller8;
            protected  int beginFiller9;
	
	/**
	* Constructor for HdrSummaryRecDashSerialized
	**/
    public HdrSummaryRecDashSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdrSummaryRecDashSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HDR_SUMMARY_REC_DASH_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFiller102 = getStartOffset() + 2;	// set offset for serialization
  
  
             beginFiller202 = getStartOffset() + 17;	// set offset for serialization
  
  
             beginFiller301 = getStartOffset() + 31;	// set offset for serialization
  
  
             beginFiller401 = getStartOffset() + 45;	// set offset for serialization
  
  
             beginFiller5 = getStartOffset() + 59;	// set offset for serialization
  
  
             beginFiller6 = getStartOffset() + 70;	// set offset for serialization
  
  
             beginFiller7 = getStartOffset() + 88;	// set offset for serialization
  
  
             beginFiller8 = getStartOffset() + 106;	// set offset for serialization
  
  
             beginFiller9 = getStartOffset() + 123;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFiller102Counter = -1;
     public boolean isFiller102Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller102Counter != sharedCounter;
         localFiller102Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_102_LEN = 12;
	/**
	 * 	serialize this Filler102
	 */
   protected void serializeFiller102(char[] filler102) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler102,0,getStringValue(),beginFiller102,FILLER_102_LEN);
       localFiller102Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller102Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshFiller102 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller102() {	 
   		return (substring(getStringValue(),beginFiller102,beginFiller102 + FILLER_102_LEN));
   	}
     int localFiller202Counter = -1;
     public boolean isFiller202Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller202Counter != sharedCounter;
         localFiller202Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_202_LEN = 11;
	/**
	 * 	serialize this Filler202
	 */
   protected void serializeFiller202(char[] filler202) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler202,0,getStringValue(),beginFiller202,FILLER_202_LEN);
       localFiller202Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller202Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshFiller202 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller202() {	 
   		return (substring(getStringValue(),beginFiller202,beginFiller202 + FILLER_202_LEN));
   	}
     int localFiller301Counter = -1;
     public boolean isFiller301Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller301Counter != sharedCounter;
         localFiller301Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_301_LEN = 11;
	/**
	 * 	serialize this Filler301
	 */
   protected void serializeFiller301(char[] filler301) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler301,0,getStringValue(),beginFiller301,FILLER_301_LEN);
       localFiller301Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller301Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshFiller301 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller301() {	 
   		return (substring(getStringValue(),beginFiller301,beginFiller301 + FILLER_301_LEN));
   	}
     int localFiller401Counter = -1;
     public boolean isFiller401Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller401Counter != sharedCounter;
         localFiller401Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_401_LEN = 11;
	/**
	 * 	serialize this Filler401
	 */
   protected void serializeFiller401(char[] filler401) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler401,0,getStringValue(),beginFiller401,FILLER_401_LEN);
       localFiller401Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller401Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshFiller401 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller401() {	 
   		return (substring(getStringValue(),beginFiller401,beginFiller401 + FILLER_401_LEN));
   	}
     int localFiller5Counter = -1;
     public boolean isFiller5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller5Counter != sharedCounter;
         localFiller5Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_5_LEN = 8;
	/**
	 * 	serialize this Filler5
	 */
   protected void serializeFiller5(char[] filler5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler5,0,getStringValue(),beginFiller5,FILLER_5_LEN);
       localFiller5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller5Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshFiller5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller5() {	 
   		return (substring(getStringValue(),beginFiller5,beginFiller5 + FILLER_5_LEN));
   	}
     int localFiller6Counter = -1;
     public boolean isFiller6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller6Counter != sharedCounter;
         localFiller6Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_6_LEN = 14;
	/**
	 * 	serialize this Filler6
	 */
   protected void serializeFiller6(char[] filler6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler6,0,getStringValue(),beginFiller6,FILLER_6_LEN);
       localFiller6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller6Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshFiller6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller6() {	 
   		return (substring(getStringValue(),beginFiller6,beginFiller6 + FILLER_6_LEN));
   	}
     int localFiller7Counter = -1;
     public boolean isFiller7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller7Counter != sharedCounter;
         localFiller7Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_7_LEN = 14;
	/**
	 * 	serialize this Filler7
	 */
   protected void serializeFiller7(char[] filler7) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler7,0,getStringValue(),beginFiller7,FILLER_7_LEN);
       localFiller7Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller7Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshFiller7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller7() {	 
   		return (substring(getStringValue(),beginFiller7,beginFiller7 + FILLER_7_LEN));
   	}
     int localFiller8Counter = -1;
     public boolean isFiller8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller8Counter != sharedCounter;
         localFiller8Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_8_LEN = 14;
	/**
	 * 	serialize this Filler8
	 */
   protected void serializeFiller8(char[] filler8) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler8,0,getStringValue(),beginFiller8,FILLER_8_LEN);
       localFiller8Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller8Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshFiller8 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller8() {	 
   		return (substring(getStringValue(),beginFiller8,beginFiller8 + FILLER_8_LEN));
   	}
     int localFiller9Counter = -1;
     public boolean isFiller9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller9Counter != sharedCounter;
         localFiller9Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_9_LEN = 14;
	/**
	 * 	serialize this Filler9
	 */
   protected void serializeFiller9(char[] filler9) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler9,0,getStringValue(),beginFiller9,FILLER_9_LEN);
       localFiller9Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller9Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshFiller9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller9() {	 
   		return (substring(getStringValue(),beginFiller9,beginFiller9 + FILLER_9_LEN));
   	}




}
  
