package classes.problems;

//PROPERLY USED QUEUE (PRIVATE DOESNT CHANGE THE OUTCOME)
public class QueuePrivateClass {
    private char q[];        //array that holds the queue
    private int putLoc, getLoc;

    public QueuePrivateClass(int size) {         //queue constructor
        q = new char[size];  //allocate memory in constructor, because in class we only define the variables
        putLoc = getLoc = 0;
    }

    //put a character in queue
    void put(char ch) {
        if (putLoc == q.length) {
            System.out.println("The queue is full.");
        }
        q[putLoc++] = ch;
    }

    //get a character from the queue
    char get() {
        if (getLoc == putLoc) {
            System.out.println("The queue is empty.");
            return (char) 0;
        }
        return q[getLoc++];
    }
}
