package com.edwardjones.app.trdpb002.dto.serialize;

/**
*  The class DcltbtrdposSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:10. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DcltbtrdposSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DcltbtrdposSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLTBTRDPOS_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPosCurrency;
            protected  int beginPosSacNumber;
            protected  int beginPosFigi;
            protected  int beginPosBalance;
	
	/**
	* Constructor for DcltbtrdposSerialized
	**/
    public DcltbtrdposSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DcltbtrdposSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLTBTRDPOS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPosCurrency = getStartOffset() + 0;	// set offset for serialization
  
             beginPosSacNumber = getStartOffset() + 3;	// set offset for serialization
  
             beginPosFigi = getStartOffset() + 7;	// set offset for serialization
  
             beginPosBalance = getStartOffset() + 19;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPosCurrencyCounter = -1;
     public boolean isPosCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPosCurrencyCounter != sharedCounter;
         localPosCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int POS_CURRENCY_LEN = 3;
	/**
	 * 	serialize this PosCurrency
	 */
   protected void serializePosCurrency(char[] posCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(posCurrency,0,getStringValue(),beginPosCurrency,POS_CURRENCY_LEN);
       localPosCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPosCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshPosCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPosCurrency() {	 
   		return (substring(getStringValue(),beginPosCurrency,beginPosCurrency + POS_CURRENCY_LEN));
   	}
         int localPosSacNumberCounter = -1;
         public boolean isPosSacNumberModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPosSacNumberCounter != sharedCounter;
            localPosSacNumberCounter = sharedCounter; return hasModified; 
         }
   protected static final int POS_SAC_NUMBER_LEN = 4;
  	/**
	 * serializePosSacNumber
	 */
	protected void serializePosSacNumber(int posSacNumber) {
           replaceValue( //  save the value as string
                   getBinaryString( posSacNumber,POS_SAC_NUMBER_LEN)
                  ,beginPosSacNumber
                  ,POS_SAC_NUMBER_LEN
                 );
            localPosSacNumberCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkPosSacNumberMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshPosSacNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPosSacNumber() {	 
			return (getInt(beginPosSacNumber));
   	}
     int localPosFigiCounter = -1;
     public boolean isPosFigiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPosFigiCounter != sharedCounter;
         localPosFigiCounter = sharedCounter; return hasModified;
     }
	protected static final int POS_FIGI_LEN = 12;
	/**
	 * 	serialize this PosFigi
	 */
   protected void serializePosFigi(char[] posFigi) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(posFigi,0,getStringValue(),beginPosFigi,POS_FIGI_LEN);
       localPosFigiCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPosFigiConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshPosFigi is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPosFigi() {	 
   		return (substring(getStringValue(),beginPosFigi,beginPosFigi + POS_FIGI_LEN));
   	}
        int localPosBalanceCounter = -1;
        public boolean isPosBalanceModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPosBalanceCounter != sharedCounter;
           localPosBalanceCounter = sharedCounter; return hasModified; 
        }
	    public boolean posBalanceIsNumeric() {
	      return decimalIsNumeric(beginPosBalance,POS_BALANCE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] posBalanceString() {
            return getPackedString(beginPosBalance,POS_BALANCE_LEN);
         }
   protected static final int POS_BALANCE_LEN = 7;
   protected static final int POS_BALANCE_SCALE = 2;
  	/**
	 * 	serializePosBalance
	 */
	protected void serializePosBalance(BigDecimal posBalance) {
		   putDecimal(beginPosBalance,posBalance,POS_BALANCE_LEN,POS_BALANCE_SCALE,true);
		 localPosBalanceCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkPosBalanceMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshPosBalance is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshPosBalance() throws CFException {	
   	try { 
		 return (getDecimal(beginPosBalance,POS_BALANCE_LEN,POS_BALANCE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("posBalance", beginPosBalance,POS_BALANCE_LEN);
     }
   	}




}
  
