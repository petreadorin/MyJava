package classes.examples;

public class MethodOverload {

    public void ovlDemo() {
        System.out.println("This method has 0 parameters");
    }

    public void ovlDemo(int a) {
        System.out.println("This method has 1 int parameter: " + a);
    }

    public int ovlDemo(int a, int b) {
        System.out.println("This method has 2 int parameters: " + a + " " + b);
        return a + b;
    }

    public double ovlDemo(double a, double b) {
        System.out.println("This method has 2 double parameters: " + a + " " + b);
        return a + b;
    }
}

