package classes.examples;

public class ClassAccessModifiers {
    private int alpha;  //private acces
    public int beta;    //public acces
    int gamma;          //default acces

    //Methods of a class can acces private members IN the same class
    public void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }


}
