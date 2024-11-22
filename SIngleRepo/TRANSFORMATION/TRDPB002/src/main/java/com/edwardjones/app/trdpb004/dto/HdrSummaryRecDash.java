package com.edwardjones.app.trdpb004.dto;

/**
*  The class HdrSummaryRecDash is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:10. using version 5.0.0.158
**/


import com.edwardjones.app.trdpb004.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdrSummaryRecDash extends HdrSummaryRecDashSerialized { 
   


						private char[] filler102 = Field.fillLowValue(12);


						private char[] filler202 = Field.fillLowValue(11);


						private char[] filler301 = Field.fillLowValue(11);


						private char[] filler401 = Field.fillLowValue(11);


						private char[] filler5 = Field.fillLowValue(8);


						private char[] filler6 = Field.fillLowValue(14);


						private char[] filler7 = Field.fillLowValue(14);


						private char[] filler8 = Field.fillLowValue(14);


						private char[] filler9 = Field.fillLowValue(14);

	
	/**
	* Constructor for HdrSummaryRecDash
	**/
    public HdrSummaryRecDash() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("+-").toCharArray()
             , getStartOffset() + 0
             ,2
             );
       replaceValue( // serialize and save the value
             (" + ").toCharArray()
             , getStartOffset() + 14
             ,3
             );
       replaceValue( // serialize and save the value
             (" + ").toCharArray()
             , getStartOffset() + 28
             ,3
             );
       replaceValue( // serialize and save the value
             (" + ").toCharArray()
             , getStartOffset() + 42
             ,3
             );
       replaceValue( // serialize and save the value
             (" + ").toCharArray()
             , getStartOffset() + 56
             ,3
             );
       replaceValue( // serialize and save the value
             (" + ").toCharArray()
             , getStartOffset() + 67
             ,3
             );
       replaceValue( // serialize and save the value
             (" +  ").toCharArray()
             , getStartOffset() + 84
             ,4
             );
       replaceValue( // serialize and save the value
             (" +  ").toCharArray()
             , getStartOffset() + 102
             ,4
             );
       replaceValue( // serialize and save the value
             (" + ").toCharArray()
             , getStartOffset() + 120
             ,3
             );
       replaceValue( // serialize and save the value
             (" + ").toCharArray()
             , getStartOffset() + 137
             ,3
             );
    }


 

	/**
	 *	Returns the value of filler102
	 *	@return filler102
	 */
   public char[] getFiller102() throws CFException{
     if (isFiller102Modified()) { 
        filler102 = refreshFiller102();
     }
   		return filler102;
   }

  
	/**
	*  set variable filler102
	*  Corresponding COBOL Variable is FILLER1
	*  @param value
	**/
   public void setFiller102(char[] value) {
      filler102 = checkFiller102Constraints(value);
      serializeFiller102(filler102);
   } 

     /**
	 * 	Update Filler102 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller102(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller102,filler102.length);
   	
   }
   
   public void setFiller102(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller102,filler102.length);
   	
   }
   
     /**
	 * 	Update Filler102 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller102(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller102+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler102 with another Field
	 *	@param value
	 */
   public void setFiller102(Field source) {
       replace(source,0,source.length(),beginFiller102,FILLER_102_LEN);
   	
   }  
   
     /**
	 * 	Update Filler102 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller102(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller102,FILLER_102_LEN);
   	
   }
   
     /**
	 * 	Update Filler102 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller102(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller102+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler202
	 *	@return filler202
	 */
   public char[] getFiller202() throws CFException{
     if (isFiller202Modified()) { 
        filler202 = refreshFiller202();
     }
   		return filler202;
   }

  
	/**
	*  set variable filler202
	*  Corresponding COBOL Variable is FILLER2
	*  @param value
	**/
   public void setFiller202(char[] value) {
      filler202 = checkFiller202Constraints(value);
      serializeFiller202(filler202);
   } 

     /**
	 * 	Update Filler202 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller202(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller202,filler202.length);
   	
   }
   
   public void setFiller202(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller202,filler202.length);
   	
   }
   
     /**
	 * 	Update Filler202 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller202(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller202+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler202 with another Field
	 *	@param value
	 */
   public void setFiller202(Field source) {
       replace(source,0,source.length(),beginFiller202,FILLER_202_LEN);
   	
   }  
   
     /**
	 * 	Update Filler202 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller202(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller202,FILLER_202_LEN);
   	
   }
   
     /**
	 * 	Update Filler202 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller202(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller202+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler301
	 *	@return filler301
	 */
   public char[] getFiller301() throws CFException{
     if (isFiller301Modified()) { 
        filler301 = refreshFiller301();
     }
   		return filler301;
   }

  
	/**
	*  set variable filler301
	*  Corresponding COBOL Variable is FILLER3
	*  @param value
	**/
   public void setFiller301(char[] value) {
      filler301 = checkFiller301Constraints(value);
      serializeFiller301(filler301);
   } 

     /**
	 * 	Update Filler301 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller301(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller301,filler301.length);
   	
   }
   
   public void setFiller301(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller301,filler301.length);
   	
   }
   
     /**
	 * 	Update Filler301 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller301(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller301+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler301 with another Field
	 *	@param value
	 */
   public void setFiller301(Field source) {
       replace(source,0,source.length(),beginFiller301,FILLER_301_LEN);
   	
   }  
   
     /**
	 * 	Update Filler301 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller301(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller301,FILLER_301_LEN);
   	
   }
   
     /**
	 * 	Update Filler301 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller301(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller301+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler401
	 *	@return filler401
	 */
   public char[] getFiller401() throws CFException{
     if (isFiller401Modified()) { 
        filler401 = refreshFiller401();
     }
   		return filler401;
   }

  
	/**
	*  set variable filler401
	*  Corresponding COBOL Variable is FILLER4
	*  @param value
	**/
   public void setFiller401(char[] value) {
      filler401 = checkFiller401Constraints(value);
      serializeFiller401(filler401);
   } 

     /**
	 * 	Update Filler401 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller401(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller401,filler401.length);
   	
   }
   
   public void setFiller401(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller401,filler401.length);
   	
   }
   
     /**
	 * 	Update Filler401 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller401(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller401+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler401 with another Field
	 *	@param value
	 */
   public void setFiller401(Field source) {
       replace(source,0,source.length(),beginFiller401,FILLER_401_LEN);
   	
   }  
   
     /**
	 * 	Update Filler401 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller401(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller401,FILLER_401_LEN);
   	
   }
   
     /**
	 * 	Update Filler401 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller401(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller401+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler5
	 *	@return filler5
	 */
   public char[] getFiller5() throws CFException{
     if (isFiller5Modified()) { 
        filler5 = refreshFiller5();
     }
   		return filler5;
   }

  
	/**
	*  set variable filler5
	*  Corresponding COBOL Variable is FILLER5
	*  @param value
	**/
   public void setFiller5(char[] value) {
      filler5 = checkFiller5Constraints(value);
      serializeFiller5(filler5);
   } 

     /**
	 * 	Update Filler5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller5,filler5.length);
   	
   }
   
   public void setFiller5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller5,filler5.length);
   	
   }
   
     /**
	 * 	Update Filler5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler5 with another Field
	 *	@param value
	 */
   public void setFiller5(Field source) {
       replace(source,0,source.length(),beginFiller5,FILLER_5_LEN);
   	
   }  
   
     /**
	 * 	Update Filler5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller5,FILLER_5_LEN);
   	
   }
   
     /**
	 * 	Update Filler5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler6
	 *	@return filler6
	 */
   public char[] getFiller6() throws CFException{
     if (isFiller6Modified()) { 
        filler6 = refreshFiller6();
     }
   		return filler6;
   }

  
	/**
	*  set variable filler6
	*  Corresponding COBOL Variable is FILLER6
	*  @param value
	**/
   public void setFiller6(char[] value) {
      filler6 = checkFiller6Constraints(value);
      serializeFiller6(filler6);
   } 

     /**
	 * 	Update Filler6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller6,filler6.length);
   	
   }
   
   public void setFiller6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller6,filler6.length);
   	
   }
   
     /**
	 * 	Update Filler6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler6 with another Field
	 *	@param value
	 */
   public void setFiller6(Field source) {
       replace(source,0,source.length(),beginFiller6,FILLER_6_LEN);
   	
   }  
   
     /**
	 * 	Update Filler6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller6,FILLER_6_LEN);
   	
   }
   
     /**
	 * 	Update Filler6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller6+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler7
	 *	@return filler7
	 */
   public char[] getFiller7() throws CFException{
     if (isFiller7Modified()) { 
        filler7 = refreshFiller7();
     }
   		return filler7;
   }

  
	/**
	*  set variable filler7
	*  Corresponding COBOL Variable is FILLER7
	*  @param value
	**/
   public void setFiller7(char[] value) {
      filler7 = checkFiller7Constraints(value);
      serializeFiller7(filler7);
   } 

     /**
	 * 	Update Filler7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller7(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller7,filler7.length);
   	
   }
   
   public void setFiller7(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller7,filler7.length);
   	
   }
   
     /**
	 * 	Update Filler7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller7+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler7 with another Field
	 *	@param value
	 */
   public void setFiller7(Field source) {
       replace(source,0,source.length(),beginFiller7,FILLER_7_LEN);
   	
   }  
   
     /**
	 * 	Update Filler7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller7(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller7,FILLER_7_LEN);
   	
   }
   
     /**
	 * 	Update Filler7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller7+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler8
	 *	@return filler8
	 */
   public char[] getFiller8() throws CFException{
     if (isFiller8Modified()) { 
        filler8 = refreshFiller8();
     }
   		return filler8;
   }

  
	/**
	*  set variable filler8
	*  Corresponding COBOL Variable is FILLER8
	*  @param value
	**/
   public void setFiller8(char[] value) {
      filler8 = checkFiller8Constraints(value);
      serializeFiller8(filler8);
   } 

     /**
	 * 	Update Filler8 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller8(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller8,filler8.length);
   	
   }
   
   public void setFiller8(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller8,filler8.length);
   	
   }
   
     /**
	 * 	Update Filler8 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller8+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler8 with another Field
	 *	@param value
	 */
   public void setFiller8(Field source) {
       replace(source,0,source.length(),beginFiller8,FILLER_8_LEN);
   	
   }  
   
     /**
	 * 	Update Filler8 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller8(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller8,FILLER_8_LEN);
   	
   }
   
     /**
	 * 	Update Filler8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller8+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler9
	 *	@return filler9
	 */
   public char[] getFiller9() throws CFException{
     if (isFiller9Modified()) { 
        filler9 = refreshFiller9();
     }
   		return filler9;
   }

  
	/**
	*  set variable filler9
	*  Corresponding COBOL Variable is FILLER9
	*  @param value
	**/
   public void setFiller9(char[] value) {
      filler9 = checkFiller9Constraints(value);
      serializeFiller9(filler9);
   } 

     /**
	 * 	Update Filler9 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller9(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller9,filler9.length);
   	
   }
   
   public void setFiller9(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller9,filler9.length);
   	
   }
   
     /**
	 * 	Update Filler9 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller9+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler9 with another Field
	 *	@param value
	 */
   public void setFiller9(Field source) {
       replace(source,0,source.length(),beginFiller9,FILLER_9_LEN);
   	
   }  
   
     /**
	 * 	Update Filler9 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller9(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller9,FILLER_9_LEN);
   	
   }
   
     /**
	 * 	Update Filler9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller9+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHdrSummaryRecDashFieldLength() {
			return HDR_SUMMARY_REC_DASH_LENGTH;
		}

}
  
