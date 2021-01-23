package examples;

public class ArraysTwo {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int min, max;
        int i;
        for (i = 0; i < nums.length; i++)
            sample[i] = i;      //extracts the array value at position i

        for (i = 0; i < nums.length; i++)
            System.out.println("sample[ " + i + " ]: " + sample[i]);

        //find min max
        min = max = nums[0];
        for(i=0;i<nums.length;i++) {
            if( min > nums[i])
                min = nums[i];
            if(max < nums[i])
                max = nums[i];
        }
        System.out.println("Min is: " + min + " .Max is: " + max);
    }
}
