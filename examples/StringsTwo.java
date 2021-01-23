package examples;

public class StringsTwo {
    public static void main(String[] args) {
        String str1 = "When it comes to Web programming, Java is #1.";
        String str2 = new String(str1);
        String str3 = "Java strings are powerful.";
        int result, idx;
        char ch;

        System.out.println("Length of str1 is: " + str1.length());

        // display str1, one character at a time
        for (int i = 0; i < str1.length(); i++)
            System.out.print(str1.charAt(i) + " ");
        System.out.println();

        if(str1.equals(str2))
            System.out.println("str1 equals str2");

        if(str1.equals(str3))
            System.out.println();
        else
            System.out.println("str1 is not equal to str3");

        result = str1.compareTo(str3);
        if(result == 0)
            System.out.println("str1 is equal to str3");
        else if(result < 0 )
            System.out.println("str1 is smaller than str3");
        else
            System.out.println("str1 is bigger than str3");

        //assign a new string to str2:
        str2 = "One Twho Three One";
        idx = str2.indexOf("One");
        System.out.println("Index of One is: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Last index of One is: " + idx);
    }
}
