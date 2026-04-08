import java.util.Scanner;


public class exemplo1 {
 public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Escreva o primeiro nome: ");
    String name1 = scanner.nextLine();

    System.out.println("Escreva o segundo nome: ");
    String name2 = scanner.nextLine();

    if (name1.equals(name2)) {
        System.out.println("Os nomes são iguais");
    }

    else{System.out.println("Os nomes não são iguais");}


scanner.close();


 }    
}
