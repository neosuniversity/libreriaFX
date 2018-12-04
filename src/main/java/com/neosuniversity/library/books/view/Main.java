package com.neosuniversity.library.books.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
		 String fxmlFile = "/fxml/altaLibro.fxml";
        //log.debug("Loading FXML for main view from: {}", fxmlFile);
        FXMLLoader loader = new FXMLLoader();
        Parent root = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
		
       // Parent root = FXMLLoader.load(getClass().getResource("/com/neosuniversity/library/books/view/altaLibro.fxml"));
        primaryStage.setTitle("Nuevo Libro");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
