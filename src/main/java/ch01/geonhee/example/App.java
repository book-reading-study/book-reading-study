package ch01.geonhee.example;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("오브젝트"));
        bookShelf.appendBook(new Book("대용량 트레픽을 처리하는 기술"));
        bookShelf.appendBook(new Book("스즈메의 문단속"));
        bookShelf.appendBook(new Book("해리포터"));

        Iterator<Book> it = bookShelf.iterator();
        // 방법 1 : 명시적 처리
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println("book = " + book.getName());
        }
        System.out.println();

        // 방법 2 : 내부적으로 Iterator 를 사용해서 처리함
        for (Book book : bookShelf) {
            System.out.println("book = " + book.getName());
        }
    }
}
