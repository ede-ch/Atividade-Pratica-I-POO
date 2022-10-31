package br.edu.poo_atividade_pratica;
public class Locadora {
    private Veiculo[] listaVeiculos;
    private Cliente[] listaClientes;
    private Locacao[] listaLocacoes;
    private int numVeiculos;
    private int numClientes;
    private int numLocacoes;

    public Locadora(int maxVeiculos, int maxClientes, int maxLocacoes) {
        this.listaVeiculos = new Veiculo[maxVeiculos];
        this.listaClientes = new Cliente[maxClientes];
        this.listaLocacoes = new Locacao[maxLocacoes];
    }
    
    /**
     * @return Veiculo [] return the listaVeiculos
     */
    public Veiculo [] getListaVeiculos() {
        return listaVeiculos;
    }

    /**
     * @param listaVeiculos the listaVeiculos to set
     */
    public void setListaVeiculos(Veiculo [] listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    /**
     * @return Cliente [] return the listaClientes
     */
    public Cliente [] getListaClientes() {
        return listaClientes;
    }

    /**
     * @param listaClientes the listaClientes to set
     */
    public void setListaClientes(Cliente [] listaClientes) {
        this.listaClientes = listaClientes;
    }

    /**
     * @return Locacao [] return the listaLocacoes
     */
    public Locacao [] getListaLocacoes() {
        return listaLocacoes;
    }

    /**
     * @param listaLocacoes the listaLocacoes to set
     */
    public void setListaLocacoes(Locacao [] listaLocacoes) {
        this.listaLocacoes = listaLocacoes;
    }

    public Locadora(){
        //Default constructor.
    }

    public void addVeiculo(Veiculo v) {
        if (v != null && v instanceof Veiculo && numVeiculos < listaVeiculos.length) {
            listaVeiculos[numVeiculos] = new Veiculo(v);
            numVeiculos++;
        }
        System.err.println("Veiculo invalido");
    }

    public void removeVeiculo(Veiculo v) {
        if (v != null && v instanceof Veiculo) {
            for (int i = 0; i < numVeiculos; i++) {
                if (listaVeiculos[i].getPlaca().equals(v.getPlaca())) {
                    listaVeiculos[numVeiculos - 1] = null;
                    numVeiculos--;
                }
            }
        }
        System.err.println("Veiculo invalido");
    }

}
