package br.edu.poo.gui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class ControladorMenu {
    @FXML
    private MenuItem addCliente;
    
    @FXML
    private MenuItem addLocacao;

    @FXML
    private MenuItem addCarro;

    @FXML
    private MenuItem addCaminhao;

    @FXML
    private MenuItem addOnibus;

    @FXML
    private Button btn_cancelar;

    @FXML
    private BorderPane borderPaneHome;
    
    // Cadastro
    @FXML
    private void cadastrarCaminhao(ActionEvent event) throws IOException {
        AnchorPane view = FXMLLoader.load(getClass().getResource("cadastroCaminhao.fxml"));
        borderPaneHome.setCenter(view);
    }

    @FXML
    private void cadastrarCarro(ActionEvent event) throws IOException {
        AnchorPane view = FXMLLoader.load(getClass().getResource("cadastroCarro.fxml"));
        borderPaneHome.setCenter(view);
    }

    @FXML
    private void cadastrarOnibus(ActionEvent event) throws IOException {
        AnchorPane view = FXMLLoader.load(getClass().getResource("cadastroOnibus.fxml"));
        borderPaneHome.setCenter(view);
    }

    @FXML
    private void cadastrarCliente(ActionEvent event) throws IOException {
        AnchorPane view = FXMLLoader.load(getClass().getResource("cadastroCliente.fxml"));
        borderPaneHome.setCenter(view);
    }

    @FXML
    private void cadastrarLocacao(ActionEvent event) throws IOException {
        AnchorPane view = FXMLLoader.load(getClass().getResource("cadastroLocacao.fxml"));
        borderPaneHome.setCenter(view);
    }

    // Pesquisa
    @FXML
    private void pesquisarCliente() throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pesquisarCliente.fxml"));
            Parent root = (Parent) loader.load();
            Stage stage = new Stage();
            stage.setTitle("Pesquisar Cliente");
            stage.initModality(Modality.NONE);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void pesquisarLocacao() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pesquisarLocacao.fxml"));
            Parent root = (Parent) loader.load();
            Stage stage = new Stage();
            stage.setTitle("Pesquisar Locação");
            stage.initModality(Modality.NONE);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void pesquisarVeiculo() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pesquisarVeiculo.fxml"));
            Parent root = (Parent) loader.load();
            Stage stage = new Stage();
            stage.setTitle("Pesquisar Veículo");
            stage.initModality(Modality.NONE);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void fecharJanela(ActionEvent event) {
        Stage stage = (Stage) btn_cancelar.getScene().getWindow();
        stage.close();
    }
}
