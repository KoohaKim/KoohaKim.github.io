package CodeUp;

import java.util.Scanner;

public class CodeUp1098 {
  public static void main(String[] args) {
// 첫번째줄 가로 w 세로 h 공백두고 입력
    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[sc.nextInt()][sc.nextInt()];

// 두번째 줄 놓을 수 있는 막대의 갯수 n
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      // 세번째줄 각 막대의 길이 l, 방향 d, 좌표 x,y
      int l = sc.nextInt();     //길이
      int d = sc.nextInt();     //방향
      int x = sc.nextInt() - 1; //좌표
      int y = sc.nextInt() - 1; //좌표
//막대를 놓을 건데 가로(0), 세로(1) 구분을 해야댐
      for (int k = 0; k < l; k++) {
        if (d == 0) {//가로면
          arr[x][y + k] = 1;
        } else { //세로면?
          arr[x + k][y] = 1;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}