package com.edwardjones.app.trdpb002.dto;

/**
*  The class Sqlext is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:10. using version 5.0.0.158
**/


import com.edwardjones.app.trdpb002.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sqlext extends SqlextSerialized { 
   

						private char[] sqlwarn8 = Field.fillLowValue(1);

						private char[] sqlwarn9 = Field.fillLowValue(1);

						private char[] sqlwarna = Field.fillLowValue(1);

						private char[] sqlstate = Field.fillLowValue(5);
	
	/**
	* Constructor for Sqlext
	**/
    public Sqlext() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sqlext. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sqlext(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sqlwarn8
	 *	@return sqlwarn8
	 */
   public char[] getSqlwarn8() throws CFException{
     if (isSqlwarn8Modified()) { 
        sqlwarn8 = refreshSqlwarn8();
     }
   		return sqlwarn8;
   }

  
	/**
	*  set variable sqlwarn8
	*  Corresponding COBOL Variable is SQLWARN8
	*  @param value
	**/
   public void setSqlwarn8(char[] value) {
      sqlwarn8 = checkSqlwarn8Constraints(value);
      serializeSqlwarn8(sqlwarn8);
   } 

     /**
	 * 	Update Sqlwarn8 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn8(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlwarn8,sqlwarn8.length);
   	
   }
   
   public void setSqlwarn8(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn8,sqlwarn8.length);
   	
   }
   
     /**
	 * 	Update Sqlwarn8 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn8+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlwarn8 with another Field
	 *	@param value
	 */
   public void setSqlwarn8(Field source) {
       replace(source,0,source.length(),beginSqlwarn8,SQLWARN_8_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlwarn8 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlwarn8(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlwarn8,SQLWARN_8_LEN);
   	
   }
   
     /**
	 * 	Update Sqlwarn8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn8+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sqlwarn9
	 *	@return sqlwarn9
	 */
   public char[] getSqlwarn9() throws CFException{
     if (isSqlwarn9Modified()) { 
        sqlwarn9 = refreshSqlwarn9();
     }
   		return sqlwarn9;
   }

  
	/**
	*  set variable sqlwarn9
	*  Corresponding COBOL Variable is SQLWARN9
	*  @param value
	**/
   public void setSqlwarn9(char[] value) {
      sqlwarn9 = checkSqlwarn9Constraints(value);
      serializeSqlwarn9(sqlwarn9);
   } 

     /**
	 * 	Update Sqlwarn9 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn9(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlwarn9,sqlwarn9.length);
   	
   }
   
   public void setSqlwarn9(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn9,sqlwarn9.length);
   	
   }
   
     /**
	 * 	Update Sqlwarn9 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn9+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlwarn9 with another Field
	 *	@param value
	 */
   public void setSqlwarn9(Field source) {
       replace(source,0,source.length(),beginSqlwarn9,SQLWARN_9_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlwarn9 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlwarn9(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlwarn9,SQLWARN_9_LEN);
   	
   }
   
     /**
	 * 	Update Sqlwarn9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn9+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sqlwarna
	 *	@return sqlwarna
	 */
   public char[] getSqlwarna() throws CFException{
     if (isSqlwarnaModified()) { 
        sqlwarna = refreshSqlwarna();
     }
   		return sqlwarna;
   }

  
	/**
	*  set variable sqlwarna
	*  Corresponding COBOL Variable is SQLWARNA
	*  @param value
	**/
   public void setSqlwarna(char[] value) {
      sqlwarna = checkSqlwarnaConstraints(value);
      serializeSqlwarna(sqlwarna);
   } 

     /**
	 * 	Update Sqlwarna 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlwarna(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlwarna,sqlwarna.length);
   	
   }
   
   public void setSqlwarna(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarna,sqlwarna.length);
   	
   }
   
     /**
	 * 	Update Sqlwarna 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarna(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarna+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlwarna with another Field
	 *	@param value
	 */
   public void setSqlwarna(Field source) {
       replace(source,0,source.length(),beginSqlwarna,SQLWARNA_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlwarna 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlwarna(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlwarna,SQLWARNA_LEN);
   	
   }
   
     /**
	 * 	Update Sqlwarna 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarna(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarna+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sqlstate
	 *	@return sqlstate
	 */
   public char[] getSqlstate() throws CFException{
     if (isSqlstateModified()) { 
        sqlstate = refreshSqlstate();
     }
   		return sqlstate;
   }

  
	/**
	*  set variable sqlstate
	*  Corresponding COBOL Variable is SQLSTATE
	*  @param value
	**/
   public void setSqlstate(char[] value) {
      sqlstate = checkSqlstateConstraints(value);
      serializeSqlstate(sqlstate);
   } 

     /**
	 * 	Update Sqlstate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlstate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlstate,sqlstate.length);
   	
   }
   
   public void setSqlstate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlstate,sqlstate.length);
   	
   }
   
     /**
	 * 	Update Sqlstate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlstate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlstate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlstate with another Field
	 *	@param value
	 */
   public void setSqlstate(Field source) {
       replace(source,0,source.length(),beginSqlstate,SQLSTATE_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlstate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlstate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlstate,SQLSTATE_LEN);
   	
   }
   
     /**
	 * 	Update Sqlstate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlstate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlstate+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSqlextFieldLength() {
			return SQLEXT_LENGTH;
		}

}
  
