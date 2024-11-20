package com.edwardjones.app.trdpb004.dto.serialize;

/**
*  The class ExcDescriptionSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 13:17. using version 5.0.0.153
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ExcDescriptionSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ExcDescriptionSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EXC_DESCRIPTION_LENGTH = 1002;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginExcDescriptionLen;
            protected  int beginExcDescriptionText;
	
	/**
	* Constructor for ExcDescriptionSerialized
	**/
    public ExcDescriptionSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ExcDescriptionSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExcDescriptionSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ExcDescriptionSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,24); // serialize this field at offset 24 by default 
    }
    
	/**
	* sets parent for this ExcDescriptionSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 24 by default
    }    
	/**
	* initializes the field in ExcDescriptionSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EXC_DESCRIPTION_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginExcDescriptionLen = getStartOffset() + 0;	// set offset for serialization
  
             beginExcDescriptionText = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localExcDescriptionLenCounter = -1;
         public boolean isExcDescriptionLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localExcDescriptionLenCounter != sharedCounter;
            localExcDescriptionLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int EXC_DESCRIPTION_LEN_LEN = 2;
  	/**
	 * serializeExcDescriptionLen
	 */
	protected void serializeExcDescriptionLen(short excDescriptionLen) {
           replaceValue( //  save the value as string
                   getBinaryString( excDescriptionLen,EXC_DESCRIPTION_LEN_LEN)
                  ,beginExcDescriptionLen
                  ,EXC_DESCRIPTION_LEN_LEN
                 );
            localExcDescriptionLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkExcDescriptionLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshExcDescriptionLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshExcDescriptionLen() {	 
			return (getShort(beginExcDescriptionLen));
   	}
     int localExcDescriptionTextCounter = -1;
     public boolean isExcDescriptionTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExcDescriptionTextCounter != sharedCounter;
         localExcDescriptionTextCounter = sharedCounter; return hasModified;
     }
	protected static final int EXC_DESCRIPTION_TEXT_LEN = 1000;
	/**
	 * 	serialize this ExcDescriptionText
	 */
   protected void serializeExcDescriptionText(char[] excDescriptionText) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(excDescriptionText,0,getStringValue(),beginExcDescriptionText,EXC_DESCRIPTION_TEXT_LEN);
       localExcDescriptionTextCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExcDescriptionTextConstraints(char[] value) {
   			return super.checkConstraints(value , 1000 ,false, false);
   }
    /**
	 *	refreshExcDescriptionText is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExcDescriptionText() {	 
   		return (substring(getStringValue(),beginExcDescriptionText,beginExcDescriptionText + EXC_DESCRIPTION_TEXT_LEN));
   	}




}
  
