package ch12.hjk.practice;

public class Main2 {
    public static void main(String[] args) {
        MultiStringDisplay md = new MultiStringDisplay();

        md.add("Hi!");
        md.add("Good Morning");
        md.add("Good Night");
        md.show();

        Display d1 = new SideBorder(md, '#');
        Display d2 = new FullBorder(md);

        d1.show();
        d2.show();
    }
}
