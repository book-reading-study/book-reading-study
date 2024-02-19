package ch05.hjk.exercise;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        // 문제 5-1
        TicketMaker maker = TicketMaker.getTicketMaker();
        System.out.println("ticket number: " + maker.getNextTicketNumber());
        System.out.println("ticket number: " + maker.getNextTicketNumber());
        System.out.println("ticket number: " + maker.getNextTicketNumber());
        TicketMaker maker2 = TicketMaker.getTicketMaker();
        System.out.println("ticket number: " + maker2.getNextTicketNumber());
        System.out.println("ticket number: " + maker2.getNextTicketNumber());
        System.out.println("ticket number: " + maker2.getNextTicketNumber());

        // 문제 5-2
        Triple alpha = Triple.getInstance("ALPHA");
        System.out.println(alpha);
        Triple beta = Triple.getInstance("BETA");
        System.out.println(beta);
        Triple gamma = Triple.getInstance("GAMMA");
        System.out.println(gamma);

        // 문제 5-3
        // synchronized 안 되어서...

    }
}
