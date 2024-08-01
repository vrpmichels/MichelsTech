package br.michelstech.financeiro.presentation.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class UsuarioController {
    @javafx.fxml.FXML
    private Button btnSair;

    @javafx.fxml.FXML
    public void btnSairAction(ActionEvent actionEvent) throws IOException {

        btnSair.getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/TelaInicial.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Dashboard");
        stage.setScene(scene);
        stage.show();


    }
}
