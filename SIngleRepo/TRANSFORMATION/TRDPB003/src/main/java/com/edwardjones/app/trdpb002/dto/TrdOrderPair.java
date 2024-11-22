package com.edwardjones.app.trdpb002.dto;

/**
*  The class TrdOrderPair is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:10. using version 5.0.0.158
**/


import com.edwardjones.app.trdpb002.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class TrdOrderPair extends TrdOrderPairSerialized { 
   

						private char[] trdExchange = Field.fillLowValue(10);

						private char[] trdBuyerId = Field.fillLowValue(12);

						private char[] trdSellerId = Field.fillLowValue(12);

						private char[] trdOrderId = Field.fillLowValue(12);

						private char[] trdFigi = Field.fillLowValue(12);

								private BigDecimal trdOrderQty = BigDecimal.ZERO;

						private char[] trdCurrency = Field.fillLowValue(3);

								private BigDecimal trdOrderAmount = BigDecimal.ZERO;

								private int trdBuyerSecAccNum;

								private int trdBuyerMoneyAccNum;

								private int trdSellerSecAccNum;

								private int trdSellerMoneyAccNum;

						private char[] trdStatus = Field.fillLowValue(1);
	
	/**
	* Constructor for TrdOrderPair
	**/
    public TrdOrderPair() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of trdExchange
	 *	@return trdExchange
	 */
   public char[] getTrdExchange() throws CFException{
     if (isTrdExchangeModified()) { 
        trdExchange = refreshTrdExchange();
     }
   		return trdExchange;
   }

  
	/**
	*  set variable trdExchange
	*  Corresponding COBOL Variable is TRD-EXCHANGE
	*  @param value
	**/
   public void setTrdExchange(char[] value) {
      trdExchange = checkTrdExchangeConstraints(value);
      serializeTrdExchange(trdExchange);
   } 

     /**
	 * 	Update TrdExchange 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdExchange(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTrdExchange,trdExchange.length);
   	
   }
   
   public void setTrdExchange(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTrdExchange,trdExchange.length);
   	
   }
   
     /**
	 * 	Update TrdExchange 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdExchange(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrdExchange+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TrdExchange with another Field
	 *	@param value
	 */
   public void setTrdExchange(Field source) {
       replace(source,0,source.length(),beginTrdExchange,TRD_EXCHANGE_LEN);
   	
   }  
   
     /**
	 * 	Update TrdExchange 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdExchange(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTrdExchange,TRD_EXCHANGE_LEN);
   	
   }
   
     /**
	 * 	Update TrdExchange 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdExchange(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrdExchange+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of trdBuyerId
	 *	@return trdBuyerId
	 */
   public char[] getTrdBuyerId() throws CFException{
     if (isTrdBuyerIdModified()) { 
        trdBuyerId = refreshTrdBuyerId();
     }
   		return trdBuyerId;
   }

  
	/**
	*  set variable trdBuyerId
	*  Corresponding COBOL Variable is TRD-BUYER-ID
	*  @param value
	**/
   public void setTrdBuyerId(char[] value) {
      trdBuyerId = checkTrdBuyerIdConstraints(value);
      serializeTrdBuyerId(trdBuyerId);
   } 

     /**
	 * 	Update TrdBuyerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdBuyerId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTrdBuyerId,trdBuyerId.length);
   	
   }
   
   public void setTrdBuyerId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTrdBuyerId,trdBuyerId.length);
   	
   }
   
     /**
	 * 	Update TrdBuyerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdBuyerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrdBuyerId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TrdBuyerId with another Field
	 *	@param value
	 */
   public void setTrdBuyerId(Field source) {
       replace(source,0,source.length(),beginTrdBuyerId,TRD_BUYER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TrdBuyerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdBuyerId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTrdBuyerId,TRD_BUYER_ID_LEN);
   	
   }
   
     /**
	 * 	Update TrdBuyerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdBuyerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrdBuyerId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of trdSellerId
	 *	@return trdSellerId
	 */
   public char[] getTrdSellerId() throws CFException{
     if (isTrdSellerIdModified()) { 
        trdSellerId = refreshTrdSellerId();
     }
   		return trdSellerId;
   }

  
	/**
	*  set variable trdSellerId
	*  Corresponding COBOL Variable is TRD-SELLER-ID
	*  @param value
	**/
   public void setTrdSellerId(char[] value) {
      trdSellerId = checkTrdSellerIdConstraints(value);
      serializeTrdSellerId(trdSellerId);
   } 

     /**
	 * 	Update TrdSellerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdSellerId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTrdSellerId,trdSellerId.length);
   	
   }
   
   public void setTrdSellerId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTrdSellerId,trdSellerId.length);
   	
   }
   
     /**
	 * 	Update TrdSellerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdSellerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrdSellerId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TrdSellerId with another Field
	 *	@param value
	 */
   public void setTrdSellerId(Field source) {
       replace(source,0,source.length(),beginTrdSellerId,TRD_SELLER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TrdSellerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdSellerId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTrdSellerId,TRD_SELLER_ID_LEN);
   	
   }
   
     /**
	 * 	Update TrdSellerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdSellerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrdSellerId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of trdOrderId
	 *	@return trdOrderId
	 */
   public char[] getTrdOrderId() throws CFException{
     if (isTrdOrderIdModified()) { 
        trdOrderId = refreshTrdOrderId();
     }
   		return trdOrderId;
   }

  
	/**
	*  set variable trdOrderId
	*  Corresponding COBOL Variable is TRD-ORDER-ID
	*  @param value
	**/
   public void setTrdOrderId(char[] value) {
      trdOrderId = checkTrdOrderIdConstraints(value);
      serializeTrdOrderId(trdOrderId);
   } 

     /**
	 * 	Update TrdOrderId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdOrderId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTrdOrderId,trdOrderId.length);
   	
   }
   
   public void setTrdOrderId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTrdOrderId,trdOrderId.length);
   	
   }
   
     /**
	 * 	Update TrdOrderId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdOrderId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrdOrderId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TrdOrderId with another Field
	 *	@param value
	 */
   public void setTrdOrderId(Field source) {
       replace(source,0,source.length(),beginTrdOrderId,TRD_ORDER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TrdOrderId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdOrderId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTrdOrderId,TRD_ORDER_ID_LEN);
   	
   }
   
     /**
	 * 	Update TrdOrderId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdOrderId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrdOrderId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of trdFigi
	 *	@return trdFigi
	 */
   public char[] getTrdFigi() throws CFException{
     if (isTrdFigiModified()) { 
        trdFigi = refreshTrdFigi();
     }
   		return trdFigi;
   }

  
	/**
	*  set variable trdFigi
	*  Corresponding COBOL Variable is TRD-FIGI
	*  @param value
	**/
   public void setTrdFigi(char[] value) {
      trdFigi = checkTrdFigiConstraints(value);
      serializeTrdFigi(trdFigi);
   } 

     /**
	 * 	Update TrdFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdFigi(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTrdFigi,trdFigi.length);
   	
   }
   
   public void setTrdFigi(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTrdFigi,trdFigi.length);
   	
   }
   
     /**
	 * 	Update TrdFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrdFigi+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TrdFigi with another Field
	 *	@param value
	 */
   public void setTrdFigi(Field source) {
       replace(source,0,source.length(),beginTrdFigi,TRD_FIGI_LEN);
   	
   }  
   
     /**
	 * 	Update TrdFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdFigi(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTrdFigi,TRD_FIGI_LEN);
   	
   }
   
     /**
	 * 	Update TrdFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrdFigi+targetIndex,targetLen);
    
   }
	public BigDecimal getTrdOrderQty() throws CFException {
        if (isTrdOrderQtyModified()) { 
           trdOrderQty = refreshTrdOrderQty();
        }
   		return trdOrderQty;
	}

    public char[] getTrdOrderQtyString() {
          return  trdOrderQtyString();
    }
	
	/**
	 * 	Update TrdOrderQty with the passed number
	 *  Corresponding COBOL Variable is TRD-ORDER-QTY
	 *	@param number
	 */
	public void setTrdOrderQty(BigDecimal number) {	
     trdOrderQty = checkTrdOrderQtyMaxLimit(number);
	    serializeTrdOrderQty(trdOrderQty);
   }
	/**
	 *	Returns the value of trdCurrency
	 *	@return trdCurrency
	 */
   public char[] getTrdCurrency() throws CFException{
     if (isTrdCurrencyModified()) { 
        trdCurrency = refreshTrdCurrency();
     }
   		return trdCurrency;
   }

  
	/**
	*  set variable trdCurrency
	*  Corresponding COBOL Variable is TRD-CURRENCY
	*  @param value
	**/
   public void setTrdCurrency(char[] value) {
      trdCurrency = checkTrdCurrencyConstraints(value);
      serializeTrdCurrency(trdCurrency);
   } 

     /**
	 * 	Update TrdCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTrdCurrency,trdCurrency.length);
   	
   }
   
   public void setTrdCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTrdCurrency,trdCurrency.length);
   	
   }
   
     /**
	 * 	Update TrdCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrdCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TrdCurrency with another Field
	 *	@param value
	 */
   public void setTrdCurrency(Field source) {
       replace(source,0,source.length(),beginTrdCurrency,TRD_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update TrdCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTrdCurrency,TRD_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update TrdCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrdCurrency+targetIndex,targetLen);
    
   }
	public BigDecimal getTrdOrderAmount() throws CFException {
        if (isTrdOrderAmountModified()) { 
           trdOrderAmount = refreshTrdOrderAmount();
        }
   		return trdOrderAmount;
	}

    public char[] getTrdOrderAmountString() {
          return  trdOrderAmountString();
    }
	
	/**
	 * 	Update TrdOrderAmount with the passed number
	 *  Corresponding COBOL Variable is TRD-ORDER-AMOUNT
	 *	@param number
	 */
	public void setTrdOrderAmount(BigDecimal number) {	
     trdOrderAmount = checkTrdOrderAmountMaxLimit(number);
	    serializeTrdOrderAmount(trdOrderAmount);
   }
	/**
	 *	Returns the value of trdBuyerSecAccNum
	 *	@return trdBuyerSecAccNum
	 */
	public int getTrdBuyerSecAccNum() throws CFException {
        if (isTrdBuyerSecAccNumModified()) { 
           trdBuyerSecAccNum = refreshTrdBuyerSecAccNum();
        }
   		return trdBuyerSecAccNum;
	}
	
	/**
	 * 	Update TrdBuyerSecAccNum with the passed value
	 *  Corresponding COBOL Variable is TRD-BUYER-SEC-ACC-NUM
	 *	@param number
	 */
	public void setTrdBuyerSecAccNum(int number) {
	     // Truncate if the number is beyond +/- Max range
	    trdBuyerSecAccNum = checkTrdBuyerSecAccNumMaxLimit(number); 
		serializeTrdBuyerSecAccNum(trdBuyerSecAccNum);
	}


	public void setTrdBuyerSecAccNum(long number) {
	    number = checkTrdBuyerSecAccNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTrdBuyerSecAccNum((int)number);
	}
	
	/**
	 *	Returns the value of trdBuyerMoneyAccNum
	 *	@return trdBuyerMoneyAccNum
	 */
	public int getTrdBuyerMoneyAccNum() throws CFException {
        if (isTrdBuyerMoneyAccNumModified()) { 
           trdBuyerMoneyAccNum = refreshTrdBuyerMoneyAccNum();
        }
   		return trdBuyerMoneyAccNum;
	}
	
	/**
	 * 	Update TrdBuyerMoneyAccNum with the passed value
	 *  Corresponding COBOL Variable is TRD-BUYER-MONEY-ACC-NUM
	 *	@param number
	 */
	public void setTrdBuyerMoneyAccNum(int number) {
	     // Truncate if the number is beyond +/- Max range
	    trdBuyerMoneyAccNum = checkTrdBuyerMoneyAccNumMaxLimit(number); 
		serializeTrdBuyerMoneyAccNum(trdBuyerMoneyAccNum);
	}


	public void setTrdBuyerMoneyAccNum(long number) {
	    number = checkTrdBuyerMoneyAccNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTrdBuyerMoneyAccNum((int)number);
	}
	
	/**
	 *	Returns the value of trdSellerSecAccNum
	 *	@return trdSellerSecAccNum
	 */
	public int getTrdSellerSecAccNum() throws CFException {
        if (isTrdSellerSecAccNumModified()) { 
           trdSellerSecAccNum = refreshTrdSellerSecAccNum();
        }
   		return trdSellerSecAccNum;
	}
	
	/**
	 * 	Update TrdSellerSecAccNum with the passed value
	 *  Corresponding COBOL Variable is TRD-SELLER-SEC-ACC-NUM
	 *	@param number
	 */
	public void setTrdSellerSecAccNum(int number) {
	     // Truncate if the number is beyond +/- Max range
	    trdSellerSecAccNum = checkTrdSellerSecAccNumMaxLimit(number); 
		serializeTrdSellerSecAccNum(trdSellerSecAccNum);
	}


	public void setTrdSellerSecAccNum(long number) {
	    number = checkTrdSellerSecAccNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTrdSellerSecAccNum((int)number);
	}
	
	/**
	 *	Returns the value of trdSellerMoneyAccNum
	 *	@return trdSellerMoneyAccNum
	 */
	public int getTrdSellerMoneyAccNum() throws CFException {
        if (isTrdSellerMoneyAccNumModified()) { 
           trdSellerMoneyAccNum = refreshTrdSellerMoneyAccNum();
        }
   		return trdSellerMoneyAccNum;
	}
	
	/**
	 * 	Update TrdSellerMoneyAccNum with the passed value
	 *  Corresponding COBOL Variable is TRD-SELLER-MONEY-ACC-NUM
	 *	@param number
	 */
	public void setTrdSellerMoneyAccNum(int number) {
	     // Truncate if the number is beyond +/- Max range
	    trdSellerMoneyAccNum = checkTrdSellerMoneyAccNumMaxLimit(number); 
		serializeTrdSellerMoneyAccNum(trdSellerMoneyAccNum);
	}


	public void setTrdSellerMoneyAccNum(long number) {
	    number = checkTrdSellerMoneyAccNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTrdSellerMoneyAccNum((int)number);
	}
	
	/**
	 *	Returns the value of trdStatus
	 *	@return trdStatus
	 */
   public char[] getTrdStatus() throws CFException{
     if (isTrdStatusModified()) { 
        trdStatus = refreshTrdStatus();
     }
   		return trdStatus;
   }

  
	/**
	*  set variable trdStatus
	*  Corresponding COBOL Variable is TRD-STATUS
	*  @param value
	**/
   public void setTrdStatus(char[] value) {
      trdStatus = checkTrdStatusConstraints(value);
      serializeTrdStatus(trdStatus);
   } 

     /**
	 * 	Update TrdStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTrdStatus,trdStatus.length);
   	
   }
   
   public void setTrdStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTrdStatus,trdStatus.length);
   	
   }
   
     /**
	 * 	Update TrdStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrdStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TrdStatus with another Field
	 *	@param value
	 */
   public void setTrdStatus(Field source) {
       replace(source,0,source.length(),beginTrdStatus,TRD_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update TrdStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTrdStatus,TRD_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update TrdStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrdStatus+targetIndex,targetLen);
    
   }
	char[] trdAccepted88Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isTrdAccepted()
	 *	@return  Returns true if isTrdAccepted() is "A"
	 */
   public boolean isTrdAccepted() throws CFException {
      return (  compareChars( getTrdStatus() , trdAccepted88Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setTrdAcceptedTrue() {  			
    	setTrdStatus( trdAccepted88Value);
   	}
	char[] trdSacBookingDone88Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isTrdSacBookingDone()
	 *	@return  Returns true if isTrdSacBookingDone() is "S"
	 */
   public boolean isTrdSacBookingDone() throws CFException {
      return (  compareChars( getTrdStatus() , trdSacBookingDone88Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setTrdSacBookingDoneTrue() {  			
    	setTrdStatus( trdSacBookingDone88Value);
   	}
	char[] trdSacBookingFailed88Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isTrdSacBookingFailed()
	 *	@return  Returns true if isTrdSacBookingFailed() is "F"
	 */
   public boolean isTrdSacBookingFailed() throws CFException {
      return (  compareChars( getTrdStatus() , trdSacBookingFailed88Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setTrdSacBookingFailedTrue() {  			
    	setTrdStatus( trdSacBookingFailed88Value);
   	}
	char[] trdMacBookingDone88Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isTrdMacBookingDone()
	 *	@return  Returns true if isTrdMacBookingDone() is "M"
	 */
   public boolean isTrdMacBookingDone() throws CFException {
      return (  compareChars( getTrdStatus() , trdMacBookingDone88Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setTrdMacBookingDoneTrue() {  			
    	setTrdStatus( trdMacBookingDone88Value);
   	}
	char[] trdMacBookingFailed88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isTrdMacBookingFailed()
	 *	@return  Returns true if isTrdMacBookingFailed() is "N"
	 */
   public boolean isTrdMacBookingFailed() throws CFException {
      return (  compareChars( getTrdStatus() , trdMacBookingFailed88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setTrdMacBookingFailedTrue() {  			
    	setTrdStatus( trdMacBookingFailed88Value);
   	}

	
	
	

		public static int getTrdOrderPairFieldLength() {
			return TRD_ORDER_PAIR_LENGTH;
		}

}
  
