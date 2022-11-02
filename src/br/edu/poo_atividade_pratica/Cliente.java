package br.edu.poo_atividade_pratica;

public class Cliente {
    private long CPF;
    private String nome;
    private String endereco;
    private int telefone;
    private int carteiraMotorista;

    /**
     * @param CPF CPF do cliente.
     * @param nome Nome do cliente.
     * @param endereco Endereço do cliente.
     * @param telefone Telefone do cliente.
     * @param carteiraMotorista Número da carteira de motorista do cliente.
     */
    public Cliente(long CPF, String nome, String endereco, int telefone, int carteiraMotorista) {
        this.CPF = CPF;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.carteiraMotorista = carteiraMotorista;
    }

    /**
     * Possibilita a criação de um objeto Cliente sem parâmetros.
     */
    public Cliente() {
        // Construtor padrão
    }

    /**
     * @return CPF do cliente do tipo long.
     */
    public long getCPF() {
        return CPF;
    }

    /**
     * @param CPF Seta o CPF do cliente do tipo long.
     */
    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    /**
     * @return Nome do cliente do tipo String.
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome Seta o nome do cliente do tipo String.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Endereço do cliente do tipo String.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco Seta o endereço do cliente do tipo String.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return Telefone do cliente do tipo int.
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone Seta o telefone do cliente do tipo int.
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return Número da carteira de motorista do cliente do tipo int.
     */
    public int getCarteiraMotorista() {
        return carteiraMotorista;
    }

    /**
     * @param carteiraMotorista Seta o número da carteira de motorista do cliente do tipo int.
     */
    public void setCarteiraMotorista(int carteiraMotorista) {
        this.carteiraMotorista = carteiraMotorista;
    }
}
