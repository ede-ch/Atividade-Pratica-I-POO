package br.edu.poo.objects;

public class ListaCliente implements IClientes {
    private Cliente[] listaClientes;
    private int numClientes;

    /**
     * @param c cliente do tipo Cliente. 
     * Se "c" não é nulo e é uma instância do tipo Cliente, adiciona um cliente na lista de clientes.
     * Caso contrário, não adiciona e retorna "Não é um cliente válido".
     * !Inicializar a variável numClientes com "0"!
     */
    @Override
    public void add(Cliente c) {
        if (c != null && c instanceof Cliente) {
            listaClientes[numClientes++] = c;
        }
        System.err.println("Não é um cliente válido.");
    }

    /**
     * @param CPF CPF do cliente do tipo long.
     * @return "null" se o CPF não for válido ou não for encontrado.
     * Se CPF maior que zero e encontra um CPF igual na lista, procura o cliente na lista de clientes.
     * Caso contrário, retorna "null".
     */
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
    
    /**
     * @param CPF CPF do cliente do tipo long.
     * @return "Cliente não encontrado" se o CPF não for válido ou não for encontrado.
     * @return Cliente com o CPF informado.
     * Se CPF maior que zero e encontra um CPF igual na lista, retorna informações sobre o cliente.
     * Caso contrário, retorna "Cliente não encontrado".
     */
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

    /**
     * @return informações sobre todos os clientes.
     * @return "Não há clientes cadastrados" se a lista de clientes estiver vazia.
     * Se o tamanho da lista de clientes for maior que zero, para cada cliente na lista de clientes,
     * retorna informações sobre o cliente.
     * Caso contrário, retorna "Não há clientes cadastrados".
     */
    @Override
    public String getInfo() {
        if (listaClientes.length > 0) {
            for (Cliente cliente : listaClientes) {
                return cliente.toString();
            }
        }
        return "Não há clientes cadastrados";
    }

    /**
     * @return "Não há clientes cadastrados" se a lista de clientes estiver vazia.
     * Se o tamanho da lista de clientes for maior que zero, para cada cliente na lista de clientes,
     * retorna informações resumidas sobre os clientes.
     * Caso contrário, retorna "Não há clientes cadastrados".
     */
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

    /**
     * @param CPF CPF do cliente do tipo long.
     * @return "true" se o CPF for maior que zero e encontrar um CPF igual na lista.
     * @return "false" se o CPF não for maior que zero ou não encontrar um CPF igual na lista.
     * Se CPF maior que zero e o cliente existe, remove o cliente da lista de clientes e retorna true.
     * Caso contrário, retorna false.
     */
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
            for (int i = 0; i < listaClientes.length; i++) {
                if (listaClientes[i].getCPF() == CPF) {
                    return true;
                }
            }
        }
        return false;
    }
}
