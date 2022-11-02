package br.edu.poo.objects;

public class ListaLocacao implements ILocacoes {
    private Locacao[] listaLocacoes;
    private int numLocacoes;

    /**
     * @param l locacao do tipo Locacao. 
     * Se "l" não é nulo e é uma instância do tipo Locacao, adiciona uma locação na lista de locações.
     * Caso contrário, não adiciona e retorna "Não é uma locação válida".
     * !Inicializar a variável numLocacoes com "0"!
     */
    @Override
    public void add(Locacao l) {
        if (l != null && l instanceof Locacao) {
            listaLocacoes[numLocacoes++] = l;
        }
        System.err.println("Não é uma locação válida.");
    }

    /**
     * @param codigo código do cliente do tipo int.
     * @return "null" se o código não for válido ou não for encontrado.
     * @return Locação com o código informado.
     * Se codigo maior que zero e encontra um código igual na lista, procura a locação na lista de locações.
     * Caso contrário, retorna "null".
     */
    @Override
    public Locacao get(int codigo) {
        if (codigo > 0) {
            for (int i = 0; i < listaLocacoes.length; i++) {
                if (listaLocacoes[i].getCodigo() == codigo) {
                    return listaLocacoes[i];
                }
            }
        }
        return null;
    }

    /**
     * @param codigo código do cliente do tipo int.
     * @return "Locação não encontrada" se o código não for válido ou não for encontrado.
     * Se codigo maior que zero e encontra um código igual na lista, retorna informações sobre a locação.
     * Caso contrário, retorna "Locação não encontrada".
     */
    @Override
    public String getInfo(int codigo) {
        if (codigo > 0) {
            for (int i = 0; i < listaLocacoes.length; i++) {
                if (listaLocacoes[i].getCodigo() == codigo) {
                    return listaLocacoes[i].toString();
                }
            }
        }
        return "Locação não encontrada";
    }

    /**
     * @return informações sobre todas as locações.
     * @return "Locação não encontrada" se o código não for válido ou não for encontrado.
     * Se o tamanho da lista de locações for maior que zero, para toda locação na lista de locações,
     * retorna informações resumidas sobre as locações.
     * Caso contrário, retorna "Locação não encontrada".
     */
    @Override
    public String getInfo() {
        if (listaLocacoes.length > 0) {
            for (Locacao locacao : listaLocacoes) {
                return locacao.toString();
            }
        }
        return "Não há locações cadastradas";
    }

    /**
     * @param codigo código do cliente do tipo int.
     * @return "true" se o código for válido e for encontrado.
     * @return "false" se o código não for válido ou não for encontrado.
     * Se codigo maior que zero e encontra um código igual na lista, remove a locação da lista de locações e retorna "true".
     * Caso contrário, retorna "false".
     */
    @Override
    public boolean remove(int codigo) {
        if (codigo > 0) {
            for (int i = 0; i < listaLocacoes.length; i++) {
                if (listaLocacoes[i].getCodigo() == codigo) {
                    listaLocacoes[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * @param codigo código do cliente do tipo long.
     * @return "true" se o código for maior que zero e encontrar um código igual na lista.
     * @return "false" se o código não for maior que zero ou não encontrar um código igual na lista.
     * Se codigo maior que zero e a locação existe, retorna "true".
     * Caso contrário, retorna "false".
     */
    @Override
    public boolean existe(int codigo) {
        if (codigo > 0) {
            for (int i = 0; i < listaLocacoes.length; i++) {
                if (listaLocacoes[i].getCodigo() == codigo) {
                    return true;
                }
            }
        }
        return false;
    }
}
