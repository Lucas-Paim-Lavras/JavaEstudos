package unidade02.aula1;

public class Produto {
    String Nome;
    double preco;

    //Construtor 0 - com todos os dados.
    public Produto(String Nome, double preco) {
        this.Nome = Nome;
        this.preco = preco;
    }
    //Construtor 1 - Sem nome e um valor fizo de preço = 10,00
    public Produto(String Nome) {
        this.Nome = Nome;
        this.preco = 10.0;
    }
    //Construtor 2 - sem dados do produto (padrão)
    public Produto() {
    }

    //Construtor 3 - Apenas com o dado do preço do produto
    public Produto(double preco) {
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + Nome + ", Preço: " + preco);
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 12.99);
        Produto p2 = new Produto("Papel");

        p1.exibirDetalhes();
        p2.exibirDetalhes();
    }


}
