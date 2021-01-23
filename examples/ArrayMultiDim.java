package examples;

public class ArrayMultiDim {
    public static void main(String[] args) {
        int[][][] cube = {
                {
                        {1, 2, 3},
                        {1, 2, 3},
                        {1, 2, 3}
                }

        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++)
                    System.out.print(cube[i][j][k] + " ");
                System.out.println();
            }
        }
    }
}
