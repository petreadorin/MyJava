package examples;

import javax.swing.*;

public class ForEachMultiDim {
    public static void main(String[] args) {
        int[][] nums = new int[3][5];
        int sum = 0;

        //CLASIC FOR LOOP THAT GOES THROUGH THE ARRAY
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        //ENHANCED FOR LOOP
        for (int x[] : nums) {
            for (int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Sum is: " + sum);
    }
}