package Aula11P6;

public class ClasseDeTeste {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Notebook", 3500.00, 10);
        Produto p2 = new Produto("Mouse Gamer", 150.00, 50);

        
        p1.exibirInfo();
        p2.exibirInfo();

        
        System.out.printf("Apenas o valor total de %s: R$ %.2f\n\n", p1.nome, p1.calcularValorTotalEmEstoque());

        
        p2.adicionarEstoque(25);

        
        p2.exibirInfo();
    }
}