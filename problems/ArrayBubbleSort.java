package problems;

public class ArrayBubbleSort {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t, size = 10;
        //display original array
        System.out.print("Original array: ");
        for (int i = 0; i < nums.length; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        //bubble sort algo
        for (a = 1; a < nums.length; a++)
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {      //if number out of order
                    //exchange elements:
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        //display sorted array
        System.out.print("Sorted array: ");
        for(int i=0; i< size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}