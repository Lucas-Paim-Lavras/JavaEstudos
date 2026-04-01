package unidade02.aula2;

public class Break {
    public static void main(String[] args) {
        int[] numeros = {9, 3, 1, 2, 1};

        for (int numero : numeros) {
            if (numero > 5) {
                break;
            }
            System.out.println("Número: " + numero);
            //Assim que quebra a condição. Não executa mais
        }
    }
}
