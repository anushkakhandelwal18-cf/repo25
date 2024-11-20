package com.edwardjones.app.trdpb004.dto.serialize;

/**
*  The class SqlwarnSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 13:17. using version 5.0.0.153
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SqlwarnSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SqlwarnSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SQLWARN_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlwarn0;
            protected  int beginSqlwarn1;
            protected  int beginSqlwarn2;
            protected  int beginSqlwarn3;
            protected  int beginSqlwarn4;
            protected  int beginSqlwarn5;
            protected  int beginSqlwarn6;
            protected  int beginSqlwarn7;
	
	/**
	* Constructor for SqlwarnSerialized
	**/
    public SqlwarnSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SqlwarnSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqlwarnSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SqlwarnSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,120); // serialize this field at offset 120 by default 
    }
    
	/**
	* sets parent for this SqlwarnSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 120 by default
    }    
	/**
	* initializes the field in SqlwarnSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SQLWARN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSqlwarn0 = getStartOffset() + 0;	// set offset for serialization
  
             beginSqlwarn1 = getStartOffset() + 1;	// set offset for serialization
  
             beginSqlwarn2 = getStartOffset() + 2;	// set offset for serialization
  
             beginSqlwarn3 = getStartOffset() + 3;	// set offset for serialization
  
             beginSqlwarn4 = getStartOffset() + 4;	// set offset for serialization
  
             beginSqlwarn5 = getStartOffset() + 5;	// set offset for serialization
  
             beginSqlwarn6 = getStartOffset() + 6;	// set offset for serialization
  
             beginSqlwarn7 = getStartOffset() + 7;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSqlwarn0Counter = -1;
     public boolean isSqlwarn0Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlwarn0Counter != sharedCounter;
         localSqlwarn0Counter = sharedCounter; return hasModified;
     }
	protected static final int SQLWARN_0_LEN = 1;
	/**
	 * 	serialize this Sqlwarn0
	 */
   protected void serializeSqlwarn0(char[] sqlwarn0) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlwarn0,0,getStringValue(),beginSqlwarn0,SQLWARN_0_LEN);
       localSqlwarn0Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlwarn0Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSqlwarn0 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlwarn0() {	 
   		return (substring(getStringValue(),beginSqlwarn0,beginSqlwarn0 + SQLWARN_0_LEN));
   	}
     int localSqlwarn1Counter = -1;
     public boolean isSqlwarn1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlwarn1Counter != sharedCounter;
         localSqlwarn1Counter = sharedCounter; return hasModified;
     }
	protected static final int SQLWARN_1_LEN = 1;
	/**
	 * 	serialize this Sqlwarn1
	 */
   protected void serializeSqlwarn1(char[] sqlwarn1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlwarn1,0,getStringValue(),beginSqlwarn1,SQLWARN_1_LEN);
       localSqlwarn1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlwarn1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSqlwarn1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlwarn1() {	 
   		return (substring(getStringValue(),beginSqlwarn1,beginSqlwarn1 + SQLWARN_1_LEN));
   	}
     int localSqlwarn2Counter = -1;
     public boolean isSqlwarn2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlwarn2Counter != sharedCounter;
         localSqlwarn2Counter = sharedCounter; return hasModified;
     }
	protected static final int SQLWARN_2_LEN = 1;
	/**
	 * 	serialize this Sqlwarn2
	 */
   protected void serializeSqlwarn2(char[] sqlwarn2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlwarn2,0,getStringValue(),beginSqlwarn2,SQLWARN_2_LEN);
       localSqlwarn2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlwarn2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSqlwarn2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlwarn2() {	 
   		return (substring(getStringValue(),beginSqlwarn2,beginSqlwarn2 + SQLWARN_2_LEN));
   	}
     int localSqlwarn3Counter = -1;
     public boolean isSqlwarn3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlwarn3Counter != sharedCounter;
         localSqlwarn3Counter = sharedCounter; return hasModified;
     }
	protected static final int SQLWARN_3_LEN = 1;
	/**
	 * 	serialize this Sqlwarn3
	 */
   protected void serializeSqlwarn3(char[] sqlwarn3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlwarn3,0,getStringValue(),beginSqlwarn3,SQLWARN_3_LEN);
       localSqlwarn3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlwarn3Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSqlwarn3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlwarn3() {	 
   		return (substring(getStringValue(),beginSqlwarn3,beginSqlwarn3 + SQLWARN_3_LEN));
   	}
     int localSqlwarn4Counter = -1;
     public boolean isSqlwarn4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlwarn4Counter != sharedCounter;
         localSqlwarn4Counter = sharedCounter; return hasModified;
     }
	protected static final int SQLWARN_4_LEN = 1;
	/**
	 * 	serialize this Sqlwarn4
	 */
   protected void serializeSqlwarn4(char[] sqlwarn4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlwarn4,0,getStringValue(),beginSqlwarn4,SQLWARN_4_LEN);
       localSqlwarn4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlwarn4Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSqlwarn4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlwarn4() {	 
   		return (substring(getStringValue(),beginSqlwarn4,beginSqlwarn4 + SQLWARN_4_LEN));
   	}
     int localSqlwarn5Counter = -1;
     public boolean isSqlwarn5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlwarn5Counter != sharedCounter;
         localSqlwarn5Counter = sharedCounter; return hasModified;
     }
	protected static final int SQLWARN_5_LEN = 1;
	/**
	 * 	serialize this Sqlwarn5
	 */
   protected void serializeSqlwarn5(char[] sqlwarn5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlwarn5,0,getStringValue(),beginSqlwarn5,SQLWARN_5_LEN);
       localSqlwarn5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlwarn5Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSqlwarn5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlwarn5() {	 
   		return (substring(getStringValue(),beginSqlwarn5,beginSqlwarn5 + SQLWARN_5_LEN));
   	}
     int localSqlwarn6Counter = -1;
     public boolean isSqlwarn6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlwarn6Counter != sharedCounter;
         localSqlwarn6Counter = sharedCounter; return hasModified;
     }
	protected static final int SQLWARN_6_LEN = 1;
	/**
	 * 	serialize this Sqlwarn6
	 */
   protected void serializeSqlwarn6(char[] sqlwarn6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlwarn6,0,getStringValue(),beginSqlwarn6,SQLWARN_6_LEN);
       localSqlwarn6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlwarn6Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSqlwarn6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlwarn6() {	 
   		return (substring(getStringValue(),beginSqlwarn6,beginSqlwarn6 + SQLWARN_6_LEN));
   	}
     int localSqlwarn7Counter = -1;
     public boolean isSqlwarn7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlwarn7Counter != sharedCounter;
         localSqlwarn7Counter = sharedCounter; return hasModified;
     }
	protected static final int SQLWARN_7_LEN = 1;
	/**
	 * 	serialize this Sqlwarn7
	 */
   protected void serializeSqlwarn7(char[] sqlwarn7) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlwarn7,0,getStringValue(),beginSqlwarn7,SQLWARN_7_LEN);
       localSqlwarn7Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlwarn7Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSqlwarn7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlwarn7() {	 
   		return (substring(getStringValue(),beginSqlwarn7,beginSqlwarn7 + SQLWARN_7_LEN));
   	}




}
  
