package com.example.interpreter.Controllers;

import com.example.interpreter.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.SubScene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


import java.io.IOException;

public class ControllerMenu {

    public VBox root;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("памятка");
    }

    public void btnTraClicked(ActionEvent actionEvent) throws IOException { //на переводчик
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Translator.fxml"));
        SubScene scene = new SubScene(fxmlLoader.load(), 500, 650);
        this.root.getChildren().clear();
        this.root.getChildren().add(scene.getRoot());
    }

    public void btnCarClicked(ActionEvent actionEvent) throws IOException { // кнопка на карточки
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("CardMenu.fxml"));
        SubScene scene = new SubScene(fxmlLoader.load(), 500, 650);
        this.root.getChildren().clear();
        this.root.getChildren().add(scene.getRoot());
    }

    public void btnDicClicked(ActionEvent actionEvent) throws IOException { // кнопка на общий словарь
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Table.fxml"));
        SubScene scene = new SubScene(fxmlLoader.load(), 500, 650);
        this.root.getChildren().clear();
        this.root.getChildren().add(scene.getRoot());

    }

    public void btnQueClicked(ActionEvent actionEvent) throws IOException { // кнопка что такое кривая забывания
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Inf.que.fxml"));
        SubScene scene = new SubScene(fxmlLoader.load(), 500, 650);
        this.root.getChildren().clear();
        this.root.getChildren().add(scene.getRoot());
    }
    public void btnHomeQueClicked(ActionEvent actionEvent) throws IOException { //назад со сцены что такое кривая запоминания
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Menu.fxml"));
        SubScene scene = new SubScene(fxmlLoader.load(), 500, 650);
        this.root.getChildren().clear();
        this.root.getChildren().add(scene.getRoot());
    }

    public void btnInfClicked(ActionEvent actionEvent) throws IOException { // кнопка промежутки между повторениями
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Time.fxml"));
        SubScene scene = new SubScene(fxmlLoader.load(), 500, 650);
        this.root.getChildren().clear();
        this.root.getChildren().add(scene.getRoot());
    }

    public void btnHomeClicked(ActionEvent actionEvent) throws IOException { // назад со сцены про промежутки между повторениями
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Menu.fxml"));
        SubScene scene = new SubScene(fxmlLoader.load(), 500, 650);
        this.root.getChildren().clear();
        this.root.getChildren().add(scene.getRoot());
    }

}