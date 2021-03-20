package lab9;

import Lab8.CircQueueImp;

/**
 * Created by fatima on 13/07/2020.
 */
public class Josephus {
    public static void main(String[] args) {
        String[] a1={"a","b","c","d","e","f"};
        CircQueueImp<String> cq= new CircQueueImp<>();

        for (int i = 0; i < a1.length; i++) {
            cq.enqueue( a1[i]);
        }
        while (cq.size()>1){
         for(int i=0;i<2;i++)
             cq.rotate();
            System.out.println(cq.dequeue()+"is out");
        }
        System.out.println(" is winner   "+cq.dequeue());
    }
}
