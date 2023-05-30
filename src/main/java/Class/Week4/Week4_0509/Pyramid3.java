package Class.Week4.Week4_0509;

public class Pyramid3 {
  private String spaceChar = "0";

  public Pyramid3(String spaceChar) {
    this.spaceChar = spaceChar;
  }

  public void printPyramid(int height) {
    for (int i = 0; i < height; i++) {
      System.out.printf("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
    }
  }
  public static void main(String[] args) {
    Pyramid3 pyramid3 = new Pyramid3(" "); // argument " "를 넘겨서 초기화
    Pyramid3 pyramidSpaceZero = new Pyramid3("0"); // argument "0"을 넘겨서 초기화
    pyramid3.printPyramid(4);
    pyramidSpaceZero.printPyramid(5);
  }

}

