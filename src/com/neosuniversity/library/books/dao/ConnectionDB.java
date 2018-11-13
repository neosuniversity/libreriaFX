package com.neosuniversity.library.books.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Implements Connections Data Base
 */
public class ConnectionDB implements IConnectionDB {

    private Connection conexion = null;

    @Override
    public  Connection createConnectionDB() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String servidor = "jdbc:mysql://localhost:3306/library?useSSL=false";
        String usuario = "YOUR_USER";
        String pass = "YOUR_PASSWORD";
        return conexion = DriverManager.getConnection(servidor, usuario, pass);
    }



}