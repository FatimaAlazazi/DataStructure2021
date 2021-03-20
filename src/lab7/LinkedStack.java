package lab7;

import lab5.SinglyLinkedList;

/**
 * Created by fatima on 06/03/2021.
 */
public class LinkedStack<E> implements Stack<E> {
    private SinglyLinkedList<E>list= new SinglyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public void push(E element) {
        list.addFirst(element);

    }

    @Override
    public E pop() {
        return list.removeFirst();
    }
}
