public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
/*        metody.policzWynik();

        int result = metody.pobierzWynik();
        int result2 = result * 2;
        System.out.println(result2);*/

        metody.policzWynikParam(5);
        metody.policzWynikParam(23);

        int i = 5;
        int j = 7;

        int result = metody.add(i, j, "Hello");
        System.out.println(result);

    }
}
