package examples;

public class Methods {
    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 20;
        double result = calculateInterest(100d, 0.05d, 10);  //stores the result of the method in a result variable

        System.out.println("Before method call");   // 1
        doSomething();                              // 2 it will call the method statements
        System.out.println("After method call");    // 3

        showSum(7.5, 1.4, 3);

        swap(val1, val2);    //this does nothing because parameters allow to pass values INTO the method
        System.out.println(val1);
        System.out.println(val2);

        System.out.println("Interest: " + result);


    }

    static void doSomething() {     //a method with no return type(void) and no parameters ()
        System.out.println("We are inside a method.");
        System.out.println("Still inside the method.");

    }

    static void showSum(double x, double y, int counter) {

        if (counter < 1) //if counter is 0, program executes the sum and wastes memory
            return;     //so we add a condition to return instantly;

        double sum = x + y;                //only visible (scoped) inside this method
        for (int i = 0; i < counter; i++)
            System.out.println(sum);
    }

    static void swap(int x, int y) {
        int z = x;
        x = y;
        y = z;
    }

    static double calculateInterest(double amt, double rate, int years) {
        return amt * rate * years;
    }
}

