package ch13.hjk.example;

import ch07.hjk.example.Director;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
