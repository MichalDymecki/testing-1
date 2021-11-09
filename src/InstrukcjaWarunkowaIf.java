import java.util.Scanner;

public class InstrukcjaWarunkowaIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź dzielną: ");
        float dzielna = scanner.nextFloat();
        System.out.print("Wprowadź dzielnik: ");
        float dzielnik = scanner.nextFloat();

        if(dzielnik != 0) {
            System.out.println("Wynik dzielenia to: " + dzielna/dzielnik);
        } else {
            System.out.println("Proszę podaj inny dzielnik");
        }

    }
}
