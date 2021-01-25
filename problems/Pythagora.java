package problems;

import java.util.Scanner;

//using pythaghora's theorem, find thge length of the hypothenuse, while knowing the length of the cathethes;
public class Pythagora {
    public static void main(String[] args) {
        float hypo = 0.0f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the first side: ");
        float side1 = scanner.nextFloat();
        System.out.println("Enter the length of the second side: ");
        float side2 = scanner.nextFloat();
        hypo = (float) Math.sqrt((side1 * side1) + (side2 * side2));
        System.out.println(hypo);

    }
}
