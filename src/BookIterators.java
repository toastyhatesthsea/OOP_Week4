public class BookIterators implements Iterator<Book>{

    private int current;
    private Book[] books;

    public BookIterators(Book[] books) {
        this.books = books;
        current = 0;
    }

    @Override
    public void resetIterator() {
        current = 0;
    }

    @Override
    public Book nextItem() {
        return books[current++];
    }

    @Override
    public Book currentItem() {
        return books[current];
    }

    @Override
    public boolean hasNext() {
        if (current < books.length) {
            return true;
        } else {
            return false;
        }
    }
}
