package ch06.hannah.exercise;

public class UnderLinePen extends CopyProduct {

    UnderLinePen(String ch) {
        super(ch);
    }

    UnderLinePen(UnderLinePen underLinePen) {
        super(underLinePen.ch);
    }


    @Override
    public void use(String s) {
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

}
