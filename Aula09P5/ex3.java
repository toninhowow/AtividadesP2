package Aula09P5;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantos nomes deseja cadastrar? ");
        int total = leitor.nextInt();
        String[] nomes = new String[total];

        for (int i = 0; i < total; i++) {
            System.out.print("Nome " + (i+1) + ": ");
            nomes[i] = leitor.next();
        }

        System.out.print("Qual nome você deseja buscar na lista? ");
        String termoBusca = leitor.next();

        if (elementoExiste(nomes, termoBusca)) {
            System.out.println("Sucesso! O nome está na lista.");
        } else {
            System.out.println("Aviso: Nome não encontrado.");
        }

        leitor.close();
    }

    public static boolean elementoExiste(String[] lista, String busca) {
        for (String item : lista) { 
            if (item.equalsIgnoreCase(busca)) { 
                return true;
            }
        }
        return false;
    }
}