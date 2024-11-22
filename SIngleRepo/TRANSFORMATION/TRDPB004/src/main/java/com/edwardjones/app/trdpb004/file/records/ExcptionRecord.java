package com.edwardjones.app.trdpb004.file.records;

/**
*  The class ExcptionRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:10. using version 5.0.0.158
**/


import com.edwardjones.app.trdpb004.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ExcptionRecord extends ExcptionRecordSerialized { 
   

						private char[] excptionRecordString = Field.fillLowValue(1100);
	
	/**
	* Constructor for ExcptionRecord
	**/
    public ExcptionRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of excptionRecordString
	 *	@return excptionRecordString
	 */
   public char[] getExcptionRecordString() throws CFException{
     if (isExcptionRecordStringModified()) { 
        excptionRecordString = refreshExcptionRecordString();
     }
   		return excptionRecordString;
   }

  
	/**
	*  set variable excptionRecordString
	*  Corresponding COBOL Variable is EXCPTION-RECORD-STRING
	*  @param value
	**/
   public void setExcptionRecordString(char[] value) {
      excptionRecordString = checkExcptionRecordStringConstraints(value);
      serializeExcptionRecordString(excptionRecordString);
   } 

     /**
	 * 	Update ExcptionRecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExcptionRecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExcptionRecordString,excptionRecordString.length);
   	
   }
   
   public void setExcptionRecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExcptionRecordString,excptionRecordString.length);
   	
   }
   
     /**
	 * 	Update ExcptionRecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExcptionRecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExcptionRecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExcptionRecordString with another Field
	 *	@param value
	 */
   public void setExcptionRecordString(Field source) {
       replace(source,0,source.length(),beginExcptionRecordString,EXCPTION_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update ExcptionRecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExcptionRecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExcptionRecordString,EXCPTION_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update ExcptionRecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExcptionRecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExcptionRecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getExcptionRecordFieldLength() {
			return EXCPTION_RECORD_LENGTH;
		}

}
  
