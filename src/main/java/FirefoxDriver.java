public class FirefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieram przegladarkę Firefox");
    }

    @Override
    public void findElemenBy() {
        System.out.println("Znajduje element w przeglądarce Firefox");

    }
}
