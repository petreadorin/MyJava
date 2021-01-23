package problems;

import java.util.Scanner;

//how far away it strikes? 1100feet/second  .input seconds away from
public class LightningStrike {
    public static void main(String[]args){
        double distance;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Time it took to hear the sound: ");
        double time= scanner.nextDouble();
        distance = time * 1100;
        System.out.println("The lightning struck "+ distance+" feet away!");
    }

}
