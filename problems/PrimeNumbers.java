package problems;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Display primes up to which number: ");
        int roof = scanner.nextInt();

        for (int i = 2; i < roof; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
                i++;
            }
        }
    }
}
