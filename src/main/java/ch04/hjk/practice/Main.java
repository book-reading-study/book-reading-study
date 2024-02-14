package ch04.hjk.practice;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product product1 = factory.create("first");
        Product product2 = factory.create("second");
        Product product3 = factory.create("third");

        product1.use();
        product2.use();
        product3.use();
    }
}
