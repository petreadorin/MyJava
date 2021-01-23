package examples;
//transform negative to positive
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
         int absval, number;   //absolute value
        do {
            System.out.println("Input a number: ");

                number = scanner.nextInt();
                absval = number < 0 ? (-number) : number;
                System.out.println("The number is: " + absval);
        }
        while(number != 0);
    }
}
