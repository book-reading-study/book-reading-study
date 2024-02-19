package ch04.minhyeon.practice.idcard;

import ch04.minhyeon.practice.framework.Factory;
import ch04.minhyeon.practice.framework.Product;

public class IDCardFactory extends Factory {
    private static long idNumber = 1;

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, idNumber++);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
