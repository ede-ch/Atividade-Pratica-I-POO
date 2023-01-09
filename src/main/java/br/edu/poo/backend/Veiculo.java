package br.edu.poo.backend;

public class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private float valorDiaria;

    /**
     * @param placa Placa do veículo.
     * @param modelo Modelo do veículo.
     * @param ano Ano do veículo.
     * @param valorDiaria Valor da diária do veículo.
     */
    public Veiculo(String placa, String modelo, int ano, float valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
    }

    /**
     * Possibilita a criação de um objeto Veiculo sem parâmetros.
     */
    public Veiculo() {
        // Construtor padrão
    }

    /**
     * @return Placa do veículo do tipo String.
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa Seta a placa do veículo do tipo String.
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return Modelo do veículo do tipo String.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo Seta o modelo do veículo do tipo String.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return Ano do veículo do tipo int.
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano Seta o ano do veículo do tipo int.
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return Valor da diária do veículo do tipo float.
     */
    public float getValorDiaria() {
        return valorDiaria;
    }

    /**
     * @param valorDiaria Seta o valor da diária do veículo do tipo float.
     */
    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String toString() {
        return "Placa: " + placa + "\nModelo: " + modelo + "\nAno: " + ano + "\nValor da diária: "
                + valorDiaria;
    }
}
