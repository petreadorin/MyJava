package classes.problems;

public class Vehicle {
    int passangers;
    int fuelCap;
    int mpg;  //meters per gallon;

    Vehicle(int p, int f, int m) {        //vehicle constructor
        passangers = p;
        fuelCap = f;
        mpg = m;
    }

    int range() {
        return mpg * fuelCap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

}
