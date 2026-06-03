package Aula16P9;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, double salario, String dataNascimento) {
        super(nome, cpf, salario, dataNascimento);
    }

    @Override 
    public double getSalario() {
        return super.getSalario() + 2000.00;
    }
}