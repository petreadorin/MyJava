package problems;

import java.util.Scanner;

// Sum and factorial result of X numbers;
public class FactorialAndSum {
    public static void main(String[] args) {
        int sum = 0;
        long factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            factorial *= i;
            sum += i;
        }
        System.out.println("the sum of the first " + number + "  numbers is: " + sum);
        System.out.println("the produce of the first " + number + " numbers is: " + factorial);
    }
}