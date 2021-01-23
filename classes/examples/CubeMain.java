package classes.examples;

public class CubeMain {
    public static void main(String[] args) {
        Cube ob1 = new Cube(10, 2, 5);
        Cube ob2 = new Cube(10, 2, 5);
        Cube ob3 = new Cube(4, 5, 5);

        System.out.println("Ob1 has the same dimensions as ob2: " + ob1.sameCube(ob2));
        System.out.println("Ob1 has the same dimensions as ob3: " + ob1.sameCube(ob3));

        System.out.println("Ob1 has the same volume as ob3: " + ob1.sameVolume(ob3));
    }
}
