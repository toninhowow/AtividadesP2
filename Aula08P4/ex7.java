package Aula08P4;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = leitor.next();
        String invertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }

        System.out.println("Invertida: " + invertida);
        leitor.close();
    }
}
