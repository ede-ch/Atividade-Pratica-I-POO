package br.edu.poo.objects;

import java.util.ArrayList;

public class ListaLocacao implements ILocacoes {
    private ArrayList<Locacao> listaLocacoes = new ArrayList<Locacao>();
    /**
     * @param l Locação do tipo Locacao. 
     * Se "l" não é nulo e é uma instância do tipo Locacao, adiciona uma locação na lista de locações.
     * Caso contrário, não adiciona e retorna "Não é uma locação válida".
     * !Inicializar a variável numLocacoes com "0"!
     */
    @Override
    public void add(Locacao l) {
        if (l != null && l instanceof Locacao) {
            listaLocacoes.add(l);
            System.out.println("Locação adicionada com sucesso!");
        } else {
            System.err.println("Não é uma locação válida.");
        }
    }

    /**
     * @param codigo Código do cliente do tipo int.
     * @return Locação com o código informado.
     * @return "null" se o código não for válido ou não for encontrado.
     * Se codigo maior que zero e encontra um código igual na lista, exibe a locação na lista de locações.
     * Caso contrário, retorna "null".
     */
    @Override
    public Locacao get(int codigo) {
        Locacao resultado = null;

        if (codigo > 0) {
            for (int i = 0; i < listaLocacoes.size(); i++) {
                if (listaLocacoes.get(i).getCodigo() == codigo) {
                    resultado = listaLocacoes.get(i);
                }
            }
        } else {
            resultado = null;
        }
        return resultado;
    }

    /**
     * @param codigo código do cliente do tipo int.
     * @return Informações sobre a locação com o código informado.
     * @return "Locação não encontrada" se o código não for válido ou não for encontrado.
     * Se codigo maior que zero e encontra um código igual na lista, retorna informações sobre a locação.
     * Caso contrário, retorna "Locação não encontrada".
     */
    @Override
    public String getInfo(int codigo) {
        String resultado = null;

        if (codigo > 0) {
            for (int i = 0; i < listaLocacoes.size(); i++) {
                if (listaLocacoes.get(i).getCodigo() == codigo) {
                    resultado = listaLocacoes.get(i).toString();
                }
            }
        } else {
            resultado = "Locação não encontrada";
        }
        return resultado;
    }

    /**
     * @return Informações sobre todas as locações.
     * @return "Locação não encontrada" se o código não for válido ou não for encontrado.
     * Se o tamanho da lista de locações for maior que zero, para toda locação na lista de locações,
     * retorna informações sobre as locações.
     * Caso contrário, retorna "Locação não encontrada".
     */
    @Override
    public String getInfo() {
        String resultado = null;

        if (listaLocacoes.size() > 0) {
            for (int i = 0; i < listaLocacoes.size(); i++) {
                resultado = listaLocacoes.get(i).toString();
            }
        } else {
            resultado = "Não há locações cadastradas";
        }
        return resultado;
    }

    /**
     * @param codigo Código do cliente do tipo int.
     * @return "true" se o código for válido e for encontrado.
     * @return "false" se o código não for válido ou não for encontrado.
     * Se codigo maior que zero e encontra um código igual na lista, remove a 
     * locação da lista de locações e retorna "true".
     * Caso contrário, retorna "false".
     */
    @Override
    public boolean remove(int codigo) {
        boolean resultado = false;

        if (codigo > 0) {
            for (int i = 0; i < listaLocacoes.size(); i++) {
                if (listaLocacoes.get(i).getCodigo() == codigo) {
                    listaLocacoes.remove(i);
                    System.out.print("Locação removida com sucesso!");
                    resultado = true;
                }
            }
        } else {
            resultado = false;
            System.err.println("Locação não encontrada");
        }
        return resultado;
    }
    
    /**
     * @param codigo Código do cliente do tipo int.
     * @return "true" se o código for maior que zero e encontrar um código igual na lista.
     * @return "false" se o código não for maior que zero ou não encontrar um código igual na lista.
     * Se codigo maior que zero e a locação existe, retorna "true".
     * Caso contrário, retorna "false".
     */
    @Override
    public boolean existe(int codigo) {
        boolean resultado = false;

        if (codigo > 0) {
            for (int i = 0; i < listaLocacoes.size(); i++) {
                if (listaLocacoes.get(i).getCodigo() == codigo) {
                    resultado = true;
                }
            }
        } else {
            resultado = false;
        }
        return resultado;
    }
}
