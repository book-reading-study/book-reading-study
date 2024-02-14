package ch04.hjk.exercise;

import java.util.HashMap;
import java.util.Map;

public class ImprovedIDCardFactory extends Factory{
    Map<Integer, String> map = new HashMap<>();
    private static int serialNumber = 1000;

    @Override
    protected Product createProduct(String owner) {
        map.put(serialNumber, owner);
        return new ImprovedIDCard(owner, serialNumber++);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "를 등록하였습니다.");
    }
}
