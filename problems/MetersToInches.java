package problems;

//A Convertor of meters to inches!
public class MetersToInches {
    public static void main(String[] args) {
        double inches, meters;
        int counter = 0;
        for (meters = 1; meters <= 100; meters++) {
            inches = meters * 39.37;
            System.out.println(meters + " meters " + " is " + inches + " inches.");
            counter++;

            if (counter == 12) {             //every 12th line, println()
                System.out.println();
                counter=0;
            }
        }
    }
}
