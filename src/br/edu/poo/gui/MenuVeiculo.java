package br.edu.poo.gui;

import br.edu.poo.objects.*;

import java.util.Scanner;

public class MenuVeiculo {
    private ListaVeiculo metodoVeiculo = new ListaVeiculo();
    Scanner input = new Scanner(System.in);

    public void Menu() {
        int opcao = 0;
        do {
            System.out.print(
                    "1 - Adicionar veículo \n2 - Pesquisar um veículo \n3 - Exibir informações de um veículo \n4 - Exibir informações de todos veículos"
                            + "\n5 - Exibir informações resumidas de todos veículos \n6 - Remover um veículo \n7 - Verificar existência de um veículo \n8 - Sair \nDigite a opção desejada: ");
            
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
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 8);
    }

    public void addVeiculo() {
        System.out.print(
                "Qual o tipo de veículo? \n1 - Caminhão \n2 - Carro \n3 - ônibus \n4 - Voltar \nDigite a opção desejada: ");

        int tipo = input.nextInt();
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
    }

    public void addCaminhao() {
        System.out.print("Digite a placa do caminhão: ");
        String placa = input.nextLine();

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
        System.out.print("Digite a placa do carro: ");
        String placa = input.nextLine();

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

        System.out.print("O carro possui ar condicionado? \n1 - Sim \n2 - Não");
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
        System.out.print("Digite a placa do ônibus: ");
        String placa = input.nextLine();

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

        System.out.println("Veículo encontrado: " + metodoVeiculo.get(placa));
    }

    public void exibeInfoVeiculo() {
        String placa = input.nextLine();
        System.out.print("Digite a placa do veículo: ");
        placa = input.nextLine();

        System.out.println("Veículo encontrado: " + metodoVeiculo.getInfo(placa));
    }

    public void dadosTodosVeiculos() {
        System.out.print("Aqui estão os dados de todos os veículos: ");

        System.out.println(metodoVeiculo.getInfo());
    }

    public void resumoVeiculos() {
        System.out.print("Aqui está o resumo dos veículos: ");

        System.out.println(metodoVeiculo.getResumoInfo());
    }

    public void removeVeiculo() {
        String placa = input.nextLine();
        System.out.print("Digite a placa do veículo: ");
        placa = input.nextLine();

        System.out.print("Essa ação é irreversível. Deseja continuar?  \n1 - Sim \n2 - Não: ");
        int opcao = input.nextInt();
        if (opcao == 1) {
            metodoVeiculo.remove(placa);
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