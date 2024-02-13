package ch04.geonhee.practice.idcard;

import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._04_factory_method.practice.framework.Product;

public class IdCard extends Product {

    private String owner;
    private int serial;

    IdCard(String owner, int serial) {
        System.out.println(owner + "의 카드를 " + serial + "번으로 만듭니다.");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println(this + "를 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IdCard: " + owner + "(" + serial + ")]";
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
