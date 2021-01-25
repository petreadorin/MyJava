package problems;

//Create a square  NxN matrix which contains a central circle filled with  '.' and is surrounded by 'x' :
//    raza cercului este N/2, unde N este este dimensiunea matrici
//    centrul cercului este a = (N-1)/2 si b = (N-1)/2
public class CircleMatrix {
    public static void main(String[] args) {
        int[][] square = new int[11][11];
        int n = square.length;
        int a = (n - 1) / 2;        //centrul cercului
        int b = (n - 1) / 2;        //centrul cercului
        int r = n / 2;              //raza cercului

        for (int i = 0; i < n; i++) {
            for(int j = 0;j< n;j++) {
                int distanceFromCenter = (i - a) * (i - a) + (j - b) * (j - b);
                int estePunctInCerc =  r * r;

                if(distanceFromCenter < estePunctInCerc)
                    System.out.print(" . ");
                else
                    System.out.print(" # ");

            }
            System.out.println();
        }
    }
}
