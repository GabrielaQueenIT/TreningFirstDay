public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
        metody.policzWynik();
        int fajny = metody.pobierzWynik();
        System.out.println("Mnożenie *2 = " + fajny*2);
        metody.policzWynikParam(1000);
        metody.policzWynikParam(500);
    }


}
