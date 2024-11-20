package com.edwardjones.app.trdpb004.dto;

/**
*  The class HdrRunlogRecDash is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 12:55. using version 5.0.0.153
**/


import com.edwardjones.app.trdpb004.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdrRunlogRecDash extends HdrRunlogRecDashSerialized { 
   


						private char[] filler1 = Field.fillLowValue(12);


						private char[] filler2 = Field.fillLowValue(8);


						private char[] filler3 = Field.fillLowValue(26);


						private char[] filler4 = Field.fillLowValue(26);

	
	/**
	* Constructor for HdrRunlogRecDash
	**/
    public HdrRunlogRecDash() {
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
             , getStartOffset() + 14
             ,3
             );
       replaceValue( // serialize and save the value
             ("-+-").toCharArray()
             , getStartOffset() + 25
             ,3
             );
       replaceValue( // serialize and save the value
             ("-+-").toCharArray()
             , getStartOffset() + 54
             ,3
             );
       replaceValue( // serialize and save the value
             ("-+ ").toCharArray()
             , getStartOffset() + 83
             ,3
             );
    }


 

	/**
	 *	Returns the value of filler1
	 *	@return filler1
	 */
   public char[] getFiller1() throws CFException{
     if (isFiller1Modified()) { 
        filler1 = refreshFiller1();
     }
   		return filler1;
   }

  
	/**
	*  set variable filler1
	*  Corresponding COBOL Variable is FILLER1
	*  @param value
	**/
   public void setFiller1(char[] value) {
      filler1 = checkFiller1Constraints(value);
      serializeFiller1(filler1);
   } 

     /**
	 * 	Update Filler1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller1,filler1.length);
   	
   }
   
   public void setFiller1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller1,filler1.length);
   	
   }
   
     /**
	 * 	Update Filler1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler1 with another Field
	 *	@param value
	 */
   public void setFiller1(Field source) {
       replace(source,0,source.length(),beginFiller1,FILLER_1_LEN);
   	
   }  
   
     /**
	 * 	Update Filler1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller1,FILLER_1_LEN);
   	
   }
   
     /**
	 * 	Update Filler1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler2
	 *	@return filler2
	 */
   public char[] getFiller2() throws CFException{
     if (isFiller2Modified()) { 
        filler2 = refreshFiller2();
     }
   		return filler2;
   }

  
	/**
	*  set variable filler2
	*  Corresponding COBOL Variable is FILLER2
	*  @param value
	**/
   public void setFiller2(char[] value) {
      filler2 = checkFiller2Constraints(value);
      serializeFiller2(filler2);
   } 

     /**
	 * 	Update Filler2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller2,filler2.length);
   	
   }
   
   public void setFiller2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller2,filler2.length);
   	
   }
   
     /**
	 * 	Update Filler2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler2 with another Field
	 *	@param value
	 */
   public void setFiller2(Field source) {
       replace(source,0,source.length(),beginFiller2,FILLER_2_LEN);
   	
   }  
   
     /**
	 * 	Update Filler2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller2,FILLER_2_LEN);
   	
   }
   
     /**
	 * 	Update Filler2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler3
	 *	@return filler3
	 */
   public char[] getFiller3() throws CFException{
     if (isFiller3Modified()) { 
        filler3 = refreshFiller3();
     }
   		return filler3;
   }

  
	/**
	*  set variable filler3
	*  Corresponding COBOL Variable is FILLER3
	*  @param value
	**/
   public void setFiller3(char[] value) {
      filler3 = checkFiller3Constraints(value);
      serializeFiller3(filler3);
   } 

     /**
	 * 	Update Filler3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller3,filler3.length);
   	
   }
   
   public void setFiller3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller3,filler3.length);
   	
   }
   
     /**
	 * 	Update Filler3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler3 with another Field
	 *	@param value
	 */
   public void setFiller3(Field source) {
       replace(source,0,source.length(),beginFiller3,FILLER_3_LEN);
   	
   }  
   
     /**
	 * 	Update Filler3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller3,FILLER_3_LEN);
   	
   }
   
     /**
	 * 	Update Filler3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler4
	 *	@return filler4
	 */
   public char[] getFiller4() throws CFException{
     if (isFiller4Modified()) { 
        filler4 = refreshFiller4();
     }
   		return filler4;
   }

  
	/**
	*  set variable filler4
	*  Corresponding COBOL Variable is FILLER4
	*  @param value
	**/
   public void setFiller4(char[] value) {
      filler4 = checkFiller4Constraints(value);
      serializeFiller4(filler4);
   } 

     /**
	 * 	Update Filler4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller4,filler4.length);
   	
   }
   
   public void setFiller4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller4,filler4.length);
   	
   }
   
     /**
	 * 	Update Filler4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler4 with another Field
	 *	@param value
	 */
   public void setFiller4(Field source) {
       replace(source,0,source.length(),beginFiller4,FILLER_4_LEN);
   	
   }  
   
     /**
	 * 	Update Filler4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller4,FILLER_4_LEN);
   	
   }
   
     /**
	 * 	Update Filler4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller4+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHdrRunlogRecDashFieldLength() {
			return HDR_RUNLOG_REC_DASH_LENGTH;
		}

}
  
