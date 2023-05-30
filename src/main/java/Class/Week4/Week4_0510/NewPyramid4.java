package Class.Week4.Week4_0510;

public class NewPyramid4 {

  public static String makeALine(String symbol, int n){
    return symbol.repeat(n);
  }
  public static void main(String[] args) {
    int h = 5;
    for (int i = 0; i < h; i++) {
      System.out.printf("%s%s\n",makeALine(" ", i),makeALine("*",2 * (h - i) - 1));
    }
  }
}