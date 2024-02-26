package ch04.minhyeon.example.idcard;

import ch04.minhyeon.example.framework.Factory;
import ch04.minhyeon.example.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product +"을 등록했습니다.");
    }
}
