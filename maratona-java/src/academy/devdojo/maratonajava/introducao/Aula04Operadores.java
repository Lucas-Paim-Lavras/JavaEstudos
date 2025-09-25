package academy.devdojo.maratonajava.introducao;

import java.awt.desktop.AboutEvent;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / * Operadores Aritméticos

        //Parte 01
        double numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02; //o resultado da divisão de dois números inteiros ou double d´a sempre o resultado respectivos à declaração
        System.out.println(numero02 - numero01);
        System.out.println(numero02 + numero01);
        System.out.println("Valor " + numero02 + numero01);   //se colocarmos a operação depois de uma string, concatena Resp: Valor 2010
        System.out.println(numero02+ numero01 +" Valor " + numero02 + numero01); //antes da string não há concatenação
        System.out.println(resultado);

        //Parte 02
        // %
        int resto = 20 % 2;   //é um número par
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezdiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezdiferenteDez);


        // && (AND) || (OR) ! (NOT)
        int idade = 35;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta));
        System.out.println(("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta));

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPS5 = 5000F;

        boolean isPS5Compravel = valorTotalContaCorrente > valorPS5 || valorTotalContaPoupanca > valorPS5;
        System.out.println("isPS5Compravel " + isPS5Compravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2;    //3600
        bonus /= 2;    //1800
        bonus %= 2;    //par 0
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador++;     //mesma coisa no javascript
        contador--;
        ++contador;     //antes
        --contador;
        int contador2 = 0;

        System.out.println(contador2++);  //só depois incrementa
        System.out.println(contador2);    //aparece o incremento depois
        System.out.println((++contador2));   //faz antes de chamar a variável   tem isso no javascript também mas quase que não usa.




    }
}
