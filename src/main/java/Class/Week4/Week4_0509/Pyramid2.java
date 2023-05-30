package Class.Week4.Week4_0509;

public class Pyramid2 {
  public void printPyramid(int height) {
    for (int i = 0; i < height; i++) {
      System.out.printf("%s %s\n"," ".repeat(height-i-1), "*".repeat(2*i+1));

    }
  }

  public static void main(String[] args) {
    Pyramid2 pyramid2 = new Pyramid2();
    int height = 4;
    pyramid2.printPyramid(height);
  }
}
