package chapter13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterTest {
    public static void main(String[] args)
    {
        Predicate<Integer> isPositve = x -> x > 0; //양수를 찾는 Predicate

        List<Integer> numbers = Arrays.asList(5, -10, -22, 0, 43, 7); //asList를 활용해서 배열을 만들 수도 있는듯?
        /*Stream<Integer> s = numbers.stream().filter(isPositve);
        s.forEach(n -> System.out.println(n));*/
        numbers.stream().filter(isPositve).forEach(s -> System.out.println(s));
    }
}
