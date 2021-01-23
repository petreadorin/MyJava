package examples;

public class BooleanDemo {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b is: " + b);
        b = true;
        System.out.println("b is: " + b);
        if (b)     //last b value was true, so "if" will be executed;
            System.out.println("This is executed.");
        b = false;
        if (b)   // b changed to false, so "if" will not be executed;
            System.out.println("This will not be executed.");
        System.out.println("10 >9 is " + (10 > 9));  //10>9 is a boolean value, and it will display the result
    }
}
