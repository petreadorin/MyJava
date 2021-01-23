package classes.examples;

public class MyClassMain {
    public static void main(String [] args) {
        MyClass t1 = new MyClass(10);    //constructor MyClass() is called to initialize object t1
        MyClass t2 = new MyClass(88);    // and gives it the value 10 and 88 respectively
                                            //the values are first passed to i, which then passes it to X

        System.out.println(t1.x + " " + t2.x); //object t1 is given the value x
    }
}
