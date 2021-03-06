package classes.problems;

public class Help {
    public void helpOn(int what) {
        switch (what) {
            case '1':
                System.out.println("The if: ");
                System.out.println("if(condition) {");
                System.out.println("statements;\n} else {\n statements;\n } ");
                break;

            case '2':
                System.out.println("The switch: ");
                System.out.println("switch(expression) {");
                System.out.println("\tcase value :");
                System.out.println("\t\tstatement sequence;");
                System.out.println("\t\tbreak;");
                System.out.println("}");
                break;

            case '3':
                System.out.println("The for: ");
                System.out.println("for (initialization; condition; increment) {");
                System.out.println("\tstatements;");
                System.out.println("}");
                break;

            case '4':
                System.out.println("The while: ");
                System.out.println("while (condition) {");
                System.out.println("\tstatements ;");
                System.out.println("}");
                break;

            case '5':
                System.out.println("The do-while: ");
                System.out.println("do {");
                System.out.println("\t statements ;");
                System.out.println("}");
                System.out.println("\t while (condition) ;");
                break;

            case '6':
                System.out.println("The break: ");
                System.out.println("break; or break label;");
                break;

            case '7':
                System.out.println("The continue: ");
                System.out.println("continue; or continue label;");
                break;

        }
        System.out.println();
    }

    public void showMenu() {
        System.out.println("Help on: ");
        System.out.println("1.if");
        System.out.println("2.switch");
        System.out.println("3.for");
        System.out.println("4.while");
        System.out.println("5.do-while");
        System.out.println("6.break");
        System.out.println("7.continue\n");
        System.out.print("Choose one (q to quit): ");
    }

    public boolean isValid(int ch) {
        return !(ch < '1' | ch > '7' & ch != 'q');
    }
}

