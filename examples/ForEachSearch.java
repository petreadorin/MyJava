package examples;
//INPUT A NUMBER , CHECK IF IT IS IN THE ARRAY, IF NOT INPUT AGAIN:

import java.util.Arrays;
import java.util.Scanner;

public class ForEachSearch {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        boolean notFound = true;

        do {
            System.out.println("Type your number: ");
            int number = scanner.nextInt();
            for (int x : nums) {
                if (number == x) {
                    notFound = false;
                    break;
                }
            }
            if(notFound)
                System.out.println("Try again!");
        }
        while (notFound);
        System.out.println("YOU ARE CORRECT!");
    }
}