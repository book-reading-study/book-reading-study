package ch04.geonhee.practice.idcard;

import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._04_factory_method.practice.framework.Factory;
import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._04_factory_method.practice.framework.Product;

public class IdCardFactory extends Factory {

    private int serial = 100;



    @Override
    protected synchronized Product createProduct(String owner) {
        return new IdCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "를 등록했습니다.");
    }
}
