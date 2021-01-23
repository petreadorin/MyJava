package classes.examples;

public class StaticMethodMain {
    public static void main(String[] args) {
        System.out.println("val is: " + StaticMethod.val);
        System.out.println("val divided by 2 is: " + StaticMethod.valDiv2());

        StaticMethod.val = 4;
        System.out.println("val is: " + StaticMethod.val);
        System.out.println("val divided by 2 is: " + StaticMethod.valDiv2());

    }
}
