package sixthclass.thisex;

class Student
{
    private int id;
    private String name;
    private int grade;
    private String major;
    private String phonenumber;

    public int  getId() {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int  getGrade()
    {
        return grade;
    }

    public Student setName(String name)
    {
        this.name = name;
        return this;
    }

    public Student setGrade(int grade)
    {
        this.grade = grade;
        return this;
    }

    public Student setId(int id)
    {
        this.id = id;
        return this;
    }

    public void ShowInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Grade: " + grade);
    }
}

public class ReturnItSelf {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setGrade(1).setId(2).setName("최진혁").ShowInfo();
    }
}
