package ch13.hjk.practice;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
