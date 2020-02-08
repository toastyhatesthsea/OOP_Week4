public class FunFunTests {
    public static void main(String[] asdpasdlasd) {
        Book[] aBooks = new Book[3];


        aBooks[0] = new Book("Harry Potter");
        aBooks[1] = new Book("Bible");
        aBooks[2] = new Book("Coloring Book");

        List<Book> aList = new BookLists(aBooks);

        Iterator<Book> aIterator = aList.iterator();
        while (aIterator.hasNext()) {
            System.out.println(aIterator.currentItem().getBookName());
            aIterator.nextItem();
        }
    }
}
