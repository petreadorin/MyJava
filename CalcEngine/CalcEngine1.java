package CalcEngine;

//CalcEngine v0.2
public class CalcEngine1 {
    public static void main(String[] args) {
        double value1 = 100.0d;
        double value2 = 0.0d;
        double result = 0.0d;
        String opCode = "divide";
        switch (opCode) {
            case "addition":
                result = value1 + value2;
                break;
            case "subtraction":
                result = value1 - value2;
                break;
            case "multiply":
                result = value1 * value2;
                break;
            case "divide":
                result = value2 != 0 ? value1 / value2 : 0.0d;
                break;
            default:
                System.out.println("invalid opCode: " + opCode);
                result = 0.0d;
                break;

        }
        System.out.println(result);

    }
}
