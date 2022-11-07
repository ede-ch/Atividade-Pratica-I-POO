package br.edu.poo.gui;

import br.edu.poo.objects.*;
import java.util.Scanner;

public class MenuLocacao {
    // Criando um novo objeto da classe ListaLocacao, ListaVeiculo e ListaCliente.
    private ListaLocacao metodoLocacao = new ListaLocacao();
    private ListaCliente metodoCliente = new ListaCliente();
    private ListaVeiculo metodoVeiculo = new ListaVeiculo();
    Scanner input = new Scanner(System.in);

    // Menu do programa.
    public void Menu() {
        int opcao = 0;
        do {
            System.out.println("\n\n");
            System.out.println("+-------------------------------------------+");
            System.out.println("|          Menu de Opções da Locação        |");
            System.out.println("+-------------------------------------------+");
            System.out.println("| 1 - Cadastrar                            |");
            System.out.println("| 2 - Pesquisar                            |");
            System.out.println("| 3 - Exibe Info                           |");
            System.out.println("| 4 - Todas locações                       |");
            System.out.println("| 5 - Remove                               |");
            System.out.println("| 6 - Verifica                             |");
            System.out.println("| 7 - Voltar ao menu principal             |");
            System.out.println("| 8 - Sair                                 |");
            System.out.println("+-------------------------------------------+");

            System.out.print("Opção: ");

            opcao = input.nextInt();

            input.nextLine();

            // Switch case para navegar pelo menu.
            switch (opcao) {
                case 1:
                    addLocacao();
                    break;
                case 2:
                    pesquisarLocacao();
                    break;
                case 3:
                    exibeInfoLocacao();
                    break;
                case 4:
                    dadosTodasLocacoes();
                    break;
                case 5:
                    removeLocacao();
                    break;
                case 6:
                    existeLocacao();
                    break;
                case 8:
                    System.out.println("Voltando ao menu principal...");
                    break;

                case 9:
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
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 7);
    }

    // Este método adiciona uma nova locação no sistema.
    public void addLocacao() {
        System.out.print("Digite o CPF do cliente: ");
        long cpf = input.nextLong();
        Cliente cliente = metodoCliente.get(cpf);

        String placa = input.nextLine();
        System.out.print("Digite a placa do veículo: ");
        placa = input.nextLine();
        Veiculo veiculo = metodoVeiculo.get(placa);

        String dataLocacao = input.nextLine();
        System.out.print("Digite a data de locação: ");
        dataLocacao = input.nextLine();

        String dataDevolucao = input.nextLine();
        System.out.print("Digite a data de devolução: ");
        dataDevolucao = input.nextLine();

        System.out.print("O veículo possui seguro? \n1 - Sim 2 - Não: ");
        int segr = input.nextInt();
        boolean seguro = false;
        if (segr == 1) {
            seguro = true;
        } else if (segr == 2) {
            seguro = false;
        } else {
            System.out.println("Opção inválida");
        }
        // Criando um novo objeto da classe Locacao.
        Locacao locacao = new Locacao(cliente, veiculo, dataLocacao, dataDevolucao, seguro);

        // Adicionando um novo objeto na lista de locações.
        metodoLocacao.add(locacao);
        System.out.println(locacao.getCodigo());
    }

    // Este método pesquisa uma locação pelo código.
    public void pesquisarLocacao() {
        System.out.print("Digite o código da locação: ");
        int codigo = input.nextInt();

        // Imprime o resultado da pesquisa pelo código.
        System.out.println(metodoLocacao.get(codigo));
    }

    // Este método exibe as informações de uma locação.
    public void exibeInfoLocacao() {
        System.out.print("Digite o código da locação: ");
        int codigo = input.nextInt();

        // Imprime o resultado da pesquisa pelo código.
        System.out.println(metodoLocacao.getInfo(codigo));
    }

    // Este método exibe todas as locações cadastradas no sistema.
    public void dadosTodasLocacoes() {
        System.out.print("Aqui estão as informações de todas as locações: \n");

        // Imprime o resultado do método que exibe todas as locações.
        System.out.println(metodoLocacao.getInfo());
    }

    // Este método remove uma locação do sistema.
    public void removeLocacao() {
        System.out.print("Digite o código da locação: ");
        int codigo = input.nextInt();

        System.out.print("Essa ação é irreversível. Deseja continuar?  \n1 - Sim 2 - Não: ");
        int opcao = input.nextInt();
        if (opcao == 1) {
            System.out.println(metodoLocacao.remove(codigo));
            System.out.println("Locação removida com sucesso!");
        } else if (opcao == 2) {
            System.out.println("Operação cancelada");
        } else {
            System.out.println("Opção inválida");
        }
    }

    // Este método verifica se uma locação existe no sistema.
    public void existeLocacao() {
        System.out.print("Digite o código da locação: ");
        int codigo = input.nextInt();
        // Imprime o resultado da pesquisa pelo código.
        System.out.println(metodoLocacao.existe(codigo));
    }
}
