package problems;

public class StringArraySort {
    public static void main(String[] args) {
        String[] names = {"Samantha", "Dana", "Micky"};
        int size = names.length;
        int a, b;
        String tempo;

        //display original array
        System.out.print("Original array is: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();

        //Bubble sort array
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (names[b - 1].length() > names[b].length()) {    // if out of order
                    tempo = names[b - 1];
                    names[b - 1] = names[b];
                    names [b] = tempo;
                }
            }

        //display sorted array
        System.out.print("Sorted array :");
            for(int i = 0; i< size ; i++)
                System.out.print(names[i] + " ");
    }
}
