package Class.Week4.Week4_0510;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RightTrianglePrinter {

  // System.out.   --> Console
  // BufferedWriter --> Console, File
  public String makeALine(int h, int i) {
    return String.format("%s%s\n", "", "*".repeat(i));
  }

  // 출력하기
  public void printToFile(String[] lines) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter("./aaa.txt"));
    bw.append("aaa");
    bw.flush();
    bw.close();
  }


  // 콘솔에 모양 출력하기
  public void printToConsole(String[] lines) {
    for (int i = 0; i < lines.length; i++) {
      System.out.print(lines[i]);
    }
  }

  // 모양 출력하기
  public void printShape(int h) {
    // 모양 만들기
    String[] lines = new String[h];
    for (int i = 0; i < h; i++) {
      lines[i] = makeALine(h, i + 1);
    }

    // 모양 출력하기
    printToConsole(lines);
  }

  public static void main(String[] args) throws IOException {
    RightTrianglePrinter rtp = new RightTrianglePrinter();
    rtp.printShape(5);
  }
}

