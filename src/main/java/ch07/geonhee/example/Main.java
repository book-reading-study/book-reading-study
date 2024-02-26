package ch07.geonhee.example;

public class Main {

    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.geTextResult();
        System.out.println(result);
    }
}
