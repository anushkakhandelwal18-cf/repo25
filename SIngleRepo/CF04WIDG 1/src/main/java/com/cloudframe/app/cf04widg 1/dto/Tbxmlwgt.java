package com.cloudframe.app.cf04widg 1.dto;

/**
*  The class Tbxmlwgt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-14 at 17:20. using version 5.0.0.153
**/


import com.cloudframe.app.cf04widg 1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class Tbxmlwgt extends TbxmlwgtSerialized {
   

						private char[] widgetNum = Field.fillLowValue(8);

						private char[] widgetColor = Field.fillLowValue(6);

						private char[] widgetSize = Field.fillLowValue(1);

								private BigDecimal widgetPrice = BigDecimal.ZERO;

						private char[] widgetSupplier = Field.fillLowValue(8);

						private char[] widgetDesc = Field.fillLowValue(20);

						private char[] widgetManuPlant = Field.fillLowValue(8);

								private BigDecimal widgetManuCost = BigDecimal.ZERO;

								private short widgetLeadTime;
	
	/**
	* Constructor for Tbxmlwgt
	**/
    public Tbxmlwgt() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of widgetNum
	 *	@return widgetNum
	 */
   public char[] getWidgetNum() throws CFException{
     if (isWidgetNumModified()) { 
        widgetNum = refreshWidgetNum();
     }
   		return widgetNum;
   }

  
	/**
	*  set variable widgetNum
	*  Corresponding COBOL Variable is WIDGET-NUM
	*  @param value
	**/
   public void setWidgetNum(char[] value) {
      widgetNum = checkWidgetNumConstraints(value);
      serializeWidgetNum(widgetNum);
   } 

     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetNum,widgetNum.length);
   	
   }
   
   public void setWidgetNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetNum,widgetNum.length);
   	
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetNum with another Field
	 *	@param value
	 */
   public void setWidgetNum(Field source) {
       replace(source,0,source.length(),beginWidgetNum,WIDGET_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetNum,WIDGET_NUM_LEN);
   	
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of widgetColor
	 *	@return widgetColor
	 */
   public char[] getWidgetColor() throws CFException{
     if (isWidgetColorModified()) { 
        widgetColor = refreshWidgetColor();
     }
   		return widgetColor;
   }

  
	/**
	*  set variable widgetColor
	*  Corresponding COBOL Variable is WIDGET-COLOR
	*  @param value
	**/
   public void setWidgetColor(char[] value) {
      widgetColor = checkWidgetColorConstraints(value);
      serializeWidgetColor(widgetColor);
   } 

     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetColor,widgetColor.length);
   	
   }
   
   public void setWidgetColor(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetColor,widgetColor.length);
   	
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetColor+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetColor with another Field
	 *	@param value
	 */
   public void setWidgetColor(Field source) {
       replace(source,0,source.length(),beginWidgetColor,WIDGET_COLOR_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetColor,WIDGET_COLOR_LEN);
   	
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetColor+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of widgetSize
	 *	@return widgetSize
	 */
   public char[] getWidgetSize() throws CFException{
     if (isWidgetSizeModified()) { 
        widgetSize = refreshWidgetSize();
     }
   		return widgetSize;
   }

  
	/**
	*  set variable widgetSize
	*  Corresponding COBOL Variable is WIDGET-SIZE
	*  @param value
	**/
   public void setWidgetSize(char[] value) {
      widgetSize = checkWidgetSizeConstraints(value);
      serializeWidgetSize(widgetSize);
   } 

     /**
	 * 	Update WidgetSize 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetSize(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetSize,widgetSize.length);
   	
   }
   
   public void setWidgetSize(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetSize,widgetSize.length);
   	
   }
   
     /**
	 * 	Update WidgetSize 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSize(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetSize+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetSize with another Field
	 *	@param value
	 */
   public void setWidgetSize(Field source) {
       replace(source,0,source.length(),beginWidgetSize,WIDGET_SIZE_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetSize 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetSize(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetSize,WIDGET_SIZE_LEN);
   	
   }
   
     /**
	 * 	Update WidgetSize 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSize(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetSize+targetIndex,targetLen);
    
   }
	public BigDecimal getWidgetPrice() throws CFException {
        if (isWidgetPriceModified()) { 
           widgetPrice = refreshWidgetPrice();
        }
   		return widgetPrice;
	}

    public char[] getWidgetPriceString() {
          return  widgetPriceString();
    }
	
	/**
	 * 	Update WidgetPrice with the passed number
	 *  Corresponding COBOL Variable is WIDGET-PRICE
	 *	@param number
	 */
	public void setWidgetPrice(BigDecimal number) {	
     widgetPrice = checkWidgetPriceMaxLimit(number);
	    serializeWidgetPrice(widgetPrice);
   }
	/**
	 *	Returns the value of widgetSupplier
	 *	@return widgetSupplier
	 */
   public char[] getWidgetSupplier() throws CFException{
     if (isWidgetSupplierModified()) { 
        widgetSupplier = refreshWidgetSupplier();
     }
   		return widgetSupplier;
   }

  
	/**
	*  set variable widgetSupplier
	*  Corresponding COBOL Variable is WIDGET-SUPPLIER
	*  @param value
	**/
   public void setWidgetSupplier(char[] value) {
      widgetSupplier = checkWidgetSupplierConstraints(value);
      serializeWidgetSupplier(widgetSupplier);
   } 

     /**
	 * 	Update WidgetSupplier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetSupplier(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetSupplier,widgetSupplier.length);
   	
   }
   
   public void setWidgetSupplier(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetSupplier,widgetSupplier.length);
   	
   }
   
     /**
	 * 	Update WidgetSupplier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSupplier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetSupplier+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetSupplier with another Field
	 *	@param value
	 */
   public void setWidgetSupplier(Field source) {
       replace(source,0,source.length(),beginWidgetSupplier,WIDGET_SUPPLIER_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetSupplier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetSupplier(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetSupplier,WIDGET_SUPPLIER_LEN);
   	
   }
   
     /**
	 * 	Update WidgetSupplier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSupplier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetSupplier+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of widgetDesc
	 *	@return widgetDesc
	 */
   public char[] getWidgetDesc() throws CFException{
     if (isWidgetDescModified()) { 
        widgetDesc = refreshWidgetDesc();
     }
   		return widgetDesc;
   }

  
	/**
	*  set variable widgetDesc
	*  Corresponding COBOL Variable is WIDGET-DESC
	*  @param value
	**/
   public void setWidgetDesc(char[] value) {
      widgetDesc = checkWidgetDescConstraints(value);
      serializeWidgetDesc(widgetDesc);
   } 

     /**
	 * 	Update WidgetDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetDesc,widgetDesc.length);
   	
   }
   
   public void setWidgetDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetDesc,widgetDesc.length);
   	
   }
   
     /**
	 * 	Update WidgetDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetDesc with another Field
	 *	@param value
	 */
   public void setWidgetDesc(Field source) {
       replace(source,0,source.length(),beginWidgetDesc,WIDGET_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetDesc,WIDGET_DESC_LEN);
   	
   }
   
     /**
	 * 	Update WidgetDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetDesc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of widgetManuPlant
	 *	@return widgetManuPlant
	 */
   public char[] getWidgetManuPlant() throws CFException{
     if (isWidgetManuPlantModified()) { 
        widgetManuPlant = refreshWidgetManuPlant();
     }
   		return widgetManuPlant;
   }

  
	/**
	*  set variable widgetManuPlant
	*  Corresponding COBOL Variable is WIDGET-MANU-PLANT
	*  @param value
	**/
   public void setWidgetManuPlant(char[] value) {
      widgetManuPlant = checkWidgetManuPlantConstraints(value);
      serializeWidgetManuPlant(widgetManuPlant);
   } 

     /**
	 * 	Update WidgetManuPlant 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetManuPlant(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetManuPlant,widgetManuPlant.length);
   	
   }
   
   public void setWidgetManuPlant(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetManuPlant,widgetManuPlant.length);
   	
   }
   
     /**
	 * 	Update WidgetManuPlant 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetManuPlant(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetManuPlant+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetManuPlant with another Field
	 *	@param value
	 */
   public void setWidgetManuPlant(Field source) {
       replace(source,0,source.length(),beginWidgetManuPlant,WIDGET_MANU_PLANT_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetManuPlant 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetManuPlant(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetManuPlant,WIDGET_MANU_PLANT_LEN);
   	
   }
   
     /**
	 * 	Update WidgetManuPlant 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetManuPlant(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetManuPlant+targetIndex,targetLen);
    
   }
	public BigDecimal getWidgetManuCost() throws CFException {
        if (isWidgetManuCostModified()) { 
           widgetManuCost = refreshWidgetManuCost();
        }
   		return widgetManuCost;
	}

    public char[] getWidgetManuCostString() {
          return  widgetManuCostString();
    }
	
	/**
	 * 	Update WidgetManuCost with the passed number
	 *  Corresponding COBOL Variable is WIDGET-MANU-COST
	 *	@param number
	 */
	public void setWidgetManuCost(BigDecimal number) {	
     widgetManuCost = checkWidgetManuCostMaxLimit(number);
	    serializeWidgetManuCost(widgetManuCost);
   }
	/**
	 *	Returns the value of widgetLeadTime
	 *	@return widgetLeadTime
	 */
	public short getWidgetLeadTime() throws CFException {
        if (isWidgetLeadTimeModified()) { 
           widgetLeadTime = refreshWidgetLeadTime();
        }
   		return widgetLeadTime;
	}
	
	/**
	 * 	Update WidgetLeadTime with the passed value
	 *  Corresponding COBOL Variable is WIDGET-LEAD-TIME
	 *	@param number
	 */
	public void setWidgetLeadTime(short number) {
	     // Truncate if the number is beyond +/- Max range
	    widgetLeadTime = checkWidgetLeadTimeMaxLimit(number); 
		serializeWidgetLeadTime(widgetLeadTime);
	}

	public void setWidgetLeadTime(int number) {
	    number = checkWidgetLeadTimeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWidgetLeadTime((short)number);
	}
	public void setWidgetLeadTime(long number) {
	    number = checkWidgetLeadTimeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWidgetLeadTime((short)number);
	}
	


	
	
	

		public static int getTbxmlwgtFieldLength() {
			return TBXMLWGT_LENGTH;
		}

}
  
