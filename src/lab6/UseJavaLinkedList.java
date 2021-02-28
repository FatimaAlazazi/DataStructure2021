package lab6;
import java.util.LinkedList;
/**
 * Created by fatima on 28/02/2021.
 */
public class UseJavaLinkedList {
    public static void main(String[] args) {
        //how to use linked list class from java.utility package
       LinkedList<String> list= new LinkedList<>();
        list.addLast("First");
        list.addLast("Second");
        list.addLast("Third");
        int n=list.size();
        System.out.println("elements of linked list in reverse order are :");
        for (int i = 0; i <n ; i++) {
            System.out.println(list.removeLast());
        }


    }
}
