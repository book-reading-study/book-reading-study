package ch09.hjk.practice;

public class RepeatCharacterDisplayImpl extends DisplayImpl{
    String start;
    String end;
    String character;

    public RepeatCharacterDisplayImpl(String start, String end, String character){
        this.start = start;
        this.end = end;
        this.character = character;
    }

    @Override
    public void rawOpen() {
        System.out.print(start);
    }

    @Override
    public void rawPrint() {
        System.out.print(character);
    }

    @Override
    public void rawClose() {
        System.out.println(end);
    }
}
