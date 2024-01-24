package ch01.minhyeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelfList implements Iterable<Book> {
    private List<Book> books;
    private int last = 0;

    public BookShelfList(int maxsize) {
        this.books = new ArrayList(maxsize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfListIterator(this);
    }
}
