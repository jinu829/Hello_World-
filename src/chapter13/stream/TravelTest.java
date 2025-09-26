package chapter13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class TravelTest {
    public static void main(String[] args)
    {
        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

        List<TravelCustomer> customerList =  new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
        customerList.stream().map(TravelCustomer::getName).forEach(System.out::println);

        int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println("총 여행 비용은: " + total + "만 원입니다.");
        //Arrays.stream(customerList).sum();이 방법은 customerList가 컬렉션 형태이고 배열 형태가 아니기에 불가능

        System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
        customerList.stream().filter(x -> x.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
    }
}
