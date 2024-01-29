package ch01.hjk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ImproveBookShelf implements Iterable<Book>{
    // Type 을 List 로 변경
    private List<Book> books;

    public ImproveBookShelf() {
        this.books = new ArrayList<>();
    }

    public Book getBookAt(int index){
        return books.get(index);
    }

    public void appendBook(Book book){
        this.books.add(book);
    }

    public int getLength(){
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }
}
