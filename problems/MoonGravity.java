package problems;

import java.util.Scanner;

public class MoonGravity {
    public static void main(String[] args) {

        int moonWeight = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much do you weigh: ");
        int weight = scanner.nextInt();
        moonWeight = weight / 17;
        System.out.println("On the moon you would have " + moonWeight + " kg");


    }
}
