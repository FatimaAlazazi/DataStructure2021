package lab8;

import lab6.CircularlyLinkedList;

/**
 * Created by fatima on 09/07/2020.
 */
public class CircQueueImp<E> implements CircularQueue<E> {
 private CircularlyLinkedList<E> list= new CircularlyLinkedList<E>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E first() {
        return list.first();
    }

    @Override
    public void enqueue(E e) {
list.addLast(e);
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }

    @Override
    public void rotate() {
list.rotate();
    }
}
