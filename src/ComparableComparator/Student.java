package ComparableComparator;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {

    int age;
    int classNumber;

    Student(int age, int classNumber){
        this.age = age;
        this.classNumber = classNumber;
    }

    @Override
    public int compareTo(Student o){
        return this.age - o.age;
    }

    @Override
    public int compare(Student o1, Student o2){
        return o1.age - o2.age;
    }
}
