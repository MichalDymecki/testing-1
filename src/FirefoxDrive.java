public class FirefoxDrive implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element za pomocą przeglądarki Firefox");
    }
}
