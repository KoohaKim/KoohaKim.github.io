package Class.Week5.Week5_0517;

import java.util.EmptyStackException;

//pop->꺼내는것
public class Stack3 {




  private int[] arr = new int[10000];
  private int pointer = 0;

  public void push(int value){
    this.arr[pointer++] = value;      //push하면 arr에 값을 넣고 pointer++
//    System.out.println(Arrays.toString(arr));
//    System.out.println("pointer = "+ pointer);
  }

  public int pop() {
    if(isEmpty()) throw new RuntimeException("스택 빔");
//    int temp = this.arr[pointer - 1];
//    pointer --;
    return this.arr[--pointer];
//    return temp;
  }

  public boolean isEmpty() {
    return pointer == 0;
  }



  public static void main(String[] args) {
    Stack3 st = new Stack3();
    st.push(10);
    st.push(20);
    System.out.println(st.pop());       //20 꺼내기
    System.out.println(st.pop());       //10 꺼내기
    System.out.println(st.isEmpty());   // isEmpty-> true


  }


























}
