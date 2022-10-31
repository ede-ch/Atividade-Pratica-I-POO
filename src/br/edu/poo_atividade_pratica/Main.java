package br.edu.poo_atividade_pratica;
public class Main {
    public static void main(String[] args) {

        Locadora locadora = new Locadora(30, 30, 30);
        Veiculo veiculo = new Veiculo();
        Cliente cliente = new Cliente();

        Veiculo veiculo1 = new Carro("ABC-1234", "Fusca", 1970, 100, 2, 4, false, 10);
        Veiculo veiculo2 = new Carro("ABB-1233", "Monza", 1999, 15, 4, 5, true, 8);
        Veiculo veiculo3 = new Carro("AAA-1222", "Ferrari", 2010, 1000, 2, 2, true, 6.5F);
        Veiculo veiculo4 = new Carro("AAC-1111", "Santana", 1980, 50, 4, 6, false, 10.5F);
        Veiculo veiculo5 = new Carro("AAB-1111", "Fiat 147", 1980, 50, 2, 4, false, 10.5F);

        Cliente cliente1 = new Cliente(1234567890, "João", "Rua 1", 123456789, 987654321);
        Cliente cliente2 = new Cliente(1234567891, "Maria", "Rua 2", 123456789, 987654322);
        Cliente cliente3 = new Cliente(1234567892, "Carol", "Rua 3", 123456789, 987654323);
        Cliente cliente4 = new Cliente(1234567893, "Ana", "Rua 4", 123456789, 987654324);
        Cliente cliente5 = new Cliente(1234567894, "Pedro", "Rua 5", 123456789, 987654325);


        locadora.removeVeiculo(veiculo3);
        System.out.println(veiculo.getInfo());
    }
}