package com.example.interpreter.Controllers;

import com.example.interpreter.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.SubScene;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class ControllerTr {
    public VBox root;


    public void btnHomeClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Menu.fxml"));
        SubScene scene = new SubScene(fxmlLoader.load(), 500, 650);
        this.root.getChildren().clear();
        this.root.getChildren().add(scene.getRoot());

    }

    public void btnTrrClicked(ActionEvent actionEvent) { // перевод с рус на англ

    }

    public void btnAddWClicked(ActionEvent actionEvent) { // кнопка добавить слово к изучаемым нажата

    }

    public void btnChLanClicked(ActionEvent actionEvent) throws IOException { // поменяли языки местами
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Translator2.fxml"));
        SubScene scene = new SubScene(fxmlLoader.load(), 500, 650);
        this.root.getChildren().clear();
        this.root.getChildren().add(scene.getRoot());

    }

}

