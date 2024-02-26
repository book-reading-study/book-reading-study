package ch06.hannah.exercise;

public abstract class CopyProduct implements Product {

    protected String ch;

    CopyProduct(String ch) {
        this.ch = ch;
    }

    @Override
    public Product createCopy() {
        try {
            return (Product) clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}
