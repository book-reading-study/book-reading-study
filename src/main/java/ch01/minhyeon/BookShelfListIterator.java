package ch01.minhyeon;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfListIterator implements Iterator<Book> {
    private BookShelfList bookShelfList;
    private int index;


    public BookShelfListIterator(BookShelfList bookShelf) {
        this.bookShelfList = bookShelf;
        this.index = 0;
    }


    @Override
    public boolean hasNext() {
        if (index < bookShelfList.getLength()) {
            return true;
        }
        return false;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = bookShelfList.getBookAt(index);
        index++;
        return book;
    }
}
