package classes.multipleClasses;

public class ErrorInfoMain {
    public static void main(String[] args) {
       /* ErrorInfo err  = new ErrorInfo();
        Error e;

        e = err.getErrorInfo(2);
        System.out.println(e.Message()+ " severity: " + e.Severity());

        e = err.getErrorInfo(19);
        System.out.println(e.Message() + " severity: " + e.Severity());

        */
        try {
            int[] num = {1, 2, 3};
            System.out.println(num[5]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception is: " + e.getMessage());
        }
        catch(Exception e) {
            System.out.println("any other");
        }
    }
}
