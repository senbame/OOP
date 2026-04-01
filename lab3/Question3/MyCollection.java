package lab3.Question3;

import java.util.Iterator;

public interface MyCollection<T> extends Iterable<T> {

    boolean add(T element);

    boolean remove(T element);

    boolean contains(T element);

    int size();

    boolean isEmpty();

    void clear();

    Iterator<T> iterator();
}
