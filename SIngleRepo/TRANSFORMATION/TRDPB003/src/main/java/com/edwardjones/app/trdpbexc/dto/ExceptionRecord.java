package com.edwardjones.app.trdpbexc.dto;

/**
*  The class ExceptionRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:19. using version 5.0.0.158
**/


import com.edwardjones.app.trdpbexc.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ExceptionRecord extends ExceptionRecordSerialized { 
   

						private char[] exceptionType = Field.fillLowValue(20);

						private char[] exceptionDesc = Field.fillLowValue(1000);
	
	/**
	* Constructor for ExceptionRecord
	**/
    public ExceptionRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of exceptionType
	 *	@return exceptionType
	 */
   public char[] getExceptionType() throws CFException{
     if (isExceptionTypeModified()) { 
        exceptionType = refreshExceptionType();
     }
   		return exceptionType;
   }

  
	/**
	*  set variable exceptionType
	*  Corresponding COBOL Variable is EXCEPTION-TYPE
	*  @param value
	**/
   public void setExceptionType(char[] value) {
      exceptionType = checkExceptionTypeConstraints(value);
      serializeExceptionType(exceptionType);
   } 

     /**
	 * 	Update ExceptionType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExceptionType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExceptionType,exceptionType.length);
   	
   }
   
   public void setExceptionType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExceptionType,exceptionType.length);
   	
   }
   
     /**
	 * 	Update ExceptionType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExceptionType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExceptionType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExceptionType with another Field
	 *	@param value
	 */
   public void setExceptionType(Field source) {
       replace(source,0,source.length(),beginExceptionType,EXCEPTION_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update ExceptionType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExceptionType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExceptionType,EXCEPTION_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update ExceptionType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExceptionType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExceptionType+targetIndex,targetLen);
    
   }
	char[] exceptionSystem88Value = "SYSTEM              ".toCharArray();
	/**
	 *	Test condition "SYSTEM" for isExceptionSystem()
	 *	@return  Returns true if isExceptionSystem() is "SYSTEM"
	 */
   public boolean isExceptionSystem() throws CFException {
      return (  compareChars( getExceptionType() , exceptionSystem88Value)  == 0  );
   }


	/**
	*  set values "SYSTEM"
	*/
   	public void setExceptionSystemTrue() {  			
    	setExceptionType( exceptionSystem88Value);
   	}
	char[] exceptionApplication88Value = "APPLICATION         ".toCharArray();
	/**
	 *	Test condition "APPLICATION" for isExceptionApplication()
	 *	@return  Returns true if isExceptionApplication() is "APPLICATION"
	 */
   public boolean isExceptionApplication() throws CFException {
      return (  compareChars( getExceptionType() , exceptionApplication88Value)  == 0  );
   }


	/**
	*  set values "APPLICATION"
	*/
   	public void setExceptionApplicationTrue() {  			
    	setExceptionType( exceptionApplication88Value);
   	}
	char[] exceptionData88Value = "DATA                ".toCharArray();
	/**
	 *	Test condition "DATA" for isExceptionData()
	 *	@return  Returns true if isExceptionData() is "DATA"
	 */
   public boolean isExceptionData() throws CFException {
      return (  compareChars( getExceptionType() , exceptionData88Value)  == 0  );
   }


	/**
	*  set values "DATA"
	*/
   	public void setExceptionDataTrue() {  			
    	setExceptionType( exceptionData88Value);
   	}
	/**
	 *	Returns the value of exceptionDesc
	 *	@return exceptionDesc
	 */
   public char[] getExceptionDesc() throws CFException{
     if (isExceptionDescModified()) { 
        exceptionDesc = refreshExceptionDesc();
     }
   		return exceptionDesc;
   }

  
	/**
	*  set variable exceptionDesc
	*  Corresponding COBOL Variable is EXCEPTION-DESC
	*  @param value
	**/
   public void setExceptionDesc(char[] value) {
      exceptionDesc = checkExceptionDescConstraints(value);
      serializeExceptionDesc(exceptionDesc);
   } 

     /**
	 * 	Update ExceptionDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExceptionDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExceptionDesc,exceptionDesc.length);
   	
   }
   
   public void setExceptionDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExceptionDesc,exceptionDesc.length);
   	
   }
   
     /**
	 * 	Update ExceptionDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExceptionDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExceptionDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExceptionDesc with another Field
	 *	@param value
	 */
   public void setExceptionDesc(Field source) {
       replace(source,0,source.length(),beginExceptionDesc,EXCEPTION_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update ExceptionDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExceptionDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExceptionDesc,EXCEPTION_DESC_LEN);
   	
   }
   
     /**
	 * 	Update ExceptionDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExceptionDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExceptionDesc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getExceptionRecordFieldLength() {
			return EXCEPTION_RECORD_LENGTH;
		}

}
  
