package examples;

public class ContinueBreak {
    public static void main(String[]args){
        int i;
        for(i=0;i<=100;i++){
            if((i%2)!=0)
                continue; //iterate
            System.out.print(i+" ");
        }
    }
}
