package classes.problems;

public class Stack {
    private char stck[];  //array to hold the stack
    private int tos = 0;  //top of the stack

    //Construct an empty stack, given its size
    Stack(int size) {
        stck = new char[size];
        tos = 0;
    }

    //Construct a stack from a stack
    public Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];  //new type char stack

        //copy elements
        for (int i = 0; i < stck.length; i++)
            stck[i] = ob.stck[i];
    }

    //Construct a stack with initial values.
    public Stack(char a[]) {
        stck = new char[a.length];

        for (int i = 0; i < a.length; i++)
            push(a[i]);
    }

    //Push characters onto the stack.
    public void push(char ch) {
        if (tos == stck.length) {
            System.out.println("Stack is full");
            return;
        }
        stck[tos] = ch;
        tos++;
    }

    //Pop a character from the stack.
    public char pop() {
        if (tos == 0) {
            System.out.println("Stack is empty");
            return (char) 0;
        }
        tos--;
        return stck[tos];
    }
}
