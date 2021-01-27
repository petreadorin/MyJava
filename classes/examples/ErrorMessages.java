package classes.examples;

public class ErrorMessages {
    String msgs[] = {
            "Output error",
            "Input error",
            "Dsik full",
            "Index out of bounds",
    };

    //return the error message
    public String getErrorMsg(int i) {
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Invalid Error Code";
    }
}
