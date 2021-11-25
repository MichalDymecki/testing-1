public class AutoTest {
    public static void main(String[] args) {

        Auto mercedes = new Auto("Mercedes","G Class", 2015,80000);

/*        mercedes.marka = "Mercedes";
        mercedes.rok = 2015;
        mercedes.model = "G Class";
        mercedes.przebieg = 80000;*/

        mercedes.info();
        mercedes.jedz();
        mercedes.hamuj();

        Auto audi = new Auto("Audi","A5",2015,10000);

/*        audi.marka = "Audi";
        audi.model = "A5";
        audi.rok = 2015;
        audi.przebieg = 10000;*/

        audi.jedz();
        audi.hamuj();
        audi.info();
    }
}
