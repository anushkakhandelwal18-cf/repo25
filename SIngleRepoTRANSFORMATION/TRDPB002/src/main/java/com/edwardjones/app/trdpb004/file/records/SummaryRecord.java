package com.edwardjones.app.trdpb004.file.records;

/**
*  The class SummaryRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 12:55. using version 5.0.0.153
**/


import com.edwardjones.app.trdpb004.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SummaryRecord extends SummaryRecordSerialized { 
   

						private char[] summaryRecordString = Field.fillLowValue(140);
	
	/**
	* Constructor for SummaryRecord
	**/
    public SummaryRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of summaryRecordString
	 *	@return summaryRecordString
	 */
   public char[] getSummaryRecordString() throws CFException{
     if (isSummaryRecordStringModified()) { 
        summaryRecordString = refreshSummaryRecordString();
     }
   		return summaryRecordString;
   }

  
	/**
	*  set variable summaryRecordString
	*  Corresponding COBOL Variable is SUMMARY-RECORD-STRING
	*  @param value
	**/
   public void setSummaryRecordString(char[] value) {
      summaryRecordString = checkSummaryRecordStringConstraints(value);
      serializeSummaryRecordString(summaryRecordString);
   } 

     /**
	 * 	Update SummaryRecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSummaryRecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSummaryRecordString,summaryRecordString.length);
   	
   }
   
   public void setSummaryRecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSummaryRecordString,summaryRecordString.length);
   	
   }
   
     /**
	 * 	Update SummaryRecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSummaryRecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSummaryRecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SummaryRecordString with another Field
	 *	@param value
	 */
   public void setSummaryRecordString(Field source) {
       replace(source,0,source.length(),beginSummaryRecordString,SUMMARY_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update SummaryRecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSummaryRecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSummaryRecordString,SUMMARY_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update SummaryRecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSummaryRecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSummaryRecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSummaryRecordFieldLength() {
			return SUMMARY_RECORD_LENGTH;
		}

}
  
