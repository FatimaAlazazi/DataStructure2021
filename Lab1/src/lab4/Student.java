package lab4;

/**
 * Created by fatima on 14/02/2021.
 */
public class Student extends Person {
    int id;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }


    public Student(int age, String name, int id) {
        super(age, name);
        this.id = id;
    }

    public Student(int age, String name) {
        this(age, name,0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
