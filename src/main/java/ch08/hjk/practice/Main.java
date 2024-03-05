package ch08.hjk.practice;

import ch08.hjk.example.factory.Factory;
import ch08.hjk.example.factory.Link;
import ch08.hjk.example.factory.Page;
import ch08.hjk.example.factory.Tray;

public class Main {
    public static void main(String[] args) {
        // 8-1
        // tray 필드가 private면 하위 클래스에서 직접적으로 사용할 수 없다.(Tray 클래스에 getter같은 걸 만들어줘야 한다)
        // 캡슐화를 지킬 수 있는 장점은 있다.

        // 8-2
        // ch08.hjk.example.factory 에 추상메소드 추가하고 NaverPage 클래스 추가하였음
        // 링크를 넣는 건 기존 ListLink와 ListTray를 그대로 사용해서 url을 naver로 넘기는 식으로 해야 할 것 같음

        // 8-3
        // 생성자는 상속이 안 되니까 상위클래스의 생성자와 인수 개수가 같은 생성자를 임의로 만들어주기 위해서
        // 생성자를 안 만들면 컴파일 에러가 남

        // 8-4
        // 페이지를 만드는 역할과 Item을 모으는 역할을 분리하기 위해서
    }
}
