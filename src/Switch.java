import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jakie danie chciałbyś zamówić: ");
        String danie =scanner.nextLine();

        switch (danie) {
            case "Pizza":
                System.out.println("Cena to 22 złote");
                break;
            case "Losos":
                System.out.println("Cena to 30 złotych");
                break;
            case "Frytki":
                System.out.println("Cena to 9 złotych");
                break;
            default:
                System.out.println("Brak dania w karcie");
                break;
        }
    }
}
