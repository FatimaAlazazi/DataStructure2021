package lab6;

/**
 * Created by fatima on 20/02/2021.
 */
public class TestCircularly {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> list= new CircularlyLinkedList<>();
        list.addFirst(11);
        list.addLast(12);
        list.addLast(13);
        int n=list.size();
        System.out.println("elements of circularly linked list without remove any element are: ");
        for (int i = 0; i <n ; i++) {
            System.out.println(list.first());
            list.rotate();
        }
        System.out.println("size of list= "+list.size());
    }
}
