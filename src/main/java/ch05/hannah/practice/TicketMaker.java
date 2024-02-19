package ch05.hannah.practice;

public class TicketMaker {

    private static int ticket = 1000;
    private static TicketMaker ticketMaker = new TicketMaker();
    private TicketMaker() {
    }

    public static TicketMaker getNextTicketNumber() {
        System.out.printf("ticket number is %d\n", ticket);
        ticket++;
        return ticketMaker;
    }
}
