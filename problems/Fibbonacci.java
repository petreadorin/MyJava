package problems;

import java.util.Scanner;
//display the first n numbers of the fibbonacci series:
public class Fibbonacci {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int tmp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Display the first: ");
        int n = scanner.nextInt();

        while (n > 2) {
            tmp = b;      //tmp takes the value 1 on the first iteration
            b = a + b;    //b takes the value of 2  on the first iteration
            a = tmp;     //a takes the value of 1 on the first iteration
            n = n - 1;
            System.out.print(b + " ");   //display the X fibbonacci number,
        }
    }
}
