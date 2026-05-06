package Aula12P7;

public class TesteAluno {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Antônio Miranda", "2026001", 8.0, 7.5, 8.5);

        Aluno aluno2 = new Aluno("Asafe Calebe", "2026002", 5.0, 6.0, 5.5);

        Aluno aluno3 = new Aluno("Ana Carolina", "2026003", 7.0, 7.0, 7.0);


        aluno1.verificarSituacao();
        aluno2.verificarSituacao();
        aluno3.verificarSituacao();
    }
}
