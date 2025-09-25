package academy.devdojo.maratonajava.introducao;

/*Prática
Crie Variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Lucas";
        String endereco = "Rua Firmino Sales, 208A - Centro - Lavras (MG)";
        double salario = 5500.0;
        String dataRecebimento = "30/08/2025";
        String relatorio = "Eu "+nome+ ",morando no endereço "+endereco+", confirmo que recebi o salário de R$"+salario+", na data "+ dataRecebimento;
        System.out.println(relatorio);
    }
}