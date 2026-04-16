package Aula08P4;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double precoGasolina = 6.00;
        double precoAlcool = 4.50;

        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        char tipo = leitor.next().toUpperCase().charAt(0);

        System.out.print("Digite a quantidade de litros: ");
        double litros = leitor.nextDouble();

        double valorTotal = 0;
        double percentualDesconto = 0;

        if (tipo == 'A') {
            
            if (litros <= 20) {
                percentualDesconto = 0.03; 
            } else {
                percentualDesconto = 0.05; 
            }
            valorTotal = litros * (precoAlcool * (1 - percentualDesconto));

        } else if (tipo == 'G') {
            
            if (litros <= 20) {
                percentualDesconto = 0.04; 
            } else {
                percentualDesconto = 0.06; 
            }
            valorTotal = litros * (precoGasolina * (1 - percentualDesconto));

        } else {
            System.out.println("Tipo de combustível inválido!");
            leitor.close();
            return; 
        }

        System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);

        leitor.close();
    }
}
