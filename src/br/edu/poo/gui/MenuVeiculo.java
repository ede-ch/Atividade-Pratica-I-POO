package br.edu.poo.gui;

import br.edu.poo.objects.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuVeiculo {
    private ListaVeiculo metodoVeiculo = new ListaVeiculo();
    private MenuLocacao menuLocacao = new MenuLocacao(metodoVeiculo);
    Scanner input = new Scanner(System.in);

    public void Menu() {
        int opcao = 0;
        boolean erro = false;
        do {
            System.out.println("+-------------------------------------------------------+");
            System.out.println("|              Menu de Opções do Veiculo                |");
            System.out.println("+-------------------------------------------------------+");
            System.out.println("| 1 - Adicionar veículo                                 |");
            System.out.println("| 2 - Pesquisar um veículo                              |");
            System.out.println("| 3 - Exibir informações de um veículo                  |");
            System.out.println("| 4 - Exibir informações de todos veículos              |");
            System.out.println("| 5 - Exibir informações resumidas de todos veículos    |");
            System.out.println("| 6 - Remover um veículo                                |");
            System.out.println("| 7 - Verificar existência de um veículo                |");
            System.out.println("| 8 - Voltar ao menu principal                          |");
            System.out.println("| 9 - Sair                                              |");
            System.out.println("+-------------------------------------------------------+");

            try {
                System.out.print("Opção: ");
                opcao = input.nextInt();
                erro = false;
                input.nextLine();
            } catch (InputMismatchException e) {
                input.nextLine();
            }

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
                    System.out.println("Voltando ao menu principal...");
                    break;

                case 9:
                    do {
                        try {
                            System.out.println("Deseja sair? 1 - Sim 2 - Não: ");
                            opcao = input.nextInt();
                            erro = false;
                        } catch (InputMismatchException e) {
                            input.nextLine();
                        }
                    } while (erro == true);
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
        int tipo = 0;
        do {
            try {
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
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida");
                input.nextLine();
            }
        } while (tipo != 4);
    }

    public void addCaminhao() {
        boolean erro = false;
        String placa = "",
                modelo = "";
        int ano = 0,
                numEixos = 0;
        float valorDiaria = 0,
                capacidadeCarga = 0;
        do {
            try {
                input.nextLine();
                System.out.print("Digite a placa do caminhão: ");
                placa = input.nextLine();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Placa inválida");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite o modelo do caminhão: ");
                modelo = input.nextLine();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Modelo inválido");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite o ano do caminhão: ");
                ano = input.nextInt();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Ano inválido");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite o valor da diária do caminhão: ");
                valorDiaria = input.nextFloat();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite o número de eixos do caminhão: ");
                numEixos = input.nextInt();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Número inválido");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite a capacidade de carga do caminhão: ");
                capacidadeCarga = input.nextFloat();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Capacidade inválida");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        Veiculo caminhao = new Caminhao(placa, modelo, ano, valorDiaria, numEixos, capacidadeCarga);

        metodoVeiculo.add(caminhao);
    }

    public void addCarro() {
        boolean erro = false;
        String placa = "",
                modelo = "";
        int ano = 0,
                numPortas = 0,
                numPassageiros = 0,
                arCond = 0;
        float valorDiaria = 0,
                mediaKmLitro = 0;
        boolean arCondicionado = false;

        do {
            try {
                input.nextLine();
                System.out.print("Digite a placa do carro: ");
                placa = input.nextLine();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Placa inválida");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite o modelo do carro: ");
                modelo = input.nextLine();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Modelo inválido");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite o ano do carro: ");
                ano = input.nextInt();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Ano inválido");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite o valor da diária do carro: ");
                valorDiaria = input.nextFloat();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite o número de portas do carro: ");
                numPortas = input.nextInt();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Número inválido");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite o número de passageiros do carro: ");
                numPassageiros = input.nextInt();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Número inválido");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("O carro possui ar condicionado? \n1 - Sim 2 - Não: ");
                arCond = input.nextInt();
                arCondicionado = false;
                erro = false;
            } catch (InputMismatchException e) {
                input.nextLine();
                erro = true;
            }
            if (arCond == 1) {
                arCondicionado = true;
            } else if (arCond == 2) {
                arCondicionado = false;
            } else {
                System.out.println("Opção inválida");
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite a média de consumo do carro: ");
                mediaKmLitro = input.nextFloat();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Média inválida");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        Veiculo carro = new Carro(placa, modelo, ano, valorDiaria, numPortas, numPassageiros,
                arCondicionado,
                mediaKmLitro);

        metodoVeiculo.add(carro);
    }

    public void addOnibus() {
        boolean erro = false;
        String placa = "",
                modelo = "",
                categoria = "";
        int ano = 0,
                numPassageiros = 0,
                arCond = 0,
                net = 0;
        float valorDiaria = 0;
        boolean arCondicionado = false,
                internet = false;

        do {
            try {
                input.nextLine();
                System.out.print("Digite a placa do ônibus: ");
                placa = input.nextLine();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Placa inválida");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite o modelo do ônibus: ");
                modelo = input.nextLine();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Modelo inválido");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite o ano do ônibus: ");
                ano = input.nextInt();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Ano inválido");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite o valor da diária do ônibus: ");
                valorDiaria = input.nextFloat();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite o número de passageiros do ônibus: ");
                numPassageiros = input.nextInt();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Número inválido");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("Digite a categoria do ônibus: ");
                categoria = input.nextLine();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Categoria inválida");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out.print("O ônibus possui ar condicionado? \n1 - Sim 2 - Não: ");
                arCond = input.nextInt();
                arCondicionado = false;
                erro = false;
            } catch (InputMismatchException e) {
                input.nextLine();
                erro = true;
            }
            if (arCond == 1) {
                arCondicionado = true;
            } else if (arCond == 2) {
                arCondicionado = false;
            } else {
                System.out.println("Opção inválida");
            }
        } while (erro == true);

        do {
            try {
                System.out.print("O ônibus possui internet? \n1 - Sim 2 - Não: ");
                net = input.nextInt();
                internet = false;
                erro = false;
            } catch (InputMismatchException e) {
                input.nextLine();
                erro = true;
            }
            if (net == 1) {
                internet = true;
            } else if (net == 2) {
                internet = false;
            } else {
                System.out.println("Opção inválida");
            }
        } while (erro == true);

        Veiculo onibus = new Onibus(placa, modelo, ano, valorDiaria, numPassageiros, categoria,
                arCondicionado,
                internet);

        metodoVeiculo.add(onibus);
    }

    public void pesquisarVeiculo() {
        boolean erro = false;
        String placa = "";

        do {
            try {
                System.out.print("Digite a placa do veículo: ");
                placa = input.nextLine();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Placa inválida");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        System.out.println("Veículo encontrado:\n " + metodoVeiculo.get(placa));
    }

    public void exibeInfoVeiculo() {
        boolean erro = false;
        String placa = "";

        do {
            try {
                System.out.print("Digite a placa do veículo: ");
                placa = input.nextLine();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Placa inválida");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

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
        boolean erro = false;
        String placa = "";
        int opcao = 0;

        do {
            try {
                System.out.print("Digite a placa do veículo: ");
                placa = input.nextLine();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Placa inválida");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        do {
            try {
                System.out
                        .print("Essa ação é irreversível. Deseja continuar?  \n1 - Sim 2 - Não: ");
                opcao = input.nextInt();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

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
        boolean erro = false;
        String placa = "";

        do {
            try {
                placa = input.nextLine();
                System.out.print("Digite a placa do veículo: ");
                placa = input.nextLine();
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Placa inválida");
                input.nextLine();
                erro = true;
            }
        } while (erro == true);

        System.out.println(metodoVeiculo.existe(placa));
    }
}
