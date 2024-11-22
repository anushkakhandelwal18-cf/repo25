package com.edwardjones.app.trdpb004.file.records;

/**
*  The class RunlogRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 19:20. using version 5.0.0.158
**/


import com.edwardjones.app.trdpb004.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RunlogRecord extends RunlogRecordSerialized { 
   

						private char[] runlogRecordString = Field.fillLowValue(90);
	
	/**
	* Constructor for RunlogRecord
	**/
    public RunlogRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of runlogRecordString
	 *	@return runlogRecordString
	 */
   public char[] getRunlogRecordString() throws CFException{
     if (isRunlogRecordStringModified()) { 
        runlogRecordString = refreshRunlogRecordString();
     }
   		return runlogRecordString;
   }

  
	/**
	*  set variable runlogRecordString
	*  Corresponding COBOL Variable is RUNLOG-RECORD-STRING
	*  @param value
	**/
   public void setRunlogRecordString(char[] value) {
      runlogRecordString = checkRunlogRecordStringConstraints(value);
      serializeRunlogRecordString(runlogRecordString);
   } 

     /**
	 * 	Update RunlogRecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunlogRecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRunlogRecordString,runlogRecordString.length);
   	
   }
   
   public void setRunlogRecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRunlogRecordString,runlogRecordString.length);
   	
   }
   
     /**
	 * 	Update RunlogRecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunlogRecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunlogRecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RunlogRecordString with another Field
	 *	@param value
	 */
   public void setRunlogRecordString(Field source) {
       replace(source,0,source.length(),beginRunlogRecordString,RUNLOG_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update RunlogRecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunlogRecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRunlogRecordString,RUNLOG_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update RunlogRecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunlogRecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunlogRecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRunlogRecordFieldLength() {
			return RUNLOG_RECORD_LENGTH;
		}

}
  
