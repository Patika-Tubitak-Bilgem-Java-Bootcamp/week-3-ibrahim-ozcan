import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<T> {
    private Object[] list;
    private int firstEmptyIndex = 0;
    private int size = 0;

    public MyList() {
        this.list = new Object[10];
    }

    public MyList(int capacity) {
        this.list = new Object[capacity];
    }

    public int size() {
        return this.size;
    }

    public int getCapacity() {
        return this.list.length;
    }

    public void add(T value) {
        this.size++;
        if (this.size() == this.getCapacity()) {
            this.makeArrayDouble();
        }
        this.list[firstEmptyIndex++] = value;
    }

    private void makeArrayDouble() {
        this.list = Arrays.copyOf(this.list, this.size() * 2);
    }

    public T get(int index) {

        if (index >= 0 && index < this.size())
            return (T) this.list[index];
        return null;
    }

    public Object remove(int index) {
        if (index >= 0 && index < this.size()) {
            if (this.size() - 1 == index) this.list[index] = null;
            for (int i = index; i < this.size() - 1; i++) {
                this.list[i] = this.list[i + 1];
            }
            this.size--;
            this.firstEmptyIndex--;
        }
        return null;
    }

    public Object set(int index, T data) {
        if (index >= 0 && index < this.size()) {
            this.list[index] = data;
        }
        return null;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < this.firstEmptyIndex; i++) {
            str += this.list[i];
            if (i != this.firstEmptyIndex - 1)
                str += ", ";
        }
        str += "]";
        return str;
    }

    public int indexOf(T data) {

        for (int i = 0; i < this.size; i++) {
            if (this.list[i] == data)
                return i;
        }

        return -1;
    }

    public int lastIndexOf(T data) {

        for (int i = this.size - 1; i >= 0; i--) {
            if (this.list[i] == data)
                return i;
        }

        return -1;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public T[] toArray() {
        Object[] arr = new Object[this.size];
        for (int i = 0; i < this.size; i++) {
            arr[i] = this.list[i];
        }
        return (T[]) arr;
    }
    public void clear(){
        for (int i = 0; i < this.size; i++) {
            this.list[i] = null;
        }
        this.firstEmptyIndex=0;
        this.size=0;
    }

    public MyList<T> subList(int start, int finish) {
        int size = finish - start;
        MyList<T> newList = new MyList<>();
        for (int i = start; i <= finish; i++) {
            newList.add((T) this.list[i]);
        }
        return newList;
    }

    public boolean contains(T data) {
        return Arrays.stream(this.list).toList().stream().anyMatch(item -> item == data);
    }
}
