package ch09.hjk.practice;

import java.util.Random;

public class RandomDisplay extends Display{
    private static Random random = new Random();

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times){
        open();
        int value = random.nextInt(times);
        for(int i = 0 ; i < value ; i++){
            print();
        }
        close();
    }
}
