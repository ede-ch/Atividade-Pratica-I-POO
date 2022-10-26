public class Veiculo {

    private String placa;
    private String modelo;
    private int ano;
    private double valorDiaria;

    /**
     * This function returns the value of the variable placa
     * 
     * @return The value of the variable placa.
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * This function sets the value of the variable placa to the value of the
     * parameter placa
     * 
     * @param placa String
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * This function returns the value of the variable modelo
     * 
     * @return The value of the variable modelo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * This function sets the value of the variable modelo to the value of the
     * parameter modelo
     * 
     * @param modelo String
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * This function returns the value of the variable ano
     * 
     * @return The value of the variable ano.
     */
    public int getAno() {
        return ano;
    }

    /**
     * This function sets the value of the variable ano to the value of the
     * parameter ano
     * 
     * @param ano int
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * This function returns the value of the variable valorDiaria
     * 
     * @return The value of the variable valorDiaria.
     */
    public double getValorDiaria() {
        return valorDiaria;
    }

    /**
     * This function sets the value of the variable valorDiaria to the value of the
     * parameter
     * valorDiaria
     * 
     * @param valorDiaria double
     */
    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;

    }

    /**
     * This function returns a String with the information of the vehicle
     * 
     * @return A String with the information of the vehicle.
     */
    public String getInfo() {
        return "Placa: " + placa + " Modelo: " + modelo + " Ano: " + ano + " Valor da diária: "
                + valorDiaria;
    }
}