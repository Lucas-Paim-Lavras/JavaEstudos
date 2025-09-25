package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos{
    public static void main(String[] args) {
        //o que diferencia as variáveis, nada mais é que o tamanho que elas conseguem suportar
        // int, double, float, char, byte,  short, long, boolean
        int age = (int) 1000000000000L;   //fiz um casting para forçar caber dentro da variável
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Goku";   //como Strings são classes, precisam começar com letra maiúscula.
        var nome2 = "Vegeta";

        System.out.println("A idade é: " + age + " anos");
        System.out.println(salarioFloat);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);  //ele ignora o número decimal
        System.out.println("Oi meu nome é "+ nome);


    }
}


