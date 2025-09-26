package fifthclass;

public class StudentTest {
    public static void main(String[] args)
    {
        Student studentAhn = new Student();
        studentAhn.studentName = "안승연";
        Student student2 = new Student();
        student2.studentName = "최진혁";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
        System.out.println(student2.studentName);

        int one=1;
        int two=2;
        System.out.println(one);
        System.out.println(two);

        System.out.println(studentAhn);
        System.out.println(student2);
    }
}
