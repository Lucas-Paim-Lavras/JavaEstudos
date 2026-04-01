package unidade01.Aula5;

public class Estudante {
    private int matricula;
    private String nome;
    private int idade;

    public Estudante(int matricula, String nome, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
    }

    //Getters
    public int getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Métodos
    public void exibirDados(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public void atualzarDados(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}