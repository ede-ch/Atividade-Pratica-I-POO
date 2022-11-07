package br.edu.poo.gui;

import br.edu.poo.objects.*;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Cliente cliente = new Cliente();
        Locacao locacao = new Locacao();
        ListaVeiculo listaVeiculos = new ListaVeiculo();
        ListaCliente listaClientes = new ListaCliente();
        ListaLocacao listaLocacoes = new ListaLocacao();
        MenuVeiculo menuVeiculo = new MenuVeiculo();
        MenuCliente menuCliente = new MenuCliente();
        MenuLocacao menuLocacao = new MenuLocacao();

        Veiculo veiculo1 = new Carro("ABC1234", "Fusca", 1970, 10.5F, 2, 4, false, 10);
        Veiculo veiculo2 = new Carro("ABB1233", "Monza", 1999, 15.5F, 4, 5, true, 8);
        Veiculo veiculo3 = new Carro("AAA1222", "Ferrari", 2010, 1000, 2, 2, true, 6.5F);
        Veiculo veiculo4 = new Carro("AAC1111", "Santana", 1980, 50.2F, 4, 6, false, 10.5F);
        Veiculo veiculo5 = new Carro("AAB1111", "Fiat 147", 1980, 50.7F, 2, 4, false, 10.5F);

        Cliente cliente1 = new Cliente(1234567890, "João", "Rua 1", 123456789, 987654321);
        Cliente cliente2 = new Cliente(1234567891, "Maria", "Rua 2", 123456789, 987654322);
        Cliente cliente3 = new Cliente(1234567892, "Carol", "Rua 3", 123456789, 987654323);
        Cliente cliente4 = new Cliente(1234567893, "Ana", "Rua 4", 123456789, 987654324);
        Cliente cliente5 = new Cliente(1234567894, "Pedro", "Rua 5", 123456789, 987654325);
        
        Locacao locacao1 = new Locacao(cliente1, veiculo1, "12/12/2022", "12/01/2023", true);
        Locacao locacao2 = new Locacao(cliente2, veiculo2, "25/11/2022", "25/12/2022", true);
        Locacao locacao3 = new Locacao(cliente3, veiculo3, "07/11/2022", "14/11/2023", true);
        Locacao locacao4 = new Locacao(cliente4, veiculo4, "12/12/2022", "12/01/2023", true);
        Locacao locacao5 = new Locacao(cliente5, veiculo5, "12/12/2022", "12/01/2023", true);

        listaVeiculos.add(veiculo1);
        listaVeiculos.add(veiculo2);
        listaVeiculos.add(veiculo3);
        listaVeiculos.add(veiculo4);
        listaVeiculos.add(veiculo5);

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente4);
        listaClientes.add(cliente5);
        
        listaLocacoes.add(locacao1);
        listaLocacoes.add(locacao2);
        listaLocacoes.add(locacao3);
        listaLocacoes.add(locacao4);
        listaLocacoes.add(locacao5);
        

        menuCliente.Menu();
        //menuVeiculo.Menu();
        //menuLocacao.Menu();
        
    }
}    