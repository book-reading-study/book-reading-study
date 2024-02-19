package ch05.hannah.example;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("create singleton instance");
    }

    public static Singleton getInstance() {
        System.out.println("get singleton instance");
        return singleton;
    }
}
