package Aula11P6;

public class Produto {
    
    String nome;
    double preco;
    int quantidadeEstoque;

    
    public Produto(String nome, double preco, int quantidadeInicial) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeInicial;
    }

    
    public void exibirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.printf("Preço Unitário: R$ %.2f\n", this.preco);
        System.out.println("Quantidade em Estoque: " + this.quantidadeEstoque);
        System.out.printf("Valor Total em Estoque: R$ %.2f\n", calcularValorTotalEmEstoque());
    }

    
    public double calcularValorTotalEmEstoque() {
        return this.preco * this.quantidadeEstoque;
    }

    
    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
        System.out.println(">>> " + quantidade + " unidades adicionadas ao estoque de " + this.nome);
    }
}