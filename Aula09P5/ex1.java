package Aula09P5;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro cateto: ");
        double catetoA = leitor.nextDouble();

        System.out.print("Digite o valor do segundo cateto: ");
        double catetoB = leitor.nextDouble();

        double resultado = calcularHipotenusa(catetoA, catetoB);
        System.out.printf("O valor da hipotenusa é: %.2f\n", resultado);

        leitor.close();
    }

    public static double calcularHipotenusa(double a, double b) {
        return Math.sqrt((a * a) + (b * b)); 
    }
}