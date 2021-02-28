package lab5;

/**
 * Created by fatima on 20/02/2021.
 */
public class TestSingly {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list= new SinglyLinkedList<>();
        list.addFirst(11);
        list.addLast(12);
//        System.out.println(list.first());
//        System.out.println(list.last());
        int n=list.size();
        for (int i = 0; i <n ; i++) {
            System.out.println(list.removeFirst());

        }
    }
}
