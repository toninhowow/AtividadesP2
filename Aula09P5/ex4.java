package Aula09P5;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Deseja analisar quantos números? ");
        int qtd = leitor.nextInt();
        int[] entrada = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            entrada[i] = leitor.nextInt();
        }

        int[] totais = contarParesImpares(entrada);
        System.out.println("Resultado da análise:");
        System.out.println("- Quantidade de Pares: " + totais[0]);
        System.out.println("- Quantidade de Ímpares: " + totais[1]);

        leitor.close();
    }

    public static int[] contarParesImpares(int[] vetor) {
        int[] contagem = new int[2]; 
        for (int n : vetor) {
            if (n % 2 == 0) {
                contagem[0]++; 
            } else {
                contagem[1]++; 
            }
        }
        return contagem;
    }
}