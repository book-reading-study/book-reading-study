package ch17.hjk.practice;

import ch17.hjk.example.*;

public class Main {
    public static void main(String[] args) {
        // 문제 17-1
        NumberGenerator generator = new IncrementalNumberGenerator(10, 50, 5);
        Observer obs1 = new DigitObserver();
        Observer obs2 = new GraphObserver();
        // 문제 17-2
        Observer obs3 = new OddObserver();

        generator.addObserver(obs1);
        generator.addObserver(obs2);
        generator.addObserver(obs3);
        generator.execute();
    }
}
