package classes.problems;

//Create a function, taking a positive integer as its parameter and returning a String containing its Roman numeral.
public class RomanNumeral {
    int a;

    RomanNumeral(int x) {
        a = x;
    }

    String transform(int x) {
        String s = "";
        while (x >= 1000) {
            s += "M";
            x -= 1000;
        }
        while (x >= 900) {
            s += "CM";
            x -= 900;
        }

        while (x >= 500) {
            s += "D";
            x -= 500;
        }

        while (x >= 400) {
            s += "CD";
            x -= 400;
        }

        while (x >= 100) {
            s += "C";
            x -= 100;
        }

        while (x >= 90) {
            s += "XC";
            x -= 90;
        }

        while (x >= 50) {
            s += "L";
            x -= 50;
        }

        while (x >= 40) {
            s += "XL";
            x -= 40;
        }

        while (x >= 10) {
            s += "X";
            x -= 10;
        }

        while (x >= 9) {
            s += "IX";
            x -= 9;
        }

        while (x >= 5) {
            s += "V";
            x -= 5;
        }

        while (x >= 4) {
            s += "IV";
            x -= 4;
        }

        while (x >= 1) {
            s += "I";
            x -= 1;
        }
        return s;
    }
}
