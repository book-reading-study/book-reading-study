package ch07.hjk.example;

public class Main{
    public static void main(String[] args) {
        if(args.length != 1){
            usage();
            System.exit(0);
        }
        if(args[0].equals("text")){
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getTextResult();
            System.out.println(result);
        }else if(args[0].equals("html")){
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String result = htmlBuilder.getHTMLResult();
            System.out.println("file: " + result);
        }else{
            usage();
            System.exit(0);
        }
    }

    private static void usage() {
        System.out.println("Usage: java Main text");
        System.out.println("Usage: java Main html");
    }
}
