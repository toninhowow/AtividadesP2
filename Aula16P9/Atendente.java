package Aula16P9;

public class Atendente extends Funcionario {
    private double comissao;

    public Atendente(String nome, String cpf, double salarioBase, String dataNascimento, double comissao) {
        super(nome, cpf, salarioBase, dataNascimento); 
        this.comissao = comissao;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + this.comissao;
    }
}