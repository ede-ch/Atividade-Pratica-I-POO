package br.edu.poo_atividade_pratica;

public class ListaVeiculo implements IVeiculos {
    private Veiculo[] listaVeiculos;
    private int numVeiculos;

    public void add(Veiculo v) {
        if (v != null && v instanceof Veiculo) {
            listaVeiculos[numVeiculos++] = v;
        }
    }

    public Veiculo get(String placa) {
        if(placa != null) {
            for (int i = 0; i < numVeiculos; i++) {
                if (listaVeiculos[i].getPlaca().equals(placa)) {
                    return listaVeiculos[i];
                }
            }
        }
        return null;
    }

    public String getInfo(String placa) {
        if (placa != null) {
            for (int i = 0; i < numVeiculos; i++) {
                if (listaVeiculos[i].getPlaca().equals(placa)) {
                    return listaVeiculos[i].toString();
                }
            }
        }
        return "Veiculo não encontrado";
    }

    public String getInfo() {
        if (listaVeiculos.length > 0) {
            for (int i = 0; i < numVeiculos; i++) {
                return listaVeiculos[i].toString() + "\n";
            }
        }
        return "Não há veículos cadastrados";
    }

    public String getResumoInfo() {
        if (listaVeiculos.length > 0) {
            for (int i = 0; i < listaVeiculos.length; i++) {
                return listaVeiculos[i].getPlaca() + listaVeiculos[i].getAno() 
                + listaVeiculos[i].getValorDiaria();
            }
        }
        return "Não há veículos cadastrados";
    }

    public boolean remove(String placa) {
        if (placa != null) {
            for (int i = 0; i < numVeiculos; i++) {
                if (listaVeiculos[i].getPlaca().equals(placa)) {
                    listaVeiculos[i] = listaVeiculos[numVeiculos - 1];
                    listaVeiculos[numVeiculos - 1] = null;
                    numVeiculos--;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean existe(String placa) {
        if (placa != null) {
            for (int i = 0; i < numVeiculos; i++) {
                if (listaVeiculos[i].getPlaca().equals(placa)) {
                    return true;
                }
            }
        }
        return false;
    }
}
