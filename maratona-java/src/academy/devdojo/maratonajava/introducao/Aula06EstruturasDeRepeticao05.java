package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal ; parcela >= 1 ; parcela--){
            double valorParcela = valorTotal /parcela;
            if (valorParcela < 1000){
                continue; //a lógica é um pouco diferente do break. O Continue não deixa pular pra linha 13 enquanto aquele if não seja tenha um false. Somente quando ele recebe um false que ele começa a fazer os prints.
            }
            System.out.println("Parcela "+ parcela + " R$" + valorParcela);
        }
    }
}
