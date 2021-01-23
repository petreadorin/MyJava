package classes.multipleClasses;

public class Error {
    String msg;     //contains the error message
    int severity;   //contains the severity value

    Error(String m, int s) {
        msg = m;
        severity = s;
    }
}
