package br.edu.poo_atividade_pratica;
public class Onibus extends Veiculo {

    // Declaring the variables.
    private int numPassageiros;
    private boolean arCondicionado;
    private String categoria;
    private boolean internet;

    public Onibus(String placa, String modelo, int ano, float valorDiaria, int numPassageiros, boolean arCondicionado, String categoria, boolean internet) {
        super(placa, modelo, ano, valorDiaria);
        this.numPassageiros = numPassageiros;
        this.arCondicionado = arCondicionado;
        this.categoria = categoria;
        this.internet = internet;
    }

    /**
     * This function returns the value of the variable numPassageiros
     * 
     * @return The value of the variable numPassageiros.
     */
    public int getNumPassageiros() {
        return numPassageiros;
    }

    /**
     * This function sets the value of the variable numPassageiros to the value of
     * the parameter numPassageiros
     * 
     * @param numPassageiros int
     */
    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    /**
     * This function returns the value of the variable arCondicionado
     * 
     * @return The value of the variable arCondicionado.
     */
    public boolean isArCondicionado() {
        return arCondicionado;
    }

    /**
     * This function sets the value of the variable arCondicionado to the value of
     * the parameter arCondicionado
     * 
     * @param arCondicionado boolean
     */
    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    /**
     * This function returns the value of the variable categoria
     * 
     * @return The value of the variable categoria.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * This function sets the value of the variable categoria to the value of the
     * parameter categoria
     * 
     * @param categoria String
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * This function returns the value of the variable internet
     * 
     * @return The value of the variable internet.
     */
    public boolean isInternet() {
        return internet;
    }

    /**
     * This function sets the value of the variable internet to the value of the
     * parameter internet
     * 
     * @param internet boolean
     */
    public void setInternet(boolean internet) {
        this.internet = internet;
    }

}
