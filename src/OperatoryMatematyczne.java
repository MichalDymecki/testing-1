// umożliwiają wykonanie podstawowych operacji matematycznych

public class OperatoryMatematyczne {
    public static void main(String[] args) {
        int firstNumber =4;
        int secondNumber =6;
        double thirdNumber =4.0;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        double division = thirdNumber / secondNumber;
        int mod =secondNumber % firstNumber;

        System.out.println("Wynik dodawania "+ addition);
        System.out.println("Wynik odejmowania " +subtraction);
        System.out.println("Wynik mnożenia " +multiplication);
        System.out.println("Wynik dzielenia " +division);
        System.out.println("Wynik modulo " +mod);
    }

}
