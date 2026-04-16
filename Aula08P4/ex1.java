package Aula08P4;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = leitor.nextInt();

        if (idade < 16) {
            System.out.println("Você ainda não tem idade para votar.");
        } else if (idade >= 18 && idade <= 70) {
            System.out.println("Seu voto é OBRIGATÓRIO.");
        } else {
            
            System.out.println("Seu voto é OPCIONAL.");
        }

        leitor.close();
    }
}
