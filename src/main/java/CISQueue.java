import java.util.NoSuchElementException;

public class CISQueue<T> {

    private CISLinkedList<T> queue;

    public CISQueue(T v) {
        queue = new CISLinkedList<>(v);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.removeFirst();
    }

    public void enqueue(T data) {
        queue.addLast(data);
    }

    public T poll() {
        if (isEmpty()) {
            return null;
        }
        return queue.removeFirst();
    }

    @Override
    public String toString() {
        return queue.toString();
    }

}
