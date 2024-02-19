package ch03.hannah;

public class CharDisplay implements Displayable{

    public char displayedChar;

    public CharDisplay(char displayedChar) {
        this.displayedChar = displayedChar;
    }

    @Override
    public void open() {
        System.out.println("---CHAR----");
    }

    @Override
    public void print() {
        System.out.println("A");
    }

    @Override
    public void close() {
        System.out.println("---END---");
    }
}
