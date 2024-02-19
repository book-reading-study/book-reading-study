package ch05.hjk.exercise;

public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker(){
        System.out.println("get TicketMaker instance");
    }

    public static TicketMaker getTicketMaker(){
        return ticketMaker;
    }

    public int getNextTicketNumber(){
        return ticket++;
    }
}
