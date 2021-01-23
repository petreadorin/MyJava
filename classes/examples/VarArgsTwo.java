package classes.examples;

//Normal parameters and var args parameters
public class VarArgsTwo {
    static void vaTest( String msg, int ... v) {
        System.out.println(msg  + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + " : " + v[i]);

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 3 , 7, 9);
        vaTest(("No varargs: "));
    }
}
