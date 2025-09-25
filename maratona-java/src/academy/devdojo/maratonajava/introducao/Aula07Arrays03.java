package academy.devdojo.maratonajava.introducao;

import java.util.Arrays;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{5, 4, 3, 2, 1};
        numeros[0]= 21;
//        for (int i = 0; i < numeros2.length; i++) {
//            System.out.println(numeros3[i]);
//        }
        System.out.println(numeros[0]);
        for (int num : numeros3){
            System.out.println(num);    //esse é o método for each que é utilzado para simplificar um for pra imprimir elementos de um array
        }

        Arrays.stream(numeros).forEach(num -> {

        });
    }

    //o foreach é legal que para cada elemento de uma coleção ele execiuta alguma coisa dentro das chaves.
}
