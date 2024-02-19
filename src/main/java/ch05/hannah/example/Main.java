package ch05.hannah.example;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();

        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("same instance");
        } else {
            System.out.println("diffrent instance");
        }
    }
}
