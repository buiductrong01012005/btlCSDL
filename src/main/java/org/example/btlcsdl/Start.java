package org.example.btlcsdl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Start {
    public Button startButton;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onStarButton(ActionEvent actionEvent) {
        PhimTat.chuyenCanh(startButton,"");
    }
}