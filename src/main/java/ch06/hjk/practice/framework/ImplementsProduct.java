package ch06.hjk.practice.framework;

// 문제 6-1
// createCopy만 공통으로 재정의하는 추상 클래스를 하나 만든다.
public abstract class ImplementsProduct implements Product{
    @Override
    public Product createCopy() {
        Product p = null;
        try{
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
