package ch03.geonhee.practice;

public interface AbstractDisplay {

    default void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

    void open();

    void print();

    void close();
}
