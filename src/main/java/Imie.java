import java.util.Scanner;

public class Imie {
    public static void main(String[] args) {
        System.out.println("Podaj swoje imię:");
        Scanner scanner = new Scanner(System.in);


        String imie = scanner.nextLine();

        for (int i = 0; i < (imie.length()); i++) {
            System.out.println(imie.charAt(imie.length()-1-i));

        }

    }
}
