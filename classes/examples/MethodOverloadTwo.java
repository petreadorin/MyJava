package classes.examples;

public class MethodOverloadTwo {

    void f(int x) {
        System.out.println("Inside f(int): " +x);
    }

    void f(double x) {
        System.out.println("Inside f(double): " + x);
    }
}
