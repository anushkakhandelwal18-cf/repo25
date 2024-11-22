package com.edwardjones.app.trdpb002.dto;

/**
*  The class Dcltbtrdpos is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:10. using version 5.0.0.158
**/


import com.edwardjones.app.trdpb002.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class Dcltbtrdpos extends DcltbtrdposSerialized { 
   

						private char[] posCurrency = Field.fillLowValue(3);

								private int posSacNumber;

						private char[] posFigi = Field.fillLowValue(12);

								private BigDecimal posBalance = BigDecimal.ZERO;
	
	/**
	* Constructor for Dcltbtrdpos
	**/
    public Dcltbtrdpos() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of posCurrency
	 *	@return posCurrency
	 */
   public char[] getPosCurrency() throws CFException{
     if (isPosCurrencyModified()) { 
        posCurrency = refreshPosCurrency();
     }
   		return posCurrency;
   }

  
	/**
	*  set variable posCurrency
	*  Corresponding COBOL Variable is POS-CURRENCY
	*  @param value
	**/
   public void setPosCurrency(char[] value) {
      posCurrency = checkPosCurrencyConstraints(value);
      serializePosCurrency(posCurrency);
   } 

     /**
	 * 	Update PosCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPosCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPosCurrency,posCurrency.length);
   	
   }
   
   public void setPosCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPosCurrency,posCurrency.length);
   	
   }
   
     /**
	 * 	Update PosCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPosCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPosCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PosCurrency with another Field
	 *	@param value
	 */
   public void setPosCurrency(Field source) {
       replace(source,0,source.length(),beginPosCurrency,POS_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update PosCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPosCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPosCurrency,POS_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update PosCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPosCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPosCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of posSacNumber
	 *	@return posSacNumber
	 */
	public int getPosSacNumber() throws CFException {
        if (isPosSacNumberModified()) { 
           posSacNumber = refreshPosSacNumber();
        }
   		return posSacNumber;
	}
	
	/**
	 * 	Update PosSacNumber with the passed value
	 *  Corresponding COBOL Variable is POS-SAC-NUMBER
	 *	@param number
	 */
	public void setPosSacNumber(int number) {
	     // Truncate if the number is beyond +/- Max range
	    posSacNumber = checkPosSacNumberMaxLimit(number); 
		serializePosSacNumber(posSacNumber);
	}


	public void setPosSacNumber(long number) {
	    number = checkPosSacNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPosSacNumber((int)number);
	}
	
	/**
	 *	Returns the value of posFigi
	 *	@return posFigi
	 */
   public char[] getPosFigi() throws CFException{
     if (isPosFigiModified()) { 
        posFigi = refreshPosFigi();
     }
   		return posFigi;
   }

  
	/**
	*  set variable posFigi
	*  Corresponding COBOL Variable is POS-FIGI
	*  @param value
	**/
   public void setPosFigi(char[] value) {
      posFigi = checkPosFigiConstraints(value);
      serializePosFigi(posFigi);
   } 

     /**
	 * 	Update PosFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPosFigi(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPosFigi,posFigi.length);
   	
   }
   
   public void setPosFigi(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPosFigi,posFigi.length);
   	
   }
   
     /**
	 * 	Update PosFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPosFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPosFigi+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PosFigi with another Field
	 *	@param value
	 */
   public void setPosFigi(Field source) {
       replace(source,0,source.length(),beginPosFigi,POS_FIGI_LEN);
   	
   }  
   
     /**
	 * 	Update PosFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPosFigi(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPosFigi,POS_FIGI_LEN);
   	
   }
   
     /**
	 * 	Update PosFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPosFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPosFigi+targetIndex,targetLen);
    
   }
	public BigDecimal getPosBalance() throws CFException {
        if (isPosBalanceModified()) { 
           posBalance = refreshPosBalance();
        }
   		return posBalance;
	}

    public char[] getPosBalanceString() {
          return  posBalanceString();
    }
	
	/**
	 * 	Update PosBalance with the passed number
	 *  Corresponding COBOL Variable is POS-BALANCE
	 *	@param number
	 */
	public void setPosBalance(BigDecimal number) {	
     posBalance = checkPosBalanceMaxLimit(number);
	    serializePosBalance(posBalance);
   }

	
	
	

		public static int getDcltbtrdposFieldLength() {
			return DCLTBTRDPOS_LENGTH;
		}

}
  
