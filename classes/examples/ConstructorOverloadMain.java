package classes.examples;

//JAVA AUTOMATICALLY CALLS THE PROPER CONSTRUCTOR WHEN NEW IS EXECUTED!!!!!!!!
public class ConstructorOverloadMain {
    public static void main(String[] args) {
        ConstructorsOverload c1 = new ConstructorsOverload();
        ConstructorsOverload c2 = new ConstructorsOverload(88);
        ConstructorsOverload c3 = new ConstructorsOverload(17.23);
        ConstructorsOverload c4 = new ConstructorsOverload(2, 4);

        System.out.println("c1.x: " + c1.x);
        System.out.println("c2.x: " + c2.x);
        System.out.println("c3.x: " + c3.x);
        System.out.println("c4.x: " + c4.x);
    }
}
