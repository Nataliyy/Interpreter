package com.example.interpreter.Controllers;

import com.example.interpreter.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ControllerTr {
    public VBox root;
    public TextArea Ru1;
    public ListView ListEn;
    public Button btnAddW;


    public void btnHomeClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Menu.fxml"));
        SubScene scene = new SubScene(fxmlLoader.load(), 500, 650);
        this.root.getChildren().clear();
        this.root.getChildren().add(scene.getRoot());

    }

    public void btnTrrClicked(ActionEvent actionEvent) { // перевод с рус на англ
        btnAddW.setDisable(true);
        String word = Ru1.getText();
        this.translations.clear();
        this.translations.addAll(Application.cardService.translate(word, false));
    }

    public void btnAddWClicked(ActionEvent actionEvent) { // кнопка добавить слово к изучаемым

    }

    final ObservableList<String> translations = FXCollections.observableArrayList();

    String currentTranslation;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btnAddW.setDisable(true);

        ListEn.setItems(this.translations);

        ListEn.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                currentTranslation = newValue;
                btnAddW.setDisable(false);
            }
        });

    }

    public void btnChLanClicked(ActionEvent actionEvent) {
        fromRussianToEnglish = !fromRussianToEnglish;
        if (fromRussianToEnglish) {
            this.Ru1.setPromptText("Введите слово для перевода");
        } else {
            this.Ru1.setPromptText("Enter a word to translate");
        }
    }
}

