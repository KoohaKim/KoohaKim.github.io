package Class.Week4.Week4_0508;

  class Solution {
    public int[] solution(int[] answers) {
      int[] arr = new int[3];
      int[] a = {1, 2, 3, 4, 5};
      int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
      int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

      for (int i = 0; i < answers.length; i++) {
        if (answers[i] == a[(i) % 5]) arr[0]++;   // 0,1,2,3,4 -> arr0의 값 +4
        if (answers[i] == b[(i) % 8]) arr[1]++;
        if (answers[i] == c[(i) % 10]) arr[2]++;
      }
      // answer[0] == b[0]

      // int[] answer = {1, 2, 3, 4, 5}
      // int[] arr = {4, 0, 0}

      int max = arr[0];     // 4

      if (max < arr[1]) max = arr[1];   //4<0   0
      if (max < arr[2]) max = arr[2];   //4<0   0

      if (max == arr[0] && max == arr[1] && max == arr[2]) return new int[]{1, 2, 3};
      else if (max == arr[0] && max == arr[1]) return new int[]{1, 2};
      else if (max == arr[0] && max == arr[2]) return new int[]{1, 3};
      else if (max == arr[1] && max == arr[2]) return new int[]{2, 3};
      else if (max == arr[0]) return new int[]{1};
      else if (max == arr[1]) return new int[]{2};
      return new int[]{3};

    }
  }


