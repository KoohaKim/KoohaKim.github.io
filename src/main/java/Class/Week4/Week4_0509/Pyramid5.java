package Class.Week4.Week4_0509;
//역피라미드
public class Pyramid5 {
  //메소드로 핵심내용 분리
  private String spaceChar = "0";
  public Pyramid5(String spaceChar){
    this.spaceChar = spaceChar;
  }

  public String makeALine(int h, int i){
    return String.format("%s %s\n", spaceChar.repeat(i), "*".repeat(h));
  }
  public static void main(String[] args) {
    Pyramid5 pyramid5 = new Pyramid5(" ");
    int h = 5;
    for (int i = 0; i < h; i++) {
      System.out.print(pyramid5.makeALine(h,i));

    }
  }
}
