package com.example.chatapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginFormController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane mainPane;

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtUsername;

    @FXML
    void LoginOnClick(MouseEvent event) {

        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ClientForm.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Group Chat");
            stage.setScene(new Scene(root));
            stage.show();

        } catch(Exception e) {
            System.out.println("Scene not found");
        }
    }

    @FXML
    void loginOnAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert mainPane != null : "fx:id=\"mainPane\" was not injected: check your FXML file 'LoginForm.fxml'.";
        assert btnLogin != null : "fx:id=\"btnLogin\" was not injected: check your FXML file 'LoginForm.fxml'.";
        assert txtUsername != null : "fx:id=\"txtUsername\" was not injected: check your FXML file 'LoginForm.fxml'.";

    }
}
