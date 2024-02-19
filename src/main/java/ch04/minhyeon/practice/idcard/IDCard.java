package ch04.minhyeon.practice.idcard;

import ch04.minhyeon.practice.framework.Product;

public class IDCard extends Product {
    private String owner;
    private long idNumber;
    IDCard(String owner , long idNumber){
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
        this.idNumber = idNumber;
    }

    @Override
    public void use() {

    }

    @Override
    public String toString() {
        return "IDCard{" +
                "owner='" + owner + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }

    public String getOwner(){
        return owner;
    }
}
