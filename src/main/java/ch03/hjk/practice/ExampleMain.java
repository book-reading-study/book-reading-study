package ch03.hjk.practice;

import ch03.hjk.example.AbstractDisplay;
import ch03.hjk.example.CharDisplay;
import ch03.hjk.example.StringDisplay;

public class ExampleMain {

    public static void main(String[] args) {

        AbstractDisplay d1 = new CharDisplay('h');
        AbstractDisplay d2 = new StringDisplay("hello");

        d1.display();
        d2.display();

    }
}
