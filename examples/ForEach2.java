package examples;

public class ForEach2 {
    public static void main(String[] args) {
        int nums[] = {10, 12, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        //CLASSIC FOR LOOP:
        for (int i = 0; i < nums.length; i++)
            sum1 += i;

        //FOR-EACH LOOP:
        for(int x : nums) { //x element in nums array
            System.out.println("Index is: " + x);
            sum2 += x;
            }
        System.out.println("Sum of index values: " + sum2);

        for(int y : nums) {
            sum3 +=y;
            if(y == 5)
                break;
        }
        System.out.println("Sum of index values until break: " +sum3);
        }
    }

