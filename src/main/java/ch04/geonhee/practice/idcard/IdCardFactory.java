package ch04.geonhee.practice.idcard;


import ch04.geonhee.practice.framework.Factory;
import ch04.geonhee.practice.framework.Product;

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
