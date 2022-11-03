package br.edu.poo.objects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Locacao {
    private Cliente cliente;
    private Veiculo veiculo;
    private boolean seguro;
    private static int numCodigo = 10000;
    private int codigo;
    private Date dataLocacao; // Variável aparece como "não usada" no VSCode devido a um problema
    private Date dataDevolucao; // de tempo de execução, mas funciona normalmente.
    
    SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy", new Locale("pt","BR"));
    
    /**
     * Construtor da classe Locacao.
     * @param cliente Cliente que está locando o veículo.
     * @param veiculo Veículo que está sendo locado. 
     * @param seguro Booleano indicando se o cliente contratou o seguro.
     * @param dataLocacao String para ser convertida em Date e armazenando data da locação.
     * @param dataDevolucao String para ser convertida em Date e armazenando data de devolução.
     * dataLocacao e dataDevolucao estão em um bloco try/catch para tratar uma exceção do tipo 
     * ParseException, pois o método parse() não pode ser verificado em tempo de execução.
     * https://stackoverflow.com/questions/41058499/why-the-parseexception-appears-when-use-simpledateformat
     * @param codigo Código da locação. !IMPORTANTE! O código deve ser único.
     */
    public Locacao(Cliente cliente, Veiculo veiculo, String dataLocacao,
    String dataDevolucao, boolean seguro) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.seguro = seguro;
        try {
            formatoData.setLenient(false); // Não aceita datas inválidas.
            this.dataLocacao = formatoData.parse(dataLocacao);
        } catch (ParseException e) {
            System.err.println(
                    "Erro ao converter data de locação. Verifique se a data e o formato (dd/MM/yyyy) estão corretos.");
            e.printStackTrace();
        }
        try {
            formatoData.setLenient(false); // Não aceita datas inválidas.
            this.dataDevolucao = formatoData.parse(dataDevolucao);
        } catch (ParseException e) {
            System.err.println(
                    "Erro ao converter data de devolução. Verifique se a data e o formato (dd/MM/yyyy) estão corretos.");
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
    public boolean getSeguro() {
        return seguro;
    }

    /**
     * @param seguro Seta o tipo boolean se o locador contratou um seguro.
     */
    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
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
     * @return Data de locação do tipo Date.
     */
    public Date getDataLocacao() {
        return dataLocacao;
    }

    /**
     * @param dataLocacao Seta a data de locação do tipo Date.
     */
    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    /**
     * @return Data de devolução do tipo Date.
     */
    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao Seta a data de devolução do tipo Date.
     */
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String toString() {
        return "Locação: " + codigo + "\n" + cliente + "\n" + veiculo + "\nSeguro: "
                + seguro + "\nData de locação: " + formatoData.format(dataLocacao) + "\nData de devolução: "
                + formatoData.format(dataDevolucao);
    }
}
