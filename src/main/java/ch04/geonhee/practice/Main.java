package ch04.geonhee.practice;

import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._04_factory_method.practice.framework.Factory;
import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._04_factory_method.practice.framework.Product;
import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._04_factory_method.practice.idcard.IdCardFactory;

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
