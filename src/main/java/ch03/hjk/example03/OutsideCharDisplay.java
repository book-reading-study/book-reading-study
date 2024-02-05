package ch03.hjk.example03;

import ch03.hjk.example.AbstractDisplay;

// 연습문제 3번 예시
public class OutsideCharDisplay extends AbstractDisplay {
    // protected level은 access 가능하고 package는 안됨

    private char ch; // 표시해야 하는 문자

    public OutsideCharDisplay() {
        this.ch = 'o';
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
