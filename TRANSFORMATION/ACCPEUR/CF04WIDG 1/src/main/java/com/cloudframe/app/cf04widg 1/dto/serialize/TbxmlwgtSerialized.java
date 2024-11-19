package com.cloudframe.app.cf04widg 1.dto.serialize;

/**
*  The class TbxmlwgtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-14 at 17:20. using version 5.0.0.153
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class TbxmlwgtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TbxmlwgtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TBXMLWGT_LENGTH = 61;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWidgetNum;
            protected  int beginWidgetColor;
            protected  int beginWidgetSize;
            protected  int beginWidgetPrice;
            protected  int beginWidgetSupplier;
            protected  int beginWidgetDesc;
            protected  int beginWidgetManuPlant;
            protected  int beginWidgetManuCost;
            protected  int beginWidgetLeadTime;
	
	/**
	* Constructor for TbxmlwgtSerialized
	**/
    public TbxmlwgtSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TbxmlwgtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TBXMLWGT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWidgetNum = getStartOffset() + 0;	// set offset for serialization
  
             beginWidgetColor = getStartOffset() + 8;	// set offset for serialization
  
             beginWidgetSize = getStartOffset() + 14;	// set offset for serialization
  
             beginWidgetPrice = getStartOffset() + 15;	// set offset for serialization
  
             beginWidgetSupplier = getStartOffset() + 19;	// set offset for serialization
  
             beginWidgetDesc = getStartOffset() + 27;	// set offset for serialization
  
             beginWidgetManuPlant = getStartOffset() + 47;	// set offset for serialization
  
             beginWidgetManuCost = getStartOffset() + 55;	// set offset for serialization
  
             beginWidgetLeadTime = getStartOffset() + 59;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWidgetNumCounter = -1;
     public boolean isWidgetNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetNumCounter != sharedCounter;
         localWidgetNumCounter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_NUM_LEN = 8;
	/**
	 * 	serialize this WidgetNum
	 */
   protected void serializeWidgetNum(char[] widgetNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetNum,0,getStringValue(),beginWidgetNum,WIDGET_NUM_LEN);
       localWidgetNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetNumConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWidgetNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetNum() {	 
   		return (substring(getStringValue(),beginWidgetNum,beginWidgetNum + WIDGET_NUM_LEN));
   	}
     int localWidgetColorCounter = -1;
     public boolean isWidgetColorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetColorCounter != sharedCounter;
         localWidgetColorCounter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_COLOR_LEN = 6;
	/**
	 * 	serialize this WidgetColor
	 */
   protected void serializeWidgetColor(char[] widgetColor) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetColor,0,getStringValue(),beginWidgetColor,WIDGET_COLOR_LEN);
       localWidgetColorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetColorConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshWidgetColor is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetColor() {	 
   		return (substring(getStringValue(),beginWidgetColor,beginWidgetColor + WIDGET_COLOR_LEN));
   	}
     int localWidgetSizeCounter = -1;
     public boolean isWidgetSizeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetSizeCounter != sharedCounter;
         localWidgetSizeCounter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_SIZE_LEN = 1;
	/**
	 * 	serialize this WidgetSize
	 */
   protected void serializeWidgetSize(char[] widgetSize) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetSize,0,getStringValue(),beginWidgetSize,WIDGET_SIZE_LEN);
       localWidgetSizeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetSizeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWidgetSize is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetSize() {	 
   		return (substring(getStringValue(),beginWidgetSize,beginWidgetSize + WIDGET_SIZE_LEN));
   	}
        int localWidgetPriceCounter = -1;
        public boolean isWidgetPriceModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWidgetPriceCounter != sharedCounter;
           localWidgetPriceCounter = sharedCounter; return hasModified; 
        }
	    public boolean widgetPriceIsNumeric() {
	      return decimalIsNumeric(beginWidgetPrice,WIDGET_PRICE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] widgetPriceString() {
            return getPackedString(beginWidgetPrice,WIDGET_PRICE_LEN);
         }
   protected static final int WIDGET_PRICE_LEN = 4;
   protected static final int WIDGET_PRICE_SCALE = 2;
  	/**
	 * 	serializeWidgetPrice
	 */
	protected void serializeWidgetPrice(BigDecimal widgetPrice) {
		   putDecimal(beginWidgetPrice,widgetPrice,WIDGET_PRICE_LEN,WIDGET_PRICE_SCALE,true);
		 localWidgetPriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWidgetPriceMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,7/*precision*/);
   }
     /**
	 *	refreshWidgetPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWidgetPrice() throws CFException {	
   	try { 
		 return (getDecimal(beginWidgetPrice,WIDGET_PRICE_LEN,WIDGET_PRICE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("widgetPrice", beginWidgetPrice,WIDGET_PRICE_LEN);
     }
   	}
     int localWidgetSupplierCounter = -1;
     public boolean isWidgetSupplierModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetSupplierCounter != sharedCounter;
         localWidgetSupplierCounter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_SUPPLIER_LEN = 8;
	/**
	 * 	serialize this WidgetSupplier
	 */
   protected void serializeWidgetSupplier(char[] widgetSupplier) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetSupplier,0,getStringValue(),beginWidgetSupplier,WIDGET_SUPPLIER_LEN);
       localWidgetSupplierCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetSupplierConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWidgetSupplier is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetSupplier() {	 
   		return (substring(getStringValue(),beginWidgetSupplier,beginWidgetSupplier + WIDGET_SUPPLIER_LEN));
   	}
     int localWidgetDescCounter = -1;
     public boolean isWidgetDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetDescCounter != sharedCounter;
         localWidgetDescCounter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_DESC_LEN = 20;
	/**
	 * 	serialize this WidgetDesc
	 */
   protected void serializeWidgetDesc(char[] widgetDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetDesc,0,getStringValue(),beginWidgetDesc,WIDGET_DESC_LEN);
       localWidgetDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetDescConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWidgetDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetDesc() {	 
   		return (substring(getStringValue(),beginWidgetDesc,beginWidgetDesc + WIDGET_DESC_LEN));
   	}
     int localWidgetManuPlantCounter = -1;
     public boolean isWidgetManuPlantModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetManuPlantCounter != sharedCounter;
         localWidgetManuPlantCounter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_MANU_PLANT_LEN = 8;
	/**
	 * 	serialize this WidgetManuPlant
	 */
   protected void serializeWidgetManuPlant(char[] widgetManuPlant) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetManuPlant,0,getStringValue(),beginWidgetManuPlant,WIDGET_MANU_PLANT_LEN);
       localWidgetManuPlantCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetManuPlantConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWidgetManuPlant is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetManuPlant() {	 
   		return (substring(getStringValue(),beginWidgetManuPlant,beginWidgetManuPlant + WIDGET_MANU_PLANT_LEN));
   	}
        int localWidgetManuCostCounter = -1;
        public boolean isWidgetManuCostModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWidgetManuCostCounter != sharedCounter;
           localWidgetManuCostCounter = sharedCounter; return hasModified; 
        }
	    public boolean widgetManuCostIsNumeric() {
	      return decimalIsNumeric(beginWidgetManuCost,WIDGET_MANU_COST_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] widgetManuCostString() {
            return getPackedString(beginWidgetManuCost,WIDGET_MANU_COST_LEN);
         }
   protected static final int WIDGET_MANU_COST_LEN = 4;
   protected static final int WIDGET_MANU_COST_SCALE = 2;
  	/**
	 * 	serializeWidgetManuCost
	 */
	protected void serializeWidgetManuCost(BigDecimal widgetManuCost) {
		   putDecimal(beginWidgetManuCost,widgetManuCost,WIDGET_MANU_COST_LEN,WIDGET_MANU_COST_SCALE,true);
		 localWidgetManuCostCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWidgetManuCostMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,7/*precision*/);
   }
     /**
	 *	refreshWidgetManuCost is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWidgetManuCost() throws CFException {	
   	try { 
		 return (getDecimal(beginWidgetManuCost,WIDGET_MANU_COST_LEN,WIDGET_MANU_COST_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("widgetManuCost", beginWidgetManuCost,WIDGET_MANU_COST_LEN);
     }
   	}
         int localWidgetLeadTimeCounter = -1;
         public boolean isWidgetLeadTimeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWidgetLeadTimeCounter != sharedCounter;
            localWidgetLeadTimeCounter = sharedCounter; return hasModified; 
         }
   protected static final int WIDGET_LEAD_TIME_LEN = 2;
  	/**
	 * serializeWidgetLeadTime
	 */
	protected void serializeWidgetLeadTime(short widgetLeadTime) {
           replaceValue( //  save the value as string
                   getBinaryString( widgetLeadTime,WIDGET_LEAD_TIME_LEN)
                  ,beginWidgetLeadTime
                  ,WIDGET_LEAD_TIME_LEN
                 );
            localWidgetLeadTimeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkWidgetLeadTimeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWidgetLeadTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshWidgetLeadTime() {	 
			return (getShort(beginWidgetLeadTime));
   	}




}
  
