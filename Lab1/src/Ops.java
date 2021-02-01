import java.util.Scanner;

/**
 * Created by fatima on 30/01/2021.
 */
public class Ops {
    int[] arr = new int[5];
    int numOfElements = 0;

    public void addSortedElement(int elem) {
        if (numOfElements < arr.length) {
            numOfElements++;
            int i = numOfElements - 1;
            while (i > 0 && elem < arr[i - 1]) {
                arr[i] = arr[i - 1];
                i--;
            }
            arr[i] = elem;
        } else
            System.out.println("array is full");
    }

    public void add(int elem) {
        if (numOfElements < arr.length) {
            arr[numOfElements] = elem;
            numOfElements++;
        } else
            System.out.println("array is full");

    }

    public void reverse() {
        //reverse an array
        int n = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[n];
            arr[n] = t;
            n--;
        }

    }

    public void shiftLeft() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
        arr[arr.length - 1] = 0;
    }

    public void shiftRight() {
        //shift right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = 0;
    }

    public void print() {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1)
                System.out.print(arr[i] + ",");
            else
                System.out.print(arr[i]);
        }
        System.out.print(" ]");


    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Ops o = new Ops();

        while (true) {
            System.out.println("enter element");
            o.addSortedElement(s.nextInt());
            
        }
    }

}
