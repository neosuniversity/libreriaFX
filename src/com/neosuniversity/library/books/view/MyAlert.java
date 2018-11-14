package com.neosuniversity.library.books.view;

import javafx.scene.control.Alert;

public class MyAlert  {

    private Alert alert;

    public MyAlert(String title, String header, String content, Alert.AlertType type) {
        this.alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);

    }

    public void show(){
        this.alert.show();
    }



}
