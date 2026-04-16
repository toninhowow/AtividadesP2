package Aula05P2;
import java.util.Scanner;

public class ex1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        
        int dobro = numero * 2;
        int triplo = numero * 3;

        
        System.out.println("Dobro: " + dobro);
        System.out.println("Triplo: " + triplo);

        scanner.close();
    }

}