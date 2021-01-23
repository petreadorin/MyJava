package problems;

import java.util.Locale;
import java.util.Scanner;

public class GuessTheLetter {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, answer ='k', ignore;
        do {
            System.out.println("I'm thinking of a number between A-Z.");
            System.out.print("Try to guess it: ");

            //reading the character:
        ch =(char)System.in.read();

            //discarding the other input characters:
            do{         //more details later about this loop!!!!!!!!!!!!!!!!!!!!!
                ignore = (char) System.in.read();
            }while (ignore !='\n');

        if(ch == answer)
            System.out.println("You are correct!!!");
        else{
            System.out.print("Sorry, you are ");
            if(ch<answer)
                System.out.println("too low");
            else
                System.out.println("too high");
            System.out.println("Try again! \n");
        }
        }while (answer!=ch);
    }
}