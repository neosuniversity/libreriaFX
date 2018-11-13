package com.neosuniversity.library.books.dao;

import org.apache.commons.dbcp.ConnectionFactory;
import org.apache.commons.dbcp.DriverManagerConnectionFactory;
import org.apache.commons.dbcp.PoolableConnectionFactory;
import org.apache.commons.dbcp.PoolingDataSource;
import org.apache.commons.pool.impl.GenericObjectPool;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * Implements Connections Data Base
 */
public class ConnectionDB implements IConnectionDB {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String JDBC_DB_URL = "jdbc:mysql://localhost:3306/library?useSSL=false";
    static final String JDBC_USER = "YOUR_USER";
    static final String JDBC_PASS = "YOUR_PASSWORD";
    private static GenericObjectPool poolDataBase= null;

    @Override
    public  Connection createConnectionDB() throws Exception {
        DataSource dataSource = createDataSource();
        return dataSource.getConnection();
    }
    /**
     * Create data source
     * @return
     * @throws Exception
     */
    private DataSource createDataSource() throws Exception {
        Class.forName(JDBC_DRIVER);
        poolDataBase = new GenericObjectPool();
        poolDataBase.setMaxActive(5);
        ConnectionFactory cf = new DriverManagerConnectionFactory(JDBC_DB_URL, JDBC_USER, JDBC_PASS);
        PoolableConnectionFactory pcf = new PoolableConnectionFactory(cf, poolDataBase, null, null, false, true);

        return new PoolingDataSource(poolDataBase);
    }
    private static  GenericObjectPool getConnectionPool() {
        return poolDataBase;
    }

    /**
     *  print information about Status on Data base
     */
    public static void printDbStatus() {
        System.out.println("Max.: " + getConnectionPool().getMaxActive() + "; Active: " + getConnectionPool().getNumActive() + "; Idle: " + getConnectionPool().getNumIdle());
    }

}