package Lab8;

/**
 * Created by fatima on 12/03/2021.
 */
public class TestLinkedQueue {
    public static void main(String[] args) {
        LinkedQueue<Integer>queue= new LinkedQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        while (!queue.isEmpty())
            System.out.println(queue.dequeue());
    }
}
