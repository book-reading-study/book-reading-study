package ch03.hjk.example03;

import ch03.hjk.example.AbstractDisplay;
import ch03.hjk.example.CharDisplay;

public class OutsideMain {
    public static void main(String[] args) {
        // access modifier test
        AbstractDisplay d1 = new CharDisplay('h');
        AbstractDisplay d2 = new OutsideCharDisplay();

        //d1.open(); // error
        //d1.print(); // error
        d1.close(); // run
        d1.display(); // run

        d2.display(); // run

    }
}
