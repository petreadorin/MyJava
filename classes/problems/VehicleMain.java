package classes.problems;

import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21); //vehicle constructor assigns parameters to object minivan
        Vehicle sportscar = new Vehicle(2, 14, 12);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much do you want to travel: ");
        int dist = scanner.nextInt();
        double gallons;

        /*                        !!!!!OLD COLDE WITHOUT CONSTRUCTORS!!!
        assign values to minivan;
        minivan.passangers = 7;
        minivan.fuelCap = 16;
        minivan.mpg = 21;

        //assign values to sportscar;
        sportscar.passangers = 2;
        sportscar.fuelCap = 14;
        sportscar.mpg = 12;       */

        gallons = minivan.fuelneeded(dist);
        System.out.println("The minivan can travel " + dist + " miles with " + gallons + " gallons of fuel.");

        gallons = sportscar.fuelneeded(dist) ;
        System.out.println("The sportscar can travel " + dist + " miles with " + gallons + " gallons of fuel.");

        if(minivan.range() > sportscar.range())
            System.out.println("Minivan has a greater range than the sportscar.");
        else
            System.out.println("Sportscar has a greater range than the minivan.");
    }
}
