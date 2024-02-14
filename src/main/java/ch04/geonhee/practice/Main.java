package ch04.geonhee.practice;

import ch04.geonhee.practice.framework.Factory;
import ch04.geonhee.practice.framework.Product;
import ch04.geonhee.practice.idcard.IdCardFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IdCardFactory();
        Product card1 = factory.create("A");
        Product card2 = factory.create("B");
        Product card3 = factory.create("C");

        card1.use();
        card2.use();
        card3.use();
    }
}
