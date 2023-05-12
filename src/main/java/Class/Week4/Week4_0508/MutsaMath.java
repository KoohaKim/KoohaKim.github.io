package Class.Week4_0508;

  public class MutsaMath {
  int sumOfFactors(int num) {
    // num % i == 0 이면 약수
    // 12 --> 1 2 3 4 6 12

    int answer = 1;
    for (int i = 2; i <= num; i++) {
      if (num % i == 0) answer += i;
    }
      return answer;
    }
void printResult(int num){
      System.out.printf("%d의 약수의 합은 %d 입니다.\n", num, sumOfFactors(num));
    }

    public static void main(String[] args) {
      MutsaMath mutsaMath = new MutsaMath();
      mutsaMath. printResult(12);
      mutsaMath. printResult(36);
      mutsaMath. printResult(48);
      mutsaMath. printResult(29);
    }
  }
