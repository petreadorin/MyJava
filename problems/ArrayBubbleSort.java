package problems;

//a basic example of bubble-sort in an array :)
public class ArrayBubbleSort {
    public static void main(String[] args) {
        int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t;    // t -> placeholder variable;

        //display original array
        System.out.print("Original array: ");
        for (int i = 0; i < nums.length; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        //bubble sort algo
        for (a = 1; a < nums.length; a++)
            for (b = nums.length - 1; b >= a; b--) {     //it cannot be done with for-each because it is decremented by 1!!!
                if (nums[b - 1] > nums[b]) {      //if last number is smaller than the lastnr -1 :
                    //exchange elements:
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        //display sorted array
        System.out.print("Sorted array: ");
        for(int i=0; i< nums.length; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}