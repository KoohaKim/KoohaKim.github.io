package Class.Week4.Week4_0509;
//역피라미드
public class Pyramid4 {
//메소드로 핵심내용 분리
  private String spaceChar = "0";
  public Pyramid4(String spaceChar){
    this.spaceChar = spaceChar;
  }

  public String makeALine(int h, int i){
    return String.format("%s %s\n", spaceChar.repeat(i), "*".repeat(2 * (h - i) - 1));
  }
  public static void main(String[] args) {
    Pyramid4 pyramid4 = new Pyramid4(" ");
    int h = 5;
    for (int i = 0; i < h; i++) {
      System.out.print(pyramid4.makeALine(h,i));

    }
  }
}
