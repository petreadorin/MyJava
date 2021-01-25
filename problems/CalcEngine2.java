package problems;

import java.util.Arrays;
//CalcEngine v0.3
public class CalcEngine2 {
    public static void main(String[] args) {
        double[] leftVals= {100.0d,25.0d,225.0d,11.0d};
        double[] rightVals={50.0d,92.0d,17.0d,3.0d};
        String[] opCode = {"divide","addition","substraction","multiply" };
        double[] result =new double[opCode.length];
        for(int i=1;i<opCode.length;i++){
        switch (opCode[i]) {
            case "addition":
                result[i] = leftVals[i] + rightVals[i];
                break;
            case "substraction":
                result[i] = leftVals[i] - rightVals[i];
                break;
            case "multiply":
                result[i] = leftVals[i] * rightVals[i];
                break;
            case "divide":
                result[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
                break;
            default:
                System.out.println("invalid opCode: " + opCode[i]);
                result[i] = 0.0d;
                break;
        }

        }
        System.out.println(Arrays.toString(result));

    }
}
