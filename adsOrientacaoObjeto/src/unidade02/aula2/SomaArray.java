package unidade02.aula2;

public class SomaArray {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 5, 7, 8};
        int soma = 0;
        int contador = 0;
        while (contador < numeros.length) {
            System.out.print(numeros[contador] + " + ");
            soma += numeros[contador];
            contador++;
        }

        System.out.println("Soma dos valores: " + soma);
    }
}
