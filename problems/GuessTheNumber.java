package problems;

import java.util.Locale;
import java.util.Scanner;

//guess the letter that i type game!
public class GuessTheNumber {
    public static void main(String[] args) {
        int answer = 30;
        int guess;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type your guess: ");
            guess = scanner.nextInt();
            if (guess == answer)
                System.out.println("Your are correct!");
            else if (guess < answer)
                System.out.println("Try a higher number!");
            else
                System.out.println("Try a lower number");


        }
        while (guess != answer);
    }
}

