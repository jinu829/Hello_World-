package chapter12.question.question5;



public class Student {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName)
    {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentId+":"+studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student)
        {
            Student student = (Student)obj;
            if (this.studentId == student.studentId)
            {
                return true;
            }
            else
                return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentId;
    }
}
