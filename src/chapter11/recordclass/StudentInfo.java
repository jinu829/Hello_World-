package chapter11.recordclass;

public record StudentInfo(int id, String name) 
{
    public static void main(String[] aStrings)
    {

        StudentInfo studentInfo = new StudentInfo(12345, "최지원");
        StudentInfo studentInfo2 = new StudentInfo(12345, "최지원");

        System.out.println(studentInfo.equals(studentInfo2));
        System.out.println(studentInfo.name());
        System.out.println(studentInfo);
    }
}
