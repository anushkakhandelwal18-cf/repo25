package com.cloudframe.app.cf04widg 1.dto;

/**
*  The class Dfheiblk is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-14 at 17:20. using version 5.0.0.153
**/


import com.cloudframe.app.cf04widg 1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dfheiblk extends DfheiblkSerialized {
   

								private int eibtime;

								private int eibdate;

						private char[] eibtrnid = Field.fillLowValue(4);

								private int eibtaskn;

						private char[] eibtrmid = Field.fillLowValue(4);

								private short dfheigdi;

								private short eibcposn;

								private short eibcalen;

						private char[] eibaid = Field.fillLowValue(1);

						private char[] eibfn = Field.fillLowValue(2);

						private char[] eibrcode = Field.fillLowValue(6);

						private char[] eibds = Field.fillLowValue(8);

						private char[] eibreqid = Field.fillLowValue(8);

						private char[] eibrsrce = Field.fillLowValue(8);

						private char[] eibsync = Field.fillLowValue(1);

						private char[] eibfree = Field.fillLowValue(1);

						private char[] eibrecv = Field.fillLowValue(1);

						private char[] eibfil01 = Field.fillLowValue(1);

						private char[] eibatt = Field.fillLowValue(1);

						private char[] eibeoc = Field.fillLowValue(1);

						private char[] eibfmh = Field.fillLowValue(1);

						private char[] eibcompl = Field.fillLowValue(1);

						private char[] eibsig = Field.fillLowValue(1);

						private char[] eibconf = Field.fillLowValue(1);

						private char[] eiberr = Field.fillLowValue(1);

						private char[] eiberrcd = Field.fillLowValue(4);

						private char[] eibsynrb = Field.fillLowValue(1);

						private char[] eibnodat = Field.fillLowValue(1);

								private int eibresp;

								private int eibresp2;

						private char[] eibrldbk = Field.fillLowValue(1);
	
	/**
	* Constructor for Dfheiblk
	**/
    public Dfheiblk() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	public int getEibtime() throws CFException {
        if (isEibtimeModified()) { 
           eibtime = refreshEibtime();
        }
   		return eibtime;
	}
	
	/**
	 * 	Update Eibtime with the passed value
	 *  Corresponding COBOL Variable is EIBTIME
	 *	@param number
	 */
	public void setEibtime(int number) {
			eibtime = checkEibtimeMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeEibtime(eibtime);
	}


	public void setEibtime(long number) {
	    number = checkEibtimeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setEibtime((int)number);
	}
	
	public int getEibdate() throws CFException {
        if (isEibdateModified()) { 
           eibdate = refreshEibdate();
        }
   		return eibdate;
	}
	
	/**
	 * 	Update Eibdate with the passed value
	 *  Corresponding COBOL Variable is EIBDATE
	 *	@param number
	 */
	public void setEibdate(int number) {
			eibdate = checkEibdateMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeEibdate(eibdate);
	}


	public void setEibdate(long number) {
	    number = checkEibdateMaxLimit(number); // Truncate if value is beyond +/- Max range
		setEibdate((int)number);
	}
	
	/**
	 *	Returns the value of eibtrnid
	 *	@return eibtrnid
	 */
   public char[] getEibtrnid() throws CFException{
     if (isEibtrnidModified()) { 
        eibtrnid = refreshEibtrnid();
     }
   		return eibtrnid;
   }

  
	/**
	*  set variable eibtrnid
	*  Corresponding COBOL Variable is EIBTRNID
	*  @param value
	**/
   public void setEibtrnid(char[] value) {
      eibtrnid = checkEibtrnidConstraints(value);
      serializeEibtrnid(eibtrnid);
   } 

     /**
	 * 	Update Eibtrnid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibtrnid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibtrnid,eibtrnid.length);
   	
   }
   
   public void setEibtrnid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibtrnid,eibtrnid.length);
   	
   }
   
     /**
	 * 	Update Eibtrnid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibtrnid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibtrnid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibtrnid with another Field
	 *	@param value
	 */
   public void setEibtrnid(Field source) {
       replace(source,0,source.length(),beginEibtrnid,EIBTRNID_LEN);
   	
   }  
   
     /**
	 * 	Update Eibtrnid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibtrnid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibtrnid,EIBTRNID_LEN);
   	
   }
   
     /**
	 * 	Update Eibtrnid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibtrnid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibtrnid+targetIndex,targetLen);
    
   }
	public int getEibtaskn() throws CFException {
        if (isEibtasknModified()) { 
           eibtaskn = refreshEibtaskn();
        }
   		return eibtaskn;
	}
	
	/**
	 * 	Update Eibtaskn with the passed value
	 *  Corresponding COBOL Variable is EIBTASKN
	 *	@param number
	 */
	public void setEibtaskn(int number) {
			eibtaskn = checkEibtasknMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeEibtaskn(eibtaskn);
	}


	public void setEibtaskn(long number) {
	    number = checkEibtasknMaxLimit(number); // Truncate if value is beyond +/- Max range
		setEibtaskn((int)number);
	}
	
	/**
	 *	Returns the value of eibtrmid
	 *	@return eibtrmid
	 */
   public char[] getEibtrmid() throws CFException{
     if (isEibtrmidModified()) { 
        eibtrmid = refreshEibtrmid();
     }
   		return eibtrmid;
   }

  
	/**
	*  set variable eibtrmid
	*  Corresponding COBOL Variable is EIBTRMID
	*  @param value
	**/
   public void setEibtrmid(char[] value) {
      eibtrmid = checkEibtrmidConstraints(value);
      serializeEibtrmid(eibtrmid);
   } 

     /**
	 * 	Update Eibtrmid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibtrmid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibtrmid,eibtrmid.length);
   	
   }
   
   public void setEibtrmid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibtrmid,eibtrmid.length);
   	
   }
   
     /**
	 * 	Update Eibtrmid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibtrmid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibtrmid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibtrmid with another Field
	 *	@param value
	 */
   public void setEibtrmid(Field source) {
       replace(source,0,source.length(),beginEibtrmid,EIBTRMID_LEN);
   	
   }  
   
     /**
	 * 	Update Eibtrmid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibtrmid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibtrmid,EIBTRMID_LEN);
   	
   }
   
     /**
	 * 	Update Eibtrmid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibtrmid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibtrmid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dfheigdi
	 *	@return dfheigdi
	 */
	public short getDfheigdi() throws CFException {
        if (isDfheigdiModified()) { 
           dfheigdi = refreshDfheigdi();
        }
   		return dfheigdi;
	}
	
	/**
	 * 	Update Dfheigdi with the passed value
	 *  Corresponding COBOL Variable is DFHEIGDI
	 *	@param number
	 */
	public void setDfheigdi(short number) {
	     // Truncate if the number is beyond +/- Max range
	    dfheigdi = checkDfheigdiMaxLimit(number); 
		serializeDfheigdi(dfheigdi);
	}

	public void setDfheigdi(int number) {
	    number = checkDfheigdiMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDfheigdi((short)number);
	}
	public void setDfheigdi(long number) {
	    number = checkDfheigdiMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDfheigdi((short)number);
	}
	

	/**
	 *	Returns the value of eibcposn
	 *	@return eibcposn
	 */
	public short getEibcposn() throws CFException {
        if (isEibcposnModified()) { 
           eibcposn = refreshEibcposn();
        }
   		return eibcposn;
	}
	
	/**
	 * 	Update Eibcposn with the passed value
	 *  Corresponding COBOL Variable is EIBCPOSN
	 *	@param number
	 */
	public void setEibcposn(short number) {
	     // Truncate if the number is beyond +/- Max range
	    eibcposn = checkEibcposnMaxLimit(number); 
		serializeEibcposn(eibcposn);
	}

	public void setEibcposn(int number) {
	    number = checkEibcposnMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEibcposn((short)number);
	}
	public void setEibcposn(long number) {
	    number = checkEibcposnMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEibcposn((short)number);
	}
	

	/**
	 *	Returns the value of eibcalen
	 *	@return eibcalen
	 */
	public short getEibcalen() throws CFException {
        if (isEibcalenModified()) { 
           eibcalen = refreshEibcalen();
        }
   		return eibcalen;
	}
	
	/**
	 * 	Update Eibcalen with the passed value
	 *  Corresponding COBOL Variable is EIBCALEN
	 *	@param number
	 */
	public void setEibcalen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    eibcalen = checkEibcalenMaxLimit(number); 
		serializeEibcalen(eibcalen);
	}

	public void setEibcalen(int number) {
	    number = checkEibcalenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEibcalen((short)number);
	}
	public void setEibcalen(long number) {
	    number = checkEibcalenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEibcalen((short)number);
	}
	

	/**
	 *	Returns the value of eibaid
	 *	@return eibaid
	 */
   public char[] getEibaid() throws CFException{
     if (isEibaidModified()) { 
        eibaid = refreshEibaid();
     }
   		return eibaid;
   }

  
	/**
	*  set variable eibaid
	*  Corresponding COBOL Variable is EIBAID
	*  @param value
	**/
   public void setEibaid(char[] value) {
      eibaid = checkEibaidConstraints(value);
      serializeEibaid(eibaid);
   } 

     /**
	 * 	Update Eibaid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibaid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibaid,eibaid.length);
   	
   }
   
   public void setEibaid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibaid,eibaid.length);
   	
   }
   
     /**
	 * 	Update Eibaid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibaid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibaid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibaid with another Field
	 *	@param value
	 */
   public void setEibaid(Field source) {
       replace(source,0,source.length(),beginEibaid,EIBAID_LEN);
   	
   }  
   
     /**
	 * 	Update Eibaid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibaid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibaid,EIBAID_LEN);
   	
   }
   
     /**
	 * 	Update Eibaid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibaid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibaid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eibfn
	 *	@return eibfn
	 */
   public char[] getEibfn() throws CFException{
     if (isEibfnModified()) { 
        eibfn = refreshEibfn();
     }
   		return eibfn;
   }

  
	/**
	*  set variable eibfn
	*  Corresponding COBOL Variable is EIBFN
	*  @param value
	**/
   public void setEibfn(char[] value) {
      eibfn = checkEibfnConstraints(value);
      serializeEibfn(eibfn);
   } 

     /**
	 * 	Update Eibfn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibfn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibfn,eibfn.length);
   	
   }
   
   public void setEibfn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibfn,eibfn.length);
   	
   }
   
     /**
	 * 	Update Eibfn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibfn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibfn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibfn with another Field
	 *	@param value
	 */
   public void setEibfn(Field source) {
       replace(source,0,source.length(),beginEibfn,EIBFN_LEN);
   	
   }  
   
     /**
	 * 	Update Eibfn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibfn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibfn,EIBFN_LEN);
   	
   }
   
     /**
	 * 	Update Eibfn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibfn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibfn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eibrcode
	 *	@return eibrcode
	 */
   public char[] getEibrcode() throws CFException{
     if (isEibrcodeModified()) { 
        eibrcode = refreshEibrcode();
     }
   		return eibrcode;
   }

  
	/**
	*  set variable eibrcode
	*  Corresponding COBOL Variable is EIBRCODE
	*  @param value
	**/
   public void setEibrcode(char[] value) {
      eibrcode = checkEibrcodeConstraints(value);
      serializeEibrcode(eibrcode);
   } 

     /**
	 * 	Update Eibrcode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibrcode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibrcode,eibrcode.length);
   	
   }
   
   public void setEibrcode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibrcode,eibrcode.length);
   	
   }
   
     /**
	 * 	Update Eibrcode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibrcode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibrcode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibrcode with another Field
	 *	@param value
	 */
   public void setEibrcode(Field source) {
       replace(source,0,source.length(),beginEibrcode,EIBRCODE_LEN);
   	
   }  
   
     /**
	 * 	Update Eibrcode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibrcode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibrcode,EIBRCODE_LEN);
   	
   }
   
     /**
	 * 	Update Eibrcode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibrcode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibrcode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eibds
	 *	@return eibds
	 */
   public char[] getEibds() throws CFException{
     if (isEibdsModified()) { 
        eibds = refreshEibds();
     }
   		return eibds;
   }

  
	/**
	*  set variable eibds
	*  Corresponding COBOL Variable is EIBDS
	*  @param value
	**/
   public void setEibds(char[] value) {
      eibds = checkEibdsConstraints(value);
      serializeEibds(eibds);
   } 

     /**
	 * 	Update Eibds 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibds(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibds,eibds.length);
   	
   }
   
   public void setEibds(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibds,eibds.length);
   	
   }
   
     /**
	 * 	Update Eibds 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibds(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibds+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibds with another Field
	 *	@param value
	 */
   public void setEibds(Field source) {
       replace(source,0,source.length(),beginEibds,EIBDS_LEN);
   	
   }  
   
     /**
	 * 	Update Eibds 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibds(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibds,EIBDS_LEN);
   	
   }
   
     /**
	 * 	Update Eibds 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibds(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibds+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eibreqid
	 *	@return eibreqid
	 */
   public char[] getEibreqid() throws CFException{
     if (isEibreqidModified()) { 
        eibreqid = refreshEibreqid();
     }
   		return eibreqid;
   }

  
	/**
	*  set variable eibreqid
	*  Corresponding COBOL Variable is EIBREQID
	*  @param value
	**/
   public void setEibreqid(char[] value) {
      eibreqid = checkEibreqidConstraints(value);
      serializeEibreqid(eibreqid);
   } 

     /**
	 * 	Update Eibreqid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibreqid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibreqid,eibreqid.length);
   	
   }
   
   public void setEibreqid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibreqid,eibreqid.length);
   	
   }
   
     /**
	 * 	Update Eibreqid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibreqid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibreqid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibreqid with another Field
	 *	@param value
	 */
   public void setEibreqid(Field source) {
       replace(source,0,source.length(),beginEibreqid,EIBREQID_LEN);
   	
   }  
   
     /**
	 * 	Update Eibreqid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibreqid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibreqid,EIBREQID_LEN);
   	
   }
   
     /**
	 * 	Update Eibreqid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibreqid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibreqid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eibrsrce
	 *	@return eibrsrce
	 */
   public char[] getEibrsrce() throws CFException{
     if (isEibrsrceModified()) { 
        eibrsrce = refreshEibrsrce();
     }
   		return eibrsrce;
   }

  
	/**
	*  set variable eibrsrce
	*  Corresponding COBOL Variable is EIBRSRCE
	*  @param value
	**/
   public void setEibrsrce(char[] value) {
      eibrsrce = checkEibrsrceConstraints(value);
      serializeEibrsrce(eibrsrce);
   } 

     /**
	 * 	Update Eibrsrce 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibrsrce(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibrsrce,eibrsrce.length);
   	
   }
   
   public void setEibrsrce(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibrsrce,eibrsrce.length);
   	
   }
   
     /**
	 * 	Update Eibrsrce 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibrsrce(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibrsrce+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibrsrce with another Field
	 *	@param value
	 */
   public void setEibrsrce(Field source) {
       replace(source,0,source.length(),beginEibrsrce,EIBRSRCE_LEN);
   	
   }  
   
     /**
	 * 	Update Eibrsrce 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibrsrce(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibrsrce,EIBRSRCE_LEN);
   	
   }
   
     /**
	 * 	Update Eibrsrce 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibrsrce(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibrsrce+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eibsync
	 *	@return eibsync
	 */
   public char[] getEibsync() throws CFException{
     if (isEibsyncModified()) { 
        eibsync = refreshEibsync();
     }
   		return eibsync;
   }

  
	/**
	*  set variable eibsync
	*  Corresponding COBOL Variable is EIBSYNC
	*  @param value
	**/
   public void setEibsync(char[] value) {
      eibsync = checkEibsyncConstraints(value);
      serializeEibsync(eibsync);
   } 

     /**
	 * 	Update Eibsync 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibsync(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibsync,eibsync.length);
   	
   }
   
   public void setEibsync(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibsync,eibsync.length);
   	
   }
   
     /**
	 * 	Update Eibsync 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibsync(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibsync+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibsync with another Field
	 *	@param value
	 */
   public void setEibsync(Field source) {
       replace(source,0,source.length(),beginEibsync,EIBSYNC_LEN);
   	
   }  
   
     /**
	 * 	Update Eibsync 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibsync(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibsync,EIBSYNC_LEN);
   	
   }
   
     /**
	 * 	Update Eibsync 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibsync(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibsync+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eibfree
	 *	@return eibfree
	 */
   public char[] getEibfree() throws CFException{
     if (isEibfreeModified()) { 
        eibfree = refreshEibfree();
     }
   		return eibfree;
   }

  
	/**
	*  set variable eibfree
	*  Corresponding COBOL Variable is EIBFREE
	*  @param value
	**/
   public void setEibfree(char[] value) {
      eibfree = checkEibfreeConstraints(value);
      serializeEibfree(eibfree);
   } 

     /**
	 * 	Update Eibfree 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibfree(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibfree,eibfree.length);
   	
   }
   
   public void setEibfree(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibfree,eibfree.length);
   	
   }
   
     /**
	 * 	Update Eibfree 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibfree(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibfree+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibfree with another Field
	 *	@param value
	 */
   public void setEibfree(Field source) {
       replace(source,0,source.length(),beginEibfree,EIBFREE_LEN);
   	
   }  
   
     /**
	 * 	Update Eibfree 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibfree(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibfree,EIBFREE_LEN);
   	
   }
   
     /**
	 * 	Update Eibfree 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibfree(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibfree+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eibrecv
	 *	@return eibrecv
	 */
   public char[] getEibrecv() throws CFException{
     if (isEibrecvModified()) { 
        eibrecv = refreshEibrecv();
     }
   		return eibrecv;
   }

  
	/**
	*  set variable eibrecv
	*  Corresponding COBOL Variable is EIBRECV
	*  @param value
	**/
   public void setEibrecv(char[] value) {
      eibrecv = checkEibrecvConstraints(value);
      serializeEibrecv(eibrecv);
   } 

     /**
	 * 	Update Eibrecv 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibrecv(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibrecv,eibrecv.length);
   	
   }
   
   public void setEibrecv(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibrecv,eibrecv.length);
   	
   }
   
     /**
	 * 	Update Eibrecv 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibrecv(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibrecv+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibrecv with another Field
	 *	@param value
	 */
   public void setEibrecv(Field source) {
       replace(source,0,source.length(),beginEibrecv,EIBRECV_LEN);
   	
   }  
   
     /**
	 * 	Update Eibrecv 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibrecv(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibrecv,EIBRECV_LEN);
   	
   }
   
     /**
	 * 	Update Eibrecv 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibrecv(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibrecv+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eibfil01
	 *	@return eibfil01
	 */
   public char[] getEibfil01() throws CFException{
     if (isEibfil01Modified()) { 
        eibfil01 = refreshEibfil01();
     }
   		return eibfil01;
   }

  
	/**
	*  set variable eibfil01
	*  Corresponding COBOL Variable is EIBFIL01
	*  @param value
	**/
   public void setEibfil01(char[] value) {
      eibfil01 = checkEibfil01Constraints(value);
      serializeEibfil01(eibfil01);
   } 

     /**
	 * 	Update Eibfil01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibfil01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibfil01,eibfil01.length);
   	
   }
   
   public void setEibfil01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibfil01,eibfil01.length);
   	
   }
   
     /**
	 * 	Update Eibfil01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibfil01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibfil01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibfil01 with another Field
	 *	@param value
	 */
   public void setEibfil01(Field source) {
       replace(source,0,source.length(),beginEibfil01,EIBFIL_01_LEN);
   	
   }  
   
     /**
	 * 	Update Eibfil01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibfil01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibfil01,EIBFIL_01_LEN);
   	
   }
   
     /**
	 * 	Update Eibfil01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibfil01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibfil01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eibatt
	 *	@return eibatt
	 */
   public char[] getEibatt() throws CFException{
     if (isEibattModified()) { 
        eibatt = refreshEibatt();
     }
   		return eibatt;
   }

  
	/**
	*  set variable eibatt
	*  Corresponding COBOL Variable is EIBATT
	*  @param value
	**/
   public void setEibatt(char[] value) {
      eibatt = checkEibattConstraints(value);
      serializeEibatt(eibatt);
   } 

     /**
	 * 	Update Eibatt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibatt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibatt,eibatt.length);
   	
   }
   
   public void setEibatt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibatt,eibatt.length);
   	
   }
   
     /**
	 * 	Update Eibatt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibatt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibatt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibatt with another Field
	 *	@param value
	 */
   public void setEibatt(Field source) {
       replace(source,0,source.length(),beginEibatt,EIBATT_LEN);
   	
   }  
   
     /**
	 * 	Update Eibatt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibatt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibatt,EIBATT_LEN);
   	
   }
   
     /**
	 * 	Update Eibatt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibatt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibatt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eibeoc
	 *	@return eibeoc
	 */
   public char[] getEibeoc() throws CFException{
     if (isEibeocModified()) { 
        eibeoc = refreshEibeoc();
     }
   		return eibeoc;
   }

  
	/**
	*  set variable eibeoc
	*  Corresponding COBOL Variable is EIBEOC
	*  @param value
	**/
   public void setEibeoc(char[] value) {
      eibeoc = checkEibeocConstraints(value);
      serializeEibeoc(eibeoc);
   } 

     /**
	 * 	Update Eibeoc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibeoc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibeoc,eibeoc.length);
   	
   }
   
   public void setEibeoc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibeoc,eibeoc.length);
   	
   }
   
     /**
	 * 	Update Eibeoc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibeoc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibeoc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibeoc with another Field
	 *	@param value
	 */
   public void setEibeoc(Field source) {
       replace(source,0,source.length(),beginEibeoc,EIBEOC_LEN);
   	
   }  
   
     /**
	 * 	Update Eibeoc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibeoc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibeoc,EIBEOC_LEN);
   	
   }
   
     /**
	 * 	Update Eibeoc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibeoc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibeoc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eibfmh
	 *	@return eibfmh
	 */
   public char[] getEibfmh() throws CFException{
     if (isEibfmhModified()) { 
        eibfmh = refreshEibfmh();
     }
   		return eibfmh;
   }

  
	/**
	*  set variable eibfmh
	*  Corresponding COBOL Variable is EIBFMH
	*  @param value
	**/
   public void setEibfmh(char[] value) {
      eibfmh = checkEibfmhConstraints(value);
      serializeEibfmh(eibfmh);
   } 

     /**
	 * 	Update Eibfmh 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibfmh(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibfmh,eibfmh.length);
   	
   }
   
   public void setEibfmh(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibfmh,eibfmh.length);
   	
   }
   
     /**
	 * 	Update Eibfmh 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibfmh(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibfmh+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibfmh with another Field
	 *	@param value
	 */
   public void setEibfmh(Field source) {
       replace(source,0,source.length(),beginEibfmh,EIBFMH_LEN);
   	
   }  
   
     /**
	 * 	Update Eibfmh 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibfmh(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibfmh,EIBFMH_LEN);
   	
   }
   
     /**
	 * 	Update Eibfmh 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibfmh(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibfmh+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eibcompl
	 *	@return eibcompl
	 */
   public char[] getEibcompl() throws CFException{
     if (isEibcomplModified()) { 
        eibcompl = refreshEibcompl();
     }
   		return eibcompl;
   }

  
	/**
	*  set variable eibcompl
	*  Corresponding COBOL Variable is EIBCOMPL
	*  @param value
	**/
   public void setEibcompl(char[] value) {
      eibcompl = checkEibcomplConstraints(value);
      serializeEibcompl(eibcompl);
   } 

     /**
	 * 	Update Eibcompl 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibcompl(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibcompl,eibcompl.length);
   	
   }
   
   public void setEibcompl(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibcompl,eibcompl.length);
   	
   }
   
     /**
	 * 	Update Eibcompl 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibcompl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibcompl+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibcompl with another Field
	 *	@param value
	 */
   public void setEibcompl(Field source) {
       replace(source,0,source.length(),beginEibcompl,EIBCOMPL_LEN);
   	
   }  
   
     /**
	 * 	Update Eibcompl 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibcompl(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibcompl,EIBCOMPL_LEN);
   	
   }
   
     /**
	 * 	Update Eibcompl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibcompl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibcompl+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eibsig
	 *	@return eibsig
	 */
   public char[] getEibsig() throws CFException{
     if (isEibsigModified()) { 
        eibsig = refreshEibsig();
     }
   		return eibsig;
   }

  
	/**
	*  set variable eibsig
	*  Corresponding COBOL Variable is EIBSIG
	*  @param value
	**/
   public void setEibsig(char[] value) {
      eibsig = checkEibsigConstraints(value);
      serializeEibsig(eibsig);
   } 

     /**
	 * 	Update Eibsig 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibsig(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibsig,eibsig.length);
   	
   }
   
   public void setEibsig(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibsig,eibsig.length);
   	
   }
   
     /**
	 * 	Update Eibsig 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibsig(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibsig+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibsig with another Field
	 *	@param value
	 */
   public void setEibsig(Field source) {
       replace(source,0,source.length(),beginEibsig,EIBSIG_LEN);
   	
   }  
   
     /**
	 * 	Update Eibsig 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibsig(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibsig,EIBSIG_LEN);
   	
   }
   
     /**
	 * 	Update Eibsig 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibsig(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibsig+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eibconf
	 *	@return eibconf
	 */
   public char[] getEibconf() throws CFException{
     if (isEibconfModified()) { 
        eibconf = refreshEibconf();
     }
   		return eibconf;
   }

  
	/**
	*  set variable eibconf
	*  Corresponding COBOL Variable is EIBCONF
	*  @param value
	**/
   public void setEibconf(char[] value) {
      eibconf = checkEibconfConstraints(value);
      serializeEibconf(eibconf);
   } 

     /**
	 * 	Update Eibconf 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibconf(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibconf,eibconf.length);
   	
   }
   
   public void setEibconf(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibconf,eibconf.length);
   	
   }
   
     /**
	 * 	Update Eibconf 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibconf(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibconf+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibconf with another Field
	 *	@param value
	 */
   public void setEibconf(Field source) {
       replace(source,0,source.length(),beginEibconf,EIBCONF_LEN);
   	
   }  
   
     /**
	 * 	Update Eibconf 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibconf(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibconf,EIBCONF_LEN);
   	
   }
   
     /**
	 * 	Update Eibconf 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibconf(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibconf+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eiberr
	 *	@return eiberr
	 */
   public char[] getEiberr() throws CFException{
     if (isEiberrModified()) { 
        eiberr = refreshEiberr();
     }
   		return eiberr;
   }

  
	/**
	*  set variable eiberr
	*  Corresponding COBOL Variable is EIBERR
	*  @param value
	**/
   public void setEiberr(char[] value) {
      eiberr = checkEiberrConstraints(value);
      serializeEiberr(eiberr);
   } 

     /**
	 * 	Update Eiberr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEiberr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEiberr,eiberr.length);
   	
   }
   
   public void setEiberr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEiberr,eiberr.length);
   	
   }
   
     /**
	 * 	Update Eiberr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEiberr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEiberr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eiberr with another Field
	 *	@param value
	 */
   public void setEiberr(Field source) {
       replace(source,0,source.length(),beginEiberr,EIBERR_LEN);
   	
   }  
   
     /**
	 * 	Update Eiberr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEiberr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEiberr,EIBERR_LEN);
   	
   }
   
     /**
	 * 	Update Eiberr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEiberr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEiberr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eiberrcd
	 *	@return eiberrcd
	 */
   public char[] getEiberrcd() throws CFException{
     if (isEiberrcdModified()) { 
        eiberrcd = refreshEiberrcd();
     }
   		return eiberrcd;
   }

  
	/**
	*  set variable eiberrcd
	*  Corresponding COBOL Variable is EIBERRCD
	*  @param value
	**/
   public void setEiberrcd(char[] value) {
      eiberrcd = checkEiberrcdConstraints(value);
      serializeEiberrcd(eiberrcd);
   } 

     /**
	 * 	Update Eiberrcd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEiberrcd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEiberrcd,eiberrcd.length);
   	
   }
   
   public void setEiberrcd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEiberrcd,eiberrcd.length);
   	
   }
   
     /**
	 * 	Update Eiberrcd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEiberrcd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEiberrcd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eiberrcd with another Field
	 *	@param value
	 */
   public void setEiberrcd(Field source) {
       replace(source,0,source.length(),beginEiberrcd,EIBERRCD_LEN);
   	
   }  
   
     /**
	 * 	Update Eiberrcd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEiberrcd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEiberrcd,EIBERRCD_LEN);
   	
   }
   
     /**
	 * 	Update Eiberrcd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEiberrcd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEiberrcd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eibsynrb
	 *	@return eibsynrb
	 */
   public char[] getEibsynrb() throws CFException{
     if (isEibsynrbModified()) { 
        eibsynrb = refreshEibsynrb();
     }
   		return eibsynrb;
   }

  
	/**
	*  set variable eibsynrb
	*  Corresponding COBOL Variable is EIBSYNRB
	*  @param value
	**/
   public void setEibsynrb(char[] value) {
      eibsynrb = checkEibsynrbConstraints(value);
      serializeEibsynrb(eibsynrb);
   } 

     /**
	 * 	Update Eibsynrb 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibsynrb(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibsynrb,eibsynrb.length);
   	
   }
   
   public void setEibsynrb(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibsynrb,eibsynrb.length);
   	
   }
   
     /**
	 * 	Update Eibsynrb 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibsynrb(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibsynrb+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibsynrb with another Field
	 *	@param value
	 */
   public void setEibsynrb(Field source) {
       replace(source,0,source.length(),beginEibsynrb,EIBSYNRB_LEN);
   	
   }  
   
     /**
	 * 	Update Eibsynrb 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibsynrb(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibsynrb,EIBSYNRB_LEN);
   	
   }
   
     /**
	 * 	Update Eibsynrb 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibsynrb(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibsynrb+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eibnodat
	 *	@return eibnodat
	 */
   public char[] getEibnodat() throws CFException{
     if (isEibnodatModified()) { 
        eibnodat = refreshEibnodat();
     }
   		return eibnodat;
   }

  
	/**
	*  set variable eibnodat
	*  Corresponding COBOL Variable is EIBNODAT
	*  @param value
	**/
   public void setEibnodat(char[] value) {
      eibnodat = checkEibnodatConstraints(value);
      serializeEibnodat(eibnodat);
   } 

     /**
	 * 	Update Eibnodat 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibnodat(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibnodat,eibnodat.length);
   	
   }
   
   public void setEibnodat(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibnodat,eibnodat.length);
   	
   }
   
     /**
	 * 	Update Eibnodat 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibnodat(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibnodat+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibnodat with another Field
	 *	@param value
	 */
   public void setEibnodat(Field source) {
       replace(source,0,source.length(),beginEibnodat,EIBNODAT_LEN);
   	
   }  
   
     /**
	 * 	Update Eibnodat 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibnodat(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibnodat,EIBNODAT_LEN);
   	
   }
   
     /**
	 * 	Update Eibnodat 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibnodat(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibnodat+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eibresp
	 *	@return eibresp
	 */
	public int getEibresp() throws CFException {
        if (isEibrespModified()) { 
           eibresp = refreshEibresp();
        }
   		return eibresp;
	}
	
	/**
	 * 	Update Eibresp with the passed value
	 *  Corresponding COBOL Variable is EIBRESP
	 *	@param number
	 */
	public void setEibresp(int number) {
	     // Truncate if the number is beyond +/- Max range
	    eibresp = checkEibrespMaxLimit(number); 
		serializeEibresp(eibresp);
	}


	public void setEibresp(long number) {
	    number = checkEibrespMaxLimit(number); // Truncate if value is beyond +/- Max range
		setEibresp((int)number);
	}
	
	/**
	 *	Returns the value of eibresp2
	 *	@return eibresp2
	 */
	public int getEibresp2() throws CFException {
        if (isEibresp2Modified()) { 
           eibresp2 = refreshEibresp2();
        }
   		return eibresp2;
	}
	
	/**
	 * 	Update Eibresp2 with the passed value
	 *  Corresponding COBOL Variable is EIBRESP2
	 *	@param number
	 */
	public void setEibresp2(int number) {
	     // Truncate if the number is beyond +/- Max range
	    eibresp2 = checkEibresp2MaxLimit(number); 
		serializeEibresp2(eibresp2);
	}


	public void setEibresp2(long number) {
	    number = checkEibresp2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEibresp2((int)number);
	}
	
	/**
	 *	Returns the value of eibrldbk
	 *	@return eibrldbk
	 */
   public char[] getEibrldbk() throws CFException{
     if (isEibrldbkModified()) { 
        eibrldbk = refreshEibrldbk();
     }
   		return eibrldbk;
   }

  
	/**
	*  set variable eibrldbk
	*  Corresponding COBOL Variable is EIBRLDBK
	*  @param value
	**/
   public void setEibrldbk(char[] value) {
      eibrldbk = checkEibrldbkConstraints(value);
      serializeEibrldbk(eibrldbk);
   } 

     /**
	 * 	Update Eibrldbk 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEibrldbk(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEibrldbk,eibrldbk.length);
   	
   }
   
   public void setEibrldbk(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEibrldbk,eibrldbk.length);
   	
   }
   
     /**
	 * 	Update Eibrldbk 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEibrldbk(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibrldbk+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Eibrldbk with another Field
	 *	@param value
	 */
   public void setEibrldbk(Field source) {
       replace(source,0,source.length(),beginEibrldbk,EIBRLDBK_LEN);
   	
   }  
   
     /**
	 * 	Update Eibrldbk 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEibrldbk(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEibrldbk,EIBRLDBK_LEN);
   	
   }
   
     /**
	 * 	Update Eibrldbk 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEibrldbk(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEibrldbk+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDfheiblkFieldLength() {
			return DFHEIBLK_LENGTH;
		}

}
  
