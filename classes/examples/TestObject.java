package classes.examples;
//arguments will be passed to objects, and the change will happen( because objects are refference types)
public class TestObject {
    int a, b;

    public TestObject(int i, int j) {
        a = i;
        b = j;
    }

    //pass an object to change
    void change(TestObject ob) {
        ob.a  = ob.a + ob.b;
        ob.b = -ob.b;
    }
}