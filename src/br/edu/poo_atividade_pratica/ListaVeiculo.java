package br.edu.poo_atividade_pratica;

public class ListaVeiculo implements IVeiculos {
    private Veiculo[] listaVeiculos;
    private int numVeiculos;

    @Override
    public void add(Veiculo v) {
        if (v != null && v instanceof Veiculo) {
            listaVeiculos[numVeiculos++] = v;
        }
    }

    @Override
    public Veiculo get(String placa) {
        if (placa != null) {
            for (int i = 0; i < listaVeiculos.length; i++) {
                if (listaVeiculos[i].getPlaca().equals(placa)) {
                    return listaVeiculos[i];
                }
            }
        }
        return null;
    }

    @Override
    public String getInfo(String placa) {
        if (placa != null) {
            for (int i = 0; i < listaVeiculos.length; i++) {
                if (listaVeiculos[i].getPlaca().equals(placa)) {
                    return listaVeiculos[i].toString();
                }
            }
        }
        return "Veiculo não encontrado";
    }

    @Override
    public String getInfo() {
        if (listaVeiculos.length > 0) {
            for (Veiculo veiculo : listaVeiculos) {
                return veiculo.toString();
            }
        }
        return "Não há veículos cadastrados";
    }

    @Override
    public String getResumoInfo() {
        if (listaVeiculos.length > 0) {
            for (Veiculo veiculo : listaVeiculos) {
                return veiculo.getPlaca() + veiculo.getAno()
                        + veiculo.getValorDiaria();
            }
        }
        return "Não há veículos cadastrados";
    }

    @Override
    public boolean remove(String placa) {
        if (placa != null) {
            for (int i = 0; i < listaVeiculos.length; i++) {
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

    @Override
    public boolean existe(String placa) {
        if (placa != null) {
            for (int i = 0; i < listaVeiculos.length; i++) {
                if (listaVeiculos[i].getPlaca().equals(placa)) {
                    return true;
                }
            }
        }
        return false;
    }
}
