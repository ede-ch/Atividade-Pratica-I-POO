public class Caminhao extends Veiculo {

    private int numEixos;
    private float capacidadeCarga;

    /**
     * This function returns the value of the variable numEixos
     * 
     * @return The value of the variable numEixos.
     */
    public int getNumEixos() {
        return numEixos;
    }

    /**
     * This function sets the value of the variable numEixos to the value of the
     * parameter numEixos
     * 
     * @param numEixos int
     */
    public void setNumEixos(int numEixos) {
        this.numEixos = numEixos;
    }

    /**
     * This function returns the value of the variable capacidadeCarga
     * 
     * @return The value of the variable capacidadeCarga.
     */
    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    /**
     * This function sets the value of the variable capacidadeCarga to the value of
     * the parameter capacidadeCarga
     * 
     * @param capacidadeCarga float
     */
    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
