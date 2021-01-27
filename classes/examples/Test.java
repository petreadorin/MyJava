package classes.examples;

//because we did not create a method to assign these values to objects, the changes will not be visible when we pass
//parameters to the method!!!!!!
public class Test {
    public void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }
}
