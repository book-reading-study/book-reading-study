package ch01.hjk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * BookShelf class 검색을 실행
 * ConcreteIterator 역할을 함
 */
public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf; // 반복 대상인 bookShelf를 전달받음
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Book next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
