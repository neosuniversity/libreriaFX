package com.neosuniversity.library.books.view;

import com.neosuniversity.library.books.dao.LibroDao;
import com.neosuniversity.library.books.dao.LibroDaoImpl;
import com.neosuniversity.library.books.model.Libro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class Controller {

    @FXML
    private TextField nombreLibro;

    @FXML
    private TextField autor;

    @FXML
    private TextField editorial;

    private Libro libro;

    private LibroDao libroDao;

    public Controller () {
        libroDao = new LibroDaoImpl();
    }


    public void actionAceptar(ActionEvent event) {
        /*
        System.out.println("Nombre libro:" + this.nombreLibro.getText());
        System.out.println("Autor: " + this.autor.getText());
        System.out.println("Editorial:"+ this.editorial.getText()); */

        this.libro = new Libro();

        this.libro.setNombreLibro(this.nombreLibro.getText());
        this.libro.setAutor(this.autor.getText());
        this.libro.setEditorial(this.editorial.getText());

       // System.out.println(this.libro);

        try {

            libroDao.insertLibro(libro);
             this.showSuccessDialog();
        } catch (SQLException e) {
            this.showErrorDialog(e.getMessage());
        } catch (ClassNotFoundException e) {
            this.showErrorDialog(e.getMessage());
        }


    }

    public void showSuccessDialog() {
        MyAlert alert = new MyAlert("Libros", "Alta Libros", "El alta del libro fue satisfactoria",
                Alert.AlertType.INFORMATION);
        alert.show();
    }

    public void showErrorDialog(String error){
        MyAlert alert = new MyAlert("Libros", "Alta Libros", error,
                Alert.AlertType.ERROR);
        alert.show();
    }
}
