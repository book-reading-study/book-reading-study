package ch04.geonhee.example.idcard;


import ch04.geonhee.example.framework.Factory;
import ch04.geonhee.example.framework.Product;

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
