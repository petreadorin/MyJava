package classes.problems;

public class FactorMain {
    public static void main(String[] args){
        Factor x = new Factor();

        if(x.isFactor(2, 20))  //a and b are arguments , passed as parameters to the "isFactor" method
            System.out.println("2 is factor of 20");
        if(x.isFactor(3, 20))  //a and b are arguments , passed as parameters to the "isFactor" method
            System.out.println("3 is factor of 20");
    }
}
