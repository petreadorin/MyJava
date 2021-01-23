package classes.examples;

import java.util.Scanner;

public class RecursionFactorialMain {
    public static void main (String[] args) {
        RecursionFactorial f = new RecursionFactorial();
        Scanner scanner  =  new Scanner(System.in);
        int number;
        do {
            System.out.print("Factorial of: ");
            number = scanner.nextInt();
                System.out.println("Factorial of " + number + " is: " + f.factR(number));
                System.out.println();
        } while (number  != 0);
    }
}
