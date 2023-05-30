package Class.Week5.Week5_0517;

import java.util.Arrays;

//pop->꺼내는것
public class Stack2 {




  private int[] arr = new int[10000];
  private int pointer = 0;

  public void push(int value){
    this.arr[pointer++] = value;      //push하면 arr에 값을 넣고 pointer++
//    System.out.println(Arrays.toString(arr));
//    System.out.println("pointer = "+ pointer);
  }

  public int pop() {
    int temp = this.arr[pointer - 1];
    pointer --;
//    return this.arr[--pointer];
    return temp;
  }


  public static void main(String[] args) {
    Stack2 st = new Stack2();
    st.push(10);
    st.push(20);
    System.out.println(st.pop());       //20 꺼내기
    System.out.println(st.pop());       //10 꺼내기
  }

























}
