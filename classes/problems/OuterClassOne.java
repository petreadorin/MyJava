package classes.problems;

public class OuterClassOne {
    int nums[];

    OuterClassOne(int n[]) {
        nums = n;
    }

    void analyze() {
        Inner inOb = new Inner();

        System.out.println("Minimum: " + inOb.min());
        System.out.println("Maximum: " + inOb.max());
        System.out.println("Average: " + inOb.average());
    }

    //this is an inner class.
    class Inner {
        int min() {
            int m = nums[0];

            for (int i = 1; i < nums.length; i++)
                if (nums[i] < m)
                    m = nums[i];
            return m;
        }

        int max() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
                if (nums[i] > m)
                    m = nums[i];
            return m;
        }

        int average() {
            int a = 0;
            for (int i = 0; i < nums.length; i++)
                a += nums[i];
            return a / nums.length;
        }
    }
}
