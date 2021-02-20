package lab4;

/**
 * Created by fatima on 14/02/2021.
 */
public class Test {
    public static void main(String[] args) {
        Person p1;
        Student s1=new Student(20,"fatima",1);
        p1=s1;//widening convert student to person
        System.out.println(p1);

        Person p2=new Person(20,"ahmed");;
        Student s2=s1;
        if(p2 instanceof Student)
        { s2= (Student)p2;}//narrowing convert person to student
        System.out.println(s2);
//        Person p4= new Student(20,"fatima",1);
//        NonStudent ns= (NonStudent) p4;//throw cast exception
//        System.out.println(ns);

//        Person p4= new Student(20,"fatima",1);
//        if(p4 instanceof NonStudent)//OK
//        {
//        NonStudent ns= (NonStudent) p4;
//        System.out.println(ns);}
//

    }
}
