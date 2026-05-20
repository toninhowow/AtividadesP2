package Aula14P8;

import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        
        Retangulo meuRetangulo = new Retangulo();

        System.out.println("--- CONFIGURAÇÃO DO RETÂNGULO ---");
        
        System.out.print("Digite o valor para a ALTURA (deve ser entre 0.0 e 20.0): ");
        double novaAltura = leitor.nextDouble();
        meuRetangulo.setAltura(novaAltura);

        System.out.print("Digite o valor para a LARGURA (deve ser entre 0.0 e 20.0): ");
        double novaLargura = leitor.nextDouble();
        meuRetangulo.setLargura(novaLargura);

        
        System.out.println("\n--- RESULTADOS DO TESTE ---");
        System.out.println("Altura atual: " + meuRetangulo.getAltura());
        System.out.println("Largura atual: " + meuRetangulo.getLargura());
        System.out.println("Área calculada: " + meuRetangulo.calcularArea());
        System.out.println("Perímetro calculado: " + meuRetangulo.calcularPerimetro());

        
        leitor.close();
    }
}