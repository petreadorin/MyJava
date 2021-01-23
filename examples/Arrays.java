package examples;

public class Arrays {
    public static void main(String[] args) {
        float[] values = new float[3];
        values[0] = 1.0f;
        values[1] = 2.0f;
        values[2] = 3.0f;
        float sum = 0.0f;
        for (int i = 0; i < values.length; i++)
            sum += values[i];
        System.out.println(sum);

        float[] theVals = {10.0f, 20.0f, 30.0f};
        float sum1 = 0.0f;
        for (int index = 0; index < theVals.length; index++)
            sum1 += theVals[index];
        System.out.println(sum1);




    }


}
