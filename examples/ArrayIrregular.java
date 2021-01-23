package examples;

// a bus that does 10 laps on days 1-5 , and 2 laps on days 6-7:
public class ArrayIrregular {
    public static void main(String[] args) {
        int[][] schedule = new int[7][];
        schedule[0] = new int[10];
        schedule[1] = new int[10];
        schedule[2] = new int[10];
        schedule[3] = new int[10];
        schedule[4] = new int[10];
        schedule[5] = new int[2];
        schedule[6] = new int[2];

        int i, j;
        for (i = 0; i < 5; i++)
            for (j = 0; j < 10; j++)
                schedule[i][j] =  10;

        for (i = 5; i < 7; i++)
            for (j = 0; j < 2; j++)
                schedule[i][j] = 2;
        System.out.println("Trips per day during the week: ");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++)
                System.out.print(schedule[i][j] + " ");
            System.out.println();
        }

        System.out.println("Trips per day during the weekend: ");
        for(i = 5; i<7;i++) {
            for ( j= 0; j<2; j++)
                System.out.print(schedule[i][j] + " ");
            System.out.println();
        }
    }
}
