package examples;

public class ArrayRefference {
    public static void main(String[] args) {
        int[] nums1 = new int[10];
        int[] nums2 = new int[10];
        int i;

        for (i = 0; i < nums1.length; i++)
            nums1[i] = i;

        for (i = 0; i < nums2.length; i++)
            nums2[i] = -i;

        System.out.println("Numbers from first array: ");
        for (i = 0; i < nums1.length; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

        System.out.println("Numbers for the second array: ");
        for (i = 0; i < nums2.length; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        nums2 = nums1;     //assign 2nd array the values of the 1st array

        System.out.println("Second array after conversion: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        System.out.println("First array after conversion: ");
        for(i = 0;i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();
    }
}
