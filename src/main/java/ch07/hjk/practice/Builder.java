package ch07.hjk.practice;

// 문서를 규정하는 클래스
// 문제 7-1 인터페이스로 변경
public interface Builder {
    public void makeTitle(String title);
    public void makeString(String str);
    public void makeItems(String[] items);
    public void close();

}
