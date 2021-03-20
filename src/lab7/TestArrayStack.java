package lab7;

/**
 * Created by fatima on 06/03/2021.
 */
public class TestArrayStack {
    public static void main(String[] args) {
        ArrayStack<Integer> stack= new ArrayStack<>(3);
        stack.push(11);
        stack.push(12);
        stack.push(13);
       // System.out.println(stack.top());
        System.out.println("print stack elements");
        while (!stack.isEmpty())
            System.out.println(stack.pop());
      //  stack.push(14);

    }
}
