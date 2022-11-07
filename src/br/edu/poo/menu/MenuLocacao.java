package br.edu.poo.menu;

import br.edu.poo.objects.*;
import java.util.Scanner;

public class MenuLocacao {
    private ListaLocacao metodoLocacao = new ListaLocacao();
    private ListaCliente metodoCliente = new ListaCliente();
    private ListaVeiculo metodoVeiculo = new ListaVeiculo();
    Scanner input = new Scanner(System.in);

    public void Menu() {
        int opcao = 0;
        do {
            System.out.println("\n\n");
            System.out.println("+-------------------------------------------+");
            System.out.println("|              Menu de Opções               |");
            System.out.println("+-------------------------------------------+");
            System.out.println("| 01 - Cadastrar                            |");
            System.out.println("| 02 - Pesquisar                            |");
            System.out.println("| 03 - Exibe Info                           |");
            System.out.println("| 04 - Todas locações                       |");
            System.out.println("| 05 - Remove                               |");
            System.out.println("| 06 - Verifica                             |");
            System.out.println("| 07 - Voltar                               |");
            System.out.println("+-------------------------------------------+");

            System.out.print("Opção: ");

            opcao = input.nextInt();

            input.nextLine();

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
                case 7:

                    break;
                default:
                    System.out.println("Opção inválida!");
                    Menu();
            }
        } while (opcao != 7);
    }

    public void addLocacao() {
        System.out.println("Digite o CPF do cliente: ");
        long cpf = input.nextLong();
        Cliente cliente = metodoCliente.get(cpf);

        String placa = input.nextLine();
        System.out.println("Digite a placa do veículo: ");
        placa = input.nextLine();
        Veiculo veiculo = metodoVeiculo.get(placa);

        String dataLocacao = input.nextLine();
        System.out.println("Digite a data de locação: ");
        dataLocacao = input.nextLine();

        String dataDevolucao = input.nextLine();
        System.out.println("Digite a data de devolução: ");
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
        Locacao locacao = new Locacao(cliente, veiculo, dataLocacao, dataDevolucao, seguro);

        metodoLocacao.add(locacao);
        System.out.println(locacao.getCodigo());
    }

    public void pesquisarLocacao() {
        System.out.print("Digite o código da locação: ");
        int codigo = input.nextInt();

        System.out.println(metodoLocacao.get(codigo));
    }

    public void exibeInfoLocacao() {
        System.out.print("Digite o código da locação: ");
        int codigo = input.nextInt();

        System.out.println(metodoLocacao.getInfo(codigo));
    }

    public void dadosTodasLocacoes() {
        System.out.print("Aqui estão as informações de todas as locações: \n");

        System.out.println(metodoLocacao.getInfo());
    }

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

    public void existeLocacao() {
        System.out.print("Digite o código da locação: ");
        int codigo = input.nextInt();

        System.out.println(metodoLocacao.existe(codigo));
    }
}
