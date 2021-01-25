package problems;

//In an array of 10 given integers, find and display the smallest and the biggest value.
public class ArrayMinMax {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int min, max ;

        min = max = nums[0];
        for(int i : nums) {
            if(min > i)
                min = i;
            if(max < i)
                max = i;
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
