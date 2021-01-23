package classes.quicksort;

public class Quicksort {

    //Set up a call to the actual Quicksort method.
    static void Qsort(char items[]) {
        qs (items, 0, items.length -1);
    }

    //A recursive version of Quicksort for characters.
    private static void qs(char items[], int left, int right) {
        int i, j;
        char x, y;

        i = left; j = right;
        x = items[(left + right) / 2];   //splits the array in 2 parts

        do {
            while ((items[i] < x) && (i < right))     //while items on the left
                i++;
            while ((x < items[j]) && (j > left))      //while items on the right
                j--;


            if (i <= j) {                            //if left < right
                y = items[i];                         //y =  left, left = right, right =y (replaces)
                items[i] = items[j];
                items[j] = y;
                i++;                                 //next item from left to the right
                j--;                                  //next item from right to the left
            }
        }
        while(i <= j);                               //as long as left <= right (until they are in the middle)

        if(left < j)                //if left < next right
            qs(items, left, j);     //quicksort(item , left , next right)
        if(i < right)               //if next left < right
            qs(items, i , right);   //quicksort(item, next left , right
    }
}
