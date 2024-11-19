package com.cloudframe.app.cf04widg 1.dto.serialize;

/**
*  The class DfheiblkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-14 at 17:20. using version 5.0.0.153
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DfheiblkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DfheiblkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DFHEIBLK_LENGTH = 85;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEibtime;
            protected  int beginEibdate;
            protected  int beginEibtrnid;
            protected  int beginEibtaskn;
            protected  int beginEibtrmid;
            protected  int beginDfheigdi;
            protected  int beginEibcposn;
            protected  int beginEibcalen;
            protected  int beginEibaid;
            protected  int beginEibfn;
            protected  int beginEibrcode;
            protected  int beginEibds;
            protected  int beginEibreqid;
            protected  int beginEibrsrce;
            protected  int beginEibsync;
            protected  int beginEibfree;
            protected  int beginEibrecv;
            protected  int beginEibfil01;
            protected  int beginEibatt;
            protected  int beginEibeoc;
            protected  int beginEibfmh;
            protected  int beginEibcompl;
            protected  int beginEibsig;
            protected  int beginEibconf;
            protected  int beginEiberr;
            protected  int beginEiberrcd;
            protected  int beginEibsynrb;
            protected  int beginEibnodat;
            protected  int beginEibresp;
            protected  int beginEibresp2;
            protected  int beginEibrldbk;
	
	/**
	* Constructor for DfheiblkSerialized
	**/
    public DfheiblkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DfheiblkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DFHEIBLK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEibtime = getStartOffset() + 0;	// set offset for serialization
  
             beginEibdate = getStartOffset() + 4;	// set offset for serialization
  
             beginEibtrnid = getStartOffset() + 8;	// set offset for serialization
  
             beginEibtaskn = getStartOffset() + 12;	// set offset for serialization
  
             beginEibtrmid = getStartOffset() + 16;	// set offset for serialization
  
             beginDfheigdi = getStartOffset() + 20;	// set offset for serialization
  
             beginEibcposn = getStartOffset() + 22;	// set offset for serialization
  
             beginEibcalen = getStartOffset() + 24;	// set offset for serialization
  
             beginEibaid = getStartOffset() + 26;	// set offset for serialization
  
             beginEibfn = getStartOffset() + 27;	// set offset for serialization
  
             beginEibrcode = getStartOffset() + 29;	// set offset for serialization
  
             beginEibds = getStartOffset() + 35;	// set offset for serialization
  
             beginEibreqid = getStartOffset() + 43;	// set offset for serialization
  
             beginEibrsrce = getStartOffset() + 51;	// set offset for serialization
  
             beginEibsync = getStartOffset() + 59;	// set offset for serialization
  
             beginEibfree = getStartOffset() + 60;	// set offset for serialization
  
             beginEibrecv = getStartOffset() + 61;	// set offset for serialization
  
             beginEibfil01 = getStartOffset() + 62;	// set offset for serialization
  
             beginEibatt = getStartOffset() + 63;	// set offset for serialization
  
             beginEibeoc = getStartOffset() + 64;	// set offset for serialization
  
             beginEibfmh = getStartOffset() + 65;	// set offset for serialization
  
             beginEibcompl = getStartOffset() + 66;	// set offset for serialization
  
             beginEibsig = getStartOffset() + 67;	// set offset for serialization
  
             beginEibconf = getStartOffset() + 68;	// set offset for serialization
  
             beginEiberr = getStartOffset() + 69;	// set offset for serialization
  
             beginEiberrcd = getStartOffset() + 70;	// set offset for serialization
  
             beginEibsynrb = getStartOffset() + 74;	// set offset for serialization
  
             beginEibnodat = getStartOffset() + 75;	// set offset for serialization
  
             beginEibresp = getStartOffset() + 76;	// set offset for serialization
  
             beginEibresp2 = getStartOffset() + 80;	// set offset for serialization
  
             beginEibrldbk = getStartOffset() + 84;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localEibtimeCounter = -1;
        public boolean isEibtimeModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localEibtimeCounter != sharedCounter;
           localEibtimeCounter = sharedCounter; return hasModified; 
        }
	    public boolean eibtimeIsNumeric() {
	      return decimalIsNumeric(beginEibtime,EIBTIME_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int EIBTIME_LEN = 4;
  	/**
	 * 	serializeEibtime
	 */
	protected void serializeEibtime(int eibtime) {
		   putDecimal(beginEibtime,eibtime,EIBTIME_LEN,true);
   }
   

   protected int checkEibtimeMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshEibtime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEibtime() throws CFException {	
   	try { 
		 return (getIntDecimal(beginEibtime,EIBTIME_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("eibtime", beginEibtime,EIBTIME_LEN);
     }
   	}
        int localEibdateCounter = -1;
        public boolean isEibdateModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localEibdateCounter != sharedCounter;
           localEibdateCounter = sharedCounter; return hasModified; 
        }
	    public boolean eibdateIsNumeric() {
	      return decimalIsNumeric(beginEibdate,EIBDATE_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int EIBDATE_LEN = 4;
  	/**
	 * 	serializeEibdate
	 */
	protected void serializeEibdate(int eibdate) {
		   putDecimal(beginEibdate,eibdate,EIBDATE_LEN,true);
   }
   

   protected int checkEibdateMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshEibdate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEibdate() throws CFException {	
   	try { 
		 return (getIntDecimal(beginEibdate,EIBDATE_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("eibdate", beginEibdate,EIBDATE_LEN);
     }
   	}
     int localEibtrnidCounter = -1;
     public boolean isEibtrnidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibtrnidCounter != sharedCounter;
         localEibtrnidCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBTRNID_LEN = 4;
	/**
	 * 	serialize this Eibtrnid
	 */
   protected void serializeEibtrnid(char[] eibtrnid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibtrnid,0,getStringValue(),beginEibtrnid,EIBTRNID_LEN);
       localEibtrnidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibtrnidConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshEibtrnid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibtrnid() {	 
   		return (substring(getStringValue(),beginEibtrnid,beginEibtrnid + EIBTRNID_LEN));
   	}
        int localEibtasknCounter = -1;
        public boolean isEibtasknModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localEibtasknCounter != sharedCounter;
           localEibtasknCounter = sharedCounter; return hasModified; 
        }
	    public boolean eibtasknIsNumeric() {
	      return decimalIsNumeric(beginEibtaskn,EIBTASKN_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int EIBTASKN_LEN = 4;
  	/**
	 * 	serializeEibtaskn
	 */
	protected void serializeEibtaskn(int eibtaskn) {
		   putDecimal(beginEibtaskn,eibtaskn,EIBTASKN_LEN,true);
   }
   

   protected int checkEibtasknMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshEibtaskn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEibtaskn() throws CFException {	
   	try { 
		 return (getIntDecimal(beginEibtaskn,EIBTASKN_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("eibtaskn", beginEibtaskn,EIBTASKN_LEN);
     }
   	}
     int localEibtrmidCounter = -1;
     public boolean isEibtrmidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibtrmidCounter != sharedCounter;
         localEibtrmidCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBTRMID_LEN = 4;
	/**
	 * 	serialize this Eibtrmid
	 */
   protected void serializeEibtrmid(char[] eibtrmid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibtrmid,0,getStringValue(),beginEibtrmid,EIBTRMID_LEN);
       localEibtrmidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibtrmidConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshEibtrmid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibtrmid() {	 
   		return (substring(getStringValue(),beginEibtrmid,beginEibtrmid + EIBTRMID_LEN));
   	}
         int localDfheigdiCounter = -1;
         public boolean isDfheigdiModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDfheigdiCounter != sharedCounter;
            localDfheigdiCounter = sharedCounter; return hasModified; 
         }
   protected static final int DFHEIGDI_LEN = 2;
  	/**
	 * serializeDfheigdi
	 */
	protected void serializeDfheigdi(short dfheigdi) {
           replaceValue( //  save the value as string
                   getBinaryString( dfheigdi,DFHEIGDI_LEN)
                  ,beginDfheigdi
                  ,DFHEIGDI_LEN
                 );
            localDfheigdiCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkDfheigdiMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshDfheigdi is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshDfheigdi() {	 
			return (getShort(beginDfheigdi));
   	}
         int localEibcposnCounter = -1;
         public boolean isEibcposnModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEibcposnCounter != sharedCounter;
            localEibcposnCounter = sharedCounter; return hasModified; 
         }
   protected static final int EIBCPOSN_LEN = 2;
  	/**
	 * serializeEibcposn
	 */
	protected void serializeEibcposn(short eibcposn) {
           replaceValue( //  save the value as string
                   getBinaryString( eibcposn,EIBCPOSN_LEN)
                  ,beginEibcposn
                  ,EIBCPOSN_LEN
                 );
            localEibcposnCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkEibcposnMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshEibcposn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshEibcposn() {	 
			return (getShort(beginEibcposn));
   	}
         int localEibcalenCounter = -1;
         public boolean isEibcalenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEibcalenCounter != sharedCounter;
            localEibcalenCounter = sharedCounter; return hasModified; 
         }
   protected static final int EIBCALEN_LEN = 2;
  	/**
	 * serializeEibcalen
	 */
	protected void serializeEibcalen(short eibcalen) {
           replaceValue( //  save the value as string
                   getBinaryString( eibcalen,EIBCALEN_LEN)
                  ,beginEibcalen
                  ,EIBCALEN_LEN
                 );
            localEibcalenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkEibcalenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshEibcalen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshEibcalen() {	 
			return (getShort(beginEibcalen));
   	}
     int localEibaidCounter = -1;
     public boolean isEibaidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibaidCounter != sharedCounter;
         localEibaidCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBAID_LEN = 1;
	/**
	 * 	serialize this Eibaid
	 */
   protected void serializeEibaid(char[] eibaid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibaid,0,getStringValue(),beginEibaid,EIBAID_LEN);
       localEibaidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibaidConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEibaid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibaid() {	 
   		return (substring(getStringValue(),beginEibaid,beginEibaid + EIBAID_LEN));
   	}
     int localEibfnCounter = -1;
     public boolean isEibfnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibfnCounter != sharedCounter;
         localEibfnCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBFN_LEN = 2;
	/**
	 * 	serialize this Eibfn
	 */
   protected void serializeEibfn(char[] eibfn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibfn,0,getStringValue(),beginEibfn,EIBFN_LEN);
       localEibfnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibfnConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshEibfn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibfn() {	 
   		return (substring(getStringValue(),beginEibfn,beginEibfn + EIBFN_LEN));
   	}
     int localEibrcodeCounter = -1;
     public boolean isEibrcodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibrcodeCounter != sharedCounter;
         localEibrcodeCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBRCODE_LEN = 6;
	/**
	 * 	serialize this Eibrcode
	 */
   protected void serializeEibrcode(char[] eibrcode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibrcode,0,getStringValue(),beginEibrcode,EIBRCODE_LEN);
       localEibrcodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibrcodeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshEibrcode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibrcode() {	 
   		return (substring(getStringValue(),beginEibrcode,beginEibrcode + EIBRCODE_LEN));
   	}
     int localEibdsCounter = -1;
     public boolean isEibdsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibdsCounter != sharedCounter;
         localEibdsCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBDS_LEN = 8;
	/**
	 * 	serialize this Eibds
	 */
   protected void serializeEibds(char[] eibds) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibds,0,getStringValue(),beginEibds,EIBDS_LEN);
       localEibdsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibdsConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshEibds is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibds() {	 
   		return (substring(getStringValue(),beginEibds,beginEibds + EIBDS_LEN));
   	}
     int localEibreqidCounter = -1;
     public boolean isEibreqidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibreqidCounter != sharedCounter;
         localEibreqidCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBREQID_LEN = 8;
	/**
	 * 	serialize this Eibreqid
	 */
   protected void serializeEibreqid(char[] eibreqid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibreqid,0,getStringValue(),beginEibreqid,EIBREQID_LEN);
       localEibreqidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibreqidConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshEibreqid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibreqid() {	 
   		return (substring(getStringValue(),beginEibreqid,beginEibreqid + EIBREQID_LEN));
   	}
     int localEibrsrceCounter = -1;
     public boolean isEibrsrceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibrsrceCounter != sharedCounter;
         localEibrsrceCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBRSRCE_LEN = 8;
	/**
	 * 	serialize this Eibrsrce
	 */
   protected void serializeEibrsrce(char[] eibrsrce) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibrsrce,0,getStringValue(),beginEibrsrce,EIBRSRCE_LEN);
       localEibrsrceCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibrsrceConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshEibrsrce is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibrsrce() {	 
   		return (substring(getStringValue(),beginEibrsrce,beginEibrsrce + EIBRSRCE_LEN));
   	}
     int localEibsyncCounter = -1;
     public boolean isEibsyncModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibsyncCounter != sharedCounter;
         localEibsyncCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBSYNC_LEN = 1;
	/**
	 * 	serialize this Eibsync
	 */
   protected void serializeEibsync(char[] eibsync) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibsync,0,getStringValue(),beginEibsync,EIBSYNC_LEN);
       localEibsyncCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibsyncConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEibsync is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibsync() {	 
   		return (substring(getStringValue(),beginEibsync,beginEibsync + EIBSYNC_LEN));
   	}
     int localEibfreeCounter = -1;
     public boolean isEibfreeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibfreeCounter != sharedCounter;
         localEibfreeCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBFREE_LEN = 1;
	/**
	 * 	serialize this Eibfree
	 */
   protected void serializeEibfree(char[] eibfree) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibfree,0,getStringValue(),beginEibfree,EIBFREE_LEN);
       localEibfreeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibfreeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEibfree is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibfree() {	 
   		return (substring(getStringValue(),beginEibfree,beginEibfree + EIBFREE_LEN));
   	}
     int localEibrecvCounter = -1;
     public boolean isEibrecvModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibrecvCounter != sharedCounter;
         localEibrecvCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBRECV_LEN = 1;
	/**
	 * 	serialize this Eibrecv
	 */
   protected void serializeEibrecv(char[] eibrecv) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibrecv,0,getStringValue(),beginEibrecv,EIBRECV_LEN);
       localEibrecvCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibrecvConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEibrecv is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibrecv() {	 
   		return (substring(getStringValue(),beginEibrecv,beginEibrecv + EIBRECV_LEN));
   	}
     int localEibfil01Counter = -1;
     public boolean isEibfil01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibfil01Counter != sharedCounter;
         localEibfil01Counter = sharedCounter; return hasModified;
     }
	protected static final int EIBFIL_01_LEN = 1;
	/**
	 * 	serialize this Eibfil01
	 */
   protected void serializeEibfil01(char[] eibfil01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibfil01,0,getStringValue(),beginEibfil01,EIBFIL_01_LEN);
       localEibfil01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibfil01Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEibfil01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibfil01() {	 
   		return (substring(getStringValue(),beginEibfil01,beginEibfil01 + EIBFIL_01_LEN));
   	}
     int localEibattCounter = -1;
     public boolean isEibattModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibattCounter != sharedCounter;
         localEibattCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBATT_LEN = 1;
	/**
	 * 	serialize this Eibatt
	 */
   protected void serializeEibatt(char[] eibatt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibatt,0,getStringValue(),beginEibatt,EIBATT_LEN);
       localEibattCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibattConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEibatt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibatt() {	 
   		return (substring(getStringValue(),beginEibatt,beginEibatt + EIBATT_LEN));
   	}
     int localEibeocCounter = -1;
     public boolean isEibeocModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibeocCounter != sharedCounter;
         localEibeocCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBEOC_LEN = 1;
	/**
	 * 	serialize this Eibeoc
	 */
   protected void serializeEibeoc(char[] eibeoc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibeoc,0,getStringValue(),beginEibeoc,EIBEOC_LEN);
       localEibeocCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibeocConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEibeoc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibeoc() {	 
   		return (substring(getStringValue(),beginEibeoc,beginEibeoc + EIBEOC_LEN));
   	}
     int localEibfmhCounter = -1;
     public boolean isEibfmhModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibfmhCounter != sharedCounter;
         localEibfmhCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBFMH_LEN = 1;
	/**
	 * 	serialize this Eibfmh
	 */
   protected void serializeEibfmh(char[] eibfmh) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibfmh,0,getStringValue(),beginEibfmh,EIBFMH_LEN);
       localEibfmhCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibfmhConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEibfmh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibfmh() {	 
   		return (substring(getStringValue(),beginEibfmh,beginEibfmh + EIBFMH_LEN));
   	}
     int localEibcomplCounter = -1;
     public boolean isEibcomplModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibcomplCounter != sharedCounter;
         localEibcomplCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBCOMPL_LEN = 1;
	/**
	 * 	serialize this Eibcompl
	 */
   protected void serializeEibcompl(char[] eibcompl) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibcompl,0,getStringValue(),beginEibcompl,EIBCOMPL_LEN);
       localEibcomplCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibcomplConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEibcompl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibcompl() {	 
   		return (substring(getStringValue(),beginEibcompl,beginEibcompl + EIBCOMPL_LEN));
   	}
     int localEibsigCounter = -1;
     public boolean isEibsigModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibsigCounter != sharedCounter;
         localEibsigCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBSIG_LEN = 1;
	/**
	 * 	serialize this Eibsig
	 */
   protected void serializeEibsig(char[] eibsig) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibsig,0,getStringValue(),beginEibsig,EIBSIG_LEN);
       localEibsigCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibsigConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEibsig is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibsig() {	 
   		return (substring(getStringValue(),beginEibsig,beginEibsig + EIBSIG_LEN));
   	}
     int localEibconfCounter = -1;
     public boolean isEibconfModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibconfCounter != sharedCounter;
         localEibconfCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBCONF_LEN = 1;
	/**
	 * 	serialize this Eibconf
	 */
   protected void serializeEibconf(char[] eibconf) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibconf,0,getStringValue(),beginEibconf,EIBCONF_LEN);
       localEibconfCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibconfConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEibconf is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibconf() {	 
   		return (substring(getStringValue(),beginEibconf,beginEibconf + EIBCONF_LEN));
   	}
     int localEiberrCounter = -1;
     public boolean isEiberrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEiberrCounter != sharedCounter;
         localEiberrCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBERR_LEN = 1;
	/**
	 * 	serialize this Eiberr
	 */
   protected void serializeEiberr(char[] eiberr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eiberr,0,getStringValue(),beginEiberr,EIBERR_LEN);
       localEiberrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEiberrConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEiberr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEiberr() {	 
   		return (substring(getStringValue(),beginEiberr,beginEiberr + EIBERR_LEN));
   	}
     int localEiberrcdCounter = -1;
     public boolean isEiberrcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEiberrcdCounter != sharedCounter;
         localEiberrcdCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBERRCD_LEN = 4;
	/**
	 * 	serialize this Eiberrcd
	 */
   protected void serializeEiberrcd(char[] eiberrcd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eiberrcd,0,getStringValue(),beginEiberrcd,EIBERRCD_LEN);
       localEiberrcdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEiberrcdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshEiberrcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEiberrcd() {	 
   		return (substring(getStringValue(),beginEiberrcd,beginEiberrcd + EIBERRCD_LEN));
   	}
     int localEibsynrbCounter = -1;
     public boolean isEibsynrbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibsynrbCounter != sharedCounter;
         localEibsynrbCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBSYNRB_LEN = 1;
	/**
	 * 	serialize this Eibsynrb
	 */
   protected void serializeEibsynrb(char[] eibsynrb) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibsynrb,0,getStringValue(),beginEibsynrb,EIBSYNRB_LEN);
       localEibsynrbCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibsynrbConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEibsynrb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibsynrb() {	 
   		return (substring(getStringValue(),beginEibsynrb,beginEibsynrb + EIBSYNRB_LEN));
   	}
     int localEibnodatCounter = -1;
     public boolean isEibnodatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibnodatCounter != sharedCounter;
         localEibnodatCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBNODAT_LEN = 1;
	/**
	 * 	serialize this Eibnodat
	 */
   protected void serializeEibnodat(char[] eibnodat) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibnodat,0,getStringValue(),beginEibnodat,EIBNODAT_LEN);
       localEibnodatCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibnodatConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEibnodat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibnodat() {	 
   		return (substring(getStringValue(),beginEibnodat,beginEibnodat + EIBNODAT_LEN));
   	}
         int localEibrespCounter = -1;
         public boolean isEibrespModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEibrespCounter != sharedCounter;
            localEibrespCounter = sharedCounter; return hasModified; 
         }
   protected static final int EIBRESP_LEN = 4;
  	/**
	 * serializeEibresp
	 */
	protected void serializeEibresp(int eibresp) {
           replaceValue( //  save the value as string
                   getBinaryString( eibresp,EIBRESP_LEN)
                  ,beginEibresp
                  ,EIBRESP_LEN
                 );
            localEibrespCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkEibrespMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshEibresp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEibresp() {	 
			return (getInt(beginEibresp));
   	}
         int localEibresp2Counter = -1;
         public boolean isEibresp2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEibresp2Counter != sharedCounter;
            localEibresp2Counter = sharedCounter; return hasModified; 
         }
   protected static final int EIBRESP_2_LEN = 4;
  	/**
	 * serializeEibresp2
	 */
	protected void serializeEibresp2(int eibresp2) {
           replaceValue( //  save the value as string
                   getBinaryString( eibresp2,EIBRESP_2_LEN)
                  ,beginEibresp2
                  ,EIBRESP_2_LEN
                 );
            localEibresp2Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkEibresp2MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshEibresp2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEibresp2() {	 
			return (getInt(beginEibresp2));
   	}
     int localEibrldbkCounter = -1;
     public boolean isEibrldbkModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEibrldbkCounter != sharedCounter;
         localEibrldbkCounter = sharedCounter; return hasModified;
     }
	protected static final int EIBRLDBK_LEN = 1;
	/**
	 * 	serialize this Eibrldbk
	 */
   protected void serializeEibrldbk(char[] eibrldbk) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eibrldbk,0,getStringValue(),beginEibrldbk,EIBRLDBK_LEN);
       localEibrldbkCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEibrldbkConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEibrldbk is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEibrldbk() {	 
   		return (substring(getStringValue(),beginEibrldbk,beginEibrldbk + EIBRLDBK_LEN));
   	}




}
  
