package ch01.minhyeon;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.useIterator();
        try {
            main.practice1_error();

        }catch (Exception e){

            System.out.println("====practice1_arrayList Exception===");
            System.out.println(e);

        }
        main.practice1_arrayList();
        main.useIterator();

    }


    void useIterator(){

        System.out.println("====useIterator START===");

        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-long-Legs"));

        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        //확장 for문을 사용하는 방법
        for(Book book: bookShelf){
            System.out.println(book.getName());
        }
        System.out.println();

        System.out.println("====useIterator End===");

    }

  
    void practice1_error(){
        System.out.println("====practice1_arrayList START===");

        //given
        BookShelf bookShelf = new BookShelf(4);

        //then
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-long-Legs"));
        bookShelf.appendBook(new Book("Error File")); // 에러 발생

        System.out.println("====practice1_arrayList END===");
        
    }

    
    void practice1_arrayList(){
        System.out.println("====practice1_arrayList START===");

        //given
        BookShelfList bookShelfList = new BookShelfList(4);

        //then
        bookShelfList.appendBook(new Book("Around the World in 80 Days"));
        bookShelfList.appendBook(new Book("Bible"));
        bookShelfList.appendBook(new Book("Cinderella"));
        bookShelfList.appendBook(new Book("Daddy-long-Legs"));
        bookShelfList.appendBook(new Book("Error Book"));
        bookShelfList.appendBook(new Book("Error Book2"));
        bookShelfList.appendBook(new Book("Error Book3"));


        Iterator<Book> it = bookShelfList.iterator();
        while (it.hasNext()){
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        //확장 for문을 사용하는 방법
        for(Book book: bookShelfList){
            System.out.println(book.getName());
        }
        System.out.println();

        System.out.println("====practice1_arrayList End===");

    }
}
