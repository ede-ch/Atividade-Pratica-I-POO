package br.edu.poo_atividade_pratica;

public class Caminhao extends Veiculo {

    // Declaring the variables numEixos and capacidadeCarga.
    private int numEixos;
    private float capacidadeCarga;

    public Caminhao(String placa, String modelo, int ano, float valorDiaria, int numEixos,
            float capacidadeCarga) {
        super(placa, modelo, ano, valorDiaria);
        this.numEixos = numEixos;
        this.capacidadeCarga = capacidadeCarga;
    }

    /**
     * @return int return the numEixos
     */
    public int getNumEixos() {
        return numEixos;
    }

    /**
     * @param numEixos the numEixos to set
     */
    public void setNumEixos(int numEixos) {
        this.numEixos = numEixos;
    }

    /**
     * @return float return the capacidadeCarga
     */
    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    /**
     * @param capacidadeCarga the capacidadeCarga to set
     */
    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

}
