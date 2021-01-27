package classes.examples;

public class RecursionFactorial {

    //This is a recursive method
    public int factR(int n) {
        int result;
        if (n == 1)
            return 1;
        result = factR(n - 1) * n;
        return result;
    }

    //This is an interative method
    public int factI(int n) {
        int t, result1;

        result1 = 1;
        for (t = 1; t <= n; t++)
            result1 *= t;
        return result1;
    }
}
