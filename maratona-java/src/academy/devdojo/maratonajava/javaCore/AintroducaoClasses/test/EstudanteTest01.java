package academy.devdojo.maratonajava.javaCore.AintroducaoClasses.test;

import academy.devdojo.maratonajava.javaCore.AintroducaoClasses.entitty.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 18;
        estudante.sexo= 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);

    }

}
