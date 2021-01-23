package problems;

public class LowerUpperCase {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, ignore;
        do {
            System.out.print("Character: ");
            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore!='\n');

            if (Character.isLowerCase(ch)) {
                ch -= 32;
                System.out.println("Uppercase: " + ch);
            } else if (Character.isUpperCase(ch)) {
                ch += 32;
                System.out.println("Lowercase: " + ch);
            } else
                System.out.println(ch);

        }while(ch!='.');
    }
}
