
class Student
{
    int studentID;
    String studentName;

    public Student (int studentID, String studentName)
    {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String toString()
    {
        return studentID + ", " + studentName;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (obj instanceof Student)
        {
            Student std = (Student)obj;
            if (this.studentID == std.studentID) //여기서 this를 쓰는 이유는 밑에 사용하는 부분을 보면 알 수 있는데, studentLee.equals~~~에서 studentLee가 인스턴스이므로 이때 this는 studentLee이다.
            {
                return true;
            }
            else 
            {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return studentID;
    }
}


public class EqualsTest {
    public static void main(String[] aStrings)
    {
        Student studentLee = new Student(100, "이상원");
        Student studentLee2 = studentLee;
        Student studentSang = new Student(100, "이상원");

        if (studentLee == studentLee2)
        {
            System.out.println("Lee1 same address Lee2");
        }
        else
        {
            System.out.println("Lee1 not same address Lee2");
        }

        if (studentLee.equals(studentLee2))
        {
            System.out.println("Lee1 same Lee2");
        }
        else
        {
            System.out.println("Lee1 not same Lee2");
        }

        if (studentLee == studentSang)
        {
            System.out.println("Lee1 same address Sang");
        }
        else
        {
            System.out.println("Lee1 not same address Sang");
        }

        if (studentLee.equals(studentSang))
        {
            System.out.println("Lee1 same Sang");
        }
        else
        {
            System.out.println("Lee1 not same Sang");
        }

        System.out.println("Lee1 해시코드 : "+studentLee.hashCode());
        System.out.println("Lee2 해시코드 : "+studentLee2.hashCode());
        System.out.println("Sang 해시코드 : "+studentSang.hashCode());
    }
}
//자바 코드는 항상 사용하는 부분까지 봐야 다 이해가 된다.
