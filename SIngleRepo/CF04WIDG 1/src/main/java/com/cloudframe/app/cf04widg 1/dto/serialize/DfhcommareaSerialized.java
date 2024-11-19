package com.cloudframe.app.cf04widg 1.dto.serialize;

/**
*  The class DfhcommareaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-14 at 17:20. using version 5.0.0.153
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DfhcommareaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DfhcommareaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DFHCOMMAREA_LENGTH = 121;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWidgetNum01;
            protected  int beginWidgetColor01;
            protected  int beginWidgetSize01;
            protected  int beginWidgetPrice01;
            protected  int beginWidgetSupplier01;
            protected  int beginWidgetDesc01;
            protected  int beginWidgetManuPlant01;
            protected  int beginWidgetManuCost01;
            protected  int beginWidgetLeadTime01;
            protected  int beginWidgetErrorMsg;
	
	/**
	* Constructor for DfhcommareaSerialized
	**/
    public DfhcommareaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DfhcommareaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DFHCOMMAREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWidgetNum01 = getStartOffset() + 0;	// set offset for serialization
  
             beginWidgetColor01 = getStartOffset() + 8;	// set offset for serialization
  
             beginWidgetSize01 = getStartOffset() + 14;	// set offset for serialization
  
             beginWidgetPrice01 = getStartOffset() + 15;	// set offset for serialization
  
             beginWidgetSupplier01 = getStartOffset() + 23;	// set offset for serialization
  
             beginWidgetDesc01 = getStartOffset() + 31;	// set offset for serialization
  
             beginWidgetManuPlant01 = getStartOffset() + 51;	// set offset for serialization
  
             beginWidgetManuCost01 = getStartOffset() + 59;	// set offset for serialization
  
             beginWidgetLeadTime01 = getStartOffset() + 67;	// set offset for serialization
  
             beginWidgetErrorMsg = getStartOffset() + 71;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWidgetNum01Counter = -1;
     public boolean isWidgetNum01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetNum01Counter != sharedCounter;
         localWidgetNum01Counter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_NUM_01_LEN = 8;
	/**
	 * 	serialize this WidgetNum01
	 */
   protected void serializeWidgetNum01(char[] widgetNum01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetNum01,0,getStringValue(),beginWidgetNum01,WIDGET_NUM_01_LEN);
       localWidgetNum01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetNum01Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWidgetNum01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetNum01() {	 
   		return (substring(getStringValue(),beginWidgetNum01,beginWidgetNum01 + WIDGET_NUM_01_LEN));
   	}
     int localWidgetColor01Counter = -1;
     public boolean isWidgetColor01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetColor01Counter != sharedCounter;
         localWidgetColor01Counter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_COLOR_01_LEN = 6;
	/**
	 * 	serialize this WidgetColor01
	 */
   protected void serializeWidgetColor01(char[] widgetColor01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetColor01,0,getStringValue(),beginWidgetColor01,WIDGET_COLOR_01_LEN);
       localWidgetColor01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetColor01Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshWidgetColor01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetColor01() {	 
   		return (substring(getStringValue(),beginWidgetColor01,beginWidgetColor01 + WIDGET_COLOR_01_LEN));
   	}
     int localWidgetSize01Counter = -1;
     public boolean isWidgetSize01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetSize01Counter != sharedCounter;
         localWidgetSize01Counter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_SIZE_01_LEN = 1;
	/**
	 * 	serialize this WidgetSize01
	 */
   protected void serializeWidgetSize01(char[] widgetSize01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetSize01,0,getStringValue(),beginWidgetSize01,WIDGET_SIZE_01_LEN);
       localWidgetSize01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetSize01Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWidgetSize01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetSize01() {	 
   		return (substring(getStringValue(),beginWidgetSize01,beginWidgetSize01 + WIDGET_SIZE_01_LEN));
   	}
     int localWidgetPrice01Counter = -1;
     public boolean isWidgetPrice01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetPrice01Counter != sharedCounter;
         localWidgetPrice01Counter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_PRICE_01_LEN = 8;
	/**
	 * 	serialize this WidgetPrice01
	 */
   protected void serializeWidgetPrice01(char[] widgetPrice01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetPrice01,0,getStringValue(),beginWidgetPrice01,WIDGET_PRICE_01_LEN);
       localWidgetPrice01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetPrice01Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWidgetPrice01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetPrice01() {	 
   		return (substring(getStringValue(),beginWidgetPrice01,beginWidgetPrice01 + WIDGET_PRICE_01_LEN));
   	}
     int localWidgetSupplier01Counter = -1;
     public boolean isWidgetSupplier01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetSupplier01Counter != sharedCounter;
         localWidgetSupplier01Counter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_SUPPLIER_01_LEN = 8;
	/**
	 * 	serialize this WidgetSupplier01
	 */
   protected void serializeWidgetSupplier01(char[] widgetSupplier01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetSupplier01,0,getStringValue(),beginWidgetSupplier01,WIDGET_SUPPLIER_01_LEN);
       localWidgetSupplier01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetSupplier01Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWidgetSupplier01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetSupplier01() {	 
   		return (substring(getStringValue(),beginWidgetSupplier01,beginWidgetSupplier01 + WIDGET_SUPPLIER_01_LEN));
   	}
     int localWidgetDesc01Counter = -1;
     public boolean isWidgetDesc01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetDesc01Counter != sharedCounter;
         localWidgetDesc01Counter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_DESC_01_LEN = 20;
	/**
	 * 	serialize this WidgetDesc01
	 */
   protected void serializeWidgetDesc01(char[] widgetDesc01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetDesc01,0,getStringValue(),beginWidgetDesc01,WIDGET_DESC_01_LEN);
       localWidgetDesc01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetDesc01Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWidgetDesc01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetDesc01() {	 
   		return (substring(getStringValue(),beginWidgetDesc01,beginWidgetDesc01 + WIDGET_DESC_01_LEN));
   	}
     int localWidgetManuPlant01Counter = -1;
     public boolean isWidgetManuPlant01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetManuPlant01Counter != sharedCounter;
         localWidgetManuPlant01Counter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_MANU_PLANT_01_LEN = 8;
	/**
	 * 	serialize this WidgetManuPlant01
	 */
   protected void serializeWidgetManuPlant01(char[] widgetManuPlant01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetManuPlant01,0,getStringValue(),beginWidgetManuPlant01,WIDGET_MANU_PLANT_01_LEN);
       localWidgetManuPlant01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetManuPlant01Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWidgetManuPlant01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetManuPlant01() {	 
   		return (substring(getStringValue(),beginWidgetManuPlant01,beginWidgetManuPlant01 + WIDGET_MANU_PLANT_01_LEN));
   	}
     int localWidgetManuCost01Counter = -1;
     public boolean isWidgetManuCost01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetManuCost01Counter != sharedCounter;
         localWidgetManuCost01Counter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_MANU_COST_01_LEN = 8;
	/**
	 * 	serialize this WidgetManuCost01
	 */
   protected void serializeWidgetManuCost01(char[] widgetManuCost01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetManuCost01,0,getStringValue(),beginWidgetManuCost01,WIDGET_MANU_COST_01_LEN);
       localWidgetManuCost01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetManuCost01Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWidgetManuCost01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetManuCost01() {	 
   		return (substring(getStringValue(),beginWidgetManuCost01,beginWidgetManuCost01 + WIDGET_MANU_COST_01_LEN));
   	}
     int localWidgetLeadTime01Counter = -1;
     public boolean isWidgetLeadTime01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetLeadTime01Counter != sharedCounter;
         localWidgetLeadTime01Counter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_LEAD_TIME_01_LEN = 4;
	/**
	 * 	serialize this WidgetLeadTime01
	 */
   protected void serializeWidgetLeadTime01(char[] widgetLeadTime01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetLeadTime01,0,getStringValue(),beginWidgetLeadTime01,WIDGET_LEAD_TIME_01_LEN);
       localWidgetLeadTime01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetLeadTime01Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshWidgetLeadTime01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetLeadTime01() {	 
   		return (substring(getStringValue(),beginWidgetLeadTime01,beginWidgetLeadTime01 + WIDGET_LEAD_TIME_01_LEN));
   	}
     int localWidgetErrorMsgCounter = -1;
     public boolean isWidgetErrorMsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetErrorMsgCounter != sharedCounter;
         localWidgetErrorMsgCounter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_ERROR_MSG_LEN = 50;
	/**
	 * 	serialize this WidgetErrorMsg
	 */
   protected void serializeWidgetErrorMsg(char[] widgetErrorMsg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetErrorMsg,0,getStringValue(),beginWidgetErrorMsg,WIDGET_ERROR_MSG_LEN);
       localWidgetErrorMsgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetErrorMsgConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshWidgetErrorMsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetErrorMsg() {	 
   		return (substring(getStringValue(),beginWidgetErrorMsg,beginWidgetErrorMsg + WIDGET_ERROR_MSG_LEN));
   	}




}
  
