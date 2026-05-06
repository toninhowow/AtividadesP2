package Aula12P7;

public class Aluno {
    
    String nome;
    String matricula;
    double nota1;
    double nota2;
    double notaTrabalho;

    
    public Aluno(String nome, String matricula, double nota1, double nota2, double notaTrabalho) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }

    
    public double calcularMedia() {
        return (this.nota1 + this.nota2 + this.notaTrabalho) / 3;
    }

    
    public void verificarSituacao() {
        double media = calcularMedia();
        System.out.println("Aluno: " + this.nome + " (Matrícula: " + this.matricula + ")");
        System.out.printf("Média: %.2f\n", media);

        if (media >= 7.0) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
        System.out.println("---------------------------"); // fiz isso para separar cada espaço dos Alunos
    }
}