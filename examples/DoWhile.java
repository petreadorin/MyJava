package examples;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int iVal = 80;  //even if the iVal value is bigger than the while condition,
                        // the do operation is before it, so it will get displayed
                        //the result will be printed at least once even though the condition is false
        do {
            System.out.print(iVal);
            System.out.print(" *2= ");
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 25);

        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {                                // first executes, then checks for conditions;
            System.out.println("input: ");
            input = scanner.nextLine().toLowerCase().trim();
            System.out.println(input);
        } while (!input.equals("quit"));

    }
}
