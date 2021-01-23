package examples;

public class SUBSTRINGS {
    public static void main(String[] args) {
        String originalString = "Java makes the Web move.";

        //construct a substring
        String subString = originalString.substring(5, 18);

        System.out.println("Original string: " + originalString);
        System.out.println("Substring: " + subString);
    }
}
