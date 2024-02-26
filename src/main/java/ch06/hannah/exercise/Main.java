package ch06.hannah.exercise;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        UnderLinePen underLinePen = new UnderLinePen("_");
        MessageBox starBox = new MessageBox("*");
        MessageBox slashBox = new MessageBox("/");

        manager.register("under line", underLinePen);
        manager.register("star box", starBox);
        manager.register("slash box", slashBox);

        Product p1 = manager.create("under line");
        p1.use("hannah");
        Product p2 = manager.create("star box");
        p2.use("hannah2");
        Product p3 = manager.create("slash box");
        p3.use("hannah3");

    }
}
