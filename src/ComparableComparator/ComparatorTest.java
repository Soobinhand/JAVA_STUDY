package ComparableComparator;

public class ComparatorTest {
    public static void main(String[] args) {
        Student a = new Student(20, 99);
        Student b = new Student(50, 11);
        Student c = new Student(30, 88);

        // a와는 상관없이 b와 c를 비교함
        int isBig = a.compare(b,c);

        if (isBig > 0) System.out.println("b가 c보다 큼");
        else if (isBig == 0) System.out.println("b랑 c랑 같음");
        else System.out.println("b가 c보다 작음");
    }
}
