package br.edu.poo_atividade_pratica;

public class ListaLocacao implements ILocacoes {
    private Locacao[] listaLocacoes;
    private int numLocacoes;

    @Override
    public void add(Locacao l) {
        if (l != null && l instanceof Locacao) {
            listaLocacoes[numLocacoes++] = l;
        }
    }

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

    @Override
    public String getInfo() {
        if (listaLocacoes.length > 0) {
            for (Locacao locacao : listaLocacoes) {
                return locacao.toString();
            }
        }
        return "Não há locações cadastradas";
    }

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
