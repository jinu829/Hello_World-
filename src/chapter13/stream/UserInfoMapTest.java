package chapter13.stream;

import java.util.ArrayList;
import java.util.List;

class UserInfo {
    private String name;
    private int age;

    public UserInfo(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}


public class UserInfoMapTest {
    public static void main(String[] args)
    {
        UserInfo userKim = new UserInfo("김영희", 30);
        UserInfo userLee = new UserInfo("이철수", 40);
        UserInfo userSong = new UserInfo("송영수", 55);

        List<UserInfo> userInfoList = new ArrayList<UserInfo>();
        userInfoList.add(userKim);
        userInfoList.add(userLee);
        userInfoList.add(userSong);

        //filter와 map연산으로 40세 이상인 사용자의 이름 추출
        userInfoList.stream()
                .filter(user -> user.getAge() >= 40)
                .map(UserInfo::getName)// ::은 뭐야? Userinfo에서 특정 부분만 추출하는 느낌인듯. 여기서는 이름만
                .forEach(s -> System.out.println(s));
    }
}
