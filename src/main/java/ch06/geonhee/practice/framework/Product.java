package ch06.geonhee.practice.framework;

public abstract class Product implements Cloneable {

    protected Product createCopy() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.getStackTrace();
        }
        return product;
    }

    public abstract void use(String s);
}
