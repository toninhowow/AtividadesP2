package Aula08P4;

public class ex6 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Alê", "Aline", "Clara"};

        for (String nome : nomes) {
            if (nome.startsWith("A")) {
                System.out.println(nome);
            }
        }
    }
}
