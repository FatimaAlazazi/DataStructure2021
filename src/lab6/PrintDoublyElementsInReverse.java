package lab6;

/**
 * Created by fatima on 27/02/2021.
 */
public class PrintDoublyElementsInReverse {
    public static void main(String[] args) {
        DoublyLinkedList<String>list= new DoublyLinkedList<>();
        list.addLast("First");
        list.addLast("Second");
        list.addLast("Third");
        int n=list.size();
        System.out.println("elements of doubly linked list in reverse order are :");
        for (int i = 0; i <n ; i++) {
            System.out.println(list.removeLast());
        }

    }
}
