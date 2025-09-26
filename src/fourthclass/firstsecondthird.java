package fourthclass;

public class firstsecondthird {
    /*public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        char operator = '+';
        if (operator == '+') {
            System.out.println(num1 + num2);
        }
    }*/



    /*public static void main(String[] args) {

        for (int num1 = 1; num1 <= 9; num1++)
        {
            for (int num2 = 1; num2 <= num1; num2++)
            {
                System.out.print(num1*num2);
                System.out.print("\n");
            }
        }
    }*/



    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 4-i; j > 0; j--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
        for (int i = 3; i >=1; i--)
        {
            for (int j = 1; j <= 4-i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
