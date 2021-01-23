package examples;

import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean notFound ;

        do {
            System.out.println("Input your command: ");
            String command = scanner.next();
            switch (command) {
                case "connect":
                    System.out.println("Connecting");
                    notFound = false;
                    break;

                case "cancel":
                    System.out.println("Cancelling");
                    notFound = false;
                    break;

                case "disconnect":
                    System.out.println("Disconnecting");
                    notFound = false;
                    break;

                default:
                    System.out.println("Command error!");
                    notFound = false;
                    break;
            }
        }
        while (notFound);
    }
}