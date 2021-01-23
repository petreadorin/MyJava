package problems;

import java.util.Arrays;

public class CalcEngineMethods {
    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        String[] opCode = {"divide", "addition", "substraction", "multiply"};
        double[] result = new double[opCode.length];

        for (int i = 1; i < opCode.length; i++) {
            result[i] = execute(opCode[i], leftVals[i], rightVals[i]);
        }

        System.out.println(Arrays.toString(result));

    }

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
