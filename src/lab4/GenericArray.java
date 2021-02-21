package lab4;

/**
 * Created by fatima on 14/02/2021.
 */
public class GenericArray<T> {
    T arr[];
    int num=0;

    public GenericArray() {
        arr= (T[]) new Object[2];
    }
    public void add(T element )
    {
        if (num<arr.length-1)
        {
        arr[num]=element;
        num++;}

    }
    public void print()
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        GenericArray<String >s= new GenericArray<>();
        s.add("fatima");
        s.print();
    }
}
