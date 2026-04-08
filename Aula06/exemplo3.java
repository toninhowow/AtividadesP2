package Aula06;
import java.util.Scanner;

public class exemplo3 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    String palavra = scanner.nextLine();

    int quantidade = palavra.length();
    System.out.println("A palavra tem" + quantidade + "Letras!");



  scanner.close();
    }
}
