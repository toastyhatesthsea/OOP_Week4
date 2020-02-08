public interface Iterator<G> {

    void resetIterator();

    G nextItem();

    G currentItem();

    boolean hasNext();
}

