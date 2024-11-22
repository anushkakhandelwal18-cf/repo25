package com.edwardjones.app.trdpbexc.dto;

/**
*  The class Sqlwarn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:19. using version 5.0.0.158
**/


import com.edwardjones.app.trdpbexc.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sqlwarn extends SqlwarnSerialized { 
   

						private char[] sqlwarn0 = Field.fillLowValue(1);

						private char[] sqlwarn1 = Field.fillLowValue(1);

						private char[] sqlwarn2 = Field.fillLowValue(1);

						private char[] sqlwarn3 = Field.fillLowValue(1);

						private char[] sqlwarn4 = Field.fillLowValue(1);

						private char[] sqlwarn5 = Field.fillLowValue(1);

						private char[] sqlwarn6 = Field.fillLowValue(1);

						private char[] sqlwarn7 = Field.fillLowValue(1);
	
	/**
	* Constructor for Sqlwarn
	**/
    public Sqlwarn() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sqlwarn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sqlwarn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sqlwarn0
	 *	@return sqlwarn0
	 */
   public char[] getSqlwarn0() throws CFException{
     if (isSqlwarn0Modified()) { 
        sqlwarn0 = refreshSqlwarn0();
     }
   		return sqlwarn0;
   }

  
	/**
	*  set variable sqlwarn0
	*  Corresponding COBOL Variable is SQLWARN0
	*  @param value
	**/
   public void setSqlwarn0(char[] value) {
      sqlwarn0 = checkSqlwarn0Constraints(value);
      serializeSqlwarn0(sqlwarn0);
   } 

     /**
	 * 	Update Sqlwarn0 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn0(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlwarn0,sqlwarn0.length);
   	
   }
   
   public void setSqlwarn0(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn0,sqlwarn0.length);
   	
   }
   
     /**
	 * 	Update Sqlwarn0 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn0(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn0+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlwarn0 with another Field
	 *	@param value
	 */
   public void setSqlwarn0(Field source) {
       replace(source,0,source.length(),beginSqlwarn0,SQLWARN_0_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlwarn0 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlwarn0(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlwarn0,SQLWARN_0_LEN);
   	
   }
   
     /**
	 * 	Update Sqlwarn0 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn0(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn0+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sqlwarn1
	 *	@return sqlwarn1
	 */
   public char[] getSqlwarn1() throws CFException{
     if (isSqlwarn1Modified()) { 
        sqlwarn1 = refreshSqlwarn1();
     }
   		return sqlwarn1;
   }

  
	/**
	*  set variable sqlwarn1
	*  Corresponding COBOL Variable is SQLWARN1
	*  @param value
	**/
   public void setSqlwarn1(char[] value) {
      sqlwarn1 = checkSqlwarn1Constraints(value);
      serializeSqlwarn1(sqlwarn1);
   } 

     /**
	 * 	Update Sqlwarn1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlwarn1,sqlwarn1.length);
   	
   }
   
   public void setSqlwarn1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn1,sqlwarn1.length);
   	
   }
   
     /**
	 * 	Update Sqlwarn1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlwarn1 with another Field
	 *	@param value
	 */
   public void setSqlwarn1(Field source) {
       replace(source,0,source.length(),beginSqlwarn1,SQLWARN_1_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlwarn1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlwarn1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlwarn1,SQLWARN_1_LEN);
   	
   }
   
     /**
	 * 	Update Sqlwarn1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sqlwarn2
	 *	@return sqlwarn2
	 */
   public char[] getSqlwarn2() throws CFException{
     if (isSqlwarn2Modified()) { 
        sqlwarn2 = refreshSqlwarn2();
     }
   		return sqlwarn2;
   }

  
	/**
	*  set variable sqlwarn2
	*  Corresponding COBOL Variable is SQLWARN2
	*  @param value
	**/
   public void setSqlwarn2(char[] value) {
      sqlwarn2 = checkSqlwarn2Constraints(value);
      serializeSqlwarn2(sqlwarn2);
   } 

     /**
	 * 	Update Sqlwarn2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlwarn2,sqlwarn2.length);
   	
   }
   
   public void setSqlwarn2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn2,sqlwarn2.length);
   	
   }
   
     /**
	 * 	Update Sqlwarn2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlwarn2 with another Field
	 *	@param value
	 */
   public void setSqlwarn2(Field source) {
       replace(source,0,source.length(),beginSqlwarn2,SQLWARN_2_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlwarn2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlwarn2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlwarn2,SQLWARN_2_LEN);
   	
   }
   
     /**
	 * 	Update Sqlwarn2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sqlwarn3
	 *	@return sqlwarn3
	 */
   public char[] getSqlwarn3() throws CFException{
     if (isSqlwarn3Modified()) { 
        sqlwarn3 = refreshSqlwarn3();
     }
   		return sqlwarn3;
   }

  
	/**
	*  set variable sqlwarn3
	*  Corresponding COBOL Variable is SQLWARN3
	*  @param value
	**/
   public void setSqlwarn3(char[] value) {
      sqlwarn3 = checkSqlwarn3Constraints(value);
      serializeSqlwarn3(sqlwarn3);
   } 

     /**
	 * 	Update Sqlwarn3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlwarn3,sqlwarn3.length);
   	
   }
   
   public void setSqlwarn3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn3,sqlwarn3.length);
   	
   }
   
     /**
	 * 	Update Sqlwarn3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlwarn3 with another Field
	 *	@param value
	 */
   public void setSqlwarn3(Field source) {
       replace(source,0,source.length(),beginSqlwarn3,SQLWARN_3_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlwarn3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlwarn3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlwarn3,SQLWARN_3_LEN);
   	
   }
   
     /**
	 * 	Update Sqlwarn3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sqlwarn4
	 *	@return sqlwarn4
	 */
   public char[] getSqlwarn4() throws CFException{
     if (isSqlwarn4Modified()) { 
        sqlwarn4 = refreshSqlwarn4();
     }
   		return sqlwarn4;
   }

  
	/**
	*  set variable sqlwarn4
	*  Corresponding COBOL Variable is SQLWARN4
	*  @param value
	**/
   public void setSqlwarn4(char[] value) {
      sqlwarn4 = checkSqlwarn4Constraints(value);
      serializeSqlwarn4(sqlwarn4);
   } 

     /**
	 * 	Update Sqlwarn4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlwarn4,sqlwarn4.length);
   	
   }
   
   public void setSqlwarn4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn4,sqlwarn4.length);
   	
   }
   
     /**
	 * 	Update Sqlwarn4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlwarn4 with another Field
	 *	@param value
	 */
   public void setSqlwarn4(Field source) {
       replace(source,0,source.length(),beginSqlwarn4,SQLWARN_4_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlwarn4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlwarn4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlwarn4,SQLWARN_4_LEN);
   	
   }
   
     /**
	 * 	Update Sqlwarn4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sqlwarn5
	 *	@return sqlwarn5
	 */
   public char[] getSqlwarn5() throws CFException{
     if (isSqlwarn5Modified()) { 
        sqlwarn5 = refreshSqlwarn5();
     }
   		return sqlwarn5;
   }

  
	/**
	*  set variable sqlwarn5
	*  Corresponding COBOL Variable is SQLWARN5
	*  @param value
	**/
   public void setSqlwarn5(char[] value) {
      sqlwarn5 = checkSqlwarn5Constraints(value);
      serializeSqlwarn5(sqlwarn5);
   } 

     /**
	 * 	Update Sqlwarn5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlwarn5,sqlwarn5.length);
   	
   }
   
   public void setSqlwarn5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn5,sqlwarn5.length);
   	
   }
   
     /**
	 * 	Update Sqlwarn5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlwarn5 with another Field
	 *	@param value
	 */
   public void setSqlwarn5(Field source) {
       replace(source,0,source.length(),beginSqlwarn5,SQLWARN_5_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlwarn5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlwarn5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlwarn5,SQLWARN_5_LEN);
   	
   }
   
     /**
	 * 	Update Sqlwarn5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sqlwarn6
	 *	@return sqlwarn6
	 */
   public char[] getSqlwarn6() throws CFException{
     if (isSqlwarn6Modified()) { 
        sqlwarn6 = refreshSqlwarn6();
     }
   		return sqlwarn6;
   }

  
	/**
	*  set variable sqlwarn6
	*  Corresponding COBOL Variable is SQLWARN6
	*  @param value
	**/
   public void setSqlwarn6(char[] value) {
      sqlwarn6 = checkSqlwarn6Constraints(value);
      serializeSqlwarn6(sqlwarn6);
   } 

     /**
	 * 	Update Sqlwarn6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlwarn6,sqlwarn6.length);
   	
   }
   
   public void setSqlwarn6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn6,sqlwarn6.length);
   	
   }
   
     /**
	 * 	Update Sqlwarn6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlwarn6 with another Field
	 *	@param value
	 */
   public void setSqlwarn6(Field source) {
       replace(source,0,source.length(),beginSqlwarn6,SQLWARN_6_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlwarn6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlwarn6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlwarn6,SQLWARN_6_LEN);
   	
   }
   
     /**
	 * 	Update Sqlwarn6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn6+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sqlwarn7
	 *	@return sqlwarn7
	 */
   public char[] getSqlwarn7() throws CFException{
     if (isSqlwarn7Modified()) { 
        sqlwarn7 = refreshSqlwarn7();
     }
   		return sqlwarn7;
   }

  
	/**
	*  set variable sqlwarn7
	*  Corresponding COBOL Variable is SQLWARN7
	*  @param value
	**/
   public void setSqlwarn7(char[] value) {
      sqlwarn7 = checkSqlwarn7Constraints(value);
      serializeSqlwarn7(sqlwarn7);
   } 

     /**
	 * 	Update Sqlwarn7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn7(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlwarn7,sqlwarn7.length);
   	
   }
   
   public void setSqlwarn7(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn7,sqlwarn7.length);
   	
   }
   
     /**
	 * 	Update Sqlwarn7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn7+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlwarn7 with another Field
	 *	@param value
	 */
   public void setSqlwarn7(Field source) {
       replace(source,0,source.length(),beginSqlwarn7,SQLWARN_7_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlwarn7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlwarn7(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlwarn7,SQLWARN_7_LEN);
   	
   }
   
     /**
	 * 	Update Sqlwarn7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlwarn7+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSqlwarnFieldLength() {
			return SQLWARN_LENGTH;
		}

}
  
