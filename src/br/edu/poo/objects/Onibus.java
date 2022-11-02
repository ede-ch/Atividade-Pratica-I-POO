package br.edu.poo.objects;

public class Onibus extends Veiculo {

    private int numPassageiros;
    private String categoria;
    private boolean arCondicionado;
    private boolean internet;

    /**
     * @param placa Placa do veículo.
     * @param modelo Modelo do veículo.
     * @param ano Ano do veículo.
     * @param valorDiaria Valor da diária do veículo.
     * @param numPassageiros Número de passageiros do ônibus.
     * @param arCondicionado Se o ônibus possui ar condicionado ou não.
     * @param categoria Categoria do ônibus.
     * @param internet Se o ônibus possui internet ou não.
     */
    public Onibus(String placa, String modelo, int ano, float valorDiaria, int numPassageiros,
            String categoria, boolean arCondicionado, boolean internet) {
        super(placa, modelo, ano, valorDiaria);
        this.numPassageiros = numPassageiros;
        this.categoria = categoria;
        this.arCondicionado = arCondicionado;
        this.internet = internet;
    }

    /**
     * @return Número de passageiros do ônibus do tipo int.
     */
    public int getNumPassageiros() {
        return numPassageiros;
    }

    /**
     * @param numPassageiros Seta o número de passageiros do ônibus do tipo int.
     */
    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    /**
     * @return Booleano que indica se o ônibus possui ar condicionado ou não.
     */
    public boolean isArCondicionado() {
        return arCondicionado;
    }

    /**
     * @param arCondicionado Seta um booleano que indica se o ônibus possui ar condicionado ou não.
     */
    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    /**
     * @return Categoria do ônibus do tipo String.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria Seta a categoria do ônibus do tipo String.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return Tipo booleano se o ônibus possui internet ou não.
     */
    public boolean isInternet() {
        return internet;
    }

    /**
     * @param internet Seta um tipo booleano se o ônibus possui internet ou não.
     */
    public void setInternet(boolean internet) {
        this.internet = internet;
    }
}
