package academy.devdojo.maratonajava.javaCore.AintroducaoClasses.test;

import academy.devdojo.maratonajava.javaCore.AintroducaoClasses.entitty.Carro;

public class ExercicioClasses {
    public static void main(String[] args) {
        Carro carros = new Carro();
        Carro carros1 = new Carro();

        carros.ano = 1987;
        carros.nome = "Fusca";
        carros.modelo = "Hatch";

        carros1.ano = 2010;
        carros1.nome = "Palio";
        carros1.modelo = "Hatch";

        //referência de objetos. Eu apenas faço o objeto receber o outro para que ele receba os mesmos atributos
        //consigo fazer apenas com objetos da mesma classe.

        carros1 = carros;

        System.out.println(carros.nome);
        System.out.println(carros.modelo);
        System.out.println(carros.ano);

        System.out.println("----------------------");

        System.out.println(carros1.nome);
        System.out.println(carros1.modelo);
        System.out.println(carros1.ano);
    }
}
