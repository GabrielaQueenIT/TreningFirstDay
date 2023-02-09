public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String uczelnia = "AGH";


    public void przedstawSie(){
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }

    public void zalogujSie(){
        System.out.println("Loguje się za pomocą nicku: " + nick);
    }

    public void podajNrIndeksu(){
        System.out.println("Numer mojego indeksu to: " +  numerIndeksu);
    }

    public void podajEmail(){
        System.out.println("Mój mail to: " + email);
    }

    public static void infoUczelnia(){
        System.out.println("Moja uczelnia to AGH");
    }


}
