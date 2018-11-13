package com.neosuniversity.library.books.dao;

import com.neosuniversity.library.books.model.Libro;

import java.sql.SQLException;
import java.util.List;

/**
 *  CRUD Operations from Data Base for Libro
 */
public interface LibroDao {

    /**
     * insert new libro in data base
     * @param libro
     * @return int rows
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    int insertLibro(Libro libro) throws SQLException, ClassNotFoundException;

    /**
     * get all libros from data base
     * @return ist<Libro>
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    List<Libro> getAllLibros() throws SQLException, ClassNotFoundException;

    /**
     * update libro on data base
     * @param libro
     * @return int rows
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    int updateLibro(Libro libro) throws SQLException, ClassNotFoundException;

    /**
     * delete libro on data base
     * @param idLibro
     * @return int rows
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    int deleteLibro(int idLibro) throws SQLException, ClassNotFoundException;


}
