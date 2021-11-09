import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");

        int customerAge = scanner.nextInt();

        if (customerAge >= 18){
            System.out.println("Wanna buy some alcohol? No problem, thanks");
        } else if (customerAge < 0){
            System.out.println("No shit, man");
        }
        else{
            System.out.println("You can't buy alcohol until you reach age of 18");
        }


    }
}
