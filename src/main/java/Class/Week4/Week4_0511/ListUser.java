package Class.Week4.Week4_0511;

import Class.Week4.Week4_0508.User;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
  public static void main(String[] args) {
    List<User> users = new ArrayList<>();

    User user1 = new User("김미미","010-1234-1234", 37);
    users.add(user1);

    User user2 = new User("김구하","010-7221-2038", 26);
    users.add(user2);

    for(User user : users){
      System.out.printf("%s님의 전화번호는 %s입니다!\n",user.getName(),user.getPhonenumber());
    }


  }
}
