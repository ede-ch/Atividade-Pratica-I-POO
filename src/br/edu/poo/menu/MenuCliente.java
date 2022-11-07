package br.edu.poo.menu;

import java.util.Scanner;
import br.edu.poo.objects.*;

public class MenuCliente {
    private ListaCliente metodoCliente = new ListaCliente();
    Scanner input1 = new Scanner(System.in);

    public void Menu() {
        int opcao = 0;
        do {
            System.out.println("\n\n");
            System.out.println("+-------------------------------------------------------+");
            System.out.println("|              Menu de Opções                           |");
            System.out.println("+-------------------------------------------------------+");
            System.out.println("| 1 - Adicionar cliente                                 |");
            System.out.println("| 2 - Pesquisar um cliente                              |");
            System.out.println("| 3 - Exibir informações de um cliente                  |");
            System.out.println("| 4 - Exibir informações de todos clientes              |");
            System.out.println("| 5 - Exibir informações resumidas de todos clientes    |");
            System.out.println("| 6 - Remover um cliente                                |");
            System.out.println("| 7 - Verificar existência de um cliente                |");
            System.out.println("| 8 - Voltar                                            |");
            System.out.println("+-------------------------------------------------------+");
            System.out.print("Opção: ");


            opcao = input1.nextInt();

            switch (opcao) {
                case 1:
                    addCliente();
                    break;

                case 2:
                    pesquisarCliente();
                    break;

                case 3:
                    exibeInfoCliente();
                    break;

                case 4:
                    dadosTodosClientes();
                    break;

                case 5:
                    resumoClientes();
                    break;

                case 6:
                    removeCliente();
                    break;

                case 7:
                    existeCliente();
                    break;

                case 8:

                default:
                    System.out.println("Opção inválida!");
                    Menu();
            }
        } while (opcao != 8);
    }

    public void addCliente() {

        System.out.print("Digite o CPF do cliente: ");
        long cpf = input1.nextLong();

        System.out.println("Digite o nome do cliente: ");
        String nome = input1.next();

        System.out.println("Digite o telefone do cliente: ");
        int telefone = input1.nextInt();

        String endereco = input1.nextLine();
        System.out.println("Digite o endereço do cliente: ");
        endereco = input1.nextLine();

        System.out.println("Digite a carteira do cliente: ");
        int carteira = input1.nextInt();

        Cliente cliente = new Cliente(cpf, nome, endereco, telefone, carteira);
        metodoCliente.add(cliente);
    }

    public void pesquisarCliente() {
        System.out.println("Digite o CPF do cliente: ");
        long cpf = input1.nextLong();
        System.out.println(metodoCliente.get(cpf));

    }

    public void exibeInfoCliente() {
        System.out.println("Digite o CPF do cliente: ");
        long cpf = input1.nextLong();
        System.out.println(metodoCliente.getInfo(cpf));
    }

    public void dadosTodosClientes() {
        System.out.println("Clientes cadastrados: ");
        System.out.println(metodoCliente.getInfo());
    }

    public void resumoClientes() {
        System.out.println("Clientes cadastrados: ");
        System.out.println(metodoCliente.getResumoInfo());

    }

    public void removeCliente() {
        System.out.println("Digite o CPF do cliente: ");
        long cpf = input1.nextLong();
        System.out.println(metodoCliente.remove(cpf));
    }

    public void existeCliente() {
        System.out.println("Digite o CPF do cliente: ");
        long cpf = input1.nextLong();
        System.out.println(metodoCliente.existe(cpf));
    }
}


