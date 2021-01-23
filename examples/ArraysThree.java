package examples;

public class ArraysThree {
    public static void main(String[] args) {
        int[] list = new int[10];
        int[] nums = {1, 2, 3};
        int[][] table = {{1, 2, 3}, {4, 5}, {6, 7, 8}};
        System.out.println("List length: " + list.length);
        System.out.println("Nums length: " + nums.length);
        System.out.println("Table length: " + table.length);  //table has 3 arrays
        System.out.println("Table[0] length: " + table[0].length);
        System.out.println("Table[1] length: " + table[1].length);
        System.out.println("Table[2] length: " + table[2].length);

        for (int i = 0; i < list.length; i++)
            list[i] = i;

        System.out.println("List values: ");
        for (int i = 0; i< list.length;i++)
            System.out.print(list[i] + " ");


    }
}
