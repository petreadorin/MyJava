package classes.examples;

//DIFFERENT WAYS TO OVERLOAD CONSTRUCTORS
public class ConstructorsOverload {
    int x;

    ConstructorsOverload() {
        System.out.println("Inside constructor MyClass().");
        x = 0;
    }

    ConstructorsOverload(int i) {
        System.out.println("Inside constructor MyClass(int).");
        x = i;
    }

    ConstructorsOverload(double d) {
        System.out.println("Inside constrcutor MyClass(double)");
        x = (int) d;
    }

    ConstructorsOverload(int i, int j) {
        System.out.println("Inside constructor MyClass(int, int)");
        x = i * j;
    }
}
