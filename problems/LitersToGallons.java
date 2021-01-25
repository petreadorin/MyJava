package problems;

//A Liter to gallon converter!!!
public class LitersToGallons {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;
        counter = 0;
        for (liters = 1; liters <= 100; liters++) {
            gallons = liters / 3.7854;
            System.out.println(liters + " liters is " + gallons + " gallons.");

            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
