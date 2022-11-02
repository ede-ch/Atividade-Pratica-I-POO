package br.edu.poo_atividade_pratica;

public class Locacao {
    // Declaring the variables.
    private int codigo;
    private Cliente cliente;
    private Veiculo veiculo;
    private int dataLocacao;
    private int dataDevolucao;
    private boolean seguro;

    // A constructor.
    public Locacao(int codigo, Cliente cliente, Veiculo veiculo, int dataLocacao, int dataDevolucao,
            boolean seguro) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.seguro = seguro;
    }

    public Locacao() {
        // Construtor padrão
    }

    /**
     * @return int return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return Cliente return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return Veiculo return the veiculo
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * @param veiculo the veiculo to set
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    /**
     * @return int return the dataLocacao
     */
    public int getDataLocacao() {
        return dataLocacao;
    }

    /**
     * @param dataLocacao the dataLocacao to set
     */
    public void setDataLocacao(int dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    /**
     * @return int return the dataDevolucao
     */
    public int getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(int dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * @return boolean return the seguro
     */
    public boolean isSeguro() {
        return seguro;
    }

    /**
     * @param seguro the seguro to set
     */
    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

}
