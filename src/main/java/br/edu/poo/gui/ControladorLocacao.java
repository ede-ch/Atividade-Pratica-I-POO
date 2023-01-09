package br.edu.poo.gui;

import java.net.URL;
import java.util.ResourceBundle;
import br.edu.poo.backend.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControladorLocacao implements Initializable{
    private ListaLocacao metodoLocacao = new ListaLocacao();
    private ControladorCliente controladorCliente = new ControladorCliente();
    private ControladorVeiculo controladorVeiculo = new ControladorVeiculo();

    @FXML
    private Button btn_cancelar;
    @FXML
    private TextField cliente_gui;
    @FXML
    private TextField veiculo_gui;
    @FXML
    private TextField dataDevolucao_gui;
    @FXML 
    TextField codLocacao_gui;
    @FXML
    private ChoiceBox<String> seguro_gui;
    private String[] seguro = { "Sim", "Não" };

    @FXML
    public void addLocacao(ActionEvent event) {
        String clienteCpf = cliente_gui.getText();
        long cpf = Long.parseLong(clienteCpf);
        Cliente cliente = controladorCliente.pesquisarCliente(cpf);

        String veiculoPlaca = veiculo_gui.getText();
        Veiculo veiculo = controladorVeiculo.pesquisarVeiculo(veiculoPlaca);

        String dataDevolucao = dataDevolucao_gui.getText();

        boolean seguro = false;
        String seguroString = seguro_gui.getValue().toString();
        if (seguroString.equals("Sim")) {
            seguro = true;
        } else {
            seguro = false;
        }

        Locacao locacao = new Locacao(cliente, veiculo, dataDevolucao, seguro);
        metodoLocacao.add(locacao);
    }

    @FXML
    public Locacao pesquisarLocacao(int cod) {
        return metodoLocacao.get(cod);
    }

    @FXML
    void pesquisarInfoLocacao (ActionEvent event) {
        String cod = codLocacao_gui.getText();
        int codLocacao = 0;

        try {
            codLocacao = Integer.parseInt(cod);
        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("CPF inválido!");
            alert.setContentText("Digite um CPF válido!");
            alert.showAndWait();

            codLocacao_gui.setText("");
        }

        String resultado = metodoLocacao.getInfo(codLocacao);

        if (!resultado.equals("")) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Locação encontrada");
            alert.setHeaderText(null);
            alert.setContentText(resultado.toString());
            alert.showAndWait();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Locação não encontrada!");
            alert.setContentText(
                    "Verifique as informaçoes preenchidas e tente novamente!");
            alert.showAndWait();
        }
    }

    @FXML
    public void infoTodasLocacacoes (ActionEvent event) {
        String resultado = metodoLocacao.getInfo();

        if (!resultado.equals("")) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Locação encontrada");
            alert.setHeaderText(null);
            alert.setContentText(resultado.toString());
            alert.showAndWait();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Locação não encontrada!");
            alert.setContentText(
                    "Verifique as informaçoes preenchidas e tente novamente!");
            alert.showAndWait();
        }
    }

    @FXML
    public void removerLocacao(ActionEvent event) {

    }

    @FXML
    public boolean existeLocacao(int cod) {
        return metodoLocacao.existe(cod);
    }

    @FXML
    public void limparCampos(ActionEvent event) {
        cliente_gui.setText("");
        veiculo_gui.setText("");
        dataDevolucao_gui.setText("");
        seguro_gui.setValue("");
    }

    @FXML
    public void fecharJanela(ActionEvent event) {
        Stage stage = (Stage) btn_cancelar.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        seguro_gui.getItems().addAll(seguro);
    }
}
