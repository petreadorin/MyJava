package classes.problems;

public class QueueOverload {
    private char q[];   //this array holds the queue
    private int putLoc, getLoc;     //the put and get indices

    //Construct an empty Queue given its size
    QueueOverload(int size) {
        q = new char[size];        //allocate memory for the queue
        putLoc = getLoc = 0;
    }

    //Construct a Queue from a Queue
    QueueOverload(QueueOverload ob) {
        putLoc = ob.putLoc;
        getLoc = ob.getLoc;
        q = new char[ob.q.length];

        // copy elements
        for (int i = getLoc; i < putLoc; i++)      //getLoc is 1st queue pos, putLoc is the last position in queue
            q[i] = ob.q[i];
    }

    //Put a character into the Queue
    void put(char ch) {
        if (putLoc == q.length) {
            System.out.println("Queue is full");
            return;
        }
        q[putLoc++] = ch;
    }

    //Construct a Queue with initial values
    QueueOverload(char a[]) {
        putLoc = 0;
        getLoc = 0;
        q = new char[a.length];

        for (int i = 0; i < a.length; i++)
            put(a[i]);
    }

    //Get a character from the queue
    char get() {
        if (getLoc == putLoc) {
            System.out.println("Queue is empty");
            return (char) 0;
        }
        return q[getLoc++];
    }


}

