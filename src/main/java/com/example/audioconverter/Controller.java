package com.example.audioconverter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

    public class Controller {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private CheckBox checkBox1;

        @FXML
        private CheckBox checkBox2;

        @FXML
        private CheckBox checkBox3;

        @FXML
        private ChoiceBox<?> choiceBox1;

        @FXML
        private ChoiceBox<?> choiceBox2;

        @FXML
        private Label progressBar;

        @FXML
        private Button startButton;

        @FXML
        void initialize() {
            assert checkBox1 != null : "fx:id=\"checkBox1\" was not injected: check your FXML file 'hello-view.fxml'.";
            assert checkBox2 != null : "fx:id=\"checkBox2\" was not injected: check your FXML file 'hello-view.fxml'.";
            assert checkBox3 != null : "fx:id=\"checkBox3\" was not injected: check your FXML file 'hello-view.fxml'.";
            assert choiceBox1 != null : "fx:id=\"choiceBox1\" was not injected: check your FXML file 'hello-view.fxml'.";
            assert choiceBox2 != null : "fx:id=\"choiceBox2\" was not injected: check your FXML file 'hello-view.fxml'.";
            assert progressBar != null : "fx:id=\"progressBar\" was not injected: check your FXML file 'hello-view.fxml'.";
            assert startButton != null : "fx:id=\"startButton\" was not injected: check your FXML file 'hello-view.fxml'.";

        }

    }