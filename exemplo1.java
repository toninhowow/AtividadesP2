

import java.util.Scanner;


public class exemplo1 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String name1 = scanner.nextLine();
    String name2 = scanner.nextLine();

    if (name1.equals(name2)) {
        System.out.println("Os nomes são iguais");
    }

    else{System.out.println("Os nomes não são iguais");}


scanner.close();


 }    
}
