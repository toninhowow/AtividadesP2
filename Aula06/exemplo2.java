package Aula06;
import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);
     String palavra1 = scanner.nextLine();
     String palavra2 = scanner.nextLine();

    if (palavra1.equalsIgnoreCase(palavra2)) {
        System.out.println("As palavras são iguais");
    }

    else{System.out.println("As palavras não são iguais");}


    scanner.close();

    }
}
