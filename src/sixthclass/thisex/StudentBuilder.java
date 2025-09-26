package sixthclass.thisex;

public class StudentBuilder {
    private int id;
    private String name;
    private int grade;
    private String major;
    private String phonenumber;

    private StudentBuilder(Builder builder)
    {
        this.id = builder.id;
        this.grade = builder.grade;
        this.major = builder.major;
        this.phonenumber = builder.phonenumber;
        this.name = builder.name;
    }

    public static class Builder
    {
        private int id;
        private int grade;
        private String name;
        private String major;
        private String phonenumber;

        public Builder(int id, String name) //이자식은 생성자
        {
            this.id = id;
            this.name = name;
        }

        public Builder grade(int grade)
        {
            this.grade = grade;
            return this;
        }

        public Builder major(String major) // 이자식은 함수
        {
            this.major = major;
            return this;
        }

        public Builder phonenumber(String phonenumber)
        {
            this.phonenumber = phonenumber;
            return this;
        }

        public StudentBuilder build()
        {
            return new StudentBuilder(this);
        }
    }

    public void ShowInfo()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(grade);
        System.out.println(major);
        System.out.println(phonenumber);
    }


    public static void main(String[] args)
    {
        StudentBuilder s1 = new Builder(1, "안녕하세요")
                .grade(3)
                .major("수학")
                .phonenumber("010-1111-2222")
                        .build();



        s1.ShowInfo();
    }
}
