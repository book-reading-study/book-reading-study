package ch06.hjk.practice;

import ch06.hjk.practice.framework.ImplementsProduct;

// 문제 6-1 예제
public class MessageBox extends ImplementsProduct {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    // 문제 6-2 복사생성자 생성
    public MessageBox(MessageBox messageBox){
        this.decochar = messageBox.decochar;
    }

    @Override
    public void use(String s) {
        int decolen = 1 + s.length() + 1;
        for(int i = 0 ; i < decolen ; i++){
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + s + decochar);
        for(int i = 0 ; i < decolen ; i++){
            System.out.print(decochar);
        }
        System.out.println();
    }

}
