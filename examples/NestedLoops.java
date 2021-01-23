package examples;

import java.util.Scanner;

//use nested loops to find the factors of numbers, between 2 to scanner:
public class NestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The number up to u want to divide: ");
        int number = scanner.nextInt();
        for (int i = 2; i <= number; i++) {
            System.out.print("factors of " + i + ": ");
            for (int j = 2; j <= i; j++)
                if ((i % j) == 0)
                    System.out.print(j + " ");
            System.out.println();
        }
    }
}
