package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Idade: ");
        int idade = input.nextInt();
        String categoria;
//        idade < 15 categoria juvenil
//        idade >= 15 && idade < 18 categorial juvenil
//        idade >= 18 categoria adulto
        if (idade >= 0 && idade < 15) {
            categoria= "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria= "Categoria Juvenil";
        }else if(idade >=18 && idade <= 130){
            categoria= "Categoria adulto";
        }else{
            categoria= "Valor inválido";
        }
        System.out.println(categoria);
    }
}
