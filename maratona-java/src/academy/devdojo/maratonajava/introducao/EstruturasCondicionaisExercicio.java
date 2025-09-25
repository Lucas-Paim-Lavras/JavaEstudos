package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salario = 70000;
        double primeiraFaixa = 9.7 /100;
        double segundaFaixa = 37.35 /100;
        double terceiraFaixa = 49.5 / 100;
        double valorImposto;
        double novoSalario;
        if (salario >= 0 && salario < 34712){
            valorImposto = salario*primeiraFaixa;
            novoSalario = salario + valorImposto;
        }else if (salario >= 34712 && salario < 68507){
            valorImposto = salario*segundaFaixa;
            novoSalario = salario + valorImposto;
        }else{
            valorImposto = salario*terceiraFaixa;
            novoSalario = salario + valorImposto;
        }
        System.out.println("O valor do importo é: R$" + valorImposto + " Seu novo salario é: R$" + novoSalario);
    }
}
