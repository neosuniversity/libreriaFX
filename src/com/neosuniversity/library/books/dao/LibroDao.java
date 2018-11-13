package com.neosuniversity.library.books.dao;

import com.neosuniversity.library.books.model.Libro;

import java.sql.SQLException;
import java.util.List;

public interface LibroDao {

    List<Libro> getAllLibros() throws SQLException, ClassNotFoundException;
}
