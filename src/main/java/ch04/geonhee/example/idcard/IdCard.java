package ch04.geonhee.example.idcard;

import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._04_factory_method.example.framework.Product;

public class IdCard extends Product {

    private String owner;

    IdCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "를 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IdCard: " + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
