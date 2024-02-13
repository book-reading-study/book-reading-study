package ch04.geonhee.example.idcard;

import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._04_factory_method.example.framework.Factory;
import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._04_factory_method.example.framework.Product;

public class IdCardFactory extends Factory {

    @Override
    protected Product createProduct(String owner) {
        return new IdCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "를 등록했습니다.");
    }
}
