package classes.examples;

public class ErrorMessagesMain {
    public static void main(String[] args) {
        ErrorMessages error = new ErrorMessages();

        System.out.println(error.getErrorMsg(2));
        System.out.println(error.getErrorMsg(19));
    }
}
