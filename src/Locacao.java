public class Locacao {

    
   // Declaring the variables.
    private int codigo;
    private Cliente cliente;
    private Veiculo veiculo;
    private int dataLocacao;
    private int dataDevolucao;
    private boolean seguro;


    // A constructor.
    public Locacao(int codigo, Cliente cliente, Veiculo veiculo, int dataLocacao, int dataDevolucao, boolean seguro) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.seguro = seguro;
    }

    /**
     * This function returns the value of the variable codigo
     * 
     * @return The value of the variable codigo.
     */
    public int getCodigo() {
        return codigo;
    }


    /**
     * This function sets the value of the variable codigo to the value of the
     * parameter codigo
     * 
     * @param codigo int
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;

    }

    /**
     * This function returns the value of the variable cliente
     * 
     * @return The value of the variable cliente.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * This function sets the value of the variable cliente to the value of the
     * parameter cliente
     * 
     * @param cliente Cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * This function returns the value of the variable veiculo
     * 
     * @return The value of the variable veiculo.
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * This function sets the value of the variable veiculo to the value of the
     * parameter veiculo
     * 
     * @param veiculo Veiculo
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    /**
     * This function returns the value of the variable dataLocacao
     * 
     * @return The value of the variable dataLocacao.
     */
    public int getDataLocacao() {
        return dataLocacao;
    }

    /**
     * This function sets the value of the variable dataLocacao to the value of the
     * parameter dataLocacao
     * 
     * @param dataLocacao int
     */
    public void setDataLocacao(int dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    /**
     * This function returns the value of the variable dataDevolucao
     * 
     * @return The value of the variable dataDevolucao.
     */
    public int getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * This function sets the value of the variable dataDevolucao to the value of the
     * parameter dataDevolucao
     * 
     * @param dataDevolucao int
     */
    public void setDataDevolucao(int dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * This function returns the value of the variable seguro
     * 
     * @return The value of the variable seguro.
     */
    public boolean isSeguro() {
        return seguro;
    }

    /**
     * This function sets the value of the variable seguro to the value of the
     * parameter seguro
     * 
     * @param seguro boolean
     */
    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }


}
