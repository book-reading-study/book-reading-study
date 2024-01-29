package ch01.hjk;

import java.util.Iterator;

public class IteratorMain {

    public static void main(String[] args) {
        testImproveIterator();
    }

    public static void testImproveIterator(){
        // 책장 만들기
        ImproveBookShelf bookShelf = new ImproveBookShelf();
        bookShelf.appendBook(new Book("first"));
        bookShelf.appendBook(new Book("second"));
        bookShelf.appendBook(new Book("third"));
        bookShelf.appendBook(new Book("fourth"));

        System.out.println("1. 명시적으로 Iterator 사용하기");
        Iterator<Book> it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = it.next();
            System.out.println(book.getName());
        }

        System.out.println("2. 확장 for문을 사용하기");
        for(Book book : bookShelf){
            System.out.println(book.getName());
        }
    }

    public static void testIterator(){
        // 책장 만들기
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("first"));
        bookShelf.appendBook(new Book("second"));
        bookShelf.appendBook(new Book("third"));
        bookShelf.appendBook(new Book("fourth"));

        // 1. 명시적으로 Iterator 사용하기
        Iterator<Book> it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = it.next();
            System.out.println(book.getName());
        }

        // 2. 확장 for문을 사용하기
        for(Book book : bookShelf){
            System.out.println(book.getName());
        }
    }
}