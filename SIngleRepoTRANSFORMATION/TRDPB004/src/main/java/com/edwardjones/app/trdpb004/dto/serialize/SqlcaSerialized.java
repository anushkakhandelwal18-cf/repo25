package com.edwardjones.app.trdpb004.dto.serialize;

/**
*  The class SqlcaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 13:17. using version 5.0.0.153
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SqlcaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SqlcaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SQLCA_LENGTH = 136;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlcaid;
            protected  int beginSqlcabc;
            protected  int beginSqlcode;
            protected  int beginSqlerrp;
           protected int beginSqlerrd;
           protected static final int SQLERRD_SIZE = 6;
	
	/**
	* Constructor for SqlcaSerialized
	**/
    public SqlcaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SqlcaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SQLCA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSqlcaid = getStartOffset() + 0;	// set offset for serialization
  
             beginSqlcabc = getStartOffset() + 8;	// set offset for serialization
  
             beginSqlcode = getStartOffset() + 12;	// set offset for serialization
  
  
             beginSqlerrp = getStartOffset() + 88;	// set offset for serialization
  
	        beginSqlerrd = getStartOffset() + 96; // set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localSqlcaidCounter = -1;
     public boolean isSqlcaidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlcaidCounter != sharedCounter;
         localSqlcaidCounter = sharedCounter; return hasModified;
     }
	protected static final int SQLCAID_LEN = 8;
	/**
	 * 	serialize this Sqlcaid
	 */
   protected void serializeSqlcaid(char[] sqlcaid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlcaid,0,getStringValue(),beginSqlcaid,SQLCAID_LEN);
       localSqlcaidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlcaidConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSqlcaid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlcaid() {	 
   		return (substring(getStringValue(),beginSqlcaid,beginSqlcaid + SQLCAID_LEN));
   	}
         int localSqlcabcCounter = -1;
         public boolean isSqlcabcModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlcabcCounter != sharedCounter;
            localSqlcabcCounter = sharedCounter; return hasModified; 
         }
   protected static final int SQLCABC_LEN = 4;
  	/**
	 * serializeSqlcabc
	 */
	protected void serializeSqlcabc(int sqlcabc) {
           replaceValue( //  save the value as string
                   getBinaryString( sqlcabc,SQLCABC_LEN)
                  ,beginSqlcabc
                  ,SQLCABC_LEN
                 );
            localSqlcabcCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSqlcabcMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSqlcabc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSqlcabc() {	 
			return (getInt(beginSqlcabc));
   	}
         int localSqlcodeCounter = -1;
         public boolean isSqlcodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlcodeCounter != sharedCounter;
            localSqlcodeCounter = sharedCounter; return hasModified; 
         }
   protected static final int SQLCODE_LEN = 4;
  	/**
	 * serializeSqlcode
	 */
	protected void serializeSqlcode(int sqlcode) {
           replaceValue( //  save the value as string
                   getBinaryString( sqlcode,SQLCODE_LEN)
                  ,beginSqlcode
                  ,SQLCODE_LEN
                 );
            localSqlcodeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSqlcodeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSqlcode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSqlcode() {	 
			return (getInt(beginSqlcode));
   	}
     int localSqlerrpCounter = -1;
     public boolean isSqlerrpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlerrpCounter != sharedCounter;
         localSqlerrpCounter = sharedCounter; return hasModified;
     }
	protected static final int SQLERRP_LEN = 8;
	/**
	 * 	serialize this Sqlerrp
	 */
   protected void serializeSqlerrp(char[] sqlerrp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlerrp,0,getStringValue(),beginSqlerrp,SQLERRP_LEN);
       localSqlerrpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlerrpConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSqlerrp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlerrp() {	 
   		return (substring(getStringValue(),beginSqlerrp,beginSqlerrp + SQLERRP_LEN));
   	}

	protected static final int SQLERRD_LEN = 4;
    /**
	 * 	serialize this Sqlerrd as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeSqlerrd(int index, int value) {
           int number = value;
           replaceValue( getBinaryString(number) , (beginSqlerrd + index*SQLERRD_LEN), SQLERRD_LEN);
   }

		public int sqlerrdSize() {
			return SQLERRD_SIZE;
		}



}
  
