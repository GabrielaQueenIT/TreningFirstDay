public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieram przegladarkę Chrome");
    }

    @Override
    public void findElemenBy() {
        System.out.println("Znajduje element w przeglądarce Chrome");
    }
}
