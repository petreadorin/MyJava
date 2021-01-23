package classes.examples;

public class VarArgs {
    static void vaTest(int... v) {
        System.out.println("Number of args: " + v.length);

        for (int i : v)
            System.out.print(i + "  ");
        System.out.println();
    }


    public static void main(String[] args) {

        vaTest(10);         //one argument
        vaTest(3, 7, 9);    //three arguments
        vaTest();               //zero arguments
    }
}
