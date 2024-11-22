package com.edwardjones.app.trdpb004.dto.serialize;

/**
*  The class SqlerrmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:20. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SqlerrmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SqlerrmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SQLERRM_LENGTH = 72;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlerrml;
            protected  int beginSqlerrmc;
	
	/**
	* Constructor for SqlerrmSerialized
	**/
    public SqlerrmSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SqlerrmSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqlerrmSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SqlerrmSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,16); // serialize this field at offset 16 by default 
    }
    
	/**
	* sets parent for this SqlerrmSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 16 by default
    }    
	/**
	* initializes the field in SqlerrmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SQLERRM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSqlerrml = getStartOffset() + 0;	// set offset for serialization
  
             beginSqlerrmc = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localSqlerrmlCounter = -1;
         public boolean isSqlerrmlModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlerrmlCounter != sharedCounter;
            localSqlerrmlCounter = sharedCounter; return hasModified; 
         }
   protected static final int SQLERRML_LEN = 2;
  	/**
	 * serializeSqlerrml
	 */
	protected void serializeSqlerrml(short sqlerrml) {
           replaceValue( //  save the value as string
                   getBinaryString( sqlerrml,SQLERRML_LEN)
                  ,beginSqlerrml
                  ,SQLERRML_LEN
                 );
            localSqlerrmlCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSqlerrmlMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSqlerrml is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSqlerrml() {	 
			return (getShort(beginSqlerrml));
   	}
     int localSqlerrmcCounter = -1;
     public boolean isSqlerrmcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlerrmcCounter != sharedCounter;
         localSqlerrmcCounter = sharedCounter; return hasModified;
     }
	protected static final int SQLERRMC_LEN = 70;
	/**
	 * 	serialize this Sqlerrmc
	 */
   protected void serializeSqlerrmc(char[] sqlerrmc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlerrmc,0,getStringValue(),beginSqlerrmc,SQLERRMC_LEN);
       localSqlerrmcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlerrmcConstraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshSqlerrmc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlerrmc() {	 
   		return (substring(getStringValue(),beginSqlerrmc,beginSqlerrmc + SQLERRMC_LEN));
   	}




}
  
