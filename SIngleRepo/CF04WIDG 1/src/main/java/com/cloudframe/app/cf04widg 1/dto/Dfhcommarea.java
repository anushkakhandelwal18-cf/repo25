package com.cloudframe.app.cf04widg 1.dto;

/**
*  The class Dfhcommarea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-14 at 17:20. using version 5.0.0.153
**/


import com.cloudframe.app.cf04widg 1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dfhcommarea extends DfhcommareaSerialized {
   

						private char[] widgetNum01 = Field.fillLowValue(8);

						private char[] widgetColor01 = Field.fillLowValue(6);

						private char[] widgetSize01 = Field.fillLowValue(1);

								private char[] widgetPrice01 = Field.fillLowValue(8);

						private char[] widgetSupplier01 = Field.fillLowValue(8);

						private char[] widgetDesc01 = Field.fillLowValue(20);

						private char[] widgetManuPlant01 = Field.fillLowValue(8);

								private char[] widgetManuCost01 = Field.fillLowValue(8);

								private char[] widgetLeadTime01 = Field.fillLowValue(4);

						private char[] widgetErrorMsg = Field.fillLowValue(50);
	
	/**
	* Constructor for Dfhcommarea
	**/
    public Dfhcommarea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of widgetNum01
	 *	@return widgetNum01
	 */
   public char[] getWidgetNum01() throws CFException{
     if (isWidgetNum01Modified()) { 
        widgetNum01 = refreshWidgetNum01();
     }
   		return widgetNum01;
   }

  
	/**
	*  set variable widgetNum01
	*  Corresponding COBOL Variable is LK-WIDGET-NUM
	*  @param value
	**/
   public void setWidgetNum01(char[] value) {
      widgetNum01 = checkWidgetNum01Constraints(value);
      serializeWidgetNum01(widgetNum01);
   } 

     /**
	 * 	Update WidgetNum01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetNum01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetNum01,widgetNum01.length);
   	
   }
   
   public void setWidgetNum01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetNum01,widgetNum01.length);
   	
   }
   
     /**
	 * 	Update WidgetNum01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetNum01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetNum01 with another Field
	 *	@param value
	 */
   public void setWidgetNum01(Field source) {
       replace(source,0,source.length(),beginWidgetNum01,WIDGET_NUM_01_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetNum01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetNum01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetNum01,WIDGET_NUM_01_LEN);
   	
   }
   
     /**
	 * 	Update WidgetNum01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetNum01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of widgetColor01
	 *	@return widgetColor01
	 */
   public char[] getWidgetColor01() throws CFException{
     if (isWidgetColor01Modified()) { 
        widgetColor01 = refreshWidgetColor01();
     }
   		return widgetColor01;
   }

  
	/**
	*  set variable widgetColor01
	*  Corresponding COBOL Variable is LK-WIDGET-COLOR
	*  @param value
	**/
   public void setWidgetColor01(char[] value) {
      widgetColor01 = checkWidgetColor01Constraints(value);
      serializeWidgetColor01(widgetColor01);
   } 

     /**
	 * 	Update WidgetColor01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetColor01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetColor01,widgetColor01.length);
   	
   }
   
   public void setWidgetColor01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetColor01,widgetColor01.length);
   	
   }
   
     /**
	 * 	Update WidgetColor01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetColor01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetColor01 with another Field
	 *	@param value
	 */
   public void setWidgetColor01(Field source) {
       replace(source,0,source.length(),beginWidgetColor01,WIDGET_COLOR_01_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetColor01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetColor01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetColor01,WIDGET_COLOR_01_LEN);
   	
   }
   
     /**
	 * 	Update WidgetColor01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetColor01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of widgetSize01
	 *	@return widgetSize01
	 */
   public char[] getWidgetSize01() throws CFException{
     if (isWidgetSize01Modified()) { 
        widgetSize01 = refreshWidgetSize01();
     }
   		return widgetSize01;
   }

  
	/**
	*  set variable widgetSize01
	*  Corresponding COBOL Variable is LK-WIDGET-SIZE
	*  @param value
	**/
   public void setWidgetSize01(char[] value) {
      widgetSize01 = checkWidgetSize01Constraints(value);
      serializeWidgetSize01(widgetSize01);
   } 

     /**
	 * 	Update WidgetSize01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetSize01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetSize01,widgetSize01.length);
   	
   }
   
   public void setWidgetSize01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetSize01,widgetSize01.length);
   	
   }
   
     /**
	 * 	Update WidgetSize01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSize01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetSize01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetSize01 with another Field
	 *	@param value
	 */
   public void setWidgetSize01(Field source) {
       replace(source,0,source.length(),beginWidgetSize01,WIDGET_SIZE_01_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetSize01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetSize01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetSize01,WIDGET_SIZE_01_LEN);
   	
   }
   
     /**
	 * 	Update WidgetSize01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSize01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetSize01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of widgetPrice01
	 *	@return widgetPrice01
	 */
   public char[] getWidgetPrice01() throws CFException{
     if (isWidgetPrice01Modified()) { 
        widgetPrice01 = refreshWidgetPrice01();
     }
   		return widgetPrice01;
   }

  
	/**
	*  set variable widgetPrice01
	*  Corresponding COBOL Variable is LK-WIDGET-PRICE
	*  @param value
	**/
   public void setWidgetPrice01(char[] value) {
      widgetPrice01 = checkWidgetPrice01Constraints(value);
      serializeWidgetPrice01(widgetPrice01);
   } 

     /**
	 * 	Update WidgetPrice01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetPrice01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetPrice01,widgetPrice01.length);
   	
   }
   
   public void setWidgetPrice01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetPrice01,widgetPrice01.length);
   	
   }
   
     /**
	 * 	Update WidgetPrice01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetPrice01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetPrice01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetPrice01 with another Field
	 *	@param value
	 */
   public void setWidgetPrice01(Field source) {
       replace(source,0,source.length(),beginWidgetPrice01,WIDGET_PRICE_01_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetPrice01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetPrice01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetPrice01,WIDGET_PRICE_01_LEN);
   	
   }
   
     /**
	 * 	Update WidgetPrice01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetPrice01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetPrice01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of widgetSupplier01
	 *	@return widgetSupplier01
	 */
   public char[] getWidgetSupplier01() throws CFException{
     if (isWidgetSupplier01Modified()) { 
        widgetSupplier01 = refreshWidgetSupplier01();
     }
   		return widgetSupplier01;
   }

  
	/**
	*  set variable widgetSupplier01
	*  Corresponding COBOL Variable is LK-WIDGET-SUPPLIER
	*  @param value
	**/
   public void setWidgetSupplier01(char[] value) {
      widgetSupplier01 = checkWidgetSupplier01Constraints(value);
      serializeWidgetSupplier01(widgetSupplier01);
   } 

     /**
	 * 	Update WidgetSupplier01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetSupplier01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetSupplier01,widgetSupplier01.length);
   	
   }
   
   public void setWidgetSupplier01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetSupplier01,widgetSupplier01.length);
   	
   }
   
     /**
	 * 	Update WidgetSupplier01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSupplier01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetSupplier01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetSupplier01 with another Field
	 *	@param value
	 */
   public void setWidgetSupplier01(Field source) {
       replace(source,0,source.length(),beginWidgetSupplier01,WIDGET_SUPPLIER_01_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetSupplier01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetSupplier01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetSupplier01,WIDGET_SUPPLIER_01_LEN);
   	
   }
   
     /**
	 * 	Update WidgetSupplier01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSupplier01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetSupplier01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of widgetDesc01
	 *	@return widgetDesc01
	 */
   public char[] getWidgetDesc01() throws CFException{
     if (isWidgetDesc01Modified()) { 
        widgetDesc01 = refreshWidgetDesc01();
     }
   		return widgetDesc01;
   }

  
	/**
	*  set variable widgetDesc01
	*  Corresponding COBOL Variable is LK-WIDGET-DESC
	*  @param value
	**/
   public void setWidgetDesc01(char[] value) {
      widgetDesc01 = checkWidgetDesc01Constraints(value);
      serializeWidgetDesc01(widgetDesc01);
   } 

     /**
	 * 	Update WidgetDesc01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetDesc01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetDesc01,widgetDesc01.length);
   	
   }
   
   public void setWidgetDesc01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetDesc01,widgetDesc01.length);
   	
   }
   
     /**
	 * 	Update WidgetDesc01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetDesc01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetDesc01 with another Field
	 *	@param value
	 */
   public void setWidgetDesc01(Field source) {
       replace(source,0,source.length(),beginWidgetDesc01,WIDGET_DESC_01_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetDesc01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetDesc01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetDesc01,WIDGET_DESC_01_LEN);
   	
   }
   
     /**
	 * 	Update WidgetDesc01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetDesc01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of widgetManuPlant01
	 *	@return widgetManuPlant01
	 */
   public char[] getWidgetManuPlant01() throws CFException{
     if (isWidgetManuPlant01Modified()) { 
        widgetManuPlant01 = refreshWidgetManuPlant01();
     }
   		return widgetManuPlant01;
   }

  
	/**
	*  set variable widgetManuPlant01
	*  Corresponding COBOL Variable is LK-WIDGET-MANU-PLANT
	*  @param value
	**/
   public void setWidgetManuPlant01(char[] value) {
      widgetManuPlant01 = checkWidgetManuPlant01Constraints(value);
      serializeWidgetManuPlant01(widgetManuPlant01);
   } 

     /**
	 * 	Update WidgetManuPlant01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetManuPlant01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetManuPlant01,widgetManuPlant01.length);
   	
   }
   
   public void setWidgetManuPlant01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetManuPlant01,widgetManuPlant01.length);
   	
   }
   
     /**
	 * 	Update WidgetManuPlant01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetManuPlant01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetManuPlant01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetManuPlant01 with another Field
	 *	@param value
	 */
   public void setWidgetManuPlant01(Field source) {
       replace(source,0,source.length(),beginWidgetManuPlant01,WIDGET_MANU_PLANT_01_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetManuPlant01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetManuPlant01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetManuPlant01,WIDGET_MANU_PLANT_01_LEN);
   	
   }
   
     /**
	 * 	Update WidgetManuPlant01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetManuPlant01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetManuPlant01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of widgetManuCost01
	 *	@return widgetManuCost01
	 */
   public char[] getWidgetManuCost01() throws CFException{
     if (isWidgetManuCost01Modified()) { 
        widgetManuCost01 = refreshWidgetManuCost01();
     }
   		return widgetManuCost01;
   }

  
	/**
	*  set variable widgetManuCost01
	*  Corresponding COBOL Variable is LK-WIDGET-MANU-COST
	*  @param value
	**/
   public void setWidgetManuCost01(char[] value) {
      widgetManuCost01 = checkWidgetManuCost01Constraints(value);
      serializeWidgetManuCost01(widgetManuCost01);
   } 

     /**
	 * 	Update WidgetManuCost01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetManuCost01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetManuCost01,widgetManuCost01.length);
   	
   }
   
   public void setWidgetManuCost01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetManuCost01,widgetManuCost01.length);
   	
   }
   
     /**
	 * 	Update WidgetManuCost01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetManuCost01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetManuCost01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetManuCost01 with another Field
	 *	@param value
	 */
   public void setWidgetManuCost01(Field source) {
       replace(source,0,source.length(),beginWidgetManuCost01,WIDGET_MANU_COST_01_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetManuCost01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetManuCost01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetManuCost01,WIDGET_MANU_COST_01_LEN);
   	
   }
   
     /**
	 * 	Update WidgetManuCost01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetManuCost01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetManuCost01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of widgetLeadTime01
	 *	@return widgetLeadTime01
	 */
   public char[] getWidgetLeadTime01() throws CFException{
     if (isWidgetLeadTime01Modified()) { 
        widgetLeadTime01 = refreshWidgetLeadTime01();
     }
   		return widgetLeadTime01;
   }

  
	/**
	*  set variable widgetLeadTime01
	*  Corresponding COBOL Variable is LK-WIDGET-LEAD-TIME
	*  @param value
	**/
   public void setWidgetLeadTime01(char[] value) {
      widgetLeadTime01 = checkWidgetLeadTime01Constraints(value);
      serializeWidgetLeadTime01(widgetLeadTime01);
   } 

     /**
	 * 	Update WidgetLeadTime01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetLeadTime01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetLeadTime01,widgetLeadTime01.length);
   	
   }
   
   public void setWidgetLeadTime01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetLeadTime01,widgetLeadTime01.length);
   	
   }
   
     /**
	 * 	Update WidgetLeadTime01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetLeadTime01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetLeadTime01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetLeadTime01 with another Field
	 *	@param value
	 */
   public void setWidgetLeadTime01(Field source) {
       replace(source,0,source.length(),beginWidgetLeadTime01,WIDGET_LEAD_TIME_01_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetLeadTime01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetLeadTime01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetLeadTime01,WIDGET_LEAD_TIME_01_LEN);
   	
   }
   
     /**
	 * 	Update WidgetLeadTime01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetLeadTime01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetLeadTime01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of widgetErrorMsg
	 *	@return widgetErrorMsg
	 */
   public char[] getWidgetErrorMsg() throws CFException{
     if (isWidgetErrorMsgModified()) { 
        widgetErrorMsg = refreshWidgetErrorMsg();
     }
   		return widgetErrorMsg;
   }

  
	/**
	*  set variable widgetErrorMsg
	*  Corresponding COBOL Variable is LK-WIDGET-ERROR-MSG
	*  @param value
	**/
   public void setWidgetErrorMsg(char[] value) {
      widgetErrorMsg = checkWidgetErrorMsgConstraints(value);
      serializeWidgetErrorMsg(widgetErrorMsg);
   } 

     /**
	 * 	Update WidgetErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetErrorMsg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetErrorMsg,widgetErrorMsg.length);
   	
   }
   
   public void setWidgetErrorMsg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetErrorMsg,widgetErrorMsg.length);
   	
   }
   
     /**
	 * 	Update WidgetErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetErrorMsg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetErrorMsg with another Field
	 *	@param value
	 */
   public void setWidgetErrorMsg(Field source) {
       replace(source,0,source.length(),beginWidgetErrorMsg,WIDGET_ERROR_MSG_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetErrorMsg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetErrorMsg,WIDGET_ERROR_MSG_LEN);
   	
   }
   
     /**
	 * 	Update WidgetErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetErrorMsg+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDfhcommareaFieldLength() {
			return DFHCOMMAREA_LENGTH;
		}

}
  
