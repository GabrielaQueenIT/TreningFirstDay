public class AutoTest {
    public static void main(String[] args) {

        Auto mercedes = new Auto("mercedes", "S1", 2022, 2000);
        mercedes.info();
        mercedes.hamuj();
        mercedes.jedz();

        System.out.println("----------------------------------------");


        Auto audi = new Auto("audi", "A6", 2022, 200000);
        audi.jedz();
        audi.hamuj();
        audi.info();
    }
}
