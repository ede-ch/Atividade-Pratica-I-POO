package br.edu.poo.gui;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.edu.poo.objects.*;

public class MenuCliente {
    private ListaCliente metodoCliente = new ListaCliente();
    private MenuLocacao metodoLocacao = new MenuLocacao(metodoCliente);
    Scanner input1 = new Scanner(System.in);

    public void Menu() {
        try {
            int opcao = 0;
            do {
                System.out.println("\n\n");
                System.out.println("+-------------------------------------------------------+");
                System.out.println("|              Menu de Opções do Cliente                |");
                System.out.println("+-------------------------------------------------------+");
                System.out.println("| 1 - Adicionar cliente                                 |");
                System.out.println("| 2 - Pesquisar um cliente                              |");
                System.out.println("| 3 - Exibir informações de um cliente                  |");
                System.out.println("| 4 - Exibir informações de todos clientes              |");
                System.out.println("| 5 - Exibir informações resumidas de todos clientes    |");
                System.out.println("| 6 - Remover um cliente                                |");
                System.out.println("| 7 - Verificar existência de um cliente                |");
                System.out.println("| 8 - Voltar ao menu principal                          |");
                System.out.println("| 9 - Sair                                              |");
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
                        System.out.println("Voltando ao menu principal...");
                        break;

                    case 9:
                        System.out.print("Deseja sair? 1 - Sim 2 - Não: ");
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
        } catch (InputMismatchException e) {
            System.out.println("Opção inválida!");
        }

    }

    public void addCliente() {
        boolean erro = false;
        long cpf = 0;
        String nome = "",
                endereco = "";
        int telefone = 0,
                carteira = 0;
        do {
            try {
                System.out.print("Digite o CPF do cliente: ");
                cpf = input1.nextLong();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("CPF inválido!");
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite o nome do cliente: ");
                nome = input1.next();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Nome inválido!");
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite o telefone do cliente: ");
                telefone = input1.nextInt();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Telefone inválido!");
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite o endereço do cliente: ");
                endereco = input1.next();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Endereço inválido!");
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite a carteira de motorista do cliente: ");
                carteira = input1.nextInt();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Carteira inválida!");
                erro = true;
            }
        } while (erro == true);

        Cliente cliente = new Cliente(cpf, nome, endereco, telefone, carteira);
        metodoCliente.add(cliente);
    }

    public void pesquisarCliente() {
        long cpf = 0;
        boolean erro = false;
        
        do {
            try {
                System.out.print("Digite o CPF do cliente: ");
                cpf = input1.nextLong();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("CPF inválido!");
                erro = true;
            }
        } while (erro == true);

        System.out.println(metodoCliente.get(cpf));

    }

    public void exibeInfoCliente() {
        long cpf = 0;
        boolean erro = false;
        
        do {
            try {
                System.out.print("Digite o CPF do cliente: ");
                cpf = input1.nextLong();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("CPF inválido!");
                erro = true;
            }
        } while (erro == true);

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
        long cpf = 0;
        boolean erro = false;
        
        do {
            try {
                System.out.print("Digite o CPF do cliente: ");
                cpf = input1.nextLong();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("CPF inválido!");
                erro = true;
            }
        } while (erro == true);

        System.out.println(metodoCliente.remove(cpf));
    }

    public void existeCliente() {
        long cpf = 0;
        boolean erro = false;
        
        do {
            try {
                System.out.print("Digite o CPF do cliente: ");
                cpf = input1.nextLong();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("CPF inválido!");
                erro = true;
            }
        } while (erro == true);

        System.out.println(metodoCliente.existe(cpf));
    }
}


