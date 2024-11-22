package com.edwardjones.app.trdpb004.dto.serialize;

/**
*  The class SqlextSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:20. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SqlextSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SqlextSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SQLEXT_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlwarn8;
            protected  int beginSqlwarn9;
            protected  int beginSqlwarna;
            protected  int beginSqlstate;
	
	/**
	* Constructor for SqlextSerialized
	**/
    public SqlextSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SqlextSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqlextSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SqlextSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,128); // serialize this field at offset 128 by default 
    }
    
	/**
	* sets parent for this SqlextSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 128 by default
    }    
	/**
	* initializes the field in SqlextSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SQLEXT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSqlwarn8 = getStartOffset() + 0;	// set offset for serialization
  
             beginSqlwarn9 = getStartOffset() + 1;	// set offset for serialization
  
             beginSqlwarna = getStartOffset() + 2;	// set offset for serialization
  
             beginSqlstate = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSqlwarn8Counter = -1;
     public boolean isSqlwarn8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlwarn8Counter != sharedCounter;
         localSqlwarn8Counter = sharedCounter; return hasModified;
     }
	protected static final int SQLWARN_8_LEN = 1;
	/**
	 * 	serialize this Sqlwarn8
	 */
   protected void serializeSqlwarn8(char[] sqlwarn8) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlwarn8,0,getStringValue(),beginSqlwarn8,SQLWARN_8_LEN);
       localSqlwarn8Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlwarn8Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSqlwarn8 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlwarn8() {	 
   		return (substring(getStringValue(),beginSqlwarn8,beginSqlwarn8 + SQLWARN_8_LEN));
   	}
     int localSqlwarn9Counter = -1;
     public boolean isSqlwarn9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlwarn9Counter != sharedCounter;
         localSqlwarn9Counter = sharedCounter; return hasModified;
     }
	protected static final int SQLWARN_9_LEN = 1;
	/**
	 * 	serialize this Sqlwarn9
	 */
   protected void serializeSqlwarn9(char[] sqlwarn9) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlwarn9,0,getStringValue(),beginSqlwarn9,SQLWARN_9_LEN);
       localSqlwarn9Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlwarn9Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSqlwarn9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlwarn9() {	 
   		return (substring(getStringValue(),beginSqlwarn9,beginSqlwarn9 + SQLWARN_9_LEN));
   	}
     int localSqlwarnaCounter = -1;
     public boolean isSqlwarnaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlwarnaCounter != sharedCounter;
         localSqlwarnaCounter = sharedCounter; return hasModified;
     }
	protected static final int SQLWARNA_LEN = 1;
	/**
	 * 	serialize this Sqlwarna
	 */
   protected void serializeSqlwarna(char[] sqlwarna) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlwarna,0,getStringValue(),beginSqlwarna,SQLWARNA_LEN);
       localSqlwarnaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlwarnaConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSqlwarna is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlwarna() {	 
   		return (substring(getStringValue(),beginSqlwarna,beginSqlwarna + SQLWARNA_LEN));
   	}
     int localSqlstateCounter = -1;
     public boolean isSqlstateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlstateCounter != sharedCounter;
         localSqlstateCounter = sharedCounter; return hasModified;
     }
	protected static final int SQLSTATE_LEN = 5;
	/**
	 * 	serialize this Sqlstate
	 */
   protected void serializeSqlstate(char[] sqlstate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlstate,0,getStringValue(),beginSqlstate,SQLSTATE_LEN);
       localSqlstateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlstateConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshSqlstate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlstate() {	 
   		return (substring(getStringValue(),beginSqlstate,beginSqlstate + SQLSTATE_LEN));
   	}




}
  
