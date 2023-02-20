import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ArrayList {

    private Object[] array;
    private int size;
    private Lock lock = new ReentrantLock();

    public ArrayList() {
        lock.lock();
        try {
            array = new Object[10];
            size = 0;
        } finally {
            lock.unlock();
        }
    }

    public void add(Object o) {
        lock.lock();
        try {
            if (size == array.length) {
                Object[] newArray = new Object[array.length * 2];
                for (int i = 0; i < array.length; i++) {
                    newArray[i] = array[i];
                }
                array = newArray;
            }
            array[size] = o;
            size++;
        } finally {
            lock.unlock();
        }
    }

    public Object get(int index) {
        return array[index];
    }

    public void remove(int index) {
        lock.lock();
        try {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        } finally {
            lock.unlock();
        }
    }

    public int size() {
        return size;
    }

}