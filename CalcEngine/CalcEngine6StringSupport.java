package CalcEngine;

import java.util.Arrays;
import java.util.Scanner;

public class CalcEngine6StringSupport {
    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'a', 's', 'm', 'd'};
        double[] results = new double[opCodes.length];

        if (args.length == 0) {
            for (int i = 1; i < opCodes.length; i++) {
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
            }
            for (double currentResult : results)
                System.out.println(currentResult);

        } else if (args.length == 1 && args[0].equals("interactive"))
            executeInteractively();

        else if (args.length == 3)
            handleCommandLine(args);

        else
            System.out.println("Input an opCode and 2 numeric values!");
    }

    //Method that reads the user input
    static void executeInteractively() {
        System.out.println("Enter an operation and two numbers: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");    //splits into multiple strings
        // based on what indicator we give(" " in our case)
        performOperation(parts);
    }

    //method that analyzes each part of the string
    private static void performOperation(String[] parts) {
        char opCode = opCodeFromString(parts[0]);
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);

    }

    //CommandLine arguments:
    private static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0); //converts the String representation of a char, into the char repr of a char!
        double leftVal = Double.parseDouble(args[1]);  //takes the String repr of a number and converts it into a double
        double rightVal = Double.parseDouble(args[2]); // --//--
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);

    }

    //exeute method:
    static double execute(char opCode, double leftVal, double rightVal) { //create an execute method type double
        // with 3 parameters
        double results;  //variable scoped inside method execute
        switch (opCode) {
            case 'a':
                results = leftVal + rightVal;
                break;
            case 's':
                results = leftVal - rightVal;
                break;
            case 'm':
                results = leftVal * rightVal;
                break;
            case 'd':
                results = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("invalid opCode: " + opCode);
                results = 0.0d;
                break;
        }
        return results;
    }

    //method that translates the words(ecuation type) that we input into opCodes that we have support for
    static char opCodeFromString(String operationName) {
        char opCode = operationName.charAt(0);  //takes the letter at the first position of the string the user inputs.
        return opCode;
    }

    //method that uses the word that represents a number
    // and translate it into the double representation of that number.
    static double valueFromWord(String word) {
        String[] numberWords = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };
        double value = 0d;
        for (int index = 0; index < numberWords.length; index++)
            if (word.equals(numberWords[index])) {          //"zero" = 0, etc;
                value = index;
                break;
            }
        return value; //returns the numeric value that corresponds of the word the user typed in
    }
}
