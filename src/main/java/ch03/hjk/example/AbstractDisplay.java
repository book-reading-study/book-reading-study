package ch03.hjk.example;

public abstract class AbstractDisplay {
    // 연습문제 2 접근제어자 설정 -> protected로 변경
    protected abstract void open();
    protected abstract void print();
    public abstract void close();

    // AbstractDisplay에서 구현하는 메소드
    // 로직 알고리즘을 명세하는 템플릿 역할을 한다.
    // final이라서 하위 클래스에서 재정의를 못한다.(연습문제 3-2)
    public final void display(){
        open();
        for(int i = 0 ; i < 5 ; i++){
            print();
        }
        close();
    }
}
