package classes.examples;

public class ClassAccessModifiersMain {
    public static void main(String[] args) {
        ClassAccessModifiers obj = new ClassAccessModifiers();

        //ACCES TO CLASS INSTANCE "ALPHA" IS POSSIBLE EVEN THOUGH IT IS PRIVATE BECAUSE WE HAVE A METHOD setAplha
        obj.setAlpha(-99);
        System.out.println("ob.alpha is " + obj.getAlpha());

        //WRONG ACCES OF PRIVATE CLASS VARIABLE:
        //ob.alpha = 10;  error because alpha variable is private in the previous class!!!
        //That is why we call it with its accessor method getAlpha, which is public!!!!

        //These are okay because beta and gamma are public
        obj.beta = 10;
        obj.gamma = 123;
    }
}
