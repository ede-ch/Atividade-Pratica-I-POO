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

public class ControladorVeiculo implements Initializable{
    private ListaVeiculo metodoVeiculo = new ListaVeiculo();

    @FXML
    private Button btn_cancelar;
    @FXML
    private TextField placa_gui;
    @FXML
    private TextField modelo_gui;
    @FXML
    private TextField ano_gui;
    @FXML
    private TextField valorDiaria_gui;
    @FXML
    private TextField numEixos_gui;
    @FXML
    private TextField capacidadeCarga_gui;
    @FXML
    private TextField numPortas_gui;
    @FXML
    private TextField numPassageiros_gui;
    @FXML
    private TextField mediaKm_gui;
    @FXML
    private ChoiceBox<String> arCondicionado_gui;
    private String[] arCondicionado = {"Sim", "Não"};
    @FXML 
    private ChoiceBox<String> categoria_gui;
    private String[] categoria = {"Popular", "Intermediário", "Luxo"};
    @FXML
    private ChoiceBox<String> internet_gui;
    private String[] internet = {"Sim", "Não"};
    @FXML
    private Button btn_pesquisar;
    
    @FXML
    public void addCaminhao(ActionEvent event) {
        String placa = placa_gui.getText();
        String modelo = modelo_gui.getText();
        
        String parseAno = ano_gui.getText();
        int ano = Integer.parseInt(parseAno);

        String parseValorDiaria = valorDiaria_gui.getText();
        float valorDiaria = Float.parseFloat(parseValorDiaria);

        String parseNumEixos = numEixos_gui.getText();
        int numEixos = Integer.parseInt(parseNumEixos);

        String parseCapacidadeCarga = capacidadeCarga_gui.getText();
        float capacidadeCarga = Float.parseFloat(parseCapacidadeCarga);

        Caminhao caminhao = new Caminhao(placa, modelo, ano, valorDiaria, numEixos, capacidadeCarga);

        metodoVeiculo.add(caminhao);
    }

    @FXML 
    public void addCarro (ActionEvent event) { 
        String placa = placa_gui.getText();
        String modelo = modelo_gui.getText();
        
        String parseAno = ano_gui.getText();
        int ano = Integer.parseInt(parseAno);

        String parseValorDiaria = valorDiaria_gui.getText();
        float valorDiaria = Float.parseFloat(parseValorDiaria);

        String parseNumPortas = numPortas_gui.getText();
        int numPortas = Integer.parseInt(parseNumPortas);

        String parseNumPassageiros = numPassageiros_gui.getText();
        int numPassageiros = Integer.parseInt(parseNumPassageiros);

        String parseMediaKm = mediaKm_gui.getText();
        float mediaKm = Float.parseFloat(parseMediaKm);

        boolean arCondicionado = false;
        String arCondicionadoString = arCondicionado_gui.getValue().toString();
        if (arCondicionadoString.equals("Sim")) {
            arCondicionado = true;
        } else {
            arCondicionado = false;
        }

        Carro carro = new Carro(placa, modelo, ano, valorDiaria, numPortas, numPassageiros, arCondicionado, mediaKm);

        metodoVeiculo.add(carro);
    }

    @FXML
    public void addOnibus(ActionEvent event) {
        String placa = placa_gui.getText();
        String modelo = modelo_gui.getText();
        
        String parseAno = ano_gui.getText();
        int ano = Integer.parseInt(parseAno);

        String parseValorDiaria = valorDiaria_gui.getText();
        float valorDiaria = Float.parseFloat(parseValorDiaria);

        String parseNumPortas = numPortas_gui.getText();
        int numPortas = Integer.parseInt(parseNumPortas);

        
        String categoria = categoria_gui.getValue().toString();
        
        boolean arCondicionado = false;
        String arCondicionadoString = arCondicionado_gui.getValue().toString();
        if (arCondicionadoString.equals("Sim")) {
            arCondicionado = true;
        } else {
            arCondicionado = false;
        }

        boolean internet = false;
        String internetString = internet_gui.getValue().toString();
        if (internetString.equals("Sim")) {
            internet = true;
        } else {
            internet = false;
        }

        Onibus onibus = new Onibus(placa, modelo, ano, valorDiaria, numPortas, categoria, arCondicionado, internet);

        metodoVeiculo.add(onibus);
    }

    @FXML
    public Veiculo pesquisarVeiculo(String placa) {
        return metodoVeiculo.get(placa);
    }

    @FXML
    public void pesquisarInfoVeiculo(ActionEvent event) {
        String placa = placa_gui.getText();

        String resultado = metodoVeiculo.getInfo(placa);

        if (!resultado.equals("")) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Veículo encontrado");
            alert.setHeaderText(null);
            alert.setContentText(resultado.toString());
            alert.showAndWait();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Veículo não encontrado!");
            alert.setContentText(
                    "Verifique as informaçoes preenchidas e tente novamente!");
            alert.showAndWait();
        }
    }
    
    @FXML
    public void infoTodosVeiculos(ActionEvent event) {
        String resultado = metodoVeiculo.getInfo();

        if (!resultado.equals("")) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Veículos encontrados");
            alert.setHeaderText(null);
            alert.setContentText(resultado.toString());
            alert.showAndWait();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Veículos não encontrados!");
            alert.setContentText(
                    "Verifique as informaçoes preenchidas e tente novamente!");
            alert.showAndWait();
        }
    }

    @FXML
    public void resumoInfoTodosVeiculos(ActionEvent event){
        String resultado = metodoVeiculo.getResumoInfo();

        if (!resultado.equals("")) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Veículos encontrados");
            alert.setHeaderText(null);
            alert.setContentText(resultado.toString());
            alert.showAndWait();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Veículos não encontrados!");
            alert.setContentText(
                    "Verifique as informaçoes preenchidas e tente novamente!");
            alert.showAndWait();
        }
    }

    @FXML
    public void removeVeiculo(ActionEvent event) {

    }

    @FXML
    public boolean existeVeiculo(String placa) {
        return metodoVeiculo.existe(placa);
    }

    @FXML
    public void fecharJanela(ActionEvent event) {
        Stage stage = (Stage) btn_cancelar.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        arCondicionado_gui.getItems().addAll(arCondicionado);
        internet_gui.getItems().addAll(internet);
        categoria_gui.getItems().addAll(categoria);
    }
}
