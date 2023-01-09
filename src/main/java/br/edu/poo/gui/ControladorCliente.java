package br.edu.poo.gui;

import javafx.fxml.FXML;
import br.edu.poo.backend.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControladorCliente {
    private ListaCliente metodoCliente = new ListaCliente();

    @FXML
    private Button btn_cancelar;
    @FXML
    private Button btn_cadastrar;
    @FXML
    private TextField cpf_gui;
    @FXML
    private TextField nome_gui;
    @FXML
    private TextField endereco_gui;
    @FXML
    private TextField telefone_gui;
    @FXML
    private TextField carteira_gui;

    @FXML
    void addCliente(ActionEvent event) {
        String parseCpf = cpf_gui.getText();
        long cpf = Long.parseLong(parseCpf);

        String parseTelefone = telefone_gui.getText();
        int telefone = Integer.parseInt(parseTelefone);

        String parseCarteira = carteira_gui.getText();
        int carteira = Integer.parseInt(parseCarteira);

        String nome = nome_gui.getText(),
                endereco = endereco_gui.getText();

        Cliente cliente = new Cliente(cpf, nome, endereco, telefone, carteira);
        metodoCliente.add(cliente);

        limparCampos(event);
    }

    @FXML
    public Cliente pesquisarCliente(long cpf) {
        return metodoCliente.get(cpf);
    }

    @FXML
    void pesquisarInfoCliente(ActionEvent event) {
        String parseCpf = cpf_gui.getText();
        long cpf = 0;

        try {
            cpf = Long.parseLong(parseCpf);
        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("CPF inválido!");
            alert.setContentText("Digite um CPF válido!");
            alert.showAndWait();

            cpf_gui.setText("");
        }

        String resultado = metodoCliente.getInfo(cpf);

        if (!resultado.equals("")) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Cliente encontrado");
            alert.setHeaderText(null);
            alert.setContentText(resultado.toString());
            alert.showAndWait();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Cliente não encontrado!");
            alert.setContentText(
                    "Verifique as informaçoes preenchidas e tente novamente!");
            alert.showAndWait();
        }
    }

    @FXML
    void infoTodosClientes(ActionEvent event) {
        String resultado = metodoCliente.getInfo();

        if (!resultado.equals("")) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Clientes encontrados");
            alert.setHeaderText(null);
            alert.setContentText(resultado.toString());
            alert.showAndWait();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Nenhum cliente encontrado!");
            alert.setContentText(
                    "Verifique as informaçoes preenchidas e tente novamente!");
            alert.showAndWait();
        }
    }

    @FXML
    void resumoInfoTodosClientes(ActionEvent event) {
        String resultado = metodoCliente.getResumoInfo();

        if (!resultado.equals("")) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Clientes encontrados");
            alert.setHeaderText(null);
            alert.setContentText(resultado.toString());
            alert.showAndWait();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Nenhum cliente encontrado!");
            alert.setContentText(
                    "Verifique as informaçoes preenchidas e tente novamente!");
            alert.showAndWait();
        }
    }

    @FXML
    void removeCliente(ActionEvent event) {

    }

    @FXML
    public boolean existeCliente(long CPF) {
        return metodoCliente.existe(CPF);
    }

    @FXML
    public void fecharJanela(ActionEvent event) {
        Stage stage = (Stage) btn_cancelar.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void limparCampos(ActionEvent event) {
        cpf_gui.setText("");
        nome_gui.setText("");
        endereco_gui.setText("");
        telefone_gui.setText("");
        carteira_gui.setText("");
    }

    /**
     * @return ListaCliente return the metodoCliente
     */
    public ListaCliente getMetodoCliente() {
        return metodoCliente;
    }

}
