public class KalkulatorTest {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Dodawanie to: "+ kalkulator.add(5,6));
        System.out.println("Odejmowanie to " + kalkulator.sub(80,9));
        System.out.println("Mnożenie to: " + kalkulator.mul(6,18));
        System.out.println("Dzielenie to: " + kalkulator.div(60,8));
        System.out.println("Modulo to: " + kalkulator.mod(12,10));

    }
}
