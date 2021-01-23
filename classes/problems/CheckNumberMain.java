package classes.problems;

public class CheckNumberMain {
    public static void main(String[] args) {
        CheckNumber e = new CheckNumber();

        if (e.isEven(10))                          // x: 10 is an argument
            System.out.println("10 is even");
        if (e.isEven(9))                           // x: 9 is an argument
            System.out.println("9 is even");
        if (e.isEven(8))                           // x: 8 is an argument
            System.out.println("8 is even");
        //THE VALUE PASSED BY A ARGUMENT IS THE VALUE RECEIVED BY THE PARAMETER "X" IN "CheckNumber" method!!!
    }
}
