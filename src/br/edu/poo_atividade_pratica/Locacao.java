package br.edu.poo_atividade_pratica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Locacao {
    private Cliente cliente;
    private Veiculo veiculo;
    private boolean seguro;
    private static int numCodigo = 10000;
    private int codigo;
    private Date dataLocacao; // Variável aparece como "não usada" no VSCode devido a um problema
    private Date dataDevolucao; // de tempo de execução, mas funciona normalmente.

    SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Construtor da classe Locacao.
     * @param codigo Código da locação. !IMPORTANTE! O código deve ser único.
     * @param cliente Cliente que está locando o veículo.
     * @param veiculo Veículo que está sendo locado. 
     * @param dataLocacao String para ser convertida em Date e armazenando data da locação.
     * @param dataDevolucao String para ser convertida em Date e armazenando data de devolução.
     * dataLocacao e dataDevolucao estão em um bloco try/catch para tratar uma exceção do tipo 
     * ParseException, pois o método parse() não pode ser verificado em tempo de execução.
     * https://stackoverflow.com/questions/41058499/why-the-parseexception-appears-when-use-simpledateformat
     * @param seguro Booleano indicando se o cliente contratou o seguro.
     */
    public Locacao(Cliente cliente, Veiculo veiculo, String dataLocacao,
            String dataDevolucao, boolean seguro) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.seguro = seguro;
        try {
            this.dataLocacao = formatoData.parse(dataLocacao);
        } catch (ParseException e) {
            System.err.println(
                    "Erro ao converter data de locação. \nVerifique se o formato da data (dd/MM/yyyy) está correta.");
            e.printStackTrace();
        }
        try {
            this.dataDevolucao = formatoData.parse(dataDevolucao);
        } catch (ParseException e) {
            System.err.println(
                    "Erro ao converter data de devolução. \nVerifique se o formato da data (dd/MM/yyyy) está correta.");
            e.printStackTrace();
        }
        this.codigo = numCodigo++;
    }

    /**
     * Possibilita a criação de um objeto Locacao sem parâmetros.
     */
    public Locacao() {
        // Construtor padrão
    }

    /**
     * @return Código da locação do tipo int.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo Seta o código da locação do tipo int.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return Cliente do tipo Cliente.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente Seta o cliente do tipo Cliente.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return Veículo do tipo Veiculo.
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * @param veiculo Seta o veículo do tipo Veiculo.
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    /**
     * @return Tipo boolean se o locador contratou um seguro.
     */
    public boolean haveSeguro() {
        return seguro;
    }

    /**
     * @param seguro Seta o tipo boolean se o locador contratou um seguro.
     */
    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }
}
