package ch09.hjk.example;

/**
 * 인터페이스를 구현한 클래스
 */
public class StringDisplayImpl extends DisplayImpl{
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.length();
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for(int i = 0 ; i < width ; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }

}
