package Class.Week4.Week4_0509;

public class MultiplicationTable {
  public static void printDan(int dan) {
    for (int i = 0; i <= 9; i++) {
      System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }
    System.out.println("---------------");
  }


  public static void main(String[] args) {

  printDan(2);
  printDan(5);
  printDan(7);
  printDan(8);
    }
  }

