package ch17.hjk.practice;

import ch17.hjk.example.NumberGenerator;
import ch17.hjk.example.Observer;

/**
 * 홀수일 때만 출력
 */
public class OddObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        if(generator.getNumber() % 2 == 1){
            System.out.println("OddObserver: " + generator.getNumber() );
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
