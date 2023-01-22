import java.util.Scanner;

public class Bomba {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę sekund: ");
        int sec = input.nextInt();


        for(int i=sec; i>0; i--){
            System.out.println("Bomba wybuchnie za " + i + "sekund" );
            Thread.sleep(1000);
        }
        System.out.println("BOOOOM");


        while(sec>0){
            System.out.println("Bomba wybuchnie za:  " + sec + " sekund");
            sec--;
            Thread.sleep(1000);
        }
        System.out.println("BOOOOM");


        int n=sec;
        do{
            System.out.println("Bomba wybuchnie za: " + n + " sekund");
            n--;
            Thread.sleep(1000);
        }
        while(n>0);
        System.out.println("BOOOOOOM");

    }
}
