package ComparableComparator;

public class ComparableTest {
    public static void main(String[] args) {
        Student a = new Student(29, 3);
        Student b = new Student(27, 1);

        int isBig = a.compareTo(b);

        if (isBig > 0){
            System.out.println("a가 b보다 나이 많음");
        }else if(isBig == 0){
            System.out.println("a랑 b랑 나이 같음");
        }else{
            System.out.println("a가 b보다 나이 적음");
        }
    }
}