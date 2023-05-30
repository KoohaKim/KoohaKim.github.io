package Class.Week4.Week4_0512;

import Class.Week4.Week4_0511.Address;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class  ReadFileEx {
  LineReader lineReader;
  Charset charset;

  public ReadFileEx(Charset charset) {
    this.charset = charset;
  }

  public List<String> getLines(String fileName) throws IOException {
    List<String> lines = new LinkedList<>();

    // BufferedReader선언 --> File연결
    BufferedReader br = new BufferedReader(new FileReader(fileName, charset));

    // BufferedReader에서 loop으로 한줄씩 불러오기
    String line;
    while ((line = br.readLine()) != null) {
      lines.add(line);
    }
    return lines;
  }


  public Hospital parse(String str) {
    System.out.println(str);
    String[] splitted = str.split(",");
    System.out.println(Arrays.toString(splitted));
    System.out.println(splitted[0]);

    Address address = new Address();
    Hospital hospital = new Hospital("", "", address);

    return hospital;
  }

  public static void main(String[] args) throws IOException {
    ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
    List<String> result = rfe.getLines("C:\\Users\\Administrator\\Downloads\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9\\new 1.병원정보서비스 2022.10..CSV");
    rfe.parse(result.get(0));
  }
}

