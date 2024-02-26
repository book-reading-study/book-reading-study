package ch07.geonhee.practice;

public interface Builder {

    void makeTitle(String title);

    void makeString(String string);

    void makeItems(String[] items);

    void close();
}
