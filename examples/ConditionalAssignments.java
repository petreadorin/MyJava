package examples;

public class ConditionalAssignments {
    public static void main(String[] args) {
        int value1 = 5;
        int value2 = 7;
        int maxValue = value1 > value2 ? value1 : value2;
        System.out.println(maxValue);
    }
}
