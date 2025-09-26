
class Point
{
    int x;
    int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return x + ", " + y;
    }
}

class Circle implements Cloneable
{
    int radius;
    Point point;

    public Circle(int x, int y, int radius)
    {
        this.radius = radius;
        point = new Point(x, y);
    }

    public String toString()
    {
        return "원점은 " + point + "이고, 반지름은" + radius+ "입니다.";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
}








public class ObjectCloneTest {
    public static void main(String[] aStrings) throws CloneNotSupportedException
    {
        Circle circle = new Circle(10, 20, 30);
        Circle copyCircle = (Circle)circle.clone();

        System.out.println(circle);
        System.out.println(copyCircle);
        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(copyCircle));
    }
}
