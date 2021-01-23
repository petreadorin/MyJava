package examples;

public class For {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i *= 2)  //init value(integer/float);condition(boolean);increment value
            System.out.println(i);

        for (int i = 0; i < 5; i++)
            System.out.println("Hello World " + i); // we add "+i" to display a counter to the rows
        for (int i = 5; i > 0; i--)
            System.out.println("SEEYA world " + i); // descrescator


    }
}
