package com.neosuniversity.library.books.dao;

import com.neosuniversity.library.books.model.Libro;

import java.sql.SQLException;
import java.util.List;

public class TestBorrame {

    public static void main (String args[]) throws Exception {
        Libro libro = new Libro("C++","CARBALLIDO","MC");

        LibroDao libroDao = new LibroDaoImpl();
      //  System.out.println("INSERT ROWS: "+ libroDao.insertLibro(libro));

        List<Libro> lstLibro = libroDao.getAllLibros();
        lstLibro.stream().forEach(book-> System.out.println(book.toString()) );
    }
}
