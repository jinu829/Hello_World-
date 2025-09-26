package fifthclass.encapsulation;

public class Customer {
    private String name;
    private double budget;

    public Customer(String name, double budget)
    {
        this.name = name;
        this.budget = budget;
    }

    public double getBudget()
    {
        return budget;
    }

    public void buyPhone(PhoneStore store)
    {
        Phone phone = store.sellPhone("아이폰", budget);

        if (phone != null)
        {
            System.out.println("buy phone");
        }
        else
        {
            System.out.println("not buy phone");
        }
    }
}
