package classes.problems;

public class VarArgsSumMain {
    public static void main(String[] args) {
        VarArgsSum sum1 = new VarArgsSum();

        int total = sum1.sum(1, 2, 3);
        System.out.println("1 + 2 + 3 = " + total);

        total = sum1.sum(1, 2, 3, 4, 5);
        System.out.println("1 + 2 + 3 + 4 + 5 = " + total);
    }
}
