package ch01.hjk;

import java.util.Iterator;

/**
 * 책장을 나타내는 클래스(책의 집합체)
 * Iterable\<Book\> 을 구현한다.
 * ConcreteAggregate 역할을 함
 */
public class BookShelf implements Iterable<Book> {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    /**
     *
     * @return BookShelfIterator
     */
    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}