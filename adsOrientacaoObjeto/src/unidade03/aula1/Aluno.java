package unidade03.aula1;

public class Aluno {

    private String nome;
    private double matricula;
    private double nota;

    public Aluno(String nome, double matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida. Deve estar entre 0 e 10.");
        }
    }

    public void exibirInformacoes(){
        System.out.println("Nome do aluno: " + nome + ", matricula: " + matricula + ", nota: " + nota);
    }
}
