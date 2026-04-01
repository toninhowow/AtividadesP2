import java.util.Scanner;

public class ex6 {
 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a taxa de serviço (%): ");
        double taxa = scanner.nextDouble();

        // Produto 1
        System.out.print("Código do produto 1: ");
        int cod1 = scanner.nextInt();
        System.out.print("Valor unitário do produto 1: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Quantidade do produto 1: ");
        int quant1 = scanner.nextInt();

        // Produto 2
        System.out.print("Código do produto 2: ");
        int cod2 = scanner.nextInt();
        System.out.print("Valor unitário do produto 2: ");
        double valor2 = scanner.nextDouble();
        System.out.print("Quantidade do produto 2: ");
        int quant2 = scanner.nextInt();

        // Valor total
        double subtotal = (valor1 * quant1) + (valor2 * quant2);
        double total = subtotal * (taxa / 100 + 1);

        
        System.out.println("Subtotal: R$ " + subtotal);
        System.out.println("Total com taxa: R$ " + total);

        scanner.close();
    }
}

