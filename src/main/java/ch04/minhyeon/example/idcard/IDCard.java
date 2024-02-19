package ch04.minhyeon.example.idcard;

import ch04.minhyeon.example.framework.Product;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner){
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {

    }

    @Override
    public String toString() {
        return "IDCard{" +
                "owner='" + owner + '\'' +
                '}';
    }

    public String getOwner(){
        return owner;
    }
}
