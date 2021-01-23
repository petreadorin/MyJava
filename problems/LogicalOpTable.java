package problems;

import java.util.Scanner;

//display a table of java's logical operators.
public class LogicalOpTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce the X value: ");
        boolean x = scanner.nextBoolean();
        System.out.println("introduce the Y value: ");
        boolean y = scanner.nextBoolean();
        System.out.println("X\t\tY\t\tAND\t\tOR\t\tNOT");
        if (x == true && y == true) {
            System.out.println(x + "\t" + y + "\t" + (x && y) + "\t" + (x || y) + "\t" + (x != y));
            System.out.println();
        }
        if (x == false && y == true) {
            System.out.println(x + "\t" + y + "\t" + (x && y) + "\t" + (x || y) + "\t" + (x != y));
            System.out.println();
        }
        if (x == false && y == false) {
            System.out.println(x + "\t" + y + "\t" + (x && y) + "\t" + (x || y) + "\t" + (x != y));
            System.out.println();
        }
        if (x == true && y == false) {
            System.out.println(x + "\t" + y + "\t" + (x && y) + "\t" + (x || y) + "\t" + (x != y));
            System.out.println();
        }
    }
}
