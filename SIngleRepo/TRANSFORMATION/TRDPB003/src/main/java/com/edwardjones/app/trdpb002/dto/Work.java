package com.edwardjones.app.trdpb002.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:10. using version 5.0.0.158
**/


import com.edwardjones.app.trdpb002.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

								private char[] sqlcode_Ws = Field.fillLowValue(4);

						private char[] crDbSwtich = Field.fillLowValue(1);

						private char[] exception = Field.fillLowValue(200);

						private char[] exceptionHandler = new char[16];

						private char[] excpType = Field.fillLowValue(1);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setExceptionHandler(("TRDPBEXC        ").toCharArray());
    }


 

	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
   public char[] getSqlcode_Ws() throws CFException{
     if (isSqlcode_WsModified()) { 
        sqlcode_Ws = refreshSqlcode_Ws();
     }
   		return sqlcode_Ws;
   }

  
	/**
	*  set variable sqlcode_Ws
	*  Corresponding COBOL Variable is WS-SQLCODE
	*  @param value
	**/
   public void setSqlcode_Ws(char[] value) {
      sqlcode_Ws = checkSqlcode_WsConstraints(value);
      serializeSqlcode_Ws(sqlcode_Ws);
   } 

     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlcode_Ws,sqlcode_Ws.length);
   	
   }
   
   public void setSqlcode_Ws(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcode_Ws,sqlcode_Ws.length);
   	
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcode_Ws+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlcode_Ws with another Field
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source) {
       replace(source,0,source.length(),beginSqlcode_Ws,SQLCODE__WS_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlcode_Ws,SQLCODE__WS_LEN);
   	
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcode_Ws+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of crDbSwtich
	 *	@return crDbSwtich
	 */
   public char[] getCrDbSwtich() throws CFException{
   		return crDbSwtich;
   }

  
	/**
	*  set variable crDbSwtich
	*  Corresponding COBOL Variable is WS-CR-DB-SWTICH
	*  @param value
	**/
   public void setCrDbSwtich(char[] value) {
       value = checkCrDbSwtichConstraints(value);
       arraycopy(value,0,crDbSwtich,0,value.length);
   } 
	public void setCrDbSwtich(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,crDbSwtich,0,beginIndex + endIndex);
   }
	char[] debitSeller88Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isDebitSeller()
	 *	@return  Returns true if isDebitSeller() is "D"
	 */
   public boolean isDebitSeller() throws CFException {
      return (  compareChars( getCrDbSwtich() , debitSeller88Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setDebitSellerTrue() {  			
    	setCrDbSwtich( debitSeller88Value);
   	}
	char[] creditBuyer88Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isCreditBuyer()
	 *	@return  Returns true if isCreditBuyer() is "C"
	 */
   public boolean isCreditBuyer() throws CFException {
      return (  compareChars( getCrDbSwtich() , creditBuyer88Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setCreditBuyerTrue() {  			
    	setCrDbSwtich( creditBuyer88Value);
   	}
	/**
	 *	Returns the value of exception
	 *	@return exception
	 */
   public char[] getException() throws CFException{
   		return exception;
   }

  
	/**
	*  set variable exception
	*  Corresponding COBOL Variable is WS-EXCEPTION
	*  @param value
	**/
   public void setException(char[] value) {
       value = checkExceptionConstraints(value);
       arraycopy(value,0,exception,0,value.length);
   } 
	public void setException(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,exception,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of exceptionHandler
	 *	@return exceptionHandler
	 */
   public char[] getExceptionHandler() throws CFException{
   		return exceptionHandler;
   }

  
	/**
	*  set variable exceptionHandler
	*  Corresponding COBOL Variable is WS-EXCEPTION-HANDLER
	*  @param value
	**/
   public void setExceptionHandler(char[] value) {
       value = checkExceptionHandlerConstraints(value);
       arraycopy(value,0,exceptionHandler,0,value.length);
   } 
	public void setExceptionHandler(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,exceptionHandler,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of excpType
	 *	@return excpType
	 */
   public char[] getExcpType() throws CFException{
   		return excpType;
   }

  
	/**
	*  set variable excpType
	*  Corresponding COBOL Variable is WS-EXCP-TYPE
	*  @param value
	**/
   public void setExcpType(char[] value) {
       value = checkExcpTypeConstraints(value);
       arraycopy(value,0,excpType,0,value.length);
   } 
	public void setExcpType(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,excpType,0,beginIndex + endIndex);
   }
	char[] noExceptions88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNoExceptions()
	 *	@return  Returns true if isNoExceptions() is "N"
	 */
   public boolean isNoExceptions() throws CFException {
      return (  compareChars( getExcpType() , noExceptions88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNoExceptionsTrue() {  			
    	setExcpType( noExceptions88Value);
   	}
	char[] systemException88Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isSystemException()
	 *	@return  Returns true if isSystemException() is "S"
	 */
   public boolean isSystemException() throws CFException {
      return (  compareChars( getExcpType() , systemException88Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setSystemExceptionTrue() {  			
    	setExcpType( systemException88Value);
   	}
	char[] applException88Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isApplException()
	 *	@return  Returns true if isApplException() is "A"
	 */
   public boolean isApplException() throws CFException {
      return (  compareChars( getExcpType() , applException88Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setApplExceptionTrue() {  			
    	setExcpType( applException88Value);
   	}
	char[] dataException88Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isDataException()
	 *	@return  Returns true if isDataException() is "D"
	 */
   public boolean isDataException() throws CFException {
      return (  compareChars( getExcpType() , dataException88Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setDataExceptionTrue() {  			
    	setExcpType( dataException88Value);
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
