package com.cloudframe.app.cf04widg 1.rest;

/**
*  The class Dfhcommarea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-14 at 17:20.
**/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;

public class Dfhcommarea { 	
   protected Logger logger = LoggerFactory.getLogger(Dfhcommarea.class);

   /*  Child Field declaration */
                  private String widgetNum01 = "";
                  private String widgetColor01 = "";
                  private String widgetSize01 = "";
                       private String widgetPrice01 = "";
                  private String widgetSupplier01 = "";
                  private String widgetDesc01 = "";
                  private String widgetManuPlant01 = "";
                       private String widgetManuCost01 = "";
                       private String widgetLeadTime01 = "";
                  private String widgetErrorMsg = "";
   /*  End of Field declaration */
	
	
   
	/**
	 *	Returns the value of widgetNum01
	 *	@return widgetNum01
	 */
   public String getWidgetNum01() {           
   		return widgetNum01;
   }

  
	/**
	*  set variable widgetNum01
	*  @param value
	**/
   public void setWidgetNum01(String value) {
	widgetNum01 = value.trim(); 
   }   
	/**
	 *	Returns the value of widgetColor01
	 *	@return widgetColor01
	 */
   public String getWidgetColor01() {           
   		return widgetColor01;
   }

  
	/**
	*  set variable widgetColor01
	*  @param value
	**/
   public void setWidgetColor01(String value) {
	widgetColor01 = value.trim(); 
   }   
	/**
	 *	Returns the value of widgetSize01
	 *	@return widgetSize01
	 */
   public String getWidgetSize01() {           
   		return widgetSize01;
   }

  
	/**
	*  set variable widgetSize01
	*  @param value
	**/
   public void setWidgetSize01(String value) {
	widgetSize01 = value.trim(); 
   }   
	/**
	 *	Returns the value of widgetPrice01
	 *	@return widgetPrice01
	 */
   public String getWidgetPrice01() {           
   		return widgetPrice01;
   }

  
	/**
	*  set variable widgetPrice01
	*  @param value
	**/
   public void setWidgetPrice01(String value) {
	widgetPrice01 = value.trim(); 
   }   
	/**
	 *	Returns the value of widgetSupplier01
	 *	@return widgetSupplier01
	 */
   public String getWidgetSupplier01() {           
   		return widgetSupplier01;
   }

  
	/**
	*  set variable widgetSupplier01
	*  @param value
	**/
   public void setWidgetSupplier01(String value) {
	widgetSupplier01 = value.trim(); 
   }   
	/**
	 *	Returns the value of widgetDesc01
	 *	@return widgetDesc01
	 */
   public String getWidgetDesc01() {           
   		return widgetDesc01;
   }

  
	/**
	*  set variable widgetDesc01
	*  @param value
	**/
   public void setWidgetDesc01(String value) {
	widgetDesc01 = value.trim(); 
   }   
	/**
	 *	Returns the value of widgetManuPlant01
	 *	@return widgetManuPlant01
	 */
   public String getWidgetManuPlant01() {           
   		return widgetManuPlant01;
   }

  
	/**
	*  set variable widgetManuPlant01
	*  @param value
	**/
   public void setWidgetManuPlant01(String value) {
	widgetManuPlant01 = value.trim(); 
   }   
	/**
	 *	Returns the value of widgetManuCost01
	 *	@return widgetManuCost01
	 */
   public String getWidgetManuCost01() {           
   		return widgetManuCost01;
   }

  
	/**
	*  set variable widgetManuCost01
	*  @param value
	**/
   public void setWidgetManuCost01(String value) {
	widgetManuCost01 = value.trim(); 
   }   
	/**
	 *	Returns the value of widgetLeadTime01
	 *	@return widgetLeadTime01
	 */
   public String getWidgetLeadTime01() {           
   		return widgetLeadTime01;
   }

  
	/**
	*  set variable widgetLeadTime01
	*  @param value
	**/
   public void setWidgetLeadTime01(String value) {
	widgetLeadTime01 = value.trim(); 
   }   
	/**
	 *	Returns the value of widgetErrorMsg
	 *	@return widgetErrorMsg
	 */
   public String getWidgetErrorMsg() {           
   		return widgetErrorMsg;
   }

  
	/**
	*  set variable widgetErrorMsg
	*  @param value
	**/
   public void setWidgetErrorMsg(String value) {
	widgetErrorMsg = value.trim(); 
   }   
 @JsonIgnore
 public void setDfhcommarea(com.cloudframe.app.cf04widg 1.dto.Dfhcommarea dfhcommarea)  throws CFException{
            if (widgetNum01 != null && !widgetNum01.isEmpty()) {
                dfhcommarea.setWidgetNum01(widgetNum01.toCharArray());
            }
            if (widgetColor01 != null && !widgetColor01.isEmpty()) {
                dfhcommarea.setWidgetColor01(widgetColor01.toCharArray());
            }
            if (widgetSize01 != null && !widgetSize01.isEmpty()) {
                dfhcommarea.setWidgetSize01(widgetSize01.toCharArray());
            }
            if (widgetPrice01 != null && !widgetPrice01.isEmpty()) {
                dfhcommarea.setWidgetPrice01(widgetPrice01.toCharArray());
            }
            if (widgetSupplier01 != null && !widgetSupplier01.isEmpty()) {
                dfhcommarea.setWidgetSupplier01(widgetSupplier01.toCharArray());
            }
            if (widgetDesc01 != null && !widgetDesc01.isEmpty()) {
                dfhcommarea.setWidgetDesc01(widgetDesc01.toCharArray());
            }
            if (widgetManuPlant01 != null && !widgetManuPlant01.isEmpty()) {
                dfhcommarea.setWidgetManuPlant01(widgetManuPlant01.toCharArray());
            }
            if (widgetManuCost01 != null && !widgetManuCost01.isEmpty()) {
                dfhcommarea.setWidgetManuCost01(widgetManuCost01.toCharArray());
            }
            if (widgetLeadTime01 != null && !widgetLeadTime01.isEmpty()) {
                dfhcommarea.setWidgetLeadTime01(widgetLeadTime01.toCharArray());
            }
            if (widgetErrorMsg != null && !widgetErrorMsg.isEmpty()) {
                dfhcommarea.setWidgetErrorMsg(widgetErrorMsg.toCharArray());
            }
 }
 
 @JsonIgnore
  public void populateFrom(com.cloudframe.app.cf04widg 1.dto.Dfhcommarea dfhcommarea)  throws CFException {
            setWidgetNum01(String.valueOf(dfhcommarea.getWidgetNum01()));
            setWidgetColor01(String.valueOf(dfhcommarea.getWidgetColor01()));
            setWidgetSize01(String.valueOf(dfhcommarea.getWidgetSize01()));
            setWidgetPrice01(String.valueOf(dfhcommarea.getWidgetPrice01()));
            setWidgetSupplier01(String.valueOf(dfhcommarea.getWidgetSupplier01()));
            setWidgetDesc01(String.valueOf(dfhcommarea.getWidgetDesc01()));
            setWidgetManuPlant01(String.valueOf(dfhcommarea.getWidgetManuPlant01()));
            setWidgetManuCost01(String.valueOf(dfhcommarea.getWidgetManuCost01()));
            setWidgetLeadTime01(String.valueOf(dfhcommarea.getWidgetLeadTime01()));
            setWidgetErrorMsg(String.valueOf(dfhcommarea.getWidgetErrorMsg()));
  }

}
  
