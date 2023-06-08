package com.example.chatapp;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class ClientFormController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane clientPane;

    @FXML
    private TextField txtMessage;

    @FXML
    private ImageView btnChooseImage;

    @FXML
    private Button btnSend;

    @FXML
    void chooseImageOnAction(MouseEvent event) {

    }

    @FXML
    void sendMessageOnAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert clientPane != null : "fx:id=\"clientPane\" was not injected: check your FXML file 'ClientForm.fxml'.";
        assert txtMessage != null : "fx:id=\"txtMessage\" was not injected: check your FXML file 'ClientForm.fxml'.";
        assert btnChooseImage != null : "fx:id=\"btnChooseImage\" was not injected: check your FXML file 'ClientForm.fxml'.";
        assert btnSend != null : "fx:id=\"btnSend\" was not injected: check your FXML file 'ClientForm.fxml'.";

    }
}
