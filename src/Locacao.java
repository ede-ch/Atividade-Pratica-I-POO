public class Locacao {

    // A private variable.
    private int codigo;
    private Cliente cliente;
    private Veiculo veiculo;
    private int dataLocacao;
    private int dataDevolucao;
    private double valorLocacao;
    private double valorDevolucao;
    private double valorTotal;
    private boolean devolvido;

    // A constructor.
    public Locacao(int codigo, Cliente cliente, Veiculo veiculo, int dataLocacao, int dataDevolucao, double valorLocacao, double valorDevolucao, double valorTotal, boolean devolvido) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valorLocacao = valorLocacao;
        this.valorDevolucao = valorDevolucao;
        this.valorTotal = valorTotal;
        this.devolvido = devolvido;
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
     * This function sets the value of the variable codigo to the value of the parameter codigo
     * 
     * @param codigo int
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * This function returns the cliente
     * 
     * @return The cliente object.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * This function sets the cliente variable to the cliente parameter
     * 
     * @param cliente Cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * This function returns the vehicle
     * 
     * @return The method is returning the value of the variable veiculo.
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * It sets the value of the veiculo variable.
     * 
     * @param veiculo is the object that I'm trying to save
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    /**
     * This function returns the dataLocacao
     * 
     * @return The dataLocacao is being returned.
     */
    public int getDataLocacao() {
        return dataLocacao;
    }

    /**
     * This function sets the dataLocacao variable to the value of the parameter dataLocacao
     * 
     * @param dataLocacao int
     */
    public void setDataLocacao(int dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    /**
     * This function returns the dataDevolucao variable
     * 
     * @return The dataDevolucao variable is being returned.
     */
    public int getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * It sets the dataDevolucao variable to the value of the parameter.
     * 
     * @param dataDevolucao the date the book is due to be returned
     */
    public void setDataDevolucao(int dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * This function returns the value of the variable valorLocacao
     * 
     * @return The value of the variable valorLocacao.
     */
    public double getValorLocacao() {
        return valorLocacao;
    }

    /**
     * This function sets the value of the variable valorLocacao to the value of the parameter
     * valorLocacao
     * 
     * @param valorLocacao double
     */
    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    /**
     * This function returns the value of the variable valorDevolucao
     * 
     * @return The value of the variable valorDevolucao.
     */
    public double getValorDevolucao() {
        return valorDevolucao;
    }

    /**
     * It sets the value of the variable valorDevolucao.
     * 
     * @param valorDevolucao the value of the return
     */
    public void setValorDevolucao(double valorDevolucao) {
        this.valorDevolucao = valorDevolucao;
    }

    /**
     * This function returns the value of the variable valorTotal
     * 
     * @return The value of the variable valorTotal.
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * It sets the value of the variable valorTotal to the value of the parameter valorTotal.
     * 
     * @param valorTotal Total value of the order
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * This function returns the value of the variable devolvido
     * 
     * @return The value of the variable devolvido.
     */
    public boolean isDevolvido() {
        return devolvido;
    }

    /**
     * This function sets the value of the variable devolvido to the value of the parameter devolvido
     * 
     * @param devolvido boolean
     */
    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    


  
    
    
}
