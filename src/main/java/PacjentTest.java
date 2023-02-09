public class PacjentTest {
    public static void main(String[] args) {
        Pacjent jan = new Pacjent("Jan", "Kowalski", "93021569853");
        jan.umowWizyte("Kapusta");
        jan.podajSwojeDane();

        System.out.println("----------------------------------------");
        Pacjent anna = new Pacjent("Anna", "Nowak", "78022300580");
        anna.podajSwojeDane();
        anna.umowWizyte("Bosak");

    }
}
