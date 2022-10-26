import java.util.ArrayList;

public class Veiculo implements IVeiculos {

    // Declaring the variables that will be used in the class.
    private String placa;
    private String modelo;
    private int ano;
    private float valorDiaria;
    private int id;

    
    // Creating an ArrayList of type Veiculo.
    ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    
    // A constructor.
    public Veiculo(String placa, String modelo, int ano, float valorDiaria, int id) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
        this.id = id;
    }
    

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
     * @param valorDiaria float
     */
    public void setValorDiaria(Float valorDiaria) {
        this.valorDiaria = valorDiaria;

    }

    /**
     * This function returns a String with the information of the vehicle
     * 
     * @return A String with the information of the vehicle.
     */
    public String toString() {
        return "Placa: " + placa + " Modelo: " + modelo + " Ano: " + ano + " Valor da diária: "
                + valorDiaria;
    }

    /**
     * This function returns the value of the variable id
     * 
     * @return The value of the variable id.
     */
    public int getId() {
        return id;
    }

    /**
     * This function sets the value of the variable id to the value of the parameter
     * id
     * 
     * @param id int
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * This function adds a vehicle to the list of vehicles
     * 
     * @param v Veiculo
     */
    public void add(Veiculo v) {
        if (veiculos != null) {
            veiculos.add(v);
        } else {
            System.out.println("Veículo está vazio");
        }

    }

    /**
     * If the list of vehicles is not null, then for each vehicle in the list, if
     * the vehicle's license
     * plate equals the license plate passed in, then return the vehicle
     * 
     * @param placa String
     * @return The method returns the object Veiculo.
     */

    public Veiculo get(String placa) {
        if (veiculos != null) {
            for (Veiculo veiculo : veiculos) {
                if (veiculo.getPlaca().equals(placa)) {
                    return veiculo;
                }
            }
        }
        return null;
    }

    /**
     * If the list of vehicles is not empty, then for each vehicle in the list,
     * return the string
     * representation of the vehicle
     * 
     * @return The method is returning the toString() method of the class Veiculo.
     */
    public String getInfo() {
        if (veiculos != null) {
            for (Veiculo veiculo : veiculos) {
                return toString();
            }
        }
        return null;
    }

    /**
     * It returns a string containing the information of a vehicle, given its plate
     * number
     * 
     * @param placa String
     * @return The method is returning a String.
     */
    public String getInfo(String placa) {
        if (veiculos != null) {
            for (Veiculo veiculo : veiculos) {
                if (veiculo.getPlaca().equals(placa)) {
                    return toString();
                }
            }
        }

        return ("Veículo não encontrado");
    }

    /**
     * It returns a string with the plate, model and year of the vehicle, if it
     * exists, or a message
     * saying that the vehicle was not found
     * 
     * @return The method is returning the String "Veículo não encontrado"
     */
    public String getResumoInfo() {
        if (veiculos != null) {
            for (Veiculo veiculo : veiculos) {
                return "Placa: " + placa + " Modelo: " + modelo + " Ano: " + ano;
            }
        }

        return ("Veículo não encontrado");
    }

    /**
     * It removes a vehicle from the list of vehicles
     * 
     * @param placa String
     * @return A boolean value.
     */
    public boolean remove(String placa) {
        if (veiculos != null) {
            for (Veiculo veiculo : veiculos) {
                if (veiculo.getPlaca().equals(placa)) {
                    veiculos.remove(veiculo);
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * It checks if a given car exists in the list of cars
     * 
     * @param placa String
     * @return A boolean value.
     */
    public boolean existe(String placa) {
        if (veiculos != null) {
            for (Veiculo veiculo : veiculos) {
                if (veiculo.getPlaca().equals(placa)) {
                    return true;
                }
            }
        }

        return false;
    }
}