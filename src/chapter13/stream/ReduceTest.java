package chapter13.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>
{
    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) return s1;
        else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args)
    {
        String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};
        System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) ->
        {
            if (s1.getBytes().length >= s2.getBytes().length) return s1;
            else return s2;
        })); // Arrays.stream(greetings)이런 형식은 우리가 처음 stream을 배울 때 사용했던 형식

        String str = Arrays.stream(greetings).reduce(new CompareString()).get(); //BinaryOperato를 구현한 클래스 사용
        System.out.println(str);
    }



}
