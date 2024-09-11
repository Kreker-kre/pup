package com.example.projectehuhuhuhuh;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but1;

    @FXML
    private Button but2;

    @FXML
    private Label text1;

    @FXML
    private Label text2;

    @FXML
    void but1(ActionEvent event) {
    text1.setText("выполнил Дмитрий Яковлев ИСП-41");
    }

    @FXML
    void but2(ActionEvent event) {
        text2.setText("тут тоже текст появляется");
    }

    @FXML
    void initialize() {
        assert but1 != null : "fx:id=\"but1\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert but2 != null : "fx:id=\"but2\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert text1 != null : "fx:id=\"text1\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert text2 != null : "fx:id=\"text2\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
