package com.neosuniversity.library.books.dao;

import com.neosuniversity.library.books.model.Libro;

import java.sql.SQLException;
import java.util.List;

public class TestBorrame {

    public static void main (String args[]) throws SQLException, ClassNotFoundException {
        LibroDao libroDao = new LibroDaoImpl();
        List<Libro> lstLibro = libroDao.getAllLibros();
        lstLibro.stream().forEach(libro-> System.out.println(libro.toString()) );
    }
}
