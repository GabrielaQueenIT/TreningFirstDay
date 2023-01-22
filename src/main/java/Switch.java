import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pogaj swoje imie: ");
        String imie = input.nextLine();

        switch (imie) {
            case "Paytrycja":
            case "Olek":
            case "Jan":
            case "Stefan":
            case "Julia":
            case "Ola":
                System.out.println("Cześć " + imie);
                break;
            default:
                System.out.println("Nie znam Cię! ");
        }
    }
}
