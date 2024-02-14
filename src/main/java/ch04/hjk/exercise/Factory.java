package ch04.hjk.exercise;

// 제품 생성 역할을 맡은 추상 클래스
// Template Method 패턴을 사용함
public abstract class Factory {
    // 로직을 명세하고 세부 구현은 하위클래스에 위임함
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
