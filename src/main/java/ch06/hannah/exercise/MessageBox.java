package ch06.hannah.exercise;

public class MessageBox extends CopyProduct {

    MessageBox(String ch) {
        super(ch);
    }

    MessageBox(MessageBox messageBox) {
        super(messageBox.ch);
    }


    @Override
    public void use(String s) {
        for (int i = 0; i < s.length() + 2; i++) {
            System.out.print(ch);
        }
        System.out.printf("\n%s%s%s\n", ch, s, ch);
        for (int i = 0; i < s.length() + 2; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

}
