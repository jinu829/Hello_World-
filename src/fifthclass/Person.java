package fifthclass;

public class Person {
    public static int add(int num1, int num2)
    {
        int result;
        result = num1 + num2;
        return result;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println(add(num1, num2));
    }
}
