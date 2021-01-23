package classes.problems;

//Write a recursive method that displays the contents of a String backwards
public class BackwardsString {
    String str;

    BackwardsString(String s) {
        str = s;
    }

    //this method calls itself until it "reaches length-1"
    void backwards(int index) {
        if (index != str.length() - 1)
            backwards(index + 1);  //the index gets incremented by 1 until the char reaches the end of the string

        System.out.print(str.charAt(index) + " ");
    }
}
