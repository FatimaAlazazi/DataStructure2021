package Lab7;

/**
 * Created by fatima on 06/03/2021.
 */
public interface Stack<E> {
    boolean isEmpty();
    int size();
    E top();
    void push(E element);
    E pop();
}
