import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor unitário do produto: ");
        double valorUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        
        double total = valorUnitario * quantidade;

        
        if (total > 100) {
            double desconto = total * 0.08;
            double valorFinal = total - desconto;

            System.out.println("Total da compra: R$ " + total);
            System.out.println("Desconto: R$ " + desconto);
            System.out.println("Valor final com desconto: R$ " + valorFinal);
        } else {
            System.out.println("Total da compra: R$ " + total);
            System.out.println("Valor final (sem desconto): R$ " + total);
        }

        scanner.close();
    }

}
