package Class.Week5.Week5_0515;
//버블 정렬 OOP화
import java.util.Arrays;

public class BubbleSort02 {
  public int[] sortARound(int[] arr, int until){
    for (int i = 0; i < until; i++) {  // 1 --> j
      if (arr[i] > arr[i + 1]) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }
    return arr;
  }

  public int[] sort(int[] arr){
    for (int j = 1; j <= arr.length; j++) {
      arr = sortARound(arr, arr.length - j);
    }
    return arr;
  }

  public static void main(String[] args) {
    BubbleSort02 bubbleSort02 = new BubbleSort02();
    int[] arr = {7, 2, 3, 9, 28, 1};
    arr = bubbleSort02.sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
