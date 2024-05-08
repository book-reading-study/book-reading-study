package ch07.hjk.example;

// 문서를 규정하는 클래스
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();

}
