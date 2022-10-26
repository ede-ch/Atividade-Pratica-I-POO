public class Cliente {

   // A variable declaration.
    private long CPF;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    
    // A constructor.
    public Cliente(long CPF, String nome, String endereco, String telefone, String email) {
        this.CPF = CPF;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    
   /**
    * This function returns the CPF of the client
    * 
    * @return The CPF number.
    */
    public long getCPF() {
        return CPF;
    }
    
    /**
     * This function sets the CPF of the object to the value of the parameter CPF
     * 
     * @param CPF The CPF of the client
     */
    public void setCPF(long CPF) {
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
    public String getTelefone() {
        return telefone;
    }
    
    /**
     * This function sets the value of the variable telefone to the value of the parameter telefone
     * 
     * @param telefone String
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    /**
     * This function returns the email of the user
     * 
     * @return The email address of the user.
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * This function sets the email of the user
     * 
     * @param email The email address of the user.
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    // A Java annotation. It is used to tell the compiler that the element is meant to override an
    // element declared in a superclass.
    @Override
    // A method that returns a string representation of the object.
    public String toString() {
        return "Cliente{" + "CPF=" + CPF + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
}
