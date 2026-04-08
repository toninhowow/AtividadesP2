package Aula06;
import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);

     System.out.println("Escreva uma palvra: ");
     String palavra1 = scanner.nextLine();

     System.out.println("Escreva outra palavra: ");
     String palavra2 = scanner.nextLine();

    if (palavra1.equalsIgnoreCase(palavra2)) {
        System.out.println("As palavras são iguais");
    }

    else{System.out.println("As palavras não são iguais");}


    scanner.close();

    }
}
