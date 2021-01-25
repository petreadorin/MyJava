package problems;

//display the factors of an input number:
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The number: ");
        int number = scanner.nextInt();
        System.out.print("The factors of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)                 //calculates if number has iteration as factor
                System.out.print(i + " ");       //if it does, it displays it
        }
        System.out.println();
    }
}
