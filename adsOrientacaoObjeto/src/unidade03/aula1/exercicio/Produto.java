package unidade03.aula1.exercicio;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Valor de preço inválido!");
        }
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0){
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }

    public void exibirInformacoes(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Quantidade do produto: " + quantidadeEstoque);
    }
}
