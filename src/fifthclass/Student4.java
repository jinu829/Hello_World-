package fifthclass;

public class Student4 {
    int studentID;
    String studentName;
    Subject2 korean;
    Subject2 math;

    public Student4(int StudentID, String studentName)
    {
        this.studentID = StudentID;
        this.studentName = studentName;

        Subject2 korean = new Subject2();
        Subject2 math = new Subject2();
    }


}
