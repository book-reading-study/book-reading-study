package ch06.geonhee.example.framework;

public interface Product extends Cloneable {

    void use(String s);

    Product createCopy();
}
