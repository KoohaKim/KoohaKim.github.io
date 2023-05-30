package CodeUp;

import java.util.Scanner;

public class CodeUp1671 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int user = sc.nextInt();
    int computer = sc.nextInt();

    if (user == 0 && computer == 1) {
      System.out.println("win");;
    } else if (user == 1 && computer == 2) {
      System.out.println("win");;
    } else if (user == 2 && computer == 0) {
      System.out.println("win");;
    } else if (user == computer) {
      System.out.println("tie");
    } else {
      System.out.println("lose");
    }
  }




  }

