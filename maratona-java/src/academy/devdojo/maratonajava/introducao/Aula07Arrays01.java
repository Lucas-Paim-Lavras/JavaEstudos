package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
//        int[] idades = null;     //tipo referency, somente esses tipos que podem ser inicializados como nulos
        int[] idades = new int[3];
        idades[0]= 21;
        idades[1] = 15;
        idades[2] = 11;

        System.out.println(idades[0]);   //se a gente não coloca nada nas posições elas iniciam apenas com 0 ou nulo(para strings)
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
