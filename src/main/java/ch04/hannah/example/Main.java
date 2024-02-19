package ch04.hannah.example;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product product1 = factory.create("hannah");
        product1.use();

        Product product2 = factory.create("sarah");
        product2.use();

    }
}
