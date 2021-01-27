package classes.examples;

public class MethodOverloadTwo {

    public void f(int x) {
        System.out.println("Inside f(int): " +x);
    }

    public void f(double x) {
        System.out.println("Inside f(double): " + x);
    }
}
