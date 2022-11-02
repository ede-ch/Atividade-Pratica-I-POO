package br.edu.poo_atividade_pratica;

public class Cliente {
    private long CPF;
    private String nome;
    private String endereco;
    private int telefone;
    private int carteiraMotorista;

    public Cliente(long CPF, String nome, String endereco, int telefone, int carteiraMotorista) {
        this.CPF = CPF;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.carteiraMotorista = carteiraMotorista;
    }

    public Cliente() {
        // Construtor padrão
    }

    /**
     * @return long return the CPF
     */
    public long getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return int return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return int return the carteiraMotorista
     */
    public int getCarteiraMotorista() {
        return carteiraMotorista;
    }

    /**
     * @param carteiraMotorista the carteiraMotorista to set
     */
    public void setCarteiraMotorista(int carteiraMotorista) {
        this.carteiraMotorista = carteiraMotorista;
    }
}
