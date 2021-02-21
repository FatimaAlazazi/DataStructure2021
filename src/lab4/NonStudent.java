package lab4;

/**
 * Created by fatima on 14/02/2021.
 */
public class NonStudent extends Person {
    String work;

    @Override
    public String toString() {
        return "NonStudent{" +
                "work='" + work + '\'' +
                '}';
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public NonStudent(int age, String name, String work) {
        super(age, name);
        this.work = work;
    }
}
