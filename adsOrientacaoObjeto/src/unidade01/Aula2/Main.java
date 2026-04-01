package unidade01.Aula2;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(5432, "Lucas Paim");

        conta1.depositar(400);
        conta1.sacar(100);

        conta1.mostrarDados();

        System.out.println("Saldo atual: " + conta1.getSaldo());

    }
}