package ch05.hannah.practice;

public class Main {

    public static void main(String[] args) {
        // 5-1
        TicketMaker.getNextTicketNumber();
        TicketMaker.getNextTicketNumber();
        TicketMaker.getNextTicketNumber();
        TicketMaker.getNextTicketNumber();

        // 5-2
        Triple alpha = Triple.getInstance("ALPHA");
        System.out.printf("the name of the instance is %s\n", alpha.getName());
    }

}
