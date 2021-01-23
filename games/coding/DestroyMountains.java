package games.coding;

import java.util.Scanner;

public class DestroyMountains {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int mountainH = Integer.MIN_VALUE;
        // game loop
        while (true) {
            int max = 0;
            int iMax = 0;
            for (int i = 0; i < 8; i++)
            {
                if( mountainH > max) {
                    max = mountainH;
                    iMax = i;
                }
            }
            System.out.println(iMax);
        }
    }
}
