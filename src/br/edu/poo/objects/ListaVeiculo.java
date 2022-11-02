package br.edu.poo.objects;

public class ListaVeiculo implements IVeiculos {
    private Veiculo[] listaVeiculos;
    private int numVeiculos;

    /**
     * @param v veiculo do tipo Veiculo. 
     * Se "v" não é nulo e é uma instância do tipo Veiculo, adiciona um veículo na lista de veículos.
     * Caso contrário, não adiciona e retorna "Não é um veículo válido".
     * !Inicializar a variável numVeiculos com "0"!
     */
    @Override
    public void add(Veiculo v) {
        if (v != null && v instanceof Veiculo) {
            listaVeiculos[numVeiculos++] = v;
        }
        System.err.println("Não é um veículo válido.");
    }

    /**
     * @param placa placa do veículo do tipo String.
     * @return Veículo com a placa informada.
     * @return "null" se a placa não for válida ou não for encontrada.
     * Se a placa não for nula, procura o veículo na lista de veículos.
     * Caso contrário, retorna "null".
     */
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

    /**
     * @param placa placa do veículo do tipo String.
     * @return Informações sobre o veículo com a placa informada.
     * @return "Veículo não encontrado" se a placa não for válida ou não for encontrada.
     * Se a placa não for nula, retorna informações sobre o veículo.
     * Caso contrário, retorna "Veículo não encontrado".
     */
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

    /**
     * @return Informações sobre todos os veículos.
     * @return "Não há veículos cadastrados" se não existir nenhum veículo.
     * Se existir algum veículo, retorna informações sobre todos os veículos.
     * Caso contrário, retorna "Não há veículos cadastrados".
     */
    @Override
    public String getInfo() {
        if (listaVeiculos.length > 0) {
            for (Veiculo veiculo : listaVeiculos) {
                return veiculo.toString();
            }
        }
        return "Não há veículos cadastrados";
    }

    /**
     * @return Informações sobre todos os veículos.
     * @return "Não há veículos cadastrados" se não existir nenhum veículo.
     * Se existir algum veículo, retorna informações sobre todos os veículos.
     * Caso contrário, retorna "Não há veículos cadastrados".
     */
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

    /**
     * @param placa placa do veículo do tipo String.
     * @return "true" se a placa for válida e o veículo for encontrado.
     * @return "false" se a placa não for válida ou não for encontrada.
     * Se a placa não for nula, remove o veículo da lista de veículos e retorna true.
     * Caso contrário, retorna false.
     */
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

    /**
     * @param placa placa do veículo do tipo String.
     * @return "true" se a placa for válida e o veículo for encontrado.
     * @return "false" se a placa não for válida ou não for encontrada.
     * Se a placa não for nula, retorna true.
     * Caso contrário, retorna false.
     */
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
