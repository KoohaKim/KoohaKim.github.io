package Class.Week4.Week4_0511;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
  public static void main(String[] args) {
    List<String> strList = new ArrayList();
    strList.add("Hello");
    strList.add("bye");
    strList.add("1");

    System.out.println(strList.get(0));
    System.out.println(strList.get(1));
    System.out.println(strList.get(2));


    List<Integer> intList = new ArrayList<>();
    intList.add(1);
    intList.add(2);

    System.out.println(intList.get(0));
    System.out.println(intList.get(1));
  }
}
