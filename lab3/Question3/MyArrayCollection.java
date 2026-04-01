package lab3.Question3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayCollection<T> implements MyCollection<T> {

    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayCollection() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public boolean add(T element) {
        ensureCapacity();
        elements[size++] = element;
        return true;
    }

    @Override
    public boolean remove(T element) {
        for (int i = 0; i < size; i++) {
            if ((elements[i] == null && element == null) ||
                (elements[i] != null && elements[i].equals(element))) {

                // сдвиг элементов влево
                for (int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                }

                elements[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if ((elements[i] == null && element == null) ||
                (elements[i] != null && elements[i].equals(element))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            Object[] newArr = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArr, 0, elements.length);
            elements = newArr;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {

        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < size;
        }

        @Override
        @SuppressWarnings("unchecked")
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return (T) elements[current++];
        }
    }
}
