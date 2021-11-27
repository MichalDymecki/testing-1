public class ChromeDriver implements  WebDriver{

    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę za pomocą Google Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję elemnt za pomocą Google Chrome");
    }
}
