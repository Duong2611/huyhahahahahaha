package hus.oop.lab12.mylist;

public class MyArrayListIterator implements MyIterator {
    private Object[] data;
    private int currentPosition;

    public MyArrayListIterator(Object[] data) {
        this.data = data;
        this.currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        if (currentPosition >= data.length || data[currentPosition] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new IllegalStateException("No next element");
        }
        return data[currentPosition++];
    }
}
