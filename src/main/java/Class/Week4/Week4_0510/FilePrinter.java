package Class.Week4.Week4_0510;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer2{
  @Override
  public void print(String message) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter("./hello.txt"));
    bw.append(message);
    bw.flush();
    bw.close();
  }
}
