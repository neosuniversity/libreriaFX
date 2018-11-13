package com.neosuniversity.library.books.dao;

import com.neosuniversity.library.books.model.Libro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibroDaoImpl implements LibroDao{

    private Connection connection;
    @Override
    public List<Libro> getAllLibros() throws SQLException, ClassNotFoundException {
        connection = new ConexionDB().mySQLConnect();
        Statement stmt=null;
        ResultSet rs=null;
        PreparedStatement pst=null;

        List<Libro> lstLibros = new ArrayList<>();
        String queryAllLibros= "SELECT  id_libro, nombreLibro, autor, editorial FROM libros ORDER BY id_libro";
        stmt = connection.createStatement();
        rs = stmt.executeQuery(queryAllLibros);
        while (rs.next()) {
            int idLibro = rs.getInt("id_libro");
            String nombreLibro = rs.getString("nombreLibro");
            String autor = rs.getString("autor");
            String editorial = rs.getString("editorial");

            Libro libro = new Libro(idLibro, nombreLibro, autor, editorial);
            lstLibros.add(libro);
        }
        ConexionDB.closeConexionDB(connection,stmt,rs,pst);
        return lstLibros;
    }
}
