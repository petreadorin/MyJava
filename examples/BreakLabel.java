package examples;

public class BreakLabel {
    public static void main(String[] args) {
        doneAfterOneTime:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                    if (k == 5)
                        break doneAfterOneTime; //only displays k until 5
                }
                System.out.println("This prints after k loop."); //it will not print;
            }
            System.out.println("This prints after j loop."); //this will not print;
        }
        System.out.println("This prints after i loop."); //this will print once;
    }
}
