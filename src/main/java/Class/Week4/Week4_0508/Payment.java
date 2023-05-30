package Class.Week4.Week4_0508;

public class Payment {
  public static void main(String[] args) {
    Account account = new Account();
    boolean isSufficient = account.isSufficient();
    if (isSufficient){
      System.out.println("결제");
    }else{
      System.out.println("잔액부족");
    }
  }
}
