package CodeUp;

import java.util.Scanner;

public class CodeUp1287 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int input = sc.nextInt();

    for (int i = 1; i < 10; i++) {        //i=1
      for (int j = 0; j < input*i; j++) { //0,1<input*1
        System.out.printf("*");
      }
      System.out.println("");
        }
  }
}



