package chapter13.innerclass;

public class OutClass {
    private int num = 10;
    private static int sNum = 20;

    private InClass inClass; //내부 클래스형 변수를 먼저 선언

    public OutClass()
    {
        inClass = new InClass();
    }

    class InClass {
        int inNum = 100;
        static int sInNum = 200;
        void inTest()
        {
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + num + "(외부 클래스의 정적 변수)");
            System.out.println("OutClass sInNum = " + num + "(인스턴스 내부 클래스의 정적 변수)");
        }
        static void sTest()
        {
            System.out.println("인스턴스 내부 클래스의 정적 메서드 호출");
        }
    }

    public void usingClass()
    {
        inClass.inTest();
    }
}
