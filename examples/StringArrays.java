package examples;

public class StringArrays {
    public static void main(String[] args) {
        String strs[] = {"This", "is", "a", "test"};

        System.out.println("Original array: ");
        for (String x : strs)
            System.out.print(x + " ");
        System.out.println("\n");

        //change a string
        strs[1] = "was";
        strs[3] = "test too";

        System.out.println("Modified array: ");
        for (String x : strs)
            System.out.print(x + " ");
    }
}
