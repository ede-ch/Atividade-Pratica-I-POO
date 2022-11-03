package br.edu.poo.objects;

public class Carro extends Veiculo {

    private int numPortas;
    private int numPassageiros;
    private boolean arCondicionado;
    private float mediaKmLitro;

    /**
     * @param placa Placa do veículo.
     * @param modelo Modelo do veículo.
     * @param ano Ano do veículo.
     * @param valorDiaria Valor da diária do veículo.
     * @param numPortas Número de portas do carro.
     * @param numPassageiros Número de passageiros do carro.
     * @param arCondicionado Se o carro possui ar condicionado ou não.
     * @param mediaKmLitro Média de quilômetros por litro do carro.
     */
    public Carro(String placa, String modelo, int ano, float valorDiaria, int numPortas,
            int numPassageiros, boolean arCondicionado, float mediaKmLitro) {
        super(placa, modelo, ano, valorDiaria);
        this.numPortas = numPortas;
        this.numPassageiros = numPassageiros;
        this.arCondicionado = arCondicionado;
        this.mediaKmLitro = mediaKmLitro;
    }

    /**
     * @return Número de portas do carro do tipo int.
     */
    public int getNumPortas() {
        return numPortas;
    }

    /**
     * @param numPortas Seta o número de portas do carro do tipo int.
     */
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    /**
     * @return Número de passageiros do carro do tipo int.
     */
    public int getNumPassageiros() {
        return numPassageiros;
    }

    /**
     * @param numPassageiros Seta o número de passageiros do carro do tipo int.
     */
    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    /**
     * @return Se o carro possui ar condicionado ou não do tipo boolean.
     */
    public boolean isArCondicionado() {
        return arCondicionado;
    }

    /**
     * @param arCondicionado Seta se o carro possui ar condicionado ou não do tipo boolean.
     */
    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    /**
     * @return Média de quilômetros por litro do carro do tipo float.
     */
    public float getMediaKmLitro() {
        return mediaKmLitro;
    }

    /**
     * @param mediaKmLitro Seta a média de quilômetros por litro do carro do tipo float.
     */
    public void setMediaKmLitro(float mediaKmLitro) {
        this.mediaKmLitro = mediaKmLitro;
    }

    public String toString() {
        return "Carro: " + super.toString() + "\nNúmero de portas: " + numPortas + "\nNúmero de passageiros: " + numPassageiros
                + "\nAr condicionado: " + arCondicionado + "\nMédia de quilômetros por litro: " + mediaKmLitro;
    }
}
