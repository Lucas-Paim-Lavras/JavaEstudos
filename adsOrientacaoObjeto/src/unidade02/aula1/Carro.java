package unidade02.aula1;

public class Carro {
    private double preco;

    // Metodo calcularPreco sem impostos
    public double calcularPreco() {
        return preco;
    }

    // Metodo calcularPreco com impostos
    public double calcularPreco(double imposto) {
        return preco + (preco * imposto);
    }


    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.preco = 20000.50;
        carro.calcularPreco();
        carro.calcularPreco(0.6);
    }
}
