package CalcEngine;

import java.util.Arrays;
//CalcEngine that works with commandline (3 parameters: ecuation nr1 nr2)
//CalcEngine 0.5
public class CalcEngine5CommandLine {
    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        String[] opCode = {"divide", "addition", "substraction", "multiply"};
        double[] result = new double[opCode.length];

        if (args.length == 0) {
            for (int i = 1; i < opCode.length; i++) {
                result[i] = execute(opCode[i], leftVals[i], rightVals[i]);
            }

            System.out.println(Arrays.toString(result));
        } else if (args.length == 3)
            handleCommandLine(args);
            else
        System.out.println("Input an opCode and 2 numeric values!");
    }

    //CommandLine arguments:
    private static void handleCommandLine(String[] args) {
        String opCode = args[0]; //converts the String representation of a char, into the char repr of a char!
        double leftVal = Double.parseDouble(args[1]);  //takes the String repr of a number and converts it into a double
        double rightVal = Double.parseDouble(args[2]); // --//--
        double result  = execute(opCode, leftVal, rightVal);
        System.out.println(result);

    }

    //exeute method:
    static double execute(String opCodes, double leftVal, double rightVal) { //create an execute method type double
        // with 3 parameters
        double results;  //variable scoped inside method execute
        switch (opCodes) {
            case "addition":
                results = leftVal + rightVal;
                break;
            case "substraction":
                results = leftVal - rightVal;
                break;
            case "multiply":
                results = leftVal * rightVal;
                break;
            case "divide":
                results = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("invalid opCode: " + opCodes);
                results = 0.0d;
                break;
        }
        return results;
    }
}
