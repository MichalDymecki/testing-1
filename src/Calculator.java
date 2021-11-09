import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();
        double thirdNumber = secondNumber;

        int adding = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        double division = firstNumber / thirdNumber;
        int mod = secondNumber % firstNumber;

        System.out.println("Wynik dodawania to : " + adding);
        System.out.println("Wynik odejmowania to : " + subtraction);
        System.out.println("Wynik mnożenia to : " + multiplication);
        System.out.println("Wynik dzielenia to : " + division);
        System.out.println("Wynik modulo to : " + mod);
    }
}
