package examples;

public class BreakDifference {
    public static void main(String[] args) {
        int x = 0, y = 0;
        //break is used at start, meaning it will only calculate the first X value with all Y values up to 2
        break1:
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if (y == 2)
                    break break1;
                System.out.println("x and y :" + x + " " + y);
            }
        }
        System.out.println();

        //break is used after the first for loop, it will display all x and y combo, with y up to 2
        for (x = 0; x < 5; x ++) {
            break2:
            for (y = 0; y < 5; y++) {
                if (y == 2)
                    break break2;
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println();
    }
}
