package ch03.hannah;

public class main {
    public static void main(String[] args) {

        Displayable display1 = new CharDisplay('A');
        Displayable display2 = new StringDisplay("ABCDE");

        display1.display();
        display2.display();
    }

}
