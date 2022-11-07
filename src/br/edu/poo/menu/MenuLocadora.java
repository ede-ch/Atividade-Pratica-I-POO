package br.edu.poo.menu;

import java.util.Scanner;

public class MenuLocadora {
    Scanner input = new Scanner(System.in);
    private MenuVeiculo menuVeiculo = new MenuVeiculo();
    private MenuCliente menuCliente = new MenuCliente();
    private MenuLocacao menuLocacao = new MenuLocacao();

    public void Menu() {
        int opcao = 0;
        do {
            System.out.println("+-------------------------------------------------------+");
            System.out.println("|                    Loca Car Menu                      |");
            System.out.println("+-------------------------------------------------------+");
            System.out.println("| 1 - Menu de Veículos                                  |");
            System.out.println("| 2 - Menu de Clientes                                  |");
            System.out.println("| 3 - Menu de Locações                                  |");
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
                        System.exit(0);
                    } else if (opcao == 2) {
                        Menu();
                    } else {
                        System.out.println("Opção inválida!");
                        Menu();
                    }
                    break;
                default:
                    break;
            }

        } while (opcao != 4);
    }
}
