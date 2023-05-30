package Class.Week5.Week5_0517;

import java.util.EmptyStackException;

public class Stack4 {
  int[] arr = new int[10000];
  int pointer = 0;

  public void push(int value) {
    arr[pointer++] = value;
//        System.out.printf("pointer:%d\n", pointer);
  }

  public int pop() {
    if(!isEmpty()){
      return arr[--pointer];
    } else {
      throw new EmptyStackException();
    }
  }

  public boolean isEmpty() {
    return pointer == 0;
  }

  public int peek() {
    if (isEmpty()) throw new EmptyStackException();
    return arr[pointer-1];
  }

  public static void main(String[] args) {
    Stack4 st = new Stack4();
    st.push(10);
    System.out.println(st.pop());
    st.push(20);
    System.out.println(st.peek());
  }
}
