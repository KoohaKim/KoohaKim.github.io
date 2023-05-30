package Class.Week5.Week5_0517;

import java.util.Arrays;
//push
public class Stack1 {




  private int[] arr = new int[10000];
  private int pointer = 0;

  public void push(int value){
    this.arr[pointer++] = value;      //push하면 arr에 값을 넣고 pointer++
    System.out.println(Arrays.toString(arr));
    System.out.println("pointer = "+ pointer);
  }

  public static void main(String[] args) {
    Stack1 st = new Stack1();
    st.push(10);
    st.push(20);
  }

























}
