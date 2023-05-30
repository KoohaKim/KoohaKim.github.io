package CodeUp;

import java.util.Scanner;

public class CodeUp1097 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//바둑판 세팅한다
    int[][] arr = new int[19][19];
//바둑판에 돌을 놓는당
    for (int i = 0; i < 19; i++) {
      String []line = sc.nextLine().split(" ");
      for (int j = 0; j < 19; j++) {
        arr[i][j] = Integer.parseInt(line[j]);
      }
    }
//뒤집기 횟수가 입력됨 단 n은 10이하의 자연수
      int reverseCount = Integer.parseInt(sc.nextLine());
// 뒤지벙야할 좌표가 횟수만큼 입려된당 ex:2
    for (int i = 0; i < reverseCount; i++) {
        String[] location = sc.nextLine().split(" ");
        int x = Integer.parseInt(location[0]) -1;
        int y = Integer.parseInt(location[1]) -1;

      for (int j = 0; j < 19; j++) {
        arr[x][j] = arr[x][j] == 1 ? 0 : 1;

      }
      for (int j = 0; j < 19; j++) {
        arr[j][y] = arr[j][y] == 1 ? 0 : 1;
      }
    }
    for (int i = 0; i < 19; i++) {
      for (int j = 0; j < 19; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

  }
}
