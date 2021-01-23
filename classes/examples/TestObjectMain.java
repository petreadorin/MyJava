package classes.examples;

public class TestObjectMain {
    public static void main(String[] args) {
        TestObject ob= new TestObject(15, 20);

        System.out.println("ob.a and ob.b before the method call: " + ob.a +" , " + ob.b);

        ob.change(ob);

        System.out.println("ob.a and ob.b after method call: " +ob.a + " , " + ob.b);
    }
}
