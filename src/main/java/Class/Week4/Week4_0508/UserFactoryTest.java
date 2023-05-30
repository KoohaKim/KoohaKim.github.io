package Class.Week4.Week4_0508;

public class UserFactoryTest {
  public static void main(String[] args) {
    UserFactory userFactory = new UserFactory();
    User user = userFactory.getAdultUser();
    System.out.println(user.age);

    }
  }
