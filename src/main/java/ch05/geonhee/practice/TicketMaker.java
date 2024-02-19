package ch05.geonhee.practice;

public class TicketMaker {

    private static TicketMaker ticketMaker = new TicketMaker();

    private int ticket;

    private TicketMaker() {
        this.ticket = 1000;
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
