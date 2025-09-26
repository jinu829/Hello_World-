package sixthclass.singleton;

public class Company {
    private static Company instance = new Company();
    private Company(){} //기본적으로 public으로 설정이 되니까!!

    public static Company getInstance()
    {
        if (instance == null)
        {
            instance = new Company();
        }
        return instance;
    }
}
