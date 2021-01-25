package problems;

import java.util.Scanner;

//input a number of your choice.Display all the numbers up until your chosen number,
//and when you reach a number divisible by 2, print it on a new line.
public class NumberPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your number: ");
        int x = scanner.nextInt();


        for (int i = 0; i <= x; i++) {
            System.out.print(i + " ");      //prints the iterations ->
            if ((i % 2) == 0)               //-> until it reaches a number divisible by 2, then it goes back to start
                continue;
            System.out.println();           //and prints the next iterations on a new line
        }
    }
}
