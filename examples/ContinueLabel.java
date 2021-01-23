package examples;

public class ContinueLabel {
    public static void main(String[] args) {

        outerloop:
        for (int i = 1; i < 10; i++) {
            System.out.print("\nOuterloop number: " + i + ",inner loop: ");
            for (int j = 1; j < 10; j++) {
                if (j == 5)
                    continue outerloop;  //control goes to OUTERLOOP WHEN VALUE 5 is reached.
                System.out.print(j);
            }
        }
    }
}
