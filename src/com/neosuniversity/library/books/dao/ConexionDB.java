package com.neosuniversity.library.books.dao;

import java.sql.*;

public class ConexionDB {

    private Connection conexion = null;
    private Statement stmt = null;
    private ResultSet rs=null;
    private PreparedStatement pst=null;

    public  Connection mySQLConnect() throws ClassNotFoundException, SQLException {
        //Driver JDBC
        Class.forName("com.mysql.jdbc.Driver");
        String servidor = "jdbc:mysql://localhost:3306/library?useSSL=false";
        String usuario = "YOUR_USER";
        String pass = "YOUR_PASSWORD";
        return conexion = DriverManager.getConnection(servidor, usuario, pass);
    }

    public static void closeConexionDB(Connection conexion,Statement stmt,ResultSet rs,PreparedStatement pst  ) {
        if (conexion != null) {
            try {
                conexion.close();
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