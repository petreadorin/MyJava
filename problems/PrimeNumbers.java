package problems;

public class PrimeNumbers {
    public static void main(String[]args){
        for(int i=2;i<100;i++){
            if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
                System.out.print(i+" ");
                i++;

            }
        }
    }
}
