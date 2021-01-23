package classes.examples;
//EXAMPLE OF STATIC TYPE VARIABLE
public class Static {
    int x;            //a normal instance variable
    static int y;     //a static variable -> one copy of y for all objects to share

    //Retunr the sum of the instance variable x
    int sum() {
        return x + y;
    }
}
