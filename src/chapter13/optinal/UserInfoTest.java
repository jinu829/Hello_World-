package chapter13.optinal;

import java.util.ArrayList;

public class UserInfoTest {
    public static void main(String[] args)
    {
        ArrayList<UserInfo> userInfoList = new ArrayList<>();
        userInfoList.add(new UserInfo(12345, "James"));
        userInfoList.add(new UserInfo(12346, "Tomas"));
        userInfoList.add(new UserInfo(12347, "Edward"));

        UserInfo userInfo = getUserInfoById(12348, userInfoList);
        if (userInfo != null)
        {
            System.out.println(userInfo.getName()); //null값 반환을 대응하기 위해 다음과 같은 if문 추가
        }
    }

    public static UserInfo getUserInfoById(int id, ArrayList<UserInfo> list)
    {
        for (UserInfo userInfo : list)
        {
            if (id == userInfo.getId())
                return userInfo;

        }
        return null; //java는 모든 경우에 대해서 return문을 만들어놔야 하는듯
    }
}
