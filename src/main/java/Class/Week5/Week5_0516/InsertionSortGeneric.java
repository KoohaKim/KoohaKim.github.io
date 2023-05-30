package Class.Week5.Week5_0516;

import java.util.Arrays;

public class InsertionSortGeneric<T> {
  // desc --> 내림차순
  // asc --> 오름차순
  public T[] sort(T[] arr, boolean isAscending) {
    return arr;
  }
  public T[] sort(T[] arr) {
    return sort(arr, true);
  }
  public static void main(String[] args) {
//      int [] arr = {7, 2, 3, 9, 28, 11};
    Character[] cArr = {'f', 'e', 'g', 'a', 'c'};
    InsertionSortGeneric<Character> is = new InsertionSortGeneric();
    cArr = is.sort(cArr, false);
    System.out.println(Arrays.toString(cArr));
  }
}

