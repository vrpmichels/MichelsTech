package br.michelstech.financeiro.presentation.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private Button btnSair;
    @FXML
    private Button btnEntrar;
    @FXML
    private PasswordField pfSenha;
    @FXML
    private TextField tfUsuario;
    @FXML
    private Label lbllogin;
    @FXML
    private Label lblmensagem;


    @FXML
    public void btnSairAction(ActionEvent actionEvent) throws IOException {
        System.exit(0);
    }

    @FXML
    public void btnentrarAction(ActionEvent actionEvent) throws IOException{

        String usuario = tfUsuario.getText();
        String senha = pfSenha.getText();
        String mensagem = "Usuário/Senha não podem estar vazios !";

        Alert alert;

        try{

            if(usuario.isEmpty() || senha.isEmpty()) {

                lbllogin.setText("");
                lblmensagem.setText(mensagem);

            } else {
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Mensagem de Informação");
                alert.setHeaderText(null);
                alert.setContentText("Usuário/Senha reconhecidos !");
                alert.showAndWait();

                btnEntrar.getScene().getWindow().hide();

                Parent root = FXMLLoader.load(getClass().getResource("/fxml/TelaInicial.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setTitle("Dashboard");
                stage.setScene(scene);
                stage.show();
            }

        }catch (Exception e) {e.printStackTrace();}

    }
}