package ch04.hannah.example;

public abstract class Factory {
    public Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    abstract protected Product createProduct(String owner);
    abstract protected void registerProduct(Product owner);

}
