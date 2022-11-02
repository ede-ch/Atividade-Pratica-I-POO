package br.edu.poo_atividade_pratica;

public class Carro extends Veiculo {

    private int numPortas;
    private int numPassageiros;
    private boolean arCondicionado;
    private float mediaKmLitro;

    public Carro(String placa, String modelo, int ano, float valorDiaria, int numPortas,
            int numPassageiros, boolean arCondicionado, float mediaKmLitro) {
        super(placa, modelo, ano, valorDiaria);
        this.numPortas = numPortas;
        this.numPassageiros = numPassageiros;
        this.arCondicionado = arCondicionado;
        this.mediaKmLitro = mediaKmLitro;
    }

    /**
     * @return int return the numPortas
     */
    public int getNumPortas() {
        return numPortas;
    }

    /**
     * @param numPortas the numPortas to set
     */
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
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
     * @return float return the mediaKmLitro
     */
    public float getMediaKmLitro() {
        return mediaKmLitro;
    }

    /**
     * @param mediaKmLitro the mediaKmLitro to set
     */
    public void setMediaKmLitro(float mediaKmLitro) {
        this.mediaKmLitro = mediaKmLitro;
    }

}
