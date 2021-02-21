package lab4;

/**
 * Created by fatima on 14/02/2021.
 */
public class GenericMethods{
    public static <A> void print(A []arr)
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] args) {
        Integer x[]={11,12,13,14,15};
        String y[]={"fatima","ahmed","mohammed"};
        Student [] s=new Student[4];
        print(x);
        print(y);
        print(s);
    }
}
