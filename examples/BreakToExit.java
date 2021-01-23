package examples;

import java.util.Scanner;

public class BreakToExit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The number up to which u want to see roots: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i * i > number)
                break;
            System.out.print(i + " ");  //prints the number until its pow surpasses max value
        }
        System.out.println("loop complete.");
    }
}
