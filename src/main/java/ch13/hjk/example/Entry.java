package ch13.hjk.example;

// Entry 클래스를 Visitor 패턴에 맞추기 위해서 Element를 구현함
public abstract class Entry implements Element {
    public abstract String getName();
    public abstract int getSize();

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
