package ch01.geonhee.practice;

import java.util.Iterator;

public class App {

    /**
     * 연습문제 : 책장 크기를 넘으면 예외가 발생하지 않고, 책을 추가 가능 하도록 만들기
     */
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("오브젝트"));
        bookShelf.appendBook(new Book("대용량 트레픽을 처리하는 기술"));
        bookShelf.appendBook(new Book("스즈메의 문단속"));
        bookShelf.appendBook(new Book("해리포터"));
        bookShelf.appendBook(new Book("해리포터2"));

        Iterator<Book> it = bookShelf.iterator();
        // 방법 1 : 명시적 처리
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println("book = " + book.getName());
        }
        System.out.println();

        bookShelf.appendBook(new Book("해리포터3"));

        // 방법 2 : 내부적으로 Iterator 를 사용해서 처리함
        for (Book book : bookShelf) {
            System.out.println("book = " + book.getName());
        }
    }
}
