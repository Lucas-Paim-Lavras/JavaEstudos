package academy.devdojo.maratonajava.javaCore.AintroducaoClasses.test;

import academy.devdojo.maratonajava.javaCore.AintroducaoClasses.entitty.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professorDeFisica = new Professor();

        professorDeFisica.nome = "Lucas Paim de Morais";
        professorDeFisica.idade = 25;
        professorDeFisica.sexo = 'M';

        System.out.println("Nome: " + professorDeFisica.nome + "\n" + "Idade: " + professorDeFisica.idade + "\n" + "Sexo: " + professorDeFisica.sexo);

    }
}
