package com.edwardjones.app.repository.impl;

import com.edwardjones.app.repository.Trdpb004Repository;
import com.cloudframe.app.data.Field;
import com.edwardjones.app.common.SQLS;
import com.cloudframe.app.dao.Db2Base;
import java.math.MathContext;
import com.edwardjones.app.common.CONSTANTS;
import java.math.BigDecimal;
import com.cloudframe.app.dao.SqlBase;
import java.sql.ResultSet;
import com.cloudframe.app.dao.CfSqlca;
import java.sql.SQLException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.edwardjones.app.trdpb004.dto.*;

@Repository
@Qualifier("trdpb004Repository")
public class Trdpb004RepositoryImpl implements Trdpb004Repository {
    Logger logger = LoggerFactory.getLogger(Trdpb004RepositoryImpl.class);

// declare:start
    int sqlFetchCounter = 0;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:openExcptionCursorTrdpb004
    
/**
******     DECLARE EXCPTION_CURSOR CURSOR WITH HOLD FOR            
******     SELECT  EXC_TYPE                                        
******            ,EXC_DESCRIPTION                                 
******       FROM TBTRDEXC                                         
******     ORDER BY EXC_TYPE ASC, EXC_DESCRIPTION ASC              
**/
    public ResultSet openExcptionCursorTrdpb004(Sqlca sqlca) throws Exception {
ResultSet excptionCursorResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	excptionCursorResultSet = db2Base.startQuery(3/* SQL Sequence*/, CONSTANTS.LITERAL_TRDPB004)
    .withSql(SQLS.SQL_587719915)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return excptionCursorResultSet;
    }
// methodEnd:openExcptionCursorTrdpb004
// methodStart:fetchExcptionCursorTrdpb004
    
/**
******    FETCH EXCPTION_CURSOR                                    
******     INTO :EXC-TYPE                                          
******         ,:EXC-DESCRIPTION                                   
**/
    public void fetchExcptionCursorTrdpb004(ResultSet excptionCursorResultSet, Sqlca sqlca, Dcltbtrdexc dcltbtrdexc) throws Exception {
try {
	boolean hasResults = excptionCursorResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = excptionCursorResultSet.getObject(1);
 if (resultObj != null) {
   dcltbtrdexc.setExcType( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = excptionCursorResultSet.getObject(2);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   dcltbtrdexc.setExcDescription( value,0, value.length,2,value.length);
   dcltbtrdexc.getExcDescription().setExcDescriptionLen((short) value.length);
} else {sqlca.setSqlcode(-305); }
		sqlFetchCounter++;
	} else {
		sqlca.setSqlcode(100); // No More rows
	}
}


catch (SQLException e) {
    if(e.getMessage().contains("result set is closed")) {
		fill501SqlcaObject(sqlca); // cursor closed
	}
	else {
 		logger.error("excptionCursorResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchExcptionCursorTrdpb004
// methodStart:fetchExcptionCursor1Trdpb004
    
/**
******        FETCH EXCPTION_CURSOR                                
******         INTO :EXC-TYPE                                      
******             ,:EXC-DESCRIPTION                               
**/
    public void fetchExcptionCursor1Trdpb004(ResultSet excptionCursorResultSet, Sqlca sqlca, Dcltbtrdexc dcltbtrdexc) throws Exception {
try {
	boolean hasResults = excptionCursorResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = excptionCursorResultSet.getObject(1);
 if (resultObj != null) {
   dcltbtrdexc.setExcType( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = excptionCursorResultSet.getObject(2);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   dcltbtrdexc.setExcDescription( value,0, value.length,2,value.length);
   dcltbtrdexc.getExcDescription().setExcDescriptionLen((short) value.length);
} else {sqlca.setSqlcode(-305); }
		sqlFetchCounter++;
	} else {
		sqlca.setSqlcode(100); // No More rows
	}
}


catch (SQLException e) {
    if(e.getMessage().contains("result set is closed")) {
		fill501SqlcaObject(sqlca); // cursor closed
	}
	else {
 		logger.error("excptionCursorResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchExcptionCursor1Trdpb004
// methodStart:closeExcptionCursorTrdpb004
    
/**
******    CLOSE EXCPTION_CURSOR                                    
**/
    public void closeExcptionCursorTrdpb004(ResultSet excptionCursorResultSet, Sqlca sqlca) throws Exception {

	closeCursor(excptionCursorResultSet,sqlca);

    }
// methodEnd:closeExcptionCursorTrdpb004
// methodStart:openRunlogCursorTrdpb004
    
/**
******     DECLARE RUNLOG_CURSOR CURSOR WITH HOLD FOR              
******     SELECT  LOG_TRANSACTION                                 
******            ,LOG_CURRENCY                                    
******            ,LOG_START_TS                                    
******            ,LOG_END_TS                                      
******       FROM TBTRDLOG                                         
******     ORDER BY LOG_TRANSACTION ASC, LOG_CURRENCY ASC          
**/
    public ResultSet openRunlogCursorTrdpb004(Sqlca sqlca) throws Exception {
ResultSet runlogCursorResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	runlogCursorResultSet = db2Base.startQuery(5/* SQL Sequence*/, CONSTANTS.LITERAL_TRDPB004)
    .withSql(SQLS.SQL_1599399814)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return runlogCursorResultSet;
    }
// methodEnd:openRunlogCursorTrdpb004
// methodStart:fetchRunlogCursorTrdpb004
    
/**
******    FETCH RUNLOG_CURSOR                                      
******     INTO :LOG-TRANSACTION                                   
******         ,:LOG-CURRENCY                                      
******         ,:LOG-START-TS                                      
******         ,:LOG-END-TS                                        
**/
    public void fetchRunlogCursorTrdpb004(ResultSet runlogCursorResultSet, Sqlca sqlca, Dcltbtrdlog dcltbtrdlog) throws Exception {
try {
	boolean hasResults = runlogCursorResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObjString = runlogCursorResultSet.getString(1);
 if (resultObjString != null) {
   dcltbtrdlog.setLogTransaction( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = runlogCursorResultSet.getObject(2);
 if (resultObj != null) {
   dcltbtrdlog.setLogCurrency( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = runlogCursorResultSet.getString(3);
 if (resultObjString != null) {
   dcltbtrdlog.setLogStartTs( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = runlogCursorResultSet.getString(4);
 if (resultObjString != null) {
   dcltbtrdlog.setLogEndTs( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
		sqlFetchCounter++;
	} else {
		sqlca.setSqlcode(100); // No More rows
	}
}


catch (SQLException e) {
    if(e.getMessage().contains("result set is closed")) {
		fill501SqlcaObject(sqlca); // cursor closed
	}
	else {
 		logger.error("runlogCursorResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchRunlogCursorTrdpb004
// methodStart:fetchRunlogCursor1Trdpb004
    
/**
******        FETCH RUNLOG_CURSOR                                  
******         INTO :LOG-TRANSACTION                               
******             ,:LOG-CURRENCY                                  
******             ,:LOG-START-TS                                  
******             ,:LOG-END-TS                                    
**/
    public void fetchRunlogCursor1Trdpb004(ResultSet runlogCursorResultSet, Sqlca sqlca, Dcltbtrdlog dcltbtrdlog) throws Exception {
try {
	boolean hasResults = runlogCursorResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObjString = runlogCursorResultSet.getString(1);
 if (resultObjString != null) {
   dcltbtrdlog.setLogTransaction( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = runlogCursorResultSet.getObject(2);
 if (resultObj != null) {
   dcltbtrdlog.setLogCurrency( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = runlogCursorResultSet.getString(3);
 if (resultObjString != null) {
   dcltbtrdlog.setLogStartTs( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = runlogCursorResultSet.getString(4);
 if (resultObjString != null) {
   dcltbtrdlog.setLogEndTs( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
		sqlFetchCounter++;
	} else {
		sqlca.setSqlcode(100); // No More rows
	}
}


catch (SQLException e) {
    if(e.getMessage().contains("result set is closed")) {
		fill501SqlcaObject(sqlca); // cursor closed
	}
	else {
 		logger.error("runlogCursorResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchRunlogCursor1Trdpb004
// methodStart:closeRunlogCursorTrdpb004
    
/**
******    CLOSE RUNLOG_CURSOR                                      
**/
    public void closeRunlogCursorTrdpb004(ResultSet runlogCursorResultSet, Sqlca sqlca) throws Exception {

	closeCursor(runlogCursorResultSet,sqlca);

    }
// methodEnd:closeRunlogCursorTrdpb004
// methodStart:openSummaryCursorTrdpb004
    
/**
******     DECLARE SUMMARY_CURSOR CURSOR WITH HOLD FOR             
******     SELECT  SUM_CUSTOMER_ID                                 
******            ,SUM_OVERDUE                                     
******            ,SUM_REJECTED                                    
******            ,SUM_SETTLED                                     
******            ,SUM_CURRENCY                                    
******            ,SUM_OPEN_BALANCE                                
******            ,SUM_TOTAL_DEBIT                                 
******            ,SUM_TOTAL_CREDIT                                
******            ,SUM_CLOSE_BALANCE                               
******       FROM TBTRDSUM                                         
******     ORDER BY SUM_CUSTOMER_ID ASC                            
**/
    public ResultSet openSummaryCursorTrdpb004(Sqlca sqlca) throws Exception {
ResultSet summaryCursorResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	summaryCursorResultSet = db2Base.startQuery(4/* SQL Sequence*/, CONSTANTS.LITERAL_TRDPB004)
    .withSql(SQLS.SQL_1000751994)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return summaryCursorResultSet;
    }
// methodEnd:openSummaryCursorTrdpb004
// methodStart:fetchSummaryCursorTrdpb004
    
/**
******    FETCH SUMMARY_CURSOR                                     
******     INTO :SUM-CUSTOMER-ID                                   
******         ,:SUM-OVERDUE                                       
******         ,:SUM-REJECTED                                      
******         ,:SUM-SETTLED                                       
******         ,:SUM-CURRENCY                                      
******         ,:SUM-OPEN-BALANCE                                  
******         ,:SUM-TOTAL-DEBIT                                   
******         ,:SUM-TOTAL-CREDIT                                  
******         ,:SUM-CLOSE-BALANCE                                 
**/
    public void fetchSummaryCursorTrdpb004(ResultSet summaryCursorResultSet, Sqlca sqlca, Dcltbtrdsum dcltbtrdsum) throws Exception {
try {
	boolean hasResults = summaryCursorResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = summaryCursorResultSet.getObject(1);
 if (resultObj != null) {
   dcltbtrdsum.setSumCustomerId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCursorResultSet.getObject(2);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumOverdue(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dcltbtrdsum.setSumOverdue(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumOverdue(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumOverdue(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCursorResultSet.getObject(3);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumRejected(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dcltbtrdsum.setSumRejected(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumRejected(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumRejected(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCursorResultSet.getObject(4);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumSettled(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dcltbtrdsum.setSumSettled(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumSettled(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumSettled(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCursorResultSet.getObject(5);
 if (resultObj != null) {
   dcltbtrdsum.setSumCurrency( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCursorResultSet.getObject(6);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumOpenBalance( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dcltbtrdsum.setSumOpenBalance( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumOpenBalance( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumOpenBalance( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCursorResultSet.getObject(7);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumTotalDebit( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dcltbtrdsum.setSumTotalDebit( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumTotalDebit( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumTotalDebit( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCursorResultSet.getObject(8);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumTotalCredit( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dcltbtrdsum.setSumTotalCredit( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumTotalCredit( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumTotalCredit( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCursorResultSet.getObject(9);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumCloseBalance( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dcltbtrdsum.setSumCloseBalance( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumCloseBalance( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumCloseBalance( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
		sqlFetchCounter++;
	} else {
		sqlca.setSqlcode(100); // No More rows
	}
}


catch (SQLException e) {
    if(e.getMessage().contains("result set is closed")) {
		fill501SqlcaObject(sqlca); // cursor closed
	}
	else {
 		logger.error("summaryCursorResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchSummaryCursorTrdpb004
// methodStart:fetchSummaryCursor1Trdpb004
    
/**
******        FETCH SUMMARY_CURSOR                                 
******         INTO :SUM-CUSTOMER-ID                               
******             ,:SUM-OVERDUE                                   
******             ,:SUM-REJECTED                                  
******             ,:SUM-SETTLED                                   
******             ,:SUM-CURRENCY                                  
******             ,:SUM-OPEN-BALANCE                              
******             ,:SUM-TOTAL-DEBIT                               
******             ,:SUM-TOTAL-CREDIT                              
**/
    public void fetchSummaryCursor1Trdpb004(ResultSet summaryCursorResultSet, Sqlca sqlca, Dcltbtrdsum dcltbtrdsum) throws Exception {
try {
	boolean hasResults = summaryCursorResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = summaryCursorResultSet.getObject(1);
 if (resultObj != null) {
   dcltbtrdsum.setSumCustomerId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCursorResultSet.getObject(2);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumOverdue(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dcltbtrdsum.setSumOverdue(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumOverdue(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumOverdue(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCursorResultSet.getObject(3);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumRejected(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dcltbtrdsum.setSumRejected(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumRejected(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumRejected(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCursorResultSet.getObject(4);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumSettled(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dcltbtrdsum.setSumSettled(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumSettled(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumSettled(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCursorResultSet.getObject(5);
 if (resultObj != null) {
   dcltbtrdsum.setSumCurrency( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCursorResultSet.getObject(6);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumOpenBalance( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dcltbtrdsum.setSumOpenBalance( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumOpenBalance( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumOpenBalance( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCursorResultSet.getObject(7);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumTotalDebit( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dcltbtrdsum.setSumTotalDebit( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumTotalDebit( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumTotalDebit( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCursorResultSet.getObject(8);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumTotalCredit( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dcltbtrdsum.setSumTotalCredit( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumTotalCredit( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumTotalCredit( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
		sqlFetchCounter++;
	} else {
		sqlca.setSqlcode(100); // No More rows
	}
}


catch (SQLException e) {
    if(e.getMessage().contains("result set is closed")) {
		fill501SqlcaObject(sqlca); // cursor closed
	}
	else {
 		logger.error("summaryCursorResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchSummaryCursor1Trdpb004
// methodStart:closeSummaryCursorTrdpb004
    
/**
******    CLOSE SUMMARY_CURSOR                                     
**/
    public void closeSummaryCursorTrdpb004(ResultSet summaryCursorResultSet, Sqlca sqlca) throws Exception {

	closeCursor(summaryCursorResultSet,sqlca);

    }
// methodEnd:closeSummaryCursorTrdpb004
// methodStart:deleteTbtrdstq
    
/**
******    DELETE FROM TBTRDSTQ                                     
**/
    public void deleteTbtrdstq(Sqlca sqlca) throws Exception {
try {
	// DELETE 
	// reset SQLCODE
	sqlca.setSqlcode(0);
	// execute SQLJ query
	int count = db2Base.startQuery(19/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB004)
.withSql(SQLS.SQL_1655432103)
		.executeUpdate(); 
	if(count <= 0) {
	sqlca.setSqlcode(100);
}

	sqlca.setSqlerrd(2,count);
}
catch (SQLException e) {
			fillSqlcaObject(sqlca, e);
}
catch(Exception e) {
	throw e;
}
    }
// methodEnd:deleteTbtrdstq
// methodStart:deleteTbtrdlog
    
/**
******    DELETE FROM TBTRDLOG                                     
**/
    public void deleteTbtrdlog(Sqlca sqlca) throws Exception {
try {
	// DELETE 
	// reset SQLCODE
	sqlca.setSqlcode(0);
	// execute SQLJ query
	int count = db2Base.startQuery(20/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB004)
.withSql(SQLS.SQL_1655218451)
		.executeUpdate(); 
	if(count <= 0) {
	sqlca.setSqlcode(100);
}

	sqlca.setSqlerrd(2,count);
}
catch (SQLException e) {
			fillSqlcaObject(sqlca, e);
}
catch(Exception e) {
	throw e;
}
    }
// methodEnd:deleteTbtrdlog
// methodStart:deleteTbtrdsum
    
/**
******    DELETE FROM TBTRDSUM                                     
**/
    public void deleteTbtrdsum(Sqlca sqlca) throws Exception {
try {
	// DELETE 
	// reset SQLCODE
	sqlca.setSqlcode(0);
	// execute SQLJ query
	int count = db2Base.startQuery(21/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB004)
.withSql(SQLS.SQL_1655432940)
		.executeUpdate(); 
	if(count <= 0) {
	sqlca.setSqlcode(100);
}

	sqlca.setSqlerrd(2,count);
}
catch (SQLException e) {
			fillSqlcaObject(sqlca, e);
}
catch(Exception e) {
	throw e;
}
    }
// methodEnd:deleteTbtrdsum
// methodStart:deleteTbtrdexc
    
/**
******    DELETE FROM TBTRDEXC                                     
**/
    public void deleteTbtrdexc(Sqlca sqlca) throws Exception {
try {
	// DELETE 
	// reset SQLCODE
	sqlca.setSqlcode(0);
	// execute SQLJ query
	int count = db2Base.startQuery(22/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB004)
.withSql(SQLS.SQL_1655018439)
		.executeUpdate(); 
	if(count <= 0) {
	sqlca.setSqlcode(100);
}

	sqlca.setSqlerrd(2,count);
}
catch (SQLException e) {
			fillSqlcaObject(sqlca, e);
}
catch(Exception e) {
	throw e;
}
    }
// methodEnd:deleteTbtrdexc
// methodStart:fillSqlcaObject
    public void fillSqlcaObject(Sqlca sqlca, SQLException e) {
            CfSqlca db2Sqlca = Db2Base.getCfSqlca(e);
            if (db2Sqlca != null) {
                sqlca.setSqlcaid("SQLCA  ".toCharArray());
                sqlca.setSqlcabc(136);
                sqlca.setSqlcode(db2Sqlca.getSqlCode());
                sqlca.setSqlerrp(db2Sqlca.getSqlErrp().toCharArray());
                if(db2Sqlca.getSqlErrmc() != null) {
                     sqlca.getSqlerrm().setSqlerrml(db2Sqlca.getSqlErrmc().length());
                     char ch = 65533;
                     char[] errmc = db2Sqlca.getSqlErrmc().toCharArray();
                      for(int i =0 ;i< errmc.length;i++){
                         if(errmc[i]==';'){
                              errmc[i] = ch;
                         }
                      }
                     sqlca.getSqlerrm().setSqlerrmc(errmc);
                }
                int[] sqlErrd = db2Sqlca.getSqlErrd();
                for (int i = 0; i < sqlErrd.length; i++) {
                    sqlca.setSqlerrd(i, sqlErrd[i]);
                }
                char[] sqlWarn = db2Sqlca.getSqlWarn();
                for (int i = 0; i < sqlWarn.length; i++) {
                    switch (i) {
                        case 0:
                            sqlca.getSqlwarn().setSqlwarn0(new char[]{sqlWarn[0]});
                            break;
                        case 1:
                            sqlca.getSqlwarn().setSqlwarn1(new char[]{sqlWarn[1]});
                            break;
                        case 2:
                            sqlca.getSqlwarn().setSqlwarn2(new char[]{sqlWarn[2]});
                            break;
                        case 3:
                            sqlca.getSqlwarn().setSqlwarn3(new char[]{sqlWarn[3]});
                            break;
                        case 4:
                            sqlca.getSqlwarn().setSqlwarn4(new char[]{sqlWarn[4]});
                            break;
                        case 5:
                            sqlca.getSqlwarn().setSqlwarn5(new char[]{sqlWarn[5]});
                            break;
                        case 6:
                            sqlca.getSqlwarn().setSqlwarn6(new char[]{sqlWarn[6]});
                            break;
                        case 7:
                            sqlca.getSqlwarn().setSqlwarn7(new char[]{sqlWarn[7]});
                            break;
                        case 8:
                            sqlca.getSqlext().setSqlwarn8(new char[]{sqlWarn[8]});
                            break;
                        case 9:
                            sqlca.getSqlext().setSqlwarn9(new char[]{sqlWarn[9]});
                            break;
                        case 10:
                            sqlca.getSqlext().setSqlwarna(new char[]{sqlWarn[10]});
                            break;
                    }
                }
                sqlca.getSqlext().setSqlstate(db2Sqlca.getSqlState().toCharArray());
        } else {
            sqlca.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
        }
    }
// methodEnd:fillSqlcaObject



    public void fill501SqlcaObject(Sqlca sqlca) {
                sqlca.setSqlcode(-501);
                sqlca.setSqlerrp("DSNXERT".toCharArray());
                sqlca.setSqlerrd(0,-240);
    	  		sqlca.setSqlerrd(1,0);
		    	sqlca.setSqlerrd(2,0);
		    	sqlca.setSqlerrd(3,-1);
		    	sqlca.setSqlerrd(4,0);
		    	sqlca.setSqlerrd(5,0);
			    sqlca.getSqlext().setSqlstate("24501".toCharArray());
    }

public void closeCursor(ResultSet result, Sqlca sqlca) throws Exception {
        sqlca.setSqlcode(0);
	try { 
	db2Base.closeCursor(result);
} catch(Exception e) {
	logger.info("{} close had exception", result);
}

db2Base.updateFetchCounter(sqlFetchCounter);
}

}
