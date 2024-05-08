package ch07.hjk.practice;

// Builder 클래스 사용해서 문서를 만듦
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        // 문제 7-2 construct 메소드 수정하기
        builder.makeTitle("hello world");
        builder.makeString("programming language");
        builder.makeItems(new String[]{
                "java",
                "c++",
                "python"
        });
        builder.makeString("hello html");
        builder.makeItems(new String[]{
                "text",
                "box",
                "input"
        });
        builder.close();
    }
}
