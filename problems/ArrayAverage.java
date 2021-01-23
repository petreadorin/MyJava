package problems;

import static java.lang.Double.MIN_VALUE;

//the average of an array with 10 doubles
public class ArrayAverage {
    public static void main(String[] args) {
        double[] nums =new double [10];
        double sum = MIN_VALUE;
        double average = MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += i;
            average = sum / (i);
        }
        System.out.println(average);

    }

}
