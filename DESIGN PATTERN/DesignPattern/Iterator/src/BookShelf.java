import java.util.Iterator;

public class BookShelf implements Iterable<Book>{

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books  = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    // iterable 인터페이스에서 iterator 를 생성하는 추상메소드를 오버라이딩해 사용할 수 있다.
    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
