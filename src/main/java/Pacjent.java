public class Pacjent {
    public String imie;
    public String nazwisko;
    public String nrPesel;



    public Pacjent(String imie, String nazwisko, String nrPesel){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrPesel = nrPesel;
    }

    public void podajSwojeDane(){
        System.out.println("Nazywam się " + imie + " " + nazwisko);
        System.out.println("Mój pesel to: " + nrPesel);
    }

    public void umowWizyte(String doktor) {
        System.out.println("Pacjent " + imie + " " + nazwisko + " umówiony jest na wizytę do dr " + doktor );    }
}
