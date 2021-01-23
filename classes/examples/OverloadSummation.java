package classes.examples;

public class OverloadSummation {
    int sum;

    //Construct from int
    OverloadSummation(int num) {
        sum  = 0;
        for(int i = 1;i <= num; i++)
            sum += i;
    }

    //Construct from object
    OverloadSummation(OverloadSummation ob) {
        sum += ob.sum;
    }
}
