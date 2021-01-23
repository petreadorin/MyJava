package classes.problems;

public class OuterClassMain {
    public static void main(String[] args) {
        int x[] = {3, 2, 1, 5, 6, 9, 7, 8};
        OuterClassOne ob = new OuterClassOne(x);

        ob.analyze();
    }
}
