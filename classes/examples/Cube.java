package classes.examples;

//Cube volume comparison
public class Cube {
        int a, b, c;
        int volume;

        //Class constructor
        public Cube(int i, int j, int k) {
            a = i;
            b = j;
            c = k;
        }

        //Return true if ob devines the same object
        boolean sameCube(Cube ob) {              //object of type Cube
            if ((ob.a == a) & (ob.b == b) & (ob.c == c))
                return true;
            else
                return false;
        }

        //Return true if objects have the same volume
        boolean sameVolume(Cube ob) {              //object of type Cube
            if (ob.volume == volume)
                return true;
            else
                return false;
        }
    }
