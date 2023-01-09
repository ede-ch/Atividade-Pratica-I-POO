package br.edu.poo.backend;

import java.util.ArrayList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 * Classe que implementa uma lista de veículos e seus métodos.
 * Durante o processo de desenvolvimento dos métodos, a IDE VSCode
 * impediu a criação de métodos com retornos diferentes dentro de 
 * um bloco IF-ELSE. Essa é uma noção de programação estruturada
 * conhecida como Single-Entry-Single-Exit (SESE). A comunidade
 * crê que isso é uma convenção herdada da linguagem C.
 * https://softwareengineering.stackexchange.com/questions/118703/where-did-the-notion-of-one-return-only-come-from
 * Notes on structured programming by Prof. Dr E. W. Dijkstra https://www.cs.utexas.edu/users/EWD/ewd02xx/EWD249.PDF
 * 
 */
public class ListaVeiculo implements IVeiculos {
    private static ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();

    /**
     * @param v veiculo do tipo Veiculo. 
     * Se "v" não é nulo e é uma instância do tipo Veiculo, adiciona um veículo na lista de veículos.
     * Caso contrário, não adiciona e retorna "Não é um veículo válido".
     * !Inicializar a variável numVeiculos com "0"!
     */
    @Override
    public void add(Veiculo v) {
        if (v != null && v instanceof Veiculo) {
            listaVeiculos.add(v);
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Veículo cadastrado");
            alert.setHeaderText(null);
            alert.setContentText(v.toString());
            alert.showAndWait();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Erro ao cadastrar veículo");
            alert.setContentText("Verifique as informaçoes preenchidas e tente novamente!");

            alert.showAndWait();
        }
    }

    /**
     * @param placa placa do veículo do tipo String.
     * @return Veículo com a placa informada.
     * @return "null" se a placa não for válida ou não for encontrada.
     * Se a placa não for nula, exibe o veículo na lista de veículos.
     * Caso contrário, retorna "null".
     */
    @Override
    public Veiculo get(String placa) {
        Veiculo resultado = null;

        if (placa != null) {
            for (int i = 0; i < listaVeiculos.size(); i++) {
                if (listaVeiculos.get(i).getPlaca().equals(placa)) {
                    resultado = listaVeiculos.get(i);
                }
            }
        } else {
            resultado = null;
        }
        return resultado;
    }

    /**
     * @param placa placa do veículo do tipo String.
     * @return Informações sobre o veículo com a placa informada.
     * @return "Veículo não encontrado" se a placa não for válida ou não for encontrada.
     * Se a placa não for nula, retorna informações sobre o veículo.
     * Caso contrário, retorna "Veículo não encontrado".
     */
    @Override
    public String getInfo(String placa) {
        String resultado = "";

        if (placa != null) {
            for (int i= 0; i < listaVeiculos.size(); i++) {
                if (listaVeiculos.get(i).getPlaca().equals(placa)) {
                    resultado = listaVeiculos.get(i).toString();
                }
            }
        } else {
            resultado = "Veiculo não encontrado";
        }
        return resultado;
    }

    /**
     * @return Informações sobre todos os veículos.
     * @return "Não há veículos cadastrados" se não existir nenhum veículo.
     * Se existir algum veículo, retorna informações sobre todos os veículos.
     * Caso contrário, retorna "Não há veículos cadastrados".
     */
    @Override
    public String getInfo() {
        String resultado = "";

        if (listaVeiculos.size() > 0) {
            for (int i = 0; i < listaVeiculos.size(); i++) {
                resultado += listaVeiculos.get(i).toString();
            }
            //for (Veiculo veiculo : listaVeiculos) {
            //    resultado = veiculo.toString();
            //}
        } else {
            resultado = "Não há veículos cadastrados";
        }
        return resultado;
    }

    /**
     * @return Informações resumidas sobre todos os veículos.
     * @return "Não há veículos cadastrados" se não existir nenhum veículo.
     * Se existir algum veículo, para cada veículo na lista de veículos,
     * retorna informações resumidas sobre todos os veículos.
     * Caso contrário, retorna "Não há veículos cadastrados".
     */
    @Override
    public String getResumoInfo() {
        String resultado = null;

        if (listaVeiculos.size() > 0) {
            for (int i = 0; i < listaVeiculos.size(); i++) {
                resultado = listaVeiculos.get(i).getPlaca() + listaVeiculos.get(i).getAno()
                        + listaVeiculos.get(i).getValorDiaria();
            }
        } else {
            resultado = "Não há veículos cadastrados";
        }
        return resultado;
    }

    /**
     * @param placa placa do veículo do tipo String.
     * @return "true" se a placa for válida e o veículo for encontrado.
     * @return "false" se a placa não for válida ou não for encontrada.
     * Se a placa não for nula e o veículo existir, remove o veículo da lista de veículos e retorna true.
     * Caso contrário, retorna false.
     */
    @Override
    public boolean remove(String placa) {
        boolean resultado = false;
        if (placa != null) {
            for (int i = 0; i < listaVeiculos.size(); i++) {
                if (listaVeiculos.get(i).getPlaca().equals(placa)) {
                    listaVeiculos.remove(i);
                    System.out.print("Veículo removido com sucesso!");
                    return true;
                }
            }
        } else {
            return false;
        }
        return resultado;
    }

    /**
     * @param placa placa do veículo do tipo String.
     * @return "true" se a placa for válida e o veículo for encontrado.
     * @return "false" se a placa não for válida ou não for encontrada.
     * Se a placa não for nula e o veículo existir, retorna true.
     * Caso contrário, retorna false.
     */
    @Override
    public boolean existe(String placa) {
        boolean resultado = false;

        if (placa != null) {
            for (int i = 0; i < listaVeiculos.size(); i++) {
                if (listaVeiculos.get(i).getPlaca().equals(placa)) {
                    resultado = true;
                    System.out.print("Veículo encontrado!");
                }
            }
        } else {
            resultado = false;
            System.out.print("Veículo não encontrado");
        }
        return resultado;
    }
}
