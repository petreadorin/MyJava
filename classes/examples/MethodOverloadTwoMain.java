package classes.examples;

// AUTOMATIC TYPE CONVERSION!!!!
public class MethodOverloadTwoMain {
    public static void main(String[] args) {
        MethodOverloadTwo ob = new MethodOverloadTwo();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i);
        ob.f(d);
        ob.f(b);    //type conversion to INT (byte short long -> int)
        ob.f(s);    //type conversion to INT (byte short long -> int)
        ob.f(f);    //type converson to DOUBLE (float -> double)
    }
}
