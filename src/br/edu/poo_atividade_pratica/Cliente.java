package br.edu.poo_atividade_pratica;

public class Cliente implements IClientes{
    // A variable declaration.
    private long CPF;
    private String nome;
    private String endereco;
    private int telefone;
    private int carteiraMotorista;

    private Locadora locadora = new Locadora();

    // A constructor.
    public Cliente(long CPF, String nome, String endereco, int telefone, int carteiraMotorista) {
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
     * @return The CPF number.
     */
    public long getCPF() {
        return CPF;
    }
    
    /**
     * @param CPF The CPF of the client.
     */
    public void setCPF(long CPF) {
        this.CPF = CPF;
    }
    
    /**
    * @return The method getNome() is returning the value of the variable nome. */
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
     * @return The value of the variable endereco.
     */
    public String getEndereco() {
        return endereco;
    }
    
    /**
     * @param endereco String
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    /**
     * @return The method is returning the value of the variable telefone.
     */
    public int getTelefone() {
        return telefone;
    }
    
    /**
     * @param telefone int
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
  
    /**
     * @return The value of the variable carteiraMotorista.
     */
    public int getCarteiraMotorista() {
        return carteiraMotorista;
    }

    /**
     * @param carteiraMotorista Driver's license
     */
    public void setCarteiraMotorista(int carteiraMotorista) {
        this.carteiraMotorista = carteiraMotorista;
    }

    public String toString() {
        return "CPF: " + CPF + ", Nome:" + nome + ", Endereco:" + endereco + ", Telefone:" + telefone
                + ", Carteira de Motorista: " + carteiraMotorista;
    }
    
    public void add(Cliente c) {
        locadora.addCliente(c);
    }
    
    public Cliente get(long CPF) {
        if (CPF > 0) {
            for (int i = 0; i < locadora.getListaClientes().length; i++) {
                if (locadora.getListaClientes()[i].getCPF() == CPF) {
                    return locadora.getListaClientes()[i];
                }
            }
        }
        return null;
    }
    
    public String getInfo(long CPF) {
        if (CPF > 0) {
            for (int i = 0; i < locadora.getListaClientes().length; i++) {
                if (locadora.getListaClientes()[i].getCPF() == CPF) {
                    return locadora.getListaClientes()[i].toString();
                }
            }
        }
        return null;
    }
    
    public String getInfo() {
        if (locadora.getListaClientes().length > 0) {
            for (int i = 0; i < locadora.getListaClientes().length; i++) {
                return locadora.getListaClientes()[i].toString();
            }
        }
        return "Não há clientes cadastrados.";
    }
    
    public String getResumoInfo() {
        if (locadora.getListaClientes().length > 0) {
            for (int i = 0; i < locadora.getListaClientes().length; i++) {
                return "CPF: " + locadora.getListaClientes()[i].getCPF() + ", Nome: " + locadora.getListaClientes()[i].getNome();
            }
        }
        return "Não há clientes cadastrados.";
    }
    
    public boolean remove(long CPF) {
        if (CPF > 0) {
            for (int i = 0; i < locadora.getListaClientes().length; i++) {
                if (locadora.getListaClientes()[i].getCPF() == CPF) {
                    locadora.getListaClientes()[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean existe(long CPF) {
        if (CPF > 0) {
            for (int i = 0; i < locadora.getListaClientes().length; i++) {
                if (locadora.getListaClientes()[i].getCPF() == CPF) {
                    return true;
                }
            }
        }
        return false;
    }
}
