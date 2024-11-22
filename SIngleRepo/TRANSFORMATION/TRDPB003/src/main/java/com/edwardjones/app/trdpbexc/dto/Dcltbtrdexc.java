package com.edwardjones.app.trdpbexc.dto;

/**
*  The class Dcltbtrdexc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:19. using version 5.0.0.158
**/


import com.edwardjones.app.trdpbexc.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dcltbtrdexc extends DcltbtrdexcSerialized { 
   

						private char[] excType = Field.fillLowValue(20);
				private ExcDescription excDescription = new ExcDescription();
	
	/**
	* Constructor for Dcltbtrdexc
	**/
    public Dcltbtrdexc() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			excDescription.setParent(this,getStartOffset() + 24);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of excType
	 *	@return excType
	 */
   public char[] getExcType() throws CFException{
     if (isExcTypeModified()) { 
        excType = refreshExcType();
     }
   		return excType;
   }

  
	/**
	*  set variable excType
	*  Corresponding COBOL Variable is EXC-TYPE
	*  @param value
	**/
   public void setExcType(char[] value) {
      excType = checkExcTypeConstraints(value);
      serializeExcType(excType);
   } 

     /**
	 * 	Update ExcType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExcType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExcType,excType.length);
   	
   }
   
   public void setExcType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExcType,excType.length);
   	
   }
   
     /**
	 * 	Update ExcType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExcType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExcType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExcType with another Field
	 *	@param value
	 */
   public void setExcType(Field source) {
       replace(source,0,source.length(),beginExcType,EXC_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update ExcType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExcType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExcType,EXC_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update ExcType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExcType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExcType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of excDescription
	 *	@return excDescription
	 */   
	 public ExcDescription getExcDescription() {
   	return excDescription;
   }
   /**
	* 	Update ExcDescription with the passed value
	*   Corresponding COBOL Variable is EXC-DESCRIPTION
	*	@param value
	*/
   public void setExcDescription(char[] value) {
      excDescription.setString(value); 
   }   
    
     /**
	 * 	Update ExcDescription 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setExcDescription(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,excDescription.begin,excDescription.length());
   }
   
     /**
	 * 	Update ExcDescription 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExcDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,excDescription.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ExcDescription with another Field
	 *	@param value
	 */
   public void setExcDescription(Field source) {
   	replace(source,0,source.length(),excDescription.begin,excDescription.length());
   }  
   
     /**
	 * 	Update ExcDescription 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setExcDescription(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,excDescription.begin,excDescription.length());
   }
   
     /**
	 * 	Update ExcDescription 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExcDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,excDescription.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDcltbtrdexcFieldLength() {
			return DCLTBTRDEXC_LENGTH;
		}

}
  
