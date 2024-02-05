package ch03.hjk.example;

public class TemplateMethodMain {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('h');

        AbstractDisplay d2 = new StringDisplay("hello, world");

        d1.display();
        d2.display();

    }
}
