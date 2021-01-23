package examples;

public class TypeConversion {

    public static void main(String[] args) {

        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;
        short result1 = (short) longVal; //explicitly casts long into short;   both integer values
        short result2 = (short) (byteVal - longVal);  //casts the whole paranthesis in short; both integer values
        float result3 = longVal - floatVal; //one is integer type, the other is floating point value;


        System.out.println("Succes!");

    }
}
