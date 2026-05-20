package Aula14P8;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorCompras {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        ArrayList<String> listaDeCompras = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("\n--- MENU LISTA DE COMPRAS ---");
            System.out.println("1. Adicionar Item");
            System.out.println("2. Listar Itens");
            System.out.println("3. Remover Item");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do item para adicionar: ");
                    String novoItem = leitor.nextLine();
                    listaDeCompras.add(novoItem); 
                    System.out.println("Item adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Itens na Lista ---");
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println(i + ". " + listaDeCompras.get(i));
                        }
                    }
                    break;

                case 3:
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista está vazia. Não há o que remover.");
                    } else {
                        System.out.print("Digite o índice (número) do item a ser removido: ");
                        int indice = leitor.nextInt();

                        
                        if (indice >= 0 && indice < listaDeCompras.size()) {
                            String removido = listaDeCompras.remove(indice);
                            System.out.println("Item '" + removido + "' removido com sucesso!");
                        } else {
                            System.out.println("Índice inválido! Tente novamente.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha um número de 1 a 4.");
            }

        } while (opcao != 4);

        leitor.close();
    }
}