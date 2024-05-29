package ch21.hjk.practice;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Printable p = new PrinterProxy("Alice", "ch21.hjk.practice.Printer");
        System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");

        p.setPrinterName("Bob");
        System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");

        p.print("Hello, world");

        // 21-2: synchronized를 붙이지 않았을 경우, real을 초기화하는 동안 다른 스레드에서 print()를 수행했을 때, name의 값이 real에 다르게 저장될 수 있다.
    }
}
