package Aula08P4;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número para a tabuada: ");
        int num = leitor.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, (num * i));
        }
        leitor.close();
    }
}
