package unidade03.aula1.exercicio;

public class LojaVirtual {
    public static void main(String[] args) {
        Produto produto = new Produto("Cola", 9.50, 4);

        produto.exibirInformacoes();

        produto.setPreco(-8.9);
    }
}
