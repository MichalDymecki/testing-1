public class AutoTest {
    public static void main(String[] args) {

        Auto mercedes = new Auto();

        mercedes.marka = "Mercedes";
        mercedes.rok = 2015;
        mercedes.model = "G Class";
        mercedes.przebieg = 80000;

        mercedes.info();
        mercedes.jedz();
        mercedes.hamuj();

        Auto audi = new Auto();

        audi.marka = "Audi";
        audi.model = "A5";
        audi.rok = 2015;
        audi.przebieg = 10000;

        audi.jedz();
        audi.hamuj();
        audi.info();
    }
}
