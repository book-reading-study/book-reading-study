package ch09.hjk.practice;

public class RepeatDisplay extends Display{
    public RepeatDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void repeatDisplay(int times){
        for(int i = 0 ; i < times ; i++){
            open();
            for(int j = -1 ; j < i ; j++){
                print();
            }
            close();
        }
    }
}
