package examples;

import java.lang.StringBuilder;

public class StringBuilderr {
    public static void main(String[] args) {
        String location = "Florida";
        int flightNumber = 175;

        StringBuilder sb = new StringBuilder();  //StrBuilder class creates a buffer where we store the string
        sb.append("I flew to ");                 //.append adds content to the end of the
                                                 // (since now sb is empty, it will be the first words)
        sb.append(location);                     //adds location at the end of the last sb
        sb.append(" on flight number    ");
        sb.append(flightNumber);

        String message = sb.toString();  //.toString extracts a string from the SB buffer and stores it in a variable
                                         //The buffer is not deleted after extraction.we can still operate with it

        String time = "9.00";
        int pos = sb.indexOf(" on");  //.indexOf finds the index of the value specified in the ()
                                      //and stores it in the pos variable
        sb.insert(pos, " at ");   //.insert inserts a string in the index before the one specified by pos
        sb.insert(pos + 4, time);
        message = sb.toString();
        System.out.println(message);

    }
}
