package ch03.hannah;

public class StringDisplay implements Displayable {

    private String displayedStr;
    public StringDisplay(String displayedStr) {
        this.displayedStr = displayedStr;
    }

    @Override
    public void open() {
        System.out.println("---STRING----");
    }

    @Override
    public void print() {
        System.out.println(displayedStr);
    }

    @Override
    public void close() {
        System.out.println("---CHAR----");
    }
}
