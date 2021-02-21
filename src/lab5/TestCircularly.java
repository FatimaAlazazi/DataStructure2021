package lab5;

/**
 * Created by fatima on 20/02/2021.
 */
public class TestCircularly {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer>list= new CircularlyLinkedList<>();
        list.addFirst(11);
        list.addLast(12);
        list.rotate();
        System.out.println(list.first());
    }
}
