package br.edu.poo_atividade_pratica;
public class Carro extends Veiculo {

    // Creating a class called Carro.
    private int numPortas;
    private int numPassageiros;
    private boolean arCondicionado;
    private float mediaKmLitro; 

    public Carro(String placa, String modelo, int ano, float valorDiaria, int numPortas, int numPassageiros, boolean arCondicionado, float mediaKmLitro) {
        super (placa, modelo, ano, valorDiaria);
        this.numPortas = numPortas;
        this.numPassageiros = numPassageiros;
        this.arCondicionado = arCondicionado;
        this.mediaKmLitro = mediaKmLitro;
    }

    /**
     * This function returns the value of the variable numPortas
     * 
     * @return The value of the variable numPortas.
     */
    public int getNumPortas() {
        return numPortas;
    }

    /**
     * This function sets the value of the variable numPortas to the value of the
     * parameter numPortas
     * 
     * @param numPortas int
     */
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
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
     * This function returns the value of the variable mediaKmLitro
     * 
     * @return The value of the variable mediaKmLitro.
     */
    public float getMediaKmLitro() {
        return mediaKmLitro;
    }

    /**
     * This function sets the value of the variable mediaKmLitro to the value of the
     * parameter mediaKmLitro
     * 
     * @param mediaKmLitro float
     */
    public void setMediaKmLitro(float mediaKmLitro) {
        this.mediaKmLitro = mediaKmLitro;
    }
}

    












    

