package classes.examples;

public class MethodOverloadMain {
    public static void main(String[] args) {
        MethodOverload ob = new MethodOverload();
        int resI;
        double resD;

        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("The sum of the 2 arguments is: " + resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("The sum of the 2 arguments is: " + resD);
        System.out.println();
    }
}
