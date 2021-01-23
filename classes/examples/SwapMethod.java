package classes.examples;

public class SwapMethod {
    int a;

    SwapMethod(int i) {
        a = i;
    }

    //Creating the swap method
    void swap (SwapMethod ob1, SwapMethod ob2) {
        int t;
        t = ob1.a;
        ob1.a = ob2.a;
        ob2.a = t;
    }
}
