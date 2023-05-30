package Class.Week4.Week4_0511;
//List 선언
import java.util.ArrayList;
import java.util.List;

public class ListEx {
  public static void main(String[] args) {
    List l1 = new ArrayList();
    //list에서 값을 넣을 때 .add()
    l1.add("Hello");
    l1.add(1);

    //list에서 값을 뽑을 때 .get();
    System.out.println(l1.get(0));
    System.out.println(l1.get(1));

    //들어있는 값들의 갯수? .size();
    System.out.println(l1.size());

    //인덱스의 값을 지우깅 .remove(?);
//    l1.remove(0);
//    l1.remove(0);

    //값이 비어있는지? .isEmpty();
    System.out.println(l1.isEmpty());

    //반복하는 거
    for(var item : l1){
      System.out.println(item);
    }

  }
}
