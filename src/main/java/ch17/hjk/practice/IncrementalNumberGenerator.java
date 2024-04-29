package ch17.hjk.practice;

import ch17.hjk.example.NumberGenerator;

public class IncrementalNumberGenerator extends NumberGenerator {
    int start;
    int end;
    int weight;
    int number;

    public IncrementalNumberGenerator(int start, int end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for(int i = start ; i < end ; i+=weight){
            number = i;
            notifyObservers();
        }
    }
}
