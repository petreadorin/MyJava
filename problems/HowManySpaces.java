package problems;

import java.util.Scanner;

//input a line of characters with ' ' (space) at intervals of you choosing.
// calculate the number of spaces in the text!
public class HowManySpaces {
    public static void main(String[] args) {
        int spaceCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sequence: ");
        String input = scanner.nextLine().toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println("The number of spaces is: " + spaceCount);
    }
}
