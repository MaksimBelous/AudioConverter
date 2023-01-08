package com.example.audioconverter;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button multiFileButton;

    @FXML
    private Button oneFileButton;

    @FXML
    private ToggleGroup rButtons;

    @FXML
    private RadioButton rb1;

    @FXML
    private RadioButton rb2;

    @FXML
    private RadioButton rb3;

    @FXML
    private RadioButton rb4;

    @FXML
    private RadioButton rb5;

    @FXML
    private Button startButton;

    @FXML
    private TextArea textArea;

    @FXML
    void initialize() {
        oneFileButton.setOnAction (actionEvent -> E)

    }

}
