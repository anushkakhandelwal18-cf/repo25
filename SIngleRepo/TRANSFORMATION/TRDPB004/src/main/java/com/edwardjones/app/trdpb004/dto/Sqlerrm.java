package com.edwardjones.app.trdpb004.dto;

/**
*  The class Sqlerrm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:10. using version 5.0.0.158
**/


import com.edwardjones.app.trdpb004.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sqlerrm extends SqlerrmSerialized { 
   

								private short sqlerrml;

						private char[] sqlerrmc = Field.fillLowValue(70);
	
	/**
	* Constructor for Sqlerrm
	**/
    public Sqlerrm() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sqlerrm. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sqlerrm(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sqlerrml
	 *	@return sqlerrml
	 */
	public short getSqlerrml() throws CFException {
        if (isSqlerrmlModified()) { 
           sqlerrml = refreshSqlerrml();
        }
   		return sqlerrml;
	}
	
	/**
	 * 	Update Sqlerrml with the passed value
	 *  Corresponding COBOL Variable is SQLERRML
	 *	@param number
	 */
	public void setSqlerrml(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlerrml = checkSqlerrmlMaxLimit(number); 
		serializeSqlerrml(sqlerrml);
	}

	public void setSqlerrml(int number) {
	    number = checkSqlerrmlMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlerrml((short)number);
	}
	public void setSqlerrml(long number) {
	    number = checkSqlerrmlMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlerrml((short)number);
	}
	

	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException{
     if (isSqlerrmcModified()) { 
        sqlerrmc = refreshSqlerrmc();
     }
   		return sqlerrmc;
   }

  
	/**
	*  set variable sqlerrmc
	*  Corresponding COBOL Variable is SQLERRMC
	*  @param value
	**/
   public void setSqlerrmc(char[] value) {
      sqlerrmc = checkSqlerrmcConstraints(value);
      serializeSqlerrmc(sqlerrmc);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlerrmc,sqlerrmc.length);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlerrmc,sqlerrmc.length);
   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlerrmc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
       replace(source,0,source.length(),beginSqlerrmc,SQLERRMC_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlerrmc,SQLERRMC_LEN);
   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlerrmc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSqlerrmFieldLength() {
			return SQLERRM_LENGTH;
		}

}
  
