package com.edwardjones.app.trdpb004.dto;

/**
*  The class ExcDescription is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 13:17. using version 5.0.0.153
**/


import com.edwardjones.app.trdpb004.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ExcDescription extends ExcDescriptionSerialized { 
   

								private short excDescriptionLen;

						private char[] excDescriptionText = Field.fillLowValue(1000);
	
	/**
	* Constructor for ExcDescription
	**/
    public ExcDescription() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ExcDescription. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExcDescription(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of excDescriptionLen
	 *	@return excDescriptionLen
	 */
	public short getExcDescriptionLen() throws CFException {
        if (isExcDescriptionLenModified()) { 
           excDescriptionLen = refreshExcDescriptionLen();
        }
   		return excDescriptionLen;
	}
	
	/**
	 * 	Update ExcDescriptionLen with the passed value
	 *  Corresponding COBOL Variable is EXC-DESCRIPTION-LEN
	 *	@param number
	 */
	public void setExcDescriptionLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    excDescriptionLen = checkExcDescriptionLenMaxLimit(number); 
		serializeExcDescriptionLen(excDescriptionLen);
	}

	public void setExcDescriptionLen(int number) {
	    number = checkExcDescriptionLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setExcDescriptionLen((short)number);
	}
	public void setExcDescriptionLen(long number) {
	    number = checkExcDescriptionLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setExcDescriptionLen((short)number);
	}
	

	/**
	 *	Returns the value of excDescriptionText
	 *	@return excDescriptionText
	 */
   public char[] getExcDescriptionText() throws CFException{
     if (isExcDescriptionTextModified()) { 
        excDescriptionText = refreshExcDescriptionText();
     }
   		return excDescriptionText;
   }

  
	/**
	*  set variable excDescriptionText
	*  Corresponding COBOL Variable is EXC-DESCRIPTION-TEXT
	*  @param value
	**/
   public void setExcDescriptionText(char[] value) {
      excDescriptionText = checkExcDescriptionTextConstraints(value);
      serializeExcDescriptionText(excDescriptionText);
   } 

     /**
	 * 	Update ExcDescriptionText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExcDescriptionText(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExcDescriptionText,excDescriptionText.length);
   	
   }
   
   public void setExcDescriptionText(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExcDescriptionText,excDescriptionText.length);
   	
   }
   
     /**
	 * 	Update ExcDescriptionText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExcDescriptionText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExcDescriptionText+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExcDescriptionText with another Field
	 *	@param value
	 */
   public void setExcDescriptionText(Field source) {
       replace(source,0,source.length(),beginExcDescriptionText,EXC_DESCRIPTION_TEXT_LEN);
   	
   }  
   
     /**
	 * 	Update ExcDescriptionText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExcDescriptionText(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExcDescriptionText,EXC_DESCRIPTION_TEXT_LEN);
   	
   }
   
     /**
	 * 	Update ExcDescriptionText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExcDescriptionText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExcDescriptionText+targetIndex,targetLen);
    
   }

	
	
	

		public static int getExcDescriptionFieldLength() {
			return EXC_DESCRIPTION_LENGTH;
		}

}
  
