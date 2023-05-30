package Class.Week4.Week4_0509;

import java.util.Arrays;
public class PrintArrRefactoring {

public static void printArray(int[][] arr){
  System.out.println(Arrays.toString(arr[0]));
  System.out.println(Arrays.toString(arr[1]));
  System.out.println(Arrays.toString(arr[2]));
}
  public static void main(String[] args) {
    int[][]arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };

    printArray(arr);
  }
}
