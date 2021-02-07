import java.util.Arrays;
import java.util.Random;

/**
 * Created by fatima on 06/02/2021.
 */
public class Lab3 {
    public void insertionSort(int []a)
    {
        for (int i = 1; i <a.length ; i++) {
            int cur=a[i];
            int j=i;
            while(j>0&&cur<a[j-1])
            {a[j]=a[j-1];
            j--;}
            a[j]=cur;
        }
    }

    public void fillRandom(int[] a) {
        Random r = new Random();
        r.setSeed(System.currentTimeMillis());

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(10);
        }
    }
    public int sequentialSearch(int[] a, int element) {
        int index = -1;
        int i = 0;
        boolean flag = false;
        while (!flag && i < a.length) {
            if (a[i] == element) {
                flag = true;
                index = i;
            }
            i++;
        }
        return index;
    }

    public void remove(int[] a, int index)

    {
        if (index >= 0 && index < a.length) {
            int i = index;
            while (i < a.length - 1) {
                a[i] = a[i + 1];
                i++;
            }
            a[i] = 0;
        }
    }
    public static void main(String[] args) {
        int a[]={11,12,9,13,5};
        int b[]={12,13,14,15,16};

        Lab3 l= new Lab3();
        System.out.println(Arrays.toString(a));
l.remove(a,1);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.equals(a,b));
        Arrays.fill(b,5);
        System.out.println(Arrays.toString(b));
       b= Arrays.copyOf(a,5);
        System.out.println(Arrays.toString(b));
        b=Arrays.copyOfRange(a,2,4);
        System.out.println(Arrays.toString(b));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a,9));
        l.fillRandom(a);
        System.out.println(Arrays.toString(a));


    }
}
