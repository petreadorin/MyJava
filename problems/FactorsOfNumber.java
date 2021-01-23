package problems;
//display the factors of a input number:

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The number: ");
        int number = scanner.nextInt();
        System.out.print("The factors of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
