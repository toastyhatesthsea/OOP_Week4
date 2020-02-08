public class BookLists implements List<Book>{
    private Book[] books;

    public BookLists(Book[] books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterators(books);
    }
}
