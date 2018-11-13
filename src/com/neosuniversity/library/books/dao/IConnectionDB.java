package com.neosuniversity.library.books.dao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Handle Connection to Data Base
 */
public interface IConnectionDB {
    /**
     * create new connection from data base
     * @return Connection
     * @throws Exception throws Exception
     */
    Connection createConnectionDB() throws Exception;


        /**
         * close connection from data base
         * @param connection from data base
         * @param stmt
         * @param rs
         * @param pst
         */
    static void closeConexionDB(Connection connection, Statement stmt, ResultSet rs, PreparedStatement pst  ) {

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(pst!=null){
            try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
