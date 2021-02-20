package lab4;

import java.util.Arrays;

/**
 * Created by fatima on 14/02/2021.
 */
public class Pair<A,B> {
    A first;
    B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public static void main(String[] args) {
     Pair<String,Integer> p= new Pair<>("book1",12);
        String s= p.getFirst();
        int x =p.getSecond();
        System.out.println(s+"  "+x);
        Pair<Integer,Integer> arr[]= new Pair[2];
        arr[0]= new Pair<>(1,1);
        System.out.println(arr[0].toString());
        System.out.println(Arrays.toString(arr));
    }
}
