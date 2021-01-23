package classes.multipleClasses;

public class ErrorInfoMain {
    public static void main(String[] args) {
        ErrorInfo err  = new ErrorInfo();
        Error e;

        e = err.getErrorInfo(2);
        System.out.println(e.msg + " severity: " + e.severity);

        e = err.getErrorInfo(19);
        System.out.println(e.msg + " severity: " + e.severity);
    }
}
