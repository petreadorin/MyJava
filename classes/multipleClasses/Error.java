package classes.multipleClasses;

public class Error {
    private String _msg;     //contains the error message
    private int _severity;   //contains the severity value

    public Error(String message, int severity) {
        _msg = message;
        _severity = severity;
    }

    public String Message() {
      return _msg;
    }

    public int Severity() {
        return _severity;
    }

}
