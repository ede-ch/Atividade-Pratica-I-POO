package br.edu.poo.gui;

import java.io.IOException;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Popup;

public class ControladorMenu {
    // Cadastro
    @FXML
    private void cadastrarCaminhao() throws IOException {
        App.setRoot("cadastroCaminhao");
    }

    @FXML
    private void cadastrarCarro() throws IOException {
        App.setRoot("cadastroCarro");
    }

    @FXML
    private void cadastrarOnibus() throws IOException {
        App.setRoot("cadastroOnibus");
    }

    @FXML
    private void cadastrarCliente() throws IOException {
        App.setRoot("cadastroCliente");
    }

    @FXML
    private void cadastrarLocacao() throws IOException {
        App.setRoot("cadastroLocacao");
    }

    // Pesquisa
    @FXML
    private void pesquisarCliente() throws IOException {
        App.setRoot("pesquisaCliente");
    }

    @FXML
    private void pesquisarLocacao() throws IOException {
        App.setRoot("pesquisaLocacao");
    }

    @FXML
    private void pesquisarVeiculo() throws IOException {
        App.setRoot("pesquisaVeiculo");
    }

    @FXML
    private void addRelease(Event event) throws IOException {
        Popup popup = new Popup();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("pesquisarVeiculo.fxml"));
        Parent parent = (Parent) loader.load(); // I am not sure you need a cast here
        popup.getContent().add(parent);
    }

}
