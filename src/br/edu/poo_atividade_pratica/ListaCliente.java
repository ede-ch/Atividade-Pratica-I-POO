package br.edu.poo_atividade_pratica;

public class ListaCliente implements IClientes {
    private Cliente[] listaClientes;
    private int numClientes;

    @Override
    public void add(Cliente c) {
        if (c != null && c instanceof Cliente) {
            listaClientes[numClientes++] = c;
        }
    }

    @Override
    public Cliente get(long CPF) {
        if (CPF > 0) {
            for (int i = 0; i < listaClientes.length; i++) {
                if (listaClientes[i].getCPF() == CPF) {
                    return listaClientes[i];
                }
            }
        }
        return null;
    }

    @Override
    public String getInfo(long CPF) {
        if (CPF > 0) {
            for (int i = 0; i < listaClientes.length; i++) {
                if (listaClientes[i].getCPF() == CPF) {
                    return listaClientes[i].toString();
                }
            }
        }
        return "Cliente não encontrado";
    }

    @Override
    public String getInfo() {
        if (listaClientes.length > 0) {
            for (Cliente cliente : listaClientes) {
                return cliente.toString();
            }
        }
        return "Não há clientes cadastrados";
    }

    @Override
    public String getResumoInfo() {
        if (listaClientes.length > 0) {
            for (Cliente cliente : listaClientes) {
                return cliente.getCPF() + cliente.getNome()
                        + cliente.getTelefone();
            }
        }
        return "Não há clientes cadastrados";
    }

    @Override
    public boolean remove(long CPF) {
        if (CPF > 0) {
            for (int i = 0; i < listaClientes.length; i++) {
                if (listaClientes[i].getCPF() == CPF) {
                    listaClientes[i] = listaClientes[--numClientes];
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean existe(long CPF) {
        if (CPF > 0) {
            for (int i = 0; i < listaClientes.length; i++) {
                if (listaClientes[i].getCPF() == CPF) {
                    return true;
                }
            }
        }
        return false;
    }

}
