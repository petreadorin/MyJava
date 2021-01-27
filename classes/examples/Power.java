package classes.examples;

public class Power {
    double b;
    int e;
    double val;

    public Power( double base, int exp) {
        b = base;
        e = exp;

        val = 1;
        if (exp == 0)
            return;
        for (; exp > 0; exp--)
            val = val * base;
    }
        double getPwr() {
            return val;
        }
    }

