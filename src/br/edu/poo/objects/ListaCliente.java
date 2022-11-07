package br.edu.poo.objects;

import java.util.ArrayList;

public class ListaCliente implements IClientes {
    private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    /**
     * @param c Cliente do tipo Cliente. 
     * Se "c" não é nulo e é uma instância do tipo Cliente, adiciona um cliente na lista de clientes.
     * Caso contrário, não adiciona e retorna "Não é um cliente válido".
     * !Inicializar a variável numClientes com "0"!
     */
    @Override
    public void add(Cliente c) {
        if (c != null && c instanceof Cliente) {
            listaClientes.add(c);
            System.out.println("Cliente adicionado com sucesso!");
        } else {
            System.err.println("Não é um cliente válido.");
        }
    }

    /**
     * @param CPF CPF do cliente do tipo long.
     * @return Cliente com o CPF informado.
     * @return "null" se o CPF não for válido ou não for encontrado.
     * Se CPF maior que zero e encontra um CPF igual na lista, exibe o cliente na lista de clientes.
     * Caso contrário, retorna "null".
     */
    @Override
    public Cliente get(long CPF) {
        Cliente resultado = null;

        if (CPF > 0) {
            for (int i = 0; i < listaClientes.size(); i++) {
                if (listaClientes.get(i).getCPF() == CPF) {
                    resultado = listaClientes.get(i);
                }
            }
        } else {
            resultado = null;
        }
        return resultado;
    }
    
    /**
     * @param CPF CPF do cliente do tipo long.
     * @return Cliente com o CPF informado.
     * @return "Cliente não encontrado" se o CPF não for válido ou não for encontrado.
     * Se CPF maior que zero e encontra um CPF igual na lista, retorna informações sobre o cliente.
     * Caso contrário, retorna "Cliente não encontrado".
     */
    @Override
    public String getInfo(long CPF) {
        String resultado = null;

        if (CPF > 0) {
            for (int i = 0; i < listaClientes.size(); i++) {
                if (listaClientes.get(i).getCPF() == CPF) {
                    resultado = listaClientes.get(i).toString();
                }
            }
        } else {
            resultado = "Cliente não encontrado";
        }
        return resultado;
    }

    /**
     * @return informações sobre todos os clientes.
     * @return "Não há clientes cadastrados" se a lista de clientes estiver vazia.
     * Se o tamanho da lista de clientes for maior que zero, para cada cliente na lista de clientes,
     * retorna informações sobre o cliente.
     * Caso contrário, retorna "Não há clientes cadastrados".
     */
    @Override
    public String getInfoTotal() {
        String resultado = null;

        if (listaClientes.size() > 0) {
            for (int i = 0; i < listaClientes.size(); i++) {
                resultado = listaClientes.get(i).toString();
            }
        } else {
            resultado = "Não há clientes cadastrados";
        }
        return resultado;
    }

    /**
     * @return Informaçoes resumidas sobre todos os clientes.
     * @return "Não há clientes cadastrados" se a lista de clientes estiver vazia.
     * Se o tamanho da lista de clientes for maior que zero, para cada cliente na lista de clientes,
     * retorna informações resumidas sobre os clientes.
     * Caso contrário, retorna "Não há clientes cadastrados".
     */
    @Override
    public String getResumoInfo() {
        String resultado = null;

        if (listaClientes.size() > 0) {
            for (int i = 0; i < listaClientes.size(); i++) {
                resultado = listaClientes.get(i).getCPF() + listaClientes.get(i).getNome()
                        + listaClientes.get(i).getTelefone();
            }
        } else {
            resultado = "Não há clientes cadastrados";
        }
        return resultado;
    }

    /**
     * @param CPF CPF do cliente do tipo long.
     * @return "true" se o CPF for maior que zero e encontrar um CPF igual na lista.
     * @return "false" se o CPF não for maior que zero ou não encontrar um CPF igual na lista.
     * Se CPF maior que zero e o cliente existe, remove o cliente da lista de clientes e retorna true.
     * Caso contrário, retorna false.
     */
    @Override
    public boolean remove(long CPF) {
        boolean resultado = false;

        if (CPF > 0) {
            for (int i = 0; i < listaClientes.size(); i++) {
                if (listaClientes.get(i).getCPF() == CPF) {
                    listaClientes.remove(i);
                    System.out.println("Cliente removido com sucesso!");
                    resultado = true;
                }
            }
        } else {
            resultado = false;
            System.err.println("Não é um CPF válido.");
        }
        return resultado;
    }

    /**
     * @param CPF CPF do cliente do tipo long.
     * @return "true" se o CPF for maior que zero e encontrar um CPF igual na lista.
     * @return "false" se o CPF não for maior que zero ou não encontrar um CPF igual na lista.
     * Se CPF maior que zero e o cliente existe, retorna "true".
     * Caso contrário, retorna "false".
     */
    @Override
    public boolean existe(long CPF) {
        if (CPF > 0) {
            for (int i = 0; i < listaClientes.size(); i++) {
                if (listaClientes.get(i).getCPF() == CPF) {
                    return true;
                }
            }
        }
        return false;
    }
}
