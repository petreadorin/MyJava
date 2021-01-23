package examples;

public class Strings {
    public static void main(String[] args) {
        //declare strings in various ways:
        String str1 = new String("Strings are objects");
        String str2 = "They can be constructed like this";
        String str3 = new String(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
