package Lab7;

import java.util.Arrays;

/**
 * Created by fatima on 06/03/2021.
 */
public class TestLinkedStack {
    public static void main(String[] args) {
        System.out.println("reverse array elements using stack\n");
        LinkedStack<Integer>stack= new LinkedStack<>();
        int[]arr={1,2,3,4,5};
        System.out.println("array elements before reverse");

        System.out.println(Arrays.toString(arr)+"\n\n");
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=stack.pop();

        }
        System.out.println("array element after reverse");
        System.out.println(Arrays.toString(arr));

    }
}
