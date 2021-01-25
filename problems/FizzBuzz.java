package problems;

//read a number from your keyboard.If that number is divisible by 3, display Fizz; by 5 display Buzz;
// and by 15 display fizzbuzz.else, print the number :)
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your number: ");
        int x = scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0 && i % 5 == 0) {             //the most specific condition goes first!!!
                System.out.print("FizzBuzz" + " , ");

            } else if (i % 3 == 0) {
                System.out.print("Fizz" + " , ");

            } else if (i % 5 == 0) {
                System.out.print("Buzz" + " , ");

            } else
                System.out.print(i + " , ");
        }
    }
}
