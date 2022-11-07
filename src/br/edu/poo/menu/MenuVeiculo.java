package br.edu.poo.menu;

import br.edu.poo.objects.*;

import java.util.Scanner;

public class MenuVeiculo {
    private ListaVeiculo metodoVeiculo = new ListaVeiculo();
    Scanner input = new Scanner(System.in);

    public void Menu() {
        int opcao = 0;
        do {
            System.out.println("+-------------------------------------------------------+");
            System.out.println("|              Menu de Opções                           |");
            System.out.println("+-------------------------------------------------------+");
            System.out.println("| 1 - Adicionar veículo                                 |");
            System.out.println("| 2 - Pesquisar um veículo                              |");
            System.out.println("| 3 - Exibir informações de um veículo                  |");
            System.out.println("| 4 - Exibir informações de todos veículos              |");
            System.out.println("| 5 - Exibir informações resumidas de todos veículos    |");
            System.out.println("| 6 - Remover um veículo                                |");
            System.out.println("| 7 - Verificar existência de um veículo                |");
            System.out.println("| 8 - Voltar                                            |");
            System.out.println("+-------------------------------------------------------+");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    addVeiculo();
                    break;

                case 2:
                    pesquisarVeiculo();
                    break;

                case 3:
                    exibeInfoVeiculo();
                    break;

                case 4:
                    dadosTodosVeiculos();
                    break;

                case 5:
                    resumoVeiculos();
                    break;

                case 6:
                    removeVeiculo();
                    break;

                case 7:
                    existeVeiculo();
                    break;

                case 8:
                    //MenuLocadora.Menu();
                    break;

                default:
                    System.out.println("Opção inválida");
                    Menu();
                    break;
            }
        } while (opcao != 8);
    }

    public void addVeiculo() {
        int tipo = 0;
        do {
            System.out.print(
                    "Qual o tipo de veículo? \n1 - Caminhão \n2 - Carro \n3 - ônibus \n4 - Voltar \nDigite a opção desejada: ");
            tipo = input.nextInt();
            switch (tipo) {
                case 1:
                    addCaminhao();
                    break;

                case 2:
                    addCarro();
                    break;

                case 3:
                    addOnibus();
                    break;

                case 4:
                    Menu();
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (tipo != 4);
    }

    public void addCaminhao() {
        String placa = input.nextLine();
        System.out.print("Digite a placa do caminhão: ");
        placa = input.nextLine();

        String modelo = input.nextLine();
        System.out.print("Digite o modelo do caminhão: ");
        modelo = input.nextLine();

        System.out.print("Digite o ano do caminhão: ");
        int ano = input.nextInt();

        System.out.print("Digite o valor da diária do caminhão: ");
        float valorDiaria = input.nextFloat();

        System.out.print("Digite o número de eixos do caminhão: ");
        int numEixos = input.nextInt();

        System.out.print("Digite a capacidade de carga do caminhão: ");
        float capacidadeCarga = input.nextFloat();

        Veiculo caminhao = new Caminhao(placa, modelo, ano, valorDiaria, numEixos, capacidadeCarga);

        metodoVeiculo.add(caminhao);
    }

    public void addCarro() {
        String placa = input.nextLine();
        System.out.print("Digite a placa do carro: ");
        placa = input.nextLine();

        String modelo = input.nextLine();
        System.out.print("Digite o modelo do carro: ");
        modelo = input.nextLine();

        System.out.print("Digite o ano do carro: ");
        int ano = input.nextInt();

        System.out.print("Digite o valor da diária do carro: ");
        float valorDiaria = input.nextFloat();

        System.out.print("Digite o número de portas do carro: ");
        int numPortas = input.nextInt();

        System.out.print("Digite o número de passageiros do carro: ");
        int numPassageiros = input.nextInt();

        System.out.print("O carro possui ar condicionado? \n1 - Sim 2 - Não: ");
        int arCond = input.nextInt();
        boolean arCondicionado = false;
        if (arCond == 1) {
            arCondicionado = true;
        } else if (arCond == 2) {
            arCondicionado = false;
        } else {
            System.out.print("Opção inválida");
        }

        System.out.println("Digite a média de consumo do carro: ");
        float mediaKmLitro = input.nextFloat();

        Veiculo carro = new Carro(placa, modelo, ano, valorDiaria, numPortas, numPassageiros,
                arCondicionado,
                mediaKmLitro);

        metodoVeiculo.add(carro);
    }

    public void addOnibus() {
        String placa = input.nextLine();
        System.out.print("Digite a placa do ônibus: ");
        placa = input.nextLine();

        String modelo = input.nextLine();
        System.out.print("Digite o modelo do ônibus: ");
        modelo = input.nextLine();

        System.out.print("Digite o ano do ônibus: ");
        int ano = input.nextInt();

        System.out.print("Digite o valor da diária do ônibus: ");
        float valorDiaria = input.nextFloat();

        System.out.print("Digite o número de passageiros do ônibus: ");
        int numPassageiros = input.nextInt();

        String categoria = input.nextLine();
        System.out.print("Digite a categoria do ônibus: ");
        categoria = input.nextLine();

        System.out.print("O ônibus possui ar condicionado? \n1 - Sim 2 - Não: ");
        int arCond = input.nextInt();
        boolean arCondicionado = false;
        if (arCond == 1) {
            arCondicionado = true;
        } else if (arCond == 2) {
            arCondicionado = false;
        } else {
            System.out.println("Opção inválida");
        }

        System.out.print("O ônibus possui internet? \n1 - Sim 2 - Não: ");
        int net = input.nextInt();
        boolean internet = false;
        if (net == 1) {
            internet = true;
        } else if (net == 2) {
            internet = false;
        } else {
            System.out.println("Opção inválida");
        }

        Veiculo onibus = new Onibus(placa, modelo, ano, valorDiaria, numPassageiros, categoria,
                arCondicionado,
                internet);

        metodoVeiculo.add(onibus);
    }

    public void pesquisarVeiculo() {
        String placa = input.nextLine();
        System.out.print("Digite a placa do veículo: ");
        placa = input.nextLine();

        System.out.println("Veículo encontrado:\n " + metodoVeiculo.get(placa));
    }

    public void exibeInfoVeiculo() {
        String placa = input.nextLine();
        System.out.print("Digite a placa do veículo: ");
        placa = input.nextLine();

        System.out.println("Veículo encontrado:\n " + metodoVeiculo.getInfo(placa));
    }

    public void dadosTodosVeiculos() {
        System.out.print("Aqui estão os dados de todos os veículos:\n ");

        System.out.println(metodoVeiculo.getInfo());
    }

    public void resumoVeiculos() {
        System.out.print("Aqui está o resumo dos veículos:\n ");

        System.out.println(metodoVeiculo.getResumoInfo());
    }

    public void removeVeiculo() {
        String placa = input.nextLine();
        System.out.print("Digite a placa do veículo: ");
        placa = input.nextLine();

        System.out.print("Essa ação é irreversível. Deseja continuar?  \n1 - Sim 2 - Não: ");
        int opcao = input.nextInt();
        if (opcao == 1) {
            System.out.println(metodoVeiculo.remove(placa));
            System.out.println("Veículo removido com sucesso!");
        } else if (opcao == 2) {
            System.out.println("Operação cancelada");
        } else {
            System.out.println("Opção inválida");
        }
    }

    public void existeVeiculo() {
        String placa = input.nextLine();
        System.out.println("Digite a placa do veículo: ");
        placa = input.nextLine();

        System.out.println(metodoVeiculo.existe(placa));
    }
}
