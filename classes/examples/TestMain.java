package classes.examples;

public class TestMain {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;

        //The arguments have no effect outside the method!!!
        System.out.println("a and b before the method call: " + a + " , " + b);
        ob.noChange(a, b);
        System.out.println("a and b called after the method call: " + a + ", " + b);
    }
}
