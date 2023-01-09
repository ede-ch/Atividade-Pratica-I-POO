package br.edu.poo.gui;

import java.net.URL;
import java.util.ResourceBundle;
import br.edu.poo.backend.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControladorLocacao implements Initializable{
    private ListaLocacao listaLocacao = new ListaLocacao();
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
        listaLocacao.add(locacao);
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
