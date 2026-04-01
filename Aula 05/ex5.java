import java.util.Scanner;

public class ex5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoInteiro = 40.0;

        
        System.out.print("Digite o tipo de ingresso (I para inteiro / M para meia): ");
        char tipo = scanner.next().toUpperCase().charAt(0);

        double valorPagar;

        
        if (tipo == 'I') {
            valorPagar = precoInteiro;
        } else if (tipo == 'M') {
            valorPagar = precoInteiro / 2;
        } else {
            System.out.println("Opção inválida!");
            scanner.close();
            return;
        }

        
        System.out.println("Valor a pagar: R$ " + valorPagar);

        scanner.close();
    }

}
