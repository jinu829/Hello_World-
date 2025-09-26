package chapter13.innerclass;

public class InnerClassTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        System.out.println("인스턴스 내부 클래스의 정적 메서드 호출");
        outClass.usingClass();
        System.out.println("인스턴스 내부 클래스의 정적 변수 직접 호출 OutClass.InClass.sInNum = " + OutClass.InClass.sInNum);
        OutClass.InClass.sTest();
    }

}
