package Class.Week4.Week4_0508;

import java.util.Scanner;

//피라미드 만들기
public class Star1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int height = sc.nextInt();
    //공백만들기
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < height-i-1; j++) {
        System.out.printf(" ");
      }
      //별찍기
      for (int j = 0; j < 2*i+1; j++) {
        System.out.printf("*");
          }
      System.out.println();

    }

  }
}
