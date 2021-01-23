package classes.examples;

// THE STATIC VARIABLE Y IS SHARED BY BOTH OB1 AND OB2.
// CHANGING Y AFFECTS THE WHOLE CLASS, NOT JUST AN INSTANCE
public class StaticMain {
    public static void main(String[] args) {
        Static ob1 = new Static();
        Static ob2 = new Static();

        //Each object has its own copy of a instance variable
        ob1.x = 10;
        ob2.x = 20;
        System.out.println("ob1.x and ob2.x have independent values");
        System.out.println(ob1.x + " " + ob2.x);
        System.out.println();

        //Each object shares one copy of a static variable
        Static.y = 19;
        System.out.println("First we set y to 19: ");
        System.out.println("Because Y is static, it doesnt need a method to be passed to");
        System.out.println("ob1.sum is " + ob1.sum() + "\n" + "ob2.sum is " + ob2.sum());
        System.out.println();
        //static variables dont need to be implemented as objects!!!

        Static.y = 100;
        System.out.println("Now we set y to 100: ");
        System.out.println("ob1.sum is " + ob1.sum() + "\n" + "ob2.sum is " + ob2.sum());
    }
}
