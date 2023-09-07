package com.example.csc311_gui_basics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    public Button btn1;
    public Button btn2;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        btn1.setText("button 1 clicked");
    }

    public void onButton2Click(ActionEvent actionEvent) {
        btn2.setText("clicked");

    }
}