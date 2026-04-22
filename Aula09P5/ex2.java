package Aula09P5;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantos números terá o seu array? ");
        int tamanho = leitor.nextInt();
        int[] listaNumeros = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            listaNumeros[i] = leitor.nextInt();
        }

        int maior = buscarMaior(listaNumeros);
        System.out.println("O maior valor digitado foi: " + maior);

        leitor.close();
    }

    public static int buscarMaior(int[] vetor) {
        int maiorValor = vetor[0]; 
        for (int num : vetor) {
            if (num > maiorValor) {
                maiorValor = num;
            }
        }
        return maiorValor;
    }
}