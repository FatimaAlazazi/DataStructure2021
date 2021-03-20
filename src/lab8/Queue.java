package lab8;

/**
 * Created by fatima on 12/03/2021.
 */
public interface Queue<E> {
    boolean isEmpty();
    int size();
    E first();
    void enqueue(E element);
    E dequeue();
}
