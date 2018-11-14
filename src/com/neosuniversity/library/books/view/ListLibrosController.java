package com.neosuniversity.library.books.view;

import com.neosuniversity.library.books.dao.LibroDaoImpl;
import com.neosuniversity.library.books.model.Libro;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;


public class ListLibrosController {


    @FXML
    private TableView<Libro> dataLibros;

    @FXML
    private TableColumn<Libro, String> idCol;

    @FXML
    private TableColumn<Libro, String> nombreLibroCol;

    @FXML
    private TableColumn<Libro, String> autorCol;

    @FXML
    private TableColumn<Libro, String> editorialCol;

    private ObservableList<Libro> librosViewList = FXCollections.observableArrayList();

    private LibroDaoImpl libroDao = new LibroDaoImpl();


    @FXML
    private void initialize() {

        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nombreLibroCol.setCellValueFactory(new PropertyValueFactory<>("nombreLibro"));
        autorCol.setCellValueFactory(new PropertyValueFactory<>("autor"));
        editorialCol.setCellValueFactory(new PropertyValueFactory<>("editorial"));

        try {
            librosViewList.addAll(this.libroDao.getAllLibros());
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        this.dataLibros.setItems(librosViewList);

    }

    //abrir la pantalla de alta
    public void actionAbrir(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/neosuniversity/library/books/view/altaLibro.fxml"));
        Parent root = (Parent) loader.load();


        Controller controller = loader.getController();
        controller.setViewListModel(librosViewList);

        Stage stage = new Stage();
        stage.setTitle("Alta Libro");
        stage.setScene(new Scene(root, 600, 500));
        stage.show();

    }


}
