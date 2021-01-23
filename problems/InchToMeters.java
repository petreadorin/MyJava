package problems;

public class InchToMeters {
    public static void main(String[] args) {
        double inches, meters;
        int counter = 0;
        for (meters = 1; meters <= 100; meters++) {
            inches = meters * 39.37;
            System.out.println(inches + " inches is " + meters + " meters.");
            counter++;

            if (counter == 12) {
                System.out.println();
                counter=0;
            }
        }
    }
}
