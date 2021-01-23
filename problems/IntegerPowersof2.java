package problems;
//input and display the power of 2 results
import java.util.Scanner;

public class IntegerPowersof2 {
    public static void main(String[] args) {
        int counter;
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("The exponent: ");
        int exponent = scanner.nextInt();
        for (int i = 0; i <= exponent; i++){
            result =1;
            counter =i;
            while(counter>0){
                result *=2; //the result overrites each time with multiples of 2
                counter--;   //each time counter passes through while it will be reduced to 0 so the loop ends!!!
            }
            System.out.println("2 to the power of "+i +" equals "+ result);
        }
    }
}
