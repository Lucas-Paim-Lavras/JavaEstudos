package unidade02.aula4.exercicio;

public class Estudante implements UsuarioSistema{

    @Override
    public void login() {
        System.out.println("Login do estudante");
    }

    @Override
    public void logout() {
        System.out.println("Logout do estudante");
    }

    public void inscreverCurso(){
        System.out.println("Inscrição do estudante.");
    }
}
