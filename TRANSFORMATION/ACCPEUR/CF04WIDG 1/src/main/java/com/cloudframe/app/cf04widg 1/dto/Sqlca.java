package com.cloudframe.app.cf04widg 1.dto;

/**
*  The class Sqlca is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-14 at 17:20. using version 5.0.0.153
**/


import com.cloudframe.app.cf04widg 1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Sqlca extends SqlcaSerialized {
   

						private char[] sqlcaid = Field.fillLowValue(8);

								private int sqlcabc;

								private int sqlcode;
				private Sqlerrm sqlerrm = new Sqlerrm();

						private char[] sqlerrp = Field.fillLowValue(8);
      private List<Integer> sqlerrd; 

				private Sqlwarn sqlwarn = new Sqlwarn();
				private Sqlext sqlext = new Sqlext();
	
	/**
	* Constructor for Sqlca
	**/
    public Sqlca() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			sqlerrm.setParent(this,getStartOffset() + 16);
	       			sqlwarn.setParent(this,getStartOffset() + 120);
	       			sqlext.setParent(this,getStartOffset() + 128);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sqlcaid
	 *	@return sqlcaid
	 */
   public char[] getSqlcaid() throws CFException{
     if (isSqlcaidModified()) { 
        sqlcaid = refreshSqlcaid();
     }
   		return sqlcaid;
   }

  
	/**
	*  set variable sqlcaid
	*  Corresponding COBOL Variable is SQLCAID
	*  @param value
	**/
   public void setSqlcaid(char[] value) {
      sqlcaid = checkSqlcaidConstraints(value);
      serializeSqlcaid(sqlcaid);
   } 

     /**
	 * 	Update Sqlcaid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcaid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlcaid,sqlcaid.length);
   	
   }
   
   public void setSqlcaid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcaid,sqlcaid.length);
   	
   }
   
     /**
	 * 	Update Sqlcaid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcaid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcaid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlcaid with another Field
	 *	@param value
	 */
   public void setSqlcaid(Field source) {
       replace(source,0,source.length(),beginSqlcaid,SQLCAID_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlcaid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcaid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlcaid,SQLCAID_LEN);
   	
   }
   
     /**
	 * 	Update Sqlcaid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcaid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcaid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sqlcabc
	 *	@return sqlcabc
	 */
	public int getSqlcabc() throws CFException {
        if (isSqlcabcModified()) { 
           sqlcabc = refreshSqlcabc();
        }
   		return sqlcabc;
	}
	
	/**
	 * 	Update Sqlcabc with the passed value
	 *  Corresponding COBOL Variable is SQLCABC
	 *	@param number
	 */
	public void setSqlcabc(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlcabc = checkSqlcabcMaxLimit(number); 
		serializeSqlcabc(sqlcabc);
	}


	public void setSqlcabc(long number) {
	    number = checkSqlcabcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSqlcabc((int)number);
	}
	
	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {
        if (isSqlcodeModified()) { 
           sqlcode = refreshSqlcode();
        }
   		return sqlcode;
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *  Corresponding COBOL Variable is SQLCODE
	 *	@param number
	 */
	public void setSqlcode(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlcode = checkSqlcodeMaxLimit(number); 
		serializeSqlcode(sqlcode);
	}


	public void setSqlcode(long number) {
	    number = checkSqlcodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSqlcode((int)number);
	}
	
	/**
	 *	Returns the value of sqlerrm
	 *	@return sqlerrm
	 */   
	 public Sqlerrm getSqlerrm() {
   	return sqlerrm;
   }
   /**
	* 	Update Sqlerrm with the passed value
	*   Corresponding COBOL Variable is SQLERRM
	*	@param value
	*/
   public void setSqlerrm(char[] value) {
      sqlerrm.setString(value); 
   }   
    
     /**
	 * 	Update Sqlerrm 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlerrm(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlerrm.begin,sqlerrm.length());
   }
   
     /**
	 * 	Update Sqlerrm 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlerrm.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sqlerrm with another Field
	 *	@param value
	 */
   public void setSqlerrm(Field source) {
   	replace(source,0,source.length(),sqlerrm.begin,sqlerrm.length());
   }  
   
     /**
	 * 	Update Sqlerrm 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlerrm(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlerrm.begin,sqlerrm.length());
   }
   
     /**
	 * 	Update Sqlerrm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlerrm.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sqlerrp
	 *	@return sqlerrp
	 */
   public char[] getSqlerrp() throws CFException{
     if (isSqlerrpModified()) { 
        sqlerrp = refreshSqlerrp();
     }
   		return sqlerrp;
   }

  
	/**
	*  set variable sqlerrp
	*  Corresponding COBOL Variable is SQLERRP
	*  @param value
	**/
   public void setSqlerrp(char[] value) {
      sqlerrp = checkSqlerrpConstraints(value);
      serializeSqlerrp(sqlerrp);
   } 

     /**
	 * 	Update Sqlerrp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlerrp,sqlerrp.length);
   	
   }
   
   public void setSqlerrp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlerrp,sqlerrp.length);
   	
   }
   
     /**
	 * 	Update Sqlerrp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlerrp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlerrp with another Field
	 *	@param value
	 */
   public void setSqlerrp(Field source) {
       replace(source,0,source.length(),beginSqlerrp,SQLERRP_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlerrp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlerrp,SQLERRP_LEN);
   	
   }
   
     /**
	 * 	Update Sqlerrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlerrp+targetIndex,targetLen);
    
   }
    /**
	 *	Returns the value of sqlerrd
	 *  Corresponding COBOL Variable is SQLERRD
	 *	@return sqlerrd
	 */
	public List<Integer> getSqlerrd() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < SQLERRD_SIZE;index++) {
        	list.add( getSqlerrd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSqlerrd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SQLERRD_SIZE) {
             	index = SQLERRD_SIZE -1; // can't exceed max array size
             	logger.trace("sqlerrd - Array index exceeded max Size {}, resetting it to max allowed",SQLERRD_SIZE); 
	    }   
		return getInt(beginSqlerrd+ index*SQLERRD_LEN);
   }
	
	/**
	 *	Update Sqlerrd at index with the passed value
	 *  Corresponding COBOL Variable is SQLERRD
	 *  @param index
	 *	@param number
	 */
	public void setSqlerrd(int index,int number) {
	   truncated = false; // reset left over truncated flag
		setSqlerrd(index,number, true);
	}
	
	public void setSqlerrd(int index,long number) {
			setSqlerrd(index,(int)number, true);
	}
	
	/**
	 *	Update  Sqlerrd at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSqlerrd(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSqlerrd(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= SQLERRD_SIZE) {
             	index = SQLERRD_SIZE -1; // can't exceed max array size
             	logger.trace("sqlerrd - Array index exceeded max Size "+SQLERRD_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeSqlerrd(index,value);
		}
   }
	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlwarn;
   }
   /**
	* 	Update Sqlwarn with the passed value
	*   Corresponding COBOL Variable is SQLWARN
	*	@param value
	*/
   public void setSqlwarn(char[] value) {
      sqlwarn.setString(value); 
   }   
    
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlwarn.begin,sqlwarn.length());
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlwarn.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	replace(source,0,source.length(),sqlwarn.begin,sqlwarn.length());
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlwarn.begin,sqlwarn.length());
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlwarn.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sqlext
	 *	@return sqlext
	 */   
	 public Sqlext getSqlext() {
   	return sqlext;
   }
   /**
	* 	Update Sqlext with the passed value
	*   Corresponding COBOL Variable is SQLEXT
	*	@param value
	*/
   public void setSqlext(char[] value) {
      sqlext.setString(value); 
   }   
    
     /**
	 * 	Update Sqlext 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlext(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlext.begin,sqlext.length());
   }
   
     /**
	 * 	Update Sqlext 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlext(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlext.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sqlext with another Field
	 *	@param value
	 */
   public void setSqlext(Field source) {
   	replace(source,0,source.length(),sqlext.begin,sqlext.length());
   }  
   
     /**
	 * 	Update Sqlext 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlext(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlext.begin,sqlext.length());
   }
   
     /**
	 * 	Update Sqlext 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlext(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlext.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSqlcaFieldLength() {
			return SQLCA_LENGTH;
		}

}
  
