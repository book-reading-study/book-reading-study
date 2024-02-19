package ch05.geonhee.practice;

public class Main {

    public static void main(String[] args) {
        // TicketMaker
        for (int i = 0; i < 10; i++) {
            System.out.println(TicketMaker.getInstance().getNextTicketNumber());
        }

        System.out.println("----");

        // Triple - class 로 구현
        Triple a1 = Triple.getInstance("ALPHA");
        Triple b1 = Triple.getInstance("BETA");
        Triple c1 = Triple.getInstance("GAMMA");
        Triple a2 = Triple.getInstance("ALPHA");
        Triple b2 = Triple.getInstance("BETA");
        Triple c2 = Triple.getInstance("GAMMA");

        System.out.println("a1 == a2 : " + (a1 == a2));
        System.out.println("b1 == b2 : " + (b1 == b2));
        System.out.println("c1 == c2 : " + (c1 == c2));

        System.out.println("----");

        // Triple - enum 으로 구현
        Triple2 a1Enum = Triple2.getInstance("ALPHA");
        Triple2 b1Enum = Triple2.getInstance("BETA");
        Triple2 c1Enum = Triple2.getInstance("GAMMA");
        Triple2 a2Enum = Triple2.getInstance("ALPHA");
        Triple2 b2Enum = Triple2.getInstance("BETA");
        Triple2 c2Enum = Triple2.getInstance("GAMMA");

        System.out.println("a1 == a2 : " + (a1Enum == a2Enum));
        System.out.println("b1 == b2 : " + (b1Enum == b2Enum));
        System.out.println("c1 == c2 : " + (c1Enum == c2Enum));
    }
}
