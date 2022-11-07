package br.edu.poo.gui;

import br.edu.poo.objects.*;
import java.util.Scanner;

public class MenuLocacao {
    private ListaLocacao metodoLocacao = new ListaLocacao();
    private ListaCliente metodoCliente = new ListaCliente();
    private ListaVeiculo metodoVeiculo = new ListaVeiculo();
    Scanner input = new Scanner(System.in);

    public void Menu() {
        int opcao = 0;
        System.out.println("\n\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|              Menu de Opções               |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 01 - Cadastrar                            |");
        System.out.println("| 02 - Listar                               |");
        System.out.println("| 03 - Sair                                 |");
        System.out.println("+-------------------------------------------+");

        do {
            System.out.print("Opção: ");

            opcao = input.nextInt();

            input.nextLine();

            switch (opcao) {
                case 1:
                    addLocacao();
                    break;
                case 2:
                    listarLocacao();
                    break;
                case 3:
                    Menu();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
    }

    public void addLocacao() {
        System.out.println("Digite o CPF do cliente: ");
        long cpf = input.nextLong();
        Cliente cliente = metodoCliente.get(cpf);

        System.out.println("Digite a placa do veículo: ");
        String placa = input.next();
        Veiculo veiculo = metodoVeiculo.get(placa);

        System.out.println("Digite a data de locação: ");
        String dataLocacao = input.nextLine();

        System.out.println("Digite a data de devolução: ");
        String dataDevolucao = input.nextLine();

        System.out.print("O veículo possui seguro? \n1 - Sim \n2 - Não");
        int segr = input.nextInt();
        boolean seguro = false;
        if (segr == 1) {
            seguro = true;
            System.out.println("Digite o valor do seguro: ");
            double valorSeguro = input.nextDouble();
        } else if (segr == 2) {
            seguro = false;
        } else {
            System.out.println("Opção inválida");
        }

        Locacao locacao = new Locacao(cliente, veiculo, dataLocacao, dataDevolucao, seguro);

    }

    public void listarLocacao() {
        System.out.println("Digite o código da locação: ");
        int codigo = input.nextInt();
        

    }

}
