package com.edwardjones.app.trdpb004.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 13:17. using version 5.0.0.153
**/


import com.edwardjones.app.trdpb004.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

								private char[] sqlcode_Ws = Field.fillLowValue(4);

								private int runlogFileStatus;

								private int summaryFileStatus;

								private int excptionFileStatus;

						private char[] exception = Field.fillLowValue(200);

						private char[] hdrRunlogRec = new char[86];

						private char[] hdrExcptionRec = new char[1028];

						private char[] hdrSummaryRec = new char[140];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHdrRunlogRec("| TRANSACTION  | CURRENCY | START TIMESTAMP            | END TIMESTAMP              | ".toCharArray());
								setHdrExcptionRec("| EXCEPTION TYPE       | DESCRIPTION                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | ".toCharArray());
								setHdrSummaryRec("| CUSTOMER     | OVERDUE     | REJECTED    | SETTLED     | CURRENCY | OPEN BALANCE   |  DEBITS         |  CREDITS        | CLOSE BALANCE  | ".toCharArray());
    }


 

	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
   public char[] getSqlcode_Ws() throws CFException{
     if (isSqlcode_WsModified()) { 
        sqlcode_Ws = refreshSqlcode_Ws();
     }
   		return sqlcode_Ws;
   }

  
	/**
	*  set variable sqlcode_Ws
	*  Corresponding COBOL Variable is WS-SQLCODE
	*  @param value
	**/
   public void setSqlcode_Ws(char[] value) {
      sqlcode_Ws = checkSqlcode_WsConstraints(value);
      serializeSqlcode_Ws(sqlcode_Ws);
   } 

     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlcode_Ws,sqlcode_Ws.length);
   	
   }
   
   public void setSqlcode_Ws(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcode_Ws,sqlcode_Ws.length);
   	
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcode_Ws+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlcode_Ws with another Field
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source) {
       replace(source,0,source.length(),beginSqlcode_Ws,SQLCODE__WS_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlcode_Ws,SQLCODE__WS_LEN);
   	
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcode_Ws+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of runlogFileStatus
	 *	@return runlogFileStatus
	 */
	public int getRunlogFileStatus() throws CFException {
       if (isRunlogFileStatusModified()) { 
           runlogFileStatus = refreshRunlogFileStatus();
        }
   		return runlogFileStatus;
	}
	

	
	   
	/**
	 * 	Update RunlogFileStatus with the passed value
	 *  Corresponding COBOL Variable is RUNLOG-FILE-STATUS
	 *	@param number
	 */
	public void setRunlogFileStatus(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    runlogFileStatus = checkRunlogFileStatusMaxLimit(number); 
		serializeRunlogFileStatus(runlogFileStatus);
	}
	

	public void setRunlogFileStatus(long number) {
	    number = checkRunlogFileStatusMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRunlogFileStatus((int)number);
	}
	
	/**
	 * 	Update RunlogFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setRunlogFileStatus(char[] value) throws CFException {
		 runlogFileStatus = serializeRunlogFileStatus(value);
	}
	/**
	 * 	Update RunlogFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRunlogFileStatusString(char[] value) throws CFException {
		 setRunlogFileStatus(value);
	}
	/**
	 *	Returns the value of summaryFileStatus
	 *	@return summaryFileStatus
	 */
	public int getSummaryFileStatus() throws CFException {
       if (isSummaryFileStatusModified()) { 
           summaryFileStatus = refreshSummaryFileStatus();
        }
   		return summaryFileStatus;
	}
	

	
	   
	/**
	 * 	Update SummaryFileStatus with the passed value
	 *  Corresponding COBOL Variable is SUMMARY-FILE-STATUS
	 *	@param number
	 */
	public void setSummaryFileStatus(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    summaryFileStatus = checkSummaryFileStatusMaxLimit(number); 
		serializeSummaryFileStatus(summaryFileStatus);
	}
	

	public void setSummaryFileStatus(long number) {
	    number = checkSummaryFileStatusMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSummaryFileStatus((int)number);
	}
	
	/**
	 * 	Update SummaryFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setSummaryFileStatus(char[] value) throws CFException {
		 summaryFileStatus = serializeSummaryFileStatus(value);
	}
	/**
	 * 	Update SummaryFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSummaryFileStatusString(char[] value) throws CFException {
		 setSummaryFileStatus(value);
	}
	/**
	 *	Returns the value of excptionFileStatus
	 *	@return excptionFileStatus
	 */
	public int getExcptionFileStatus() throws CFException {
       if (isExcptionFileStatusModified()) { 
           excptionFileStatus = refreshExcptionFileStatus();
        }
   		return excptionFileStatus;
	}
	

	
	   
	/**
	 * 	Update ExcptionFileStatus with the passed value
	 *  Corresponding COBOL Variable is EXCPTION-FILE-STATUS
	 *	@param number
	 */
	public void setExcptionFileStatus(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    excptionFileStatus = checkExcptionFileStatusMaxLimit(number); 
		serializeExcptionFileStatus(excptionFileStatus);
	}
	

	public void setExcptionFileStatus(long number) {
	    number = checkExcptionFileStatusMaxLimit(number); // Truncate if value is beyond +/- Max range
		setExcptionFileStatus((int)number);
	}
	
	/**
	 * 	Update ExcptionFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setExcptionFileStatus(char[] value) throws CFException {
		 excptionFileStatus = serializeExcptionFileStatus(value);
	}
	/**
	 * 	Update ExcptionFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExcptionFileStatusString(char[] value) throws CFException {
		 setExcptionFileStatus(value);
	}
	/**
	 *	Returns the value of exception
	 *	@return exception
	 */
   public char[] getException() throws CFException{
   		return exception;
   }

  
	/**
	*  set variable exception
	*  Corresponding COBOL Variable is WS-EXCEPTION
	*  @param value
	**/
   public void setException(char[] value) {
       value = checkExceptionConstraints(value);
       arraycopy(value,0,exception,0,value.length);
   } 
	public void setException(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,exception,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdrRunlogRec
	 *	@return hdrRunlogRec
	 */
   public char[] getHdrRunlogRec() throws CFException{
   		return hdrRunlogRec;
   }

  
	/**
	*  set variable hdrRunlogRec
	*  Corresponding COBOL Variable is HDR-RUNLOG-REC
	*  @param value
	**/
   public void setHdrRunlogRec(char[] value) {
       value = checkHdrRunlogRecConstraints(value);
       arraycopy(value,0,hdrRunlogRec,0,value.length);
   } 
	public void setHdrRunlogRec(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdrRunlogRec,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdrExcptionRec
	 *	@return hdrExcptionRec
	 */
   public char[] getHdrExcptionRec() throws CFException{
   		return hdrExcptionRec;
   }

  
	/**
	*  set variable hdrExcptionRec
	*  Corresponding COBOL Variable is HDR-EXCPTION-REC
	*  @param value
	**/
   public void setHdrExcptionRec(char[] value) {
       value = checkHdrExcptionRecConstraints(value);
       arraycopy(value,0,hdrExcptionRec,0,value.length);
   } 
	public void setHdrExcptionRec(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdrExcptionRec,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdrSummaryRec
	 *	@return hdrSummaryRec
	 */
   public char[] getHdrSummaryRec() throws CFException{
   		return hdrSummaryRec;
   }

  
	/**
	*  set variable hdrSummaryRec
	*  Corresponding COBOL Variable is HDR-SUMMARY-REC
	*  @param value
	**/
   public void setHdrSummaryRec(char[] value) {
       value = checkHdrSummaryRecConstraints(value);
       arraycopy(value,0,hdrSummaryRec,0,value.length);
   } 
	public void setHdrSummaryRec(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdrSummaryRec,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
