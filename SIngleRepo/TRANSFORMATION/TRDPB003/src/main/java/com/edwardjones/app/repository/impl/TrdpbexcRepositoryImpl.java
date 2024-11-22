package com.edwardjones.app.repository.impl;

import com.edwardjones.app.repository.TrdpbexcRepository;
import com.cloudframe.app.data.Field;
import com.edwardjones.app.common.SQLS;
import com.cloudframe.app.dao.Db2Base;
import java.sql.Types;
import com.edwardjones.app.common.CONSTANTS;
import com.cloudframe.app.dao.SqlBase;
import com.cloudframe.app.dao.CfSqlca;
import java.sql.SQLException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.edwardjones.app.trdpbexc.dto.*;

@Repository
@Qualifier("trdpbexcRepository")
public class TrdpbexcRepositoryImpl implements TrdpbexcRepository {
    Logger logger = LoggerFactory.getLogger(TrdpbexcRepositoryImpl.class);

// declare:start
    static final short NOT_NULL = (short)0;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:insertTbtrdexc
    
/**
******   INSERT INTO TBTRDEXC                                      
******         ( EXC_TYPE                                          
******         ,EXC_DESCRIPTION)                                   
******   VALUES(:EXC-TYPE                                          
******         ,:EXC-DESCRIPTION)                                  
**/
    public void insertTbtrdexc(Sqlca sqlca, Dcltbtrdexc dcltbtrdexc) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(2/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPBEXC)
    .withSql(SQLS.SQL_150892171)
				.withInputs(dcltbtrdexc.getExcType(),dcltbtrdexc.getExcDescription())
				.withDataTypes(Types.CHAR,Types.VARCHAR)
    .executeUpdate();
    
    sqlca.setSqlerrd(2,count);
   }
    catch (SQLException e) {
            fillSqlcaObject(sqlca, e);
    }
    catch(Exception e) {
    throw e;
    }
    }
// methodEnd:insertTbtrdexc
// methodStart:insertTbtrdexc1
    
/**
******             INSERT INTO TBTRDEXC                            
******                   ( EXC_TYPE                                
******                   ,EXC_DESCRIPTION)                         
******             VALUES(:EXC-TYPE                                
******                   ,:EXC-DESCRIPTION)                        
**/
    public void insertTbtrdexc1(Sqlca sqlca, Dcltbtrdexc dcltbtrdexc) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(3/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPBEXC)
    .withSql(SQLS.SQL_150892171_1)
				.withInputs(dcltbtrdexc.getExcType(),dcltbtrdexc.getExcDescription())
				.withDataTypes(Types.CHAR,Types.VARCHAR)
    .executeUpdate();
    
    sqlca.setSqlerrd(2,count);
   }
    catch (SQLException e) {
            fillSqlcaObject(sqlca, e);
    }
    catch(Exception e) {
    throw e;
    }
    }
// methodEnd:insertTbtrdexc1
// methodStart:insertTbtrdexc2
    
/**
******             INSERT INTO TBTRDEXC                            
******                   ( EXC_TYPE                                
******                   ,EXC_DESCRIPTION)                         
******             VALUES(:EXC-TYPE                                
******                   ,:EXC-DESCRIPTION)                        
**/
    public void insertTbtrdexc2(Sqlca sqlca, Dcltbtrdexc dcltbtrdexc) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(3/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPBEXC)
    .withSql(SQLS.SQL_150892171_2)
				.withInputs(dcltbtrdexc.getExcType(),dcltbtrdexc.getExcDescription())
				.withDataTypes(Types.CHAR,Types.VARCHAR)
    .executeUpdate();
    
    sqlca.setSqlerrd(2,count);
   }
    catch (SQLException e) {
            fillSqlcaObject(sqlca, e);
    }
    catch(Exception e) {
    throw e;
    }
    }
// methodEnd:insertTbtrdexc2
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


}
