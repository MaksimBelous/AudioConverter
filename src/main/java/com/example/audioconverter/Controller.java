package com.example.audioconverter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.stage.FileChooser;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class Controller {

    private Desktop desktop = Desktop.getDesktop();

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
    void initialize(ActionEvent e) {
        final FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(oneFileButton.getScene().getWindow());

        if (file != null) {
            openFile(file);
            List<File> files = Arrays.asList(file);
            printLog(textArea, files);
        }
    }

    private void openFile(File file) {
        try {
            this.desktop.open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printLog(TextArea textArea, List<File> files) {
        if (files == null || files.isEmpty()) {
            return;
        }
        for (File file : files) {
            textArea.appendText(file.getAbsolutePath() + "\n");
        }
    }

}
