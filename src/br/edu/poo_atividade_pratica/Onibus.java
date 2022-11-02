package br.edu.poo_atividade_pratica;

public class Onibus extends Veiculo {

    private int numPassageiros;
    private boolean arCondicionado;
    private String categoria;
    private boolean internet;

    public Onibus(String placa, String modelo, int ano, float valorDiaria, int numPassageiros,
            boolean arCondicionado, String categoria, boolean internet) {
        super(placa, modelo, ano, valorDiaria);
        this.numPassageiros = numPassageiros;
        this.arCondicionado = arCondicionado;
        this.categoria = categoria;
        this.internet = internet;
    }

    /**
     * @return int return the numPassageiros
     */
    public int getNumPassageiros() {
        return numPassageiros;
    }

    /**
     * @param numPassageiros the numPassageiros to set
     */
    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    /**
     * @return boolean return the arCondicionado
     */
    public boolean isArCondicionado() {
        return arCondicionado;
    }

    /**
     * @param arCondicionado the arCondicionado to set
     */
    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    /**
     * @return String return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return boolean return the internet
     */
    public boolean isInternet() {
        return internet;
    }

    /**
     * @param internet the internet to set
     */
    public void setInternet(boolean internet) {
        this.internet = internet;
    }

}
