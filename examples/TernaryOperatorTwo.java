package examples;

public class TernaryOperatorTwo{
    public static void main(String[] args) {
        double result1;

        for (double i = -5; i < 6; i++) {
            result1 = i != 0 ? 100 / i : 0;
            if (i != 0)
                System.out.println("100 divided by " + i + " is " + result1);
        }

        System.out.println();

        //a simplified way
        for(double i = -5; i < 6; i++) {
            if(i != 0 ? true : false)
                System.out.println("100 divided by " + i + " is " + 100 / i);
        }
    }
}
