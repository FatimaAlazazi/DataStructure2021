package lab4;

/**
 * Created by fatima on 14/02/2021.
 */
public class OldPair {
    Object first;
    Object second;

    public OldPair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

    public static void main(String[] args) {
        OldPair pair= new OldPair("book name",5);
        String name=(String)pair.getFirst();
        int quantity=(int)pair.getSecond();
        System.out.println(name+"  "+quantity);
    }
}
