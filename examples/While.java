package examples;

public class While {
    public static void main(String[] args) {
        int someValue = 4;
        int factorial = 1;     //initial factorial result is 1
        while (someValue > 1) {
            factorial *= someValue;   //1*4, goes to the next codeline
            someValue--;               //4 gets reduced by 1, goes to while condition check
        }
        System.out.println(factorial);
    }
}
