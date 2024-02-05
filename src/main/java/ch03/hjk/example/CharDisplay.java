package ch03.hjk.example;

// ConcreteClass 역할
// character 출력하는 역할을 함
public class CharDisplay extends AbstractDisplay{

    private char ch; // 표시해야 하는 문자

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    protected void open() {
        System.out.print("<<");
    }

    @Override
    protected void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }


}
