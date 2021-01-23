package problems;

//display
public class Help {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore;

        do {
            System.out.println("Help on: ");
            System.out.println("  1. if");
            System.out.println("  2. switch");
            System.out.println("  3.for");
            System.out.println("  4.while");
            System.out.println("  5.do-while");
            System.out.println("choose one: ");

            choice = (char) System.in.read();

            do
                ignore = (char) System.in.read();
            while (ignore != '\n');
        } while (choice < '1' | choice > '5');
        System.out.println("\n");
        switch (choice) {
            case '1':
                System.out.println("The if: ");
                System.out.println("if (condition) statement; ");
                System.out.println("else statament; ");
                break;
            case '2':
                System.out.println("The switch: ");
                System.out.println("switch(expression { ");
                System.out.println(" case constant : ");
                System.out.println("  statement(s) of case;");
                System.out.println("  break");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The for: ");
                System.out.println("for(initialization; condition; increment)");
                System.out.println("{ \n statement; \n }");
                break;
            case '4':
                System.out.println("The while :");
                System.out.println("while(condition)\n { \n statement; \n }");
                break;
            case '5':
                System.out.println("the do-while: ");
                System.out.println("do{ \n statement; \n } \n while (condition);");
                break;
        }
    }
}
