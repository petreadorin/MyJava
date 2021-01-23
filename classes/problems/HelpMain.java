package classes.problems;

public class HelpMain {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore;
        Help helpobj = new Help();      //implement helpobj as an instance of the Help class

        for ( ; ; ) {
            do {
                helpobj.showMenu();    //acceses the showMenu method from Help class

                choice = (char) System.in.read();  //input a choice

                do {
                    ignore = (char) System.in.read();
                }
                while (ignore != '\n');

            }
            while (!helpobj.isValid(choice));       //acceses the !argument choice with the isValid method

            if (choice == 'q')                      //q value of the choice argument
                break;

            System.out.println("\n");

            helpobj.helpOn(choice);                 //inputed choice argument of the helpOn method
        }
    }
}
