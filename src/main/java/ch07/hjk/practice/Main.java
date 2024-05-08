package ch07.hjk.practice;

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
        }else if(args[0].equals("list")){
            // 연습문제 7-3
            ListBuilder listBuilder = new ListBuilder();
            Director director = new Director(listBuilder);
            director.construct();
            String result = listBuilder.getListResult();
            System.out.println("list: " + result);
        }else{
            usage();
            System.exit(0);
        }

        // 7-4: String에 계속 문자열을 +로 합치면 합칠 때마다 새로운 인스턴스를 생성하게 되는데, StringBuilder를 사용하면 이를 방지할 수 있음
    }

    private static void usage() {
        System.out.println("Usage: java Main text");
        System.out.println("Usage: java Main html");
    }
}
