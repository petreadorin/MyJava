package problems;

import java.util.Scanner;

//Show the difference between the logical operators:
public class LogicalOperatorsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of X: ");
        int x = scanner.nextInt();
        System.out.println("Enter the value of Y: ");
        int y = scanner.nextInt();
        System.out.println("X\tY\tX&Y\tX|y\tX!=Y");

        if (x == 1 & y == 1) {
            System.out.println(x + "\t" + y + "\t" + (x & y) + "\t" + (x | y) + "\t" + (x != y));
        }
        if (x == 1 & y == 0) {
            System.out.println(x + "\t" + y + "\t" + (x & y) + "\t" + (x | y) + "\t" + (x != y));
        }
        if (x == 0 & y == 0) {
            System.out.println(x + "\t" + y + "\t" + (x & y) + "\t" + (x | y) + "\t" + (x != y));
        }
        if (x == 0 & y == 1) {
            System.out.println(x + "\t" + y + "\t" + (x & y) + "\t" + (x | y) + "\t" + (x != y));
        }
    }
}
