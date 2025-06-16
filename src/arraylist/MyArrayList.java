public class MyArrayList<T> implements MyList<T> {
    private Object[] data;
    private int size;

    public MyArrayList() {
        data = new Object[10];
        size = 0;
    }

    @Override public void add(T item) {}
    @Override public void set(int index, T item) {}
    @Override public void add(int index, T item) {}
    @Override public void addFirst(T item) {}
    @Override public void addLast(T item) {}
    @Override public T get(int index) { return null; }
    @Override public T getFirst() { return null; }
    @Override public T getLast() { return null; }
    @Override public void remove(int index) {}
    @Override public void removeFirst() {}
    @Override public void removeLast() {}
    @Override public void sort() {}
    @Override public int indexOf(Object object) { return -1; }
    @Override public int lastIndexOf(Object object) { return -1; }
    @Override public boolean exists(Object object) { return false; }
    @Override public Object[] toArray() { return null; }
    @Override public void clear() {}
    @Override public int size() { return size; }

    @Override
    public java.util.Iterator<T> iterator() {
        return null;
    }
}
