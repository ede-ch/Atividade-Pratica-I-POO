package br.edu.poo_atividade_pratica;

public class Cliente {
    // A variable declaration.
    private int CPF;
    private String nome;
    private String endereco;
    private int telefone;
    private int carteiraMotorista;

    // A constructor.
    public Cliente(int CPF, String nome, String endereco, int telefone, int carteiraMotorista) {
        this.CPF = CPF;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.carteiraMotorista = carteiraMotorista;
    }
    
    public Cliente() {
        //Default constructor.
    }

    /**
    * This function returns the CPF of the client
    * 
    * @return The CPF number.
    */
    public int getCPF() {
        return CPF;
    }
    
    /**
     * This function sets the CPF of the client
     * 
     * @param CPF The CPF of the client.
     */
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    
    /**
     * This function returns the value of the variable nome
     * 
     * @return The method getNome() is returning the value of the variable nome.
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * This function sets the name of the object
     * 
     * @param nome The name of the person
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * This function returns the endereco of the object
     * 
     * @return The value of the variable endereco.
     */
    public String getEndereco() {
        return endereco;
    }
    
    /**
     * This function sets the endereco variable to the value of the endereco parameter
     * 
     * @param endereco String
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    /**
     * This function returns the value of the variable telefone
     * 
     * @return The method is returning the value of the variable telefone.
     */
    public int getTelefone() {
        return telefone;
    }
    
    
    /**
     * This function sets the value of the variable telefone to the value of the variable telefone
     * 
     * @param telefone int
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
  
    /**
    * This function returns the value of the variable carteiraMotorista
    * 
    * @return The value of the variable carteiraMotorista.
    */
    
    public int getCarteiraMotorista() {
        return carteiraMotorista;
    }

    /**
    * This function sets the value of the variable carteiraMotorista to the value of the parameter
    * carteiraMotorista
    * 
    * @param carteiraMotorista Driver's license
    */
   
    public void setCarteiraMotorista(int carteiraMotorista) {
        this.carteiraMotorista = carteiraMotorista;
    }
    


    
}
