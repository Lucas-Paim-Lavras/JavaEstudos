package unidade02.aula4.exercicio;

public class Professor implements UsuarioSistema{

    @Override
    public void login() {
        System.out.println("login do professor realizado!");
    }

    @Override
    public void logout() {
        System.out.println("logout do professor realizado!");
    }

    public void criarCurso() {
        System.out.println("Curso criado pelo professor.");
    }
}
