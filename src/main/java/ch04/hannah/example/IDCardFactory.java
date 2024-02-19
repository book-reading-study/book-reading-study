package ch04.hannah.example;

import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {

    Map<Long, String> ownerBySrl = new HashMap<>();

    @Override
    protected Product createProduct(String owner) {
        System.out.println("IDCardFactory: creating IDCard");
        Long srl = System.currentTimeMillis();
        ownerBySrl.put(srl, owner);
        return new IDCard(owner, srl);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println("IDCardFactory: register IDCard: " + product);
    }

    public void printOwnerBySrl() {
        ownerBySrl.forEach((srl, owner) -> System.out.println("srl: " + srl + "owner: " + owner));
    }

}
