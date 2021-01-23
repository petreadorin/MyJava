package classes.examples;

public class PowerMain {
    public static void main(String[] args) {
        Power x = new Power(4.0, 2);
        Power y = new Power(2.5, 1);
        Power z = new Power(5.7, 0);

        System.out.println(x.b + " raised to the power of " + x.e + " equals " + x.getPwr());
        System.out.println(y.b + " raised to the power of  " + y.e + " equals " + y.getPwr());
        System.out.println(z.b + " raised to the power of " + z.e + " equals " + z.getPwr());
    }
}
