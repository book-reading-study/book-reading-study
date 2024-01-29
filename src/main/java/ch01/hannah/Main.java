//package ch01.hannah;
//
//import java.util.Iterator;
//
//public class Main {
//    public static void main(String[] args) {
//        BookShelf bookShelf = new BookShelf(4);
//        bookShelf.appendBook(new Book("java book"));
//        bookShelf.appendBook(new Book("python book"));
//        bookShelf.appendBook(new Book("kotlin book"));
//        bookShelf.appendBook(new Book("c++ book"));
//        bookShelf.appendBook(new Book("dart book"));
//        bookShelf.appendBook(new Book("c# book"));
//
//        Iterator<Book> it = bookShelf.iterator();
//
//        while(it.hasNext()) {
//            System.out.println(it.next().getName());
//        }
//
//        System.out.println("---for---");
//
//        for (Book book: bookShelf) {
//            System.out.println(book.getName());
//        }
//
//    }
//}