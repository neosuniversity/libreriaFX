package com.neosuniversity.library.books.view;

import com.neosuniversity.library.books.model.Libro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField nombreLibro;

    @FXML
    private TextField autor;

    @FXML
    private TextField editorial;

    private Libro libro;


    public void actionAceptar(ActionEvent event) {
        System.out.println("Nombre libro:" + this.nombreLibro.getText());
        System.out.println("Autor: " + this.autor.getText());
        System.out.println("Editorial:"+ this.editorial.getText());

        this.libro = new Libro();

        this.libro.setNombreLibro(this.nombreLibro.getText());
        this.libro.setAutor(this.autor.getText());
        this.libro.setEditorial(this.editorial.getText());

        System.out.println(this.libro);
    }
}
