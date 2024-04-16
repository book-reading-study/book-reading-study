package ch15.hjk.practice;

import ch15.hjk.practice.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        // 문제 15-1
        // PageMaker 접근지정자만 public으로 하고 다른 클래스 접근지정자는 default로 한다.

        // 문제 15-2
        PageMaker.makeLinkPage("linkpage.html");

       // 문제 15-3
        String html = """
                <!DOCTYPE html>
                <html>
                    <head>
                    </head>
                    <body>
                    </body>
                </html>
                """;
        System.out.println(html);
    }
}
