package br.michelstech.financeiro.presentation.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TelaInicialController implements Initializable {
    @javafx.fxml.FXML
    private StackedAreaChart chartsG1;
    @javafx.fxml.FXML
    private Button btnCadastroUsuarios;
    @javafx.fxml.FXML
    private Button btnContasReceber;
    @javafx.fxml.FXML
    private Button btnContasPagar;
    @javafx.fxml.FXML
    private Button BtnVendas;
    @javafx.fxml.FXML
    private Button btnCadastroProdutos;
    @javafx.fxml.FXML
    private Button btnFluxoCaixa;
    @javafx.fxml.FXML
    private TableView tvTabela2;
    @javafx.fxml.FXML
    private Button btnSair;
    @javafx.fxml.FXML
    private TableView tvTabela1;
    @javafx.fxml.FXML
    private Button btnControleEstoque;
    @javafx.fxml.FXML
    private Button btnCadastroPessoas;
    @javafx.fxml.FXML
    private BarChart chartsG2;

    @javafx.fxml.FXML
    public void btnSairAction(ActionEvent event) throws IOException {

        btnSair.getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/TelaIncial.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @javafx.fxml.FXML
    public void btnCadastroPessoasAction(ActionEvent actionEvent) throws IOException {

        btnCadastroPessoas.getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/CadastroPessoas.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Cadastro de Pessoas");
        stage.setScene(scene);
        stage.show();


    }

    @javafx.fxml.FXML
    public void btnCadastroUsuariosAction(ActionEvent actionEvent) throws IOException {
        btnCadastroUsuarios.getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/CadastroUsuario.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Cadastro de Usuários");
        stage.setScene(scene);
        stage.show();

    }
}
