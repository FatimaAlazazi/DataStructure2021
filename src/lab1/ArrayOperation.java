package lab1;

import java.util.Scanner;

/**
 * Created by fatima on 23/01/2021.
 */
public class ArrayOperation {

    static int numOfElements=0;
    public static int[]arr=new int[5];

    public static void add(int elem)
    {
      if(numOfElements<arr.length)
      {arr[numOfElements]=elem;
        numOfElements++;}
        else
          System.out.println("array is full");

    }
    public static void findRepeated()
    {
        int x[]={1,5,3,2,6,7};


    }

    public static void print()
    {
        System.out.print("[ ");
        for (int i = 0; i <arr.length ; i++)
            {
                if (i != arr.length - 1)
                    System.out.print(arr[i] + ",");
                else
                    System.out.print(arr[i]);
            }
            System.out.print(" ]");


    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        while(true)
        {

            System.out.println("input element :  ");
            int x=input.nextInt();
            add(x);
        }
    }


}
