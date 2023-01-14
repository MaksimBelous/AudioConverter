package com.example.audioconverter;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.stage.FileChooser;

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


  //  private final Desktop desktop = Desktop.getDesktop();
    final FileChooser fileChooser = new FileChooser();

    @FXML
    void initialize(ActionEvent e) {

    }

    @FXML void setOneFileButton(ActionEvent e){
        textArea.clear();
            File file = fileChooser.showOpenDialog(oneFileButton.getScene().getWindow());
            List<File> files = Arrays.asList(file);
            printLog(textArea, files);
        }


    @FXML
    void setMultiFileButton (ActionEvent e){
        textArea.clear();
        List<File> files = fileChooser.showOpenMultipleDialog(multiFileButton.getScene().getWindow());
        printLog(textArea, files);
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



/*  private void openFile(File file) {
        try {
            this.desktop.open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  */

