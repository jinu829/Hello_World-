package fifthclass.Mydate;

public class Mydate {
    private int day;
    private int month;
    private int year;

    public Mydate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getday()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    public boolean isValid()
    {
        if (month == 2)
        {
            if (day > 28 || day < 0)
            {
                System.out.println("Invalid day");
                return false;
            }
            else
            {
                System.out.println("Valid Day");
                return true;
            }
        }
        else
        {
            if (day > 31 || day < 0)
            {
                System.out.println("Invalid day");
                return false;
            }
            else
            {
                System.out.println("Valid Day");
                return true;
            }
        }

    }
}
