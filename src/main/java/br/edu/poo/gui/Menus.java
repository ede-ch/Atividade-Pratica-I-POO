package br.edu.poo.gui;

import java.io.IOException;
import javafx.fxml.FXML;

public class Menus {
    @FXML
    private void cadastrarCliente() throws IOException {
        App.setRoot("cadastroCliente");
    }

    
}
