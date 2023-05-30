package Class.Week5.Week5_0518;

import java.util.Arrays;

public class BracketWithoutStack {
  public static void main(String[] args) {
    String brackets = "((((()))))";
    boolean isValid = checkValidBrackets(brackets);
    System.out.println(isValid);
  }

  public static boolean checkValidBrackets(String brackets) {
    int count = 0;

    for (char c : brackets.toCharArray()) {
      if (c == '(') {
        count++;
      } else if (c == ')') {
        count--;
        if (count < 0) {
          return false;
        }
      }
    }

    return count == 0;
  }
}
