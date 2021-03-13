package Lab7;
import java.util.Arrays;
import java.util.Stack;
/**
 * Created by fatima on 06/03/2021.
 */
public class UseJavaStack {
    public static void main(String[] args) {
        Stack<Integer>stack= new Stack<>();
        System.out.println("reverse array elements using java.util.stack\n");
        int[]arr={1,2,3,4,5,6,7,8,9,10,11};
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
