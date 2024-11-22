package com.edwardjones.app.trdpb002.dto.serialize;

/**
*  The class TrdOrderPairSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:10. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class TrdOrderPairSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TrdOrderPairSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TRD_ORDER_PAIR_LENGTH = 88;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTrdExchange;
            protected  int beginTrdBuyerId;
            protected  int beginTrdSellerId;
            protected  int beginTrdOrderId;
            protected  int beginTrdFigi;
            protected  int beginTrdOrderQty;
            protected  int beginTrdCurrency;
            protected  int beginTrdOrderAmount;
            protected  int beginTrdBuyerSecAccNum;
            protected  int beginTrdBuyerMoneyAccNum;
            protected  int beginTrdSellerSecAccNum;
            protected  int beginTrdSellerMoneyAccNum;
            protected  int beginTrdStatus;
	
	/**
	* Constructor for TrdOrderPairSerialized
	**/
    public TrdOrderPairSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TrdOrderPairSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TRD_ORDER_PAIR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTrdExchange = getStartOffset() + 0;	// set offset for serialization
  
             beginTrdBuyerId = getStartOffset() + 10;	// set offset for serialization
  
             beginTrdSellerId = getStartOffset() + 22;	// set offset for serialization
  
             beginTrdOrderId = getStartOffset() + 34;	// set offset for serialization
  
             beginTrdFigi = getStartOffset() + 46;	// set offset for serialization
  
             beginTrdOrderQty = getStartOffset() + 58;	// set offset for serialization
  
             beginTrdCurrency = getStartOffset() + 63;	// set offset for serialization
  
             beginTrdOrderAmount = getStartOffset() + 66;	// set offset for serialization
  
             beginTrdBuyerSecAccNum = getStartOffset() + 71;	// set offset for serialization
  
             beginTrdBuyerMoneyAccNum = getStartOffset() + 75;	// set offset for serialization
  
             beginTrdSellerSecAccNum = getStartOffset() + 79;	// set offset for serialization
  
             beginTrdSellerMoneyAccNum = getStartOffset() + 83;	// set offset for serialization
  
             beginTrdStatus = getStartOffset() + 87;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTrdExchangeCounter = -1;
     public boolean isTrdExchangeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTrdExchangeCounter != sharedCounter;
         localTrdExchangeCounter = sharedCounter; return hasModified;
     }
	protected static final int TRD_EXCHANGE_LEN = 10;
	/**
	 * 	serialize this TrdExchange
	 */
   protected void serializeTrdExchange(char[] trdExchange) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(trdExchange,0,getStringValue(),beginTrdExchange,TRD_EXCHANGE_LEN);
       localTrdExchangeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTrdExchangeConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTrdExchange is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTrdExchange() {	 
   		return (substring(getStringValue(),beginTrdExchange,beginTrdExchange + TRD_EXCHANGE_LEN));
   	}
     int localTrdBuyerIdCounter = -1;
     public boolean isTrdBuyerIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTrdBuyerIdCounter != sharedCounter;
         localTrdBuyerIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TRD_BUYER_ID_LEN = 12;
	/**
	 * 	serialize this TrdBuyerId
	 */
   protected void serializeTrdBuyerId(char[] trdBuyerId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(trdBuyerId,0,getStringValue(),beginTrdBuyerId,TRD_BUYER_ID_LEN);
       localTrdBuyerIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTrdBuyerIdConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshTrdBuyerId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTrdBuyerId() {	 
   		return (substring(getStringValue(),beginTrdBuyerId,beginTrdBuyerId + TRD_BUYER_ID_LEN));
   	}
     int localTrdSellerIdCounter = -1;
     public boolean isTrdSellerIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTrdSellerIdCounter != sharedCounter;
         localTrdSellerIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TRD_SELLER_ID_LEN = 12;
	/**
	 * 	serialize this TrdSellerId
	 */
   protected void serializeTrdSellerId(char[] trdSellerId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(trdSellerId,0,getStringValue(),beginTrdSellerId,TRD_SELLER_ID_LEN);
       localTrdSellerIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTrdSellerIdConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshTrdSellerId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTrdSellerId() {	 
   		return (substring(getStringValue(),beginTrdSellerId,beginTrdSellerId + TRD_SELLER_ID_LEN));
   	}
     int localTrdOrderIdCounter = -1;
     public boolean isTrdOrderIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTrdOrderIdCounter != sharedCounter;
         localTrdOrderIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TRD_ORDER_ID_LEN = 12;
	/**
	 * 	serialize this TrdOrderId
	 */
   protected void serializeTrdOrderId(char[] trdOrderId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(trdOrderId,0,getStringValue(),beginTrdOrderId,TRD_ORDER_ID_LEN);
       localTrdOrderIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTrdOrderIdConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshTrdOrderId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTrdOrderId() {	 
   		return (substring(getStringValue(),beginTrdOrderId,beginTrdOrderId + TRD_ORDER_ID_LEN));
   	}
     int localTrdFigiCounter = -1;
     public boolean isTrdFigiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTrdFigiCounter != sharedCounter;
         localTrdFigiCounter = sharedCounter; return hasModified;
     }
	protected static final int TRD_FIGI_LEN = 12;
	/**
	 * 	serialize this TrdFigi
	 */
   protected void serializeTrdFigi(char[] trdFigi) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(trdFigi,0,getStringValue(),beginTrdFigi,TRD_FIGI_LEN);
       localTrdFigiCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTrdFigiConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshTrdFigi is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTrdFigi() {	 
   		return (substring(getStringValue(),beginTrdFigi,beginTrdFigi + TRD_FIGI_LEN));
   	}
        int localTrdOrderQtyCounter = -1;
        public boolean isTrdOrderQtyModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTrdOrderQtyCounter != sharedCounter;
           localTrdOrderQtyCounter = sharedCounter; return hasModified; 
        }
	    public boolean trdOrderQtyIsNumeric() {
	      return decimalIsNumeric(beginTrdOrderQty,TRD_ORDER_QTY_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] trdOrderQtyString() {
            return getPackedString(beginTrdOrderQty,TRD_ORDER_QTY_LEN);
         }
   protected static final int TRD_ORDER_QTY_LEN = 5;
   protected static final int TRD_ORDER_QTY_SCALE = 2;
  	/**
	 * 	serializeTrdOrderQty
	 */
	protected void serializeTrdOrderQty(BigDecimal trdOrderQty) {
		   putDecimal(beginTrdOrderQty,trdOrderQty,TRD_ORDER_QTY_LEN,TRD_ORDER_QTY_SCALE,true);
		 localTrdOrderQtyCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTrdOrderQtyMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshTrdOrderQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTrdOrderQty() throws CFException {	
   	try { 
		 return (getDecimal(beginTrdOrderQty,TRD_ORDER_QTY_LEN,TRD_ORDER_QTY_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("trdOrderQty", beginTrdOrderQty,TRD_ORDER_QTY_LEN);
     }
   	}
     int localTrdCurrencyCounter = -1;
     public boolean isTrdCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTrdCurrencyCounter != sharedCounter;
         localTrdCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int TRD_CURRENCY_LEN = 3;
	/**
	 * 	serialize this TrdCurrency
	 */
   protected void serializeTrdCurrency(char[] trdCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(trdCurrency,0,getStringValue(),beginTrdCurrency,TRD_CURRENCY_LEN);
       localTrdCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTrdCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTrdCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTrdCurrency() {	 
   		return (substring(getStringValue(),beginTrdCurrency,beginTrdCurrency + TRD_CURRENCY_LEN));
   	}
        int localTrdOrderAmountCounter = -1;
        public boolean isTrdOrderAmountModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTrdOrderAmountCounter != sharedCounter;
           localTrdOrderAmountCounter = sharedCounter; return hasModified; 
        }
	    public boolean trdOrderAmountIsNumeric() {
	      return decimalIsNumeric(beginTrdOrderAmount,TRD_ORDER_AMOUNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] trdOrderAmountString() {
            return getPackedString(beginTrdOrderAmount,TRD_ORDER_AMOUNT_LEN);
         }
   protected static final int TRD_ORDER_AMOUNT_LEN = 5;
   protected static final int TRD_ORDER_AMOUNT_SCALE = 2;
  	/**
	 * 	serializeTrdOrderAmount
	 */
	protected void serializeTrdOrderAmount(BigDecimal trdOrderAmount) {
		   putDecimal(beginTrdOrderAmount,trdOrderAmount,TRD_ORDER_AMOUNT_LEN,TRD_ORDER_AMOUNT_SCALE,true);
		 localTrdOrderAmountCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTrdOrderAmountMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshTrdOrderAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTrdOrderAmount() throws CFException {	
   	try { 
		 return (getDecimal(beginTrdOrderAmount,TRD_ORDER_AMOUNT_LEN,TRD_ORDER_AMOUNT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("trdOrderAmount", beginTrdOrderAmount,TRD_ORDER_AMOUNT_LEN);
     }
   	}
         int localTrdBuyerSecAccNumCounter = -1;
         public boolean isTrdBuyerSecAccNumModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTrdBuyerSecAccNumCounter != sharedCounter;
            localTrdBuyerSecAccNumCounter = sharedCounter; return hasModified; 
         }
   protected static final int TRD_BUYER_SEC_ACC_NUM_LEN = 4;
  	/**
	 * serializeTrdBuyerSecAccNum
	 */
	protected void serializeTrdBuyerSecAccNum(int trdBuyerSecAccNum) {
           replaceValue( //  save the value as string
                   getBinaryString( trdBuyerSecAccNum,TRD_BUYER_SEC_ACC_NUM_LEN)
                  ,beginTrdBuyerSecAccNum
                  ,TRD_BUYER_SEC_ACC_NUM_LEN
                 );
            localTrdBuyerSecAccNumCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTrdBuyerSecAccNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTrdBuyerSecAccNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTrdBuyerSecAccNum() {	 
			return (getInt(beginTrdBuyerSecAccNum));
   	}
         int localTrdBuyerMoneyAccNumCounter = -1;
         public boolean isTrdBuyerMoneyAccNumModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTrdBuyerMoneyAccNumCounter != sharedCounter;
            localTrdBuyerMoneyAccNumCounter = sharedCounter; return hasModified; 
         }
   protected static final int TRD_BUYER_MONEY_ACC_NUM_LEN = 4;
  	/**
	 * serializeTrdBuyerMoneyAccNum
	 */
	protected void serializeTrdBuyerMoneyAccNum(int trdBuyerMoneyAccNum) {
           replaceValue( //  save the value as string
                   getBinaryString( trdBuyerMoneyAccNum,TRD_BUYER_MONEY_ACC_NUM_LEN)
                  ,beginTrdBuyerMoneyAccNum
                  ,TRD_BUYER_MONEY_ACC_NUM_LEN
                 );
            localTrdBuyerMoneyAccNumCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTrdBuyerMoneyAccNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTrdBuyerMoneyAccNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTrdBuyerMoneyAccNum() {	 
			return (getInt(beginTrdBuyerMoneyAccNum));
   	}
         int localTrdSellerSecAccNumCounter = -1;
         public boolean isTrdSellerSecAccNumModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTrdSellerSecAccNumCounter != sharedCounter;
            localTrdSellerSecAccNumCounter = sharedCounter; return hasModified; 
         }
   protected static final int TRD_SELLER_SEC_ACC_NUM_LEN = 4;
  	/**
	 * serializeTrdSellerSecAccNum
	 */
	protected void serializeTrdSellerSecAccNum(int trdSellerSecAccNum) {
           replaceValue( //  save the value as string
                   getBinaryString( trdSellerSecAccNum,TRD_SELLER_SEC_ACC_NUM_LEN)
                  ,beginTrdSellerSecAccNum
                  ,TRD_SELLER_SEC_ACC_NUM_LEN
                 );
            localTrdSellerSecAccNumCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTrdSellerSecAccNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTrdSellerSecAccNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTrdSellerSecAccNum() {	 
			return (getInt(beginTrdSellerSecAccNum));
   	}
         int localTrdSellerMoneyAccNumCounter = -1;
         public boolean isTrdSellerMoneyAccNumModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTrdSellerMoneyAccNumCounter != sharedCounter;
            localTrdSellerMoneyAccNumCounter = sharedCounter; return hasModified; 
         }
   protected static final int TRD_SELLER_MONEY_ACC_NUM_LEN = 4;
  	/**
	 * serializeTrdSellerMoneyAccNum
	 */
	protected void serializeTrdSellerMoneyAccNum(int trdSellerMoneyAccNum) {
           replaceValue( //  save the value as string
                   getBinaryString( trdSellerMoneyAccNum,TRD_SELLER_MONEY_ACC_NUM_LEN)
                  ,beginTrdSellerMoneyAccNum
                  ,TRD_SELLER_MONEY_ACC_NUM_LEN
                 );
            localTrdSellerMoneyAccNumCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTrdSellerMoneyAccNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTrdSellerMoneyAccNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTrdSellerMoneyAccNum() {	 
			return (getInt(beginTrdSellerMoneyAccNum));
   	}
     int localTrdStatusCounter = -1;
     public boolean isTrdStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTrdStatusCounter != sharedCounter;
         localTrdStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int TRD_STATUS_LEN = 1;
	/**
	 * 	serialize this TrdStatus
	 */
   protected void serializeTrdStatus(char[] trdStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(trdStatus,0,getStringValue(),beginTrdStatus,TRD_STATUS_LEN);
       localTrdStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTrdStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTrdStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTrdStatus() {	 
   		return (substring(getStringValue(),beginTrdStatus,beginTrdStatus + TRD_STATUS_LEN));
   	}




}
  
