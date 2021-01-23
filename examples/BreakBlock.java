package examples;

public class BreakBlock {
    public static void main(String[] args) {
//we can give labels to our blocks of code, and when we want to break, it can break that block of code!!!
        for (int i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("i is " + i);
                        if (i == 1)
                            break one; //breaks label "one";
                        if (i == 2)
                            break two; //breaks label "two";
                        if (i == 3)
                            break three;


                    }
                    System.out.println("After block 3.");
                }
                System.out.println("After block 2.");
            }
            System.out.println("After block 1.");
        }
    }
}
