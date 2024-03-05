package ch09.hjk.practice;

public class Main {
    public static void main(String[] args) {
        // 문제 9-1
        RandomDisplay d1 = new RandomDisplay(new StringDisplayImpl("hello"));
        d1.randomDisplay(5);

        // 문제 9-2
        Display d2 = new Display(new TextFileDisplayImpl("src\\main\\java\\ch09\\hjk\\practice\\test.txt"));
        d2.display();

        // 문제 9-3
        RepeatDisplay d3 = new RepeatDisplay(new RepeatCharacterDisplayImpl("<", ">", "*"));
        d3.repeatDisplay(5);
    }
}
