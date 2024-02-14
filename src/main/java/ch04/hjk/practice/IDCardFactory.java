package ch04.hjk.practice;

public class IDCardFactory extends Factory{
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "를 등록하였습니다.");
    }
}
