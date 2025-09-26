package sixthclass.staticex;

public class Student2 {
    private static int serialNum;
    int studentID;
    String studentName;
    int grade;
    String address;

    public Student2()
    {
        serialNum++;
        studentID=serialNum;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String name)
    {
        studentName = name;
    }

    public static int getSerialNum()
    {
        int i = 10;
        return serialNum;
    }

    public void setSerialNum(int serialNum)
    {
        this.serialNum = serialNum;
    }

}
