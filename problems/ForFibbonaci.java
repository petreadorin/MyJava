package problems;

import java.util.Scanner;

//display a for fibbonaci 1 2 4 8 16 etc;
public class ForFibbonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number:");
        int input = scanner.nextInt();
        for (int i = 1; i <=input; i += i)
            System.out.print(i + " ");
    }
}
