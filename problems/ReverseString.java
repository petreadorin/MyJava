package problems;

public class ReverseString {
    public static void main(String[] args) {
        String str = "I enjoy coding";
        char[] strArray = str.toCharArray();
        for(int i = strArray.length - 1; i >= 0; i--)
            System.out.print(strArray[i]);
    }
}
