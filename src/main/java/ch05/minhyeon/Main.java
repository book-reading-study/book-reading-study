package ch05.minhyeon;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            TicketMaker ticketMaker = TicketMaker.getInstance();
            System.out.println(ticketMaker.getNextTicketNumber());
        }

    }
}
