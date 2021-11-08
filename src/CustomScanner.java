import java.util.Scanner;

public class CustomScanner {

/*
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Witaj, podaj swoję imię: ");
        String name = scanner.nextLine();
        System.out.println("Cześć " + name + " !");
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Witaj, podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Kwadrat tej liczby wynosi: " +firstNumber * firstNumber);


    }
}
