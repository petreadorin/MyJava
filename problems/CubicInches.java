package problems;


//how many cubic inches are in a cube x mile long?;
import java.util.Scanner;

public class CubicInches {
    public static void main(String[] args) {
        long cubeVolume;
        Scanner scanner = new Scanner(System.in);
        System.out.println("The length of the cube(inches): ");
        long cubeLine = scanner.nextLong();
        cubeVolume = cubeLine * cubeLine * cubeLine;
        System.out.println("There are " + cubeVolume + " cubic inches in a cubic mile.");
    }
}