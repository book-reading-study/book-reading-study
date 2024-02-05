package ch03.hjk.practice;

public interface AbstractDisplay {
    public void open();
    public void print();
    public void close();

    // final로 설정못함
    public default void display(){
        open();
        for(int i = 0 ; i < 5 ; i++){
            print();
        }
        close();
    }
}
