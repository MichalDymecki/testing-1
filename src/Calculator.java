import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metody metody = new Metody();

        System.out.print("Pierwsza liczba:");
        int firstNumber = scanner.nextInt();
        System.out.print("Druga liczba:");
        int secondNumber = scanner.nextInt();

        int adding = metody.add(firstNumber, secondNumber);
        int subtraction = metody.subtraction(firstNumber, secondNumber);
        int multiplication = metody.multiplication(firstNumber, secondNumber);
        double division = metody.division( firstNumber, secondNumber);
        int mod = metody.mod(firstNumber, secondNumber);

        System.out.println("Wynik dodawania: " + adding);
        System.out.println("Wynik odejmowania: " + subtraction);
        System.out.println("Wynik mnożenia: " + multiplication);
        System.out.println("Wynik dzielenia: " + division);
        System.out.println("Wynik dzilenia modulo: " + mod);



    }
}
