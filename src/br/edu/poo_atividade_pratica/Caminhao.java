package br.edu.poo_atividade_pratica;

public class Caminhao extends Veiculo {

    private int numEixos;
    private float capacidadeCarga;

    /**
     * @param placa Placa do veículo.
     * @param modelo Modelo do veículo.
     * @param ano Ano do veículo.
     * @param valorDiaria Valor da diária do veículo.
     * @param numEixos Número de eixos do caminhão.
     * @param capacidadeCarga Capacidade de carga do caminhão.
     */
    public Caminhao(String placa, String modelo, int ano, float valorDiaria, int numEixos,
            float capacidadeCarga) {
        super(placa, modelo, ano, valorDiaria);
        this.numEixos = numEixos;
        this.capacidadeCarga = capacidadeCarga;
    }

    /**
     * @return Número de eixos do caminhão do tipo int.
     */
    public int getNumEixos() {
        return numEixos;
    }

    /**
     * @param numEixos Seta o número de eixos do caminhão do tipo int.
     */
    public void setNumEixos(int numEixos) {
        this.numEixos = numEixos;
    }

    /**
     * @return Capacidade de carga do caminhão do tipo float.
     */
    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    /**
     * @param capacidadeCarga Seta a capacidade de carga do caminhão do tipo float.
     */
    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
