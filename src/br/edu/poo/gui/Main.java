package br.edu.poo.gui;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuVeiculo menuVeiculo = new MenuVeiculo();
        MenuCliente menuCliente = new MenuCliente();
        MenuLocacao menuLocacao = new MenuLocacao();
        
        try (Scanner input = new Scanner(System.in)) {
            int opcao = 0;
            do {
                System.out.println("+-------------------------------------------------------+");
                System.out.println("|              Menu de Opções                           |");
                System.out.println("+-------------------------------------------------------+");
                System.out.println("| 1 - Menu de Veículos                                  |");
                System.out.println("| 2 - Menu de Clientes                                  |");
                System.out.println("| 3 - Menu de locações                                  |");
                System.out.println("| 4 - Sair                                              |");
                System.out.println("+-------------------------------------------------------+");
                System.out.print("Opção: ");
                opcao = input.nextInt();

                switch (opcao) {
                    case 1:
                        menuVeiculo.Menu();
                        break;

                    case 2:
                        menuCliente.Menu();
                        break;
                    
                    case 3:
                        menuLocacao.Menu();
                        break;

                    case 4:
                        System.out.println("Deseja sair? 1 - Sim 2 - Não: ");
                        opcao = input.nextInt();
                        if (opcao == 1) {
                            System.out.println("Saindo...");
                            opcao = 4;
                        } else {
                            System.out.println("Voltando ao menu principal...");
                        }
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } while (opcao != 4);
        }
    }

   
        }