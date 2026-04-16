package Aula05P2;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o preço do litro do combustível: ");
        double precoLitro = scanner.nextDouble();

        System.out.print("Digite o valor disponível: ");
        double valor = scanner.nextDouble();

        
        double litros = valor / precoLitro;

        
        System.out.println("Você pode comprar " + litros + " litros de combustível.");

        scanner.close();
    }
}
