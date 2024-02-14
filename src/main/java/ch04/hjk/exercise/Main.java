package ch04.hjk.exercise;

public class Main {
    public static void main(String[] args) {
        // 문제 4-1
        // IDCardFactory 에서만 IDCard를 만들 수 있게 하려고 샘성자를 default 레벨로 함

        // 문제 4-2
        Factory factory = new ImprovedIDCardFactory();
        Product p1 = factory.create("hello");
        Product p2 = factory.create("hello");
        Product p3 = factory.create("hello");
        p1.use();
        p2.use();
        p3.use();

        // 문제 4-3:
        // 불가능: 하위클래스에서 Product 이름으로 생성자를 만들 수 없어서
    }
}
