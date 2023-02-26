import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf(4);
        // 책장에 4개 만큼의 공간이 있다.
        bookShelf.appendBook(new Book("AAA"));
        bookShelf.appendBook(new Book("BBB"));
        bookShelf.appendBook(new Book("CCC"));
        bookShelf.appendBook(new Book("DDD"));

        Iterator<Book> iter = bookShelf.iterator();
        while(iter.hasNext()) {
            Book book = iter.next();
            System.out.println(book.getName());
        }

        for(Book b : bookShelf) {
            System.out.println(b.getName());
        }

        Properties props = null;

        InputStream
    }
}
