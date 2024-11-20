package com.edwardjones.app.trdpb004.dto;

/**
*  The class HdrExcptionRecDash is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 13:17. using version 5.0.0.153
**/


import com.edwardjones.app.trdpb004.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdrExcptionRecDash extends HdrExcptionRecDashSerialized { 
   


						private char[] filler101 = Field.fillLowValue(20);


						private char[] filler201 = Field.fillLowValue(1000);

	
	/**
	* Constructor for HdrExcptionRecDash
	**/
    public HdrExcptionRecDash() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("+-").toCharArray()
             , getStartOffset() + 0
             ,2
             );
       replaceValue( // serialize and save the value
             ("-+-").toCharArray()
             , getStartOffset() + 22
             ,3
             );
       replaceValue( // serialize and save the value
             ("-+ ").toCharArray()
             , getStartOffset() + 1025
             ,3
             );
    }


 

	/**
	 *	Returns the value of filler101
	 *	@return filler101
	 */
   public char[] getFiller101() throws CFException{
     if (isFiller101Modified()) { 
        filler101 = refreshFiller101();
     }
   		return filler101;
   }

  
	/**
	*  set variable filler101
	*  Corresponding COBOL Variable is FILLER1
	*  @param value
	**/
   public void setFiller101(char[] value) {
      filler101 = checkFiller101Constraints(value);
      serializeFiller101(filler101);
   } 

     /**
	 * 	Update Filler101 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller101(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller101,filler101.length);
   	
   }
   
   public void setFiller101(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller101,filler101.length);
   	
   }
   
     /**
	 * 	Update Filler101 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller101(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller101+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler101 with another Field
	 *	@param value
	 */
   public void setFiller101(Field source) {
       replace(source,0,source.length(),beginFiller101,FILLER_101_LEN);
   	
   }  
   
     /**
	 * 	Update Filler101 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller101(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller101,FILLER_101_LEN);
   	
   }
   
     /**
	 * 	Update Filler101 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller101(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller101+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler201
	 *	@return filler201
	 */
   public char[] getFiller201() throws CFException{
     if (isFiller201Modified()) { 
        filler201 = refreshFiller201();
     }
   		return filler201;
   }

  
	/**
	*  set variable filler201
	*  Corresponding COBOL Variable is FILLER2
	*  @param value
	**/
   public void setFiller201(char[] value) {
      filler201 = checkFiller201Constraints(value);
      serializeFiller201(filler201);
   } 

     /**
	 * 	Update Filler201 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller201(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller201,filler201.length);
   	
   }
   
   public void setFiller201(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller201,filler201.length);
   	
   }
   
     /**
	 * 	Update Filler201 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller201(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller201+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler201 with another Field
	 *	@param value
	 */
   public void setFiller201(Field source) {
       replace(source,0,source.length(),beginFiller201,FILLER_201_LEN);
   	
   }  
   
     /**
	 * 	Update Filler201 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller201(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller201,FILLER_201_LEN);
   	
   }
   
     /**
	 * 	Update Filler201 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller201(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller201+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHdrExcptionRecDashFieldLength() {
			return HDR_EXCPTION_REC_DASH_LENGTH;
		}

}
  
