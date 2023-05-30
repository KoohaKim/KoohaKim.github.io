package Class.Week4.Week4_0508;

public class UserTest {
  public static void main(String[] args) {
    User user1 = new User();
    User user2 = new User();

    user1. name = "김세연";
    user1. age = 29;
    user1. phonenumber = "010-1234-4567";

    user2. name = "김구구";
    user2. age = 26;
    user2. phonenumber = "010-5674-9101";

    System.out.printf("%s는 성인입니까? %b\n", user1.name, user1.isAdult());
    System.out.printf("%s는 성인입니까? %b\n", user2.name, user2.isAdult());

  }
}
