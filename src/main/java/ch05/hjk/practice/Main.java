package ch05.hjk.practice;

public class Main {
    public static void main(String[] args) {
        // 1. 책 예제
        System.out.println("Start");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2){
            System.out.println("obj1과 obj2는 같은 인스턴스입니다.");
        }else{
            System.out.println("obj1과 obj2는 같은 인스턴스가 아닙니다.");
        }
        System.out.println("End");

        // 2. Enum Singleton 사용
        EnumSingleton.SINGLETON.hello();
    }
}
