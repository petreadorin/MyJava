package classes.examples;

public class OverloadSummationMain {
    public static void main(String[] args) {
        OverloadSummation s1 = new OverloadSummation(5);    //uses the OverloadSummation(int)
        OverloadSummation s2 =new OverloadSummation(s1);   //uses the OverloadSummation(ob)

        System.out.println("s1.sum = " + s1.sum);
        System.out.println("s2.sum = " + s2.sum);

    }
}
