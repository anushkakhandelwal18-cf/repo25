package com.edwardjones.app.trdpb004.dto;

/**
*  The class PrtExcptionRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 12:55. using version 5.0.0.153
**/


import com.edwardjones.app.trdpb004.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PrtExcptionRec extends PrtExcptionRecSerialized { 
   


						private char[] prtExcptionType = Field.fillLowValue(20);


						private char[] prtExcptionDesc = Field.fillLowValue(1000);

	
	/**
	* Constructor for PrtExcptionRec
	**/
    public PrtExcptionRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("| ").toCharArray()
             , getStartOffset() + 0
             ,2
             );
       replaceValue( // serialize and save the value
             (" | ").toCharArray()
             , getStartOffset() + 22
             ,3
             );
       replaceValue( // serialize and save the value
             (" | ").toCharArray()
             , getStartOffset() + 1025
             ,3
             );
    }


 

	/**
	 *	Returns the value of prtExcptionType
	 *	@return prtExcptionType
	 */
   public char[] getPrtExcptionType() throws CFException{
     if (isPrtExcptionTypeModified()) { 
        prtExcptionType = refreshPrtExcptionType();
     }
   		return prtExcptionType;
   }

  
	/**
	*  set variable prtExcptionType
	*  Corresponding COBOL Variable is PRT-EXCPTION-TYPE
	*  @param value
	**/
   public void setPrtExcptionType(char[] value) {
      prtExcptionType = checkPrtExcptionTypeConstraints(value);
      serializePrtExcptionType(prtExcptionType);
   } 

     /**
	 * 	Update PrtExcptionType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtExcptionType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtExcptionType,prtExcptionType.length);
   	
   }
   
   public void setPrtExcptionType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtExcptionType,prtExcptionType.length);
   	
   }
   
     /**
	 * 	Update PrtExcptionType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtExcptionType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtExcptionType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtExcptionType with another Field
	 *	@param value
	 */
   public void setPrtExcptionType(Field source) {
       replace(source,0,source.length(),beginPrtExcptionType,PRT_EXCPTION_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update PrtExcptionType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtExcptionType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtExcptionType,PRT_EXCPTION_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update PrtExcptionType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtExcptionType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtExcptionType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prtExcptionDesc
	 *	@return prtExcptionDesc
	 */
   public char[] getPrtExcptionDesc() throws CFException{
     if (isPrtExcptionDescModified()) { 
        prtExcptionDesc = refreshPrtExcptionDesc();
     }
   		return prtExcptionDesc;
   }

  
	/**
	*  set variable prtExcptionDesc
	*  Corresponding COBOL Variable is PRT-EXCPTION-DESC
	*  @param value
	**/
   public void setPrtExcptionDesc(char[] value) {
      prtExcptionDesc = checkPrtExcptionDescConstraints(value);
      serializePrtExcptionDesc(prtExcptionDesc);
   } 

     /**
	 * 	Update PrtExcptionDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtExcptionDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrtExcptionDesc,prtExcptionDesc.length);
   	
   }
   
   public void setPrtExcptionDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrtExcptionDesc,prtExcptionDesc.length);
   	
   }
   
     /**
	 * 	Update PrtExcptionDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtExcptionDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtExcptionDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrtExcptionDesc with another Field
	 *	@param value
	 */
   public void setPrtExcptionDesc(Field source) {
       replace(source,0,source.length(),beginPrtExcptionDesc,PRT_EXCPTION_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update PrtExcptionDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtExcptionDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrtExcptionDesc,PRT_EXCPTION_DESC_LEN);
   	
   }
   
     /**
	 * 	Update PrtExcptionDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtExcptionDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrtExcptionDesc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getPrtExcptionRecFieldLength() {
			return PRT_EXCPTION_REC_LENGTH;
		}

}
  
