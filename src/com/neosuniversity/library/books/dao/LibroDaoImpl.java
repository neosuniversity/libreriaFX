package com.neosuniversity.library.books.dao;

import com.neosuniversity.library.books.model.Libro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Implements all features LibroDao
 */
public class LibroDaoImpl implements LibroDao{

    private Connection connection;
    private Statement stmt = null;
    private ResultSet rs=null;
    private PreparedStatement pst=null;

    @Override
    public int insertLibro(Libro libro) throws SQLException, ClassNotFoundException {
        connection = new ConnectionDB().createConnectionDB();
        int rows = 0;

        String queryInsertLibro= "INSERT INTO libros (nombrelibro, autor, editorial) values (?, ? , ?) ";

        pst = connection.prepareStatement(queryInsertLibro);
        pst.setString(1, libro.getNombreLibro());
        pst.setString(2, libro.getAutor());
        pst.setString(3, libro.getEditorial());
        rows = pst.executeUpdate();
        IConnectionDB.closeConexionDB(connection,stmt,rs,pst);
        return rows;

    }

    @Override
    public List<Libro> getAllLibros() throws SQLException, ClassNotFoundException {
        connection = new ConnectionDB().createConnectionDB();

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
        IConnectionDB.closeConexionDB(connection,stmt,rs,pst);
        return lstLibros;
    }

    @Override
    public int updateLibro(Libro libro) throws SQLException, ClassNotFoundException {
        //your implementation
        return 0;
    }

    @Override
    public int deleteLibro(int idLibro) throws SQLException, ClassNotFoundException {
        //your implementation
        return 0;
    }
}
