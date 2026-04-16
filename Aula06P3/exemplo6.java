package Aula06P3;
import java.util.Scanner;

public class exemplo6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva uma frase: ");
        String frase = scanner.nextLine();

        System.out.println("Escreva a palavra que quer procurar: ");
        String palavra = scanner.nextLine();

        int i = frase.indexOf(palavra);

        if (i != -1) {
            System.out.println("Palavra encontrada na posição: " + i);
        } else {
            System.out.println("Palavra não encontrada.");
        }

        scanner.close();
    }
}