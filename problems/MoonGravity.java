package problems;

import java.util.Scanner;

//Find out how much you would weight on the moon!!!!
public class MoonGravity {
    public static void main(String[] args) {

        double moonWeight = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much do you weigh: ");
        double weight = scanner.nextInt();
        moonWeight = weight / 17;
        System.out.println("On the moon you would have " + moonWeight + " kg");


    }
}
