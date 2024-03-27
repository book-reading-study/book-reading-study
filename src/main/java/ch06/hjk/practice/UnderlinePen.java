package ch06.hjk.practice;

import ch06.hjk.practice.framework.Product;

public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    // 문제 6-2 복사생성자 생성
    public UnderlinePen(UnderlinePen underlinePen){
        this.ulchar = underlinePen.ulchar;
    }

    @Override
    public void use(String s) {
        int ulen = s.length();
        System.out.println(s);
        for (int i = 0; i < ulen; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        // 6-2 문제
        return new UnderlinePen(this);
    }
}