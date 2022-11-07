package br.edu.poo.gui;

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
        System.out.println("| 8 - Sair                                              |");
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
                    System.out.println("Deseja sair? 1 - Sim 2 - Não: ");
                    opcao = input1.nextInt();
                    if (opcao == 1) {
                        System.out.println("Saindo...");
                        System.exit(0);
                    } else if (opcao == 2) {
                        Menu();
                    } else {
                        System.out.println("Opção inválida!");
                        Menu();
                    }
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

        System.out.println("Digite o endereço do cliente: ");
        String endereco = input1.next();

        System.out.println("Digite a carteira do cliente: ");
        int carteira = input1.nextInt();
    
        Cliente cliente = new Cliente(cpf, nome, endereco, telefone, carteira);
            metodoCliente.add(cliente);
    }

    public void pesquisarCliente() {
        System.out.println("Digite o CPF do cliente: ");
        long cpf = input1.nextLong();
        System.out.print(metodoCliente.get(cpf));
        
    }

    public void exibeInfoCliente(){
        System.out.println("Digite o CPF do cliente: ");
        long cpf = input1.nextLong();
        System.out.println(metodoCliente.getInfo(cpf));
    }

    public void dadosTodosClientes(){
        System.out.println(" \n Clientes cadastrados: ");
        System.out.println("Cliente 1: " + metodoCliente.get(0));
        System.out.println(metodoCliente.getInfoTotal());
        System .out.println("Cliente 2: " + metodoCliente.get(1));
        System.out.println(metodoCliente.getInfoTotal());
    }

    public void resumoClientes(){
        System.out.println("Clientes cadastrados: ");
        System.out.println(metodoCliente.getResumoInfo());
        
    }

    public void removeCliente(){
        System.out.println("Digite o CPF do cliente: ");
        long cpf = input1.nextLong();
        metodoCliente.remove(cpf);
    }

    public void existeCliente(){
        System.out.println("Digite o CPF do cliente: ");
        long cpf = input1.nextLong();
        System.out.println(metodoCliente.existe(cpf));
    }
}

