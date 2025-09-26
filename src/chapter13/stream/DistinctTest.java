package chapter13.stream;

import java.util.ArrayList;
import java.util.List;

class Student
{
    private int id;
    private String name;

    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return(this.id == ((Student)obj).id);
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}

public class DistinctTest {
    public static void main(String[] args)
    {
        Student studentLee = new Student(100, "이윤선");
        Student studentMoon = new Student(200, "문찬욱");
        Student studentLee2 = new Student(100, "이윤선");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(studentLee);
        students.add(studentMoon);
        students.add(studentLee2);



        students.stream()
                .distinct()
                .forEach(s -> System.out.println(s.getName()));
    }
}
