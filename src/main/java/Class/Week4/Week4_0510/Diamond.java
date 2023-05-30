package Class.Week4.Week4_0510;

public class Diamond {
  public static String getRepeatSymbol(String symbol, int n){
    return symbol.repeat(n);
  }
  public static void main(String[] args) {
    int h = 7;
    int pivot = h/2;

    for (int i = 0; i < h; i++) {
    if ( i <= pivot){
      System.out.printf("%s%s\n",getRepeatSymbol("0",-2+h));
}
    }

  }
}
